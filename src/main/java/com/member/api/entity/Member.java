package com.member.api.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    @ApiModelProperty(value = "会员信息ID")
    private Integer id;
    @ApiModelProperty(value = "电话号码")
    private String phone;
    @ApiModelProperty(value = "微信头像")
    private String wx_logo;
    @ApiModelProperty(value = "微信昵称")
    private String wx_nickname;
    @ApiModelProperty(value = "小程序open_id")
    private String wx_mini_open_id;
    @ApiModelProperty(value = "微信open_id")
    private String wx_mp_open_id;
    @ApiModelProperty(value = "微信union_id")       //微信union_id
    private String wx_union_id;
    @ApiModelProperty(value = "机构（公司）ID")     //机构（公司）ID
    private Integer company_id;
    @ApiModelProperty(value = "注册时间")    //注册时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date register_time;
    @ApiModelProperty(value = "最后登录时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//最后登录时间
    private Date last_login_time;
    @ApiModelProperty(value = "最后登录的ip地址") //最后登录的ip地址
    private String last_login_ip;
    @ApiModelProperty(value = "删除状态(f：未删除(未注销)，t：已删除(已注销，伪删除))") //删除状态（f：未删除(未注销)，t：已删除(已注销，伪删除)）
    private boolean delete_flag;
    @ApiModelProperty(value = "支付密码")           //支付密码
    private String pay_password;
    @ApiModelProperty(value = "城市code")           //城市code
    private String city_code;
    @ApiModelProperty(value = "预缴费停车费的余额")  //预缴费停车费的余额
    private Integer wallet_mny;
    @ApiModelProperty(value = "是否快速缴费离场")         //是否快速缴费离场
    private boolean isquickcharge;
    @ApiModelProperty(value = "是否快速缴费")            //是否快速缴费
    private boolean is_fast_charge;


}
