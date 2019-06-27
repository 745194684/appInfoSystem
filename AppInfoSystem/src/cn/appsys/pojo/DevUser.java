package cn.appsys.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class DevUser {
	private Integer id;//主键id
	private String devCode;//开发者帐号(系统登录账号)
	private String devName;//开发者名称
	private String devPassword;//开发者密码
	private String devEmail;//开发者邮箱
	private String devInfo;	//开发者简介
	private Integer createdBy;//创建者
	private Date creationDate;//创建时间
	private Integer modifyBy;//更新者
	private Date modifyDate;//更新时间
}
