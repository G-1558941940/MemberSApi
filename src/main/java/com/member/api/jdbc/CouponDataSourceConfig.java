package com.member.api.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @program: game_api
 * @description:
 * @author: chensiqi
 * @create: 2019-04-12 14:14
 * @version: 1.0
 **/
@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = CouponDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "couponSqlSessionFactory")
public class CouponDataSourceConfig {

    // 精确到 cluster 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.member.api.mappers.coupon";
    static final String MAPPER_LOCATION = "classpath:mappers/coupon/*.xml";

    @Value("${spring.coupon.datasource.url}")
    private String url;

    @Value("${spring.coupon.datasource.username}")
    private String user;

    @Value("${spring.coupon.datasource.password}")
    private String password;

    @Value("${spring.coupon.datasource.driver-class-name}")
    private String driverClass;

    @Bean(name = "couponDataSource")
    public DataSource clusterDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "couponTransactionManager")
    public DataSourceTransactionManager clusterTransactionManager() {
        return new DataSourceTransactionManager(clusterDataSource());
    }

    @Bean(name = "couponSqlSessionFactory")
    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("couponDataSource") DataSource clusterDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(clusterDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(CouponDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
