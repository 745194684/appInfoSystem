package cn.appsys.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AppInfo {

    private Integer id;//主键id
    private String softwareName;//软件名称
    private String APKName;//APK名称
    private String supportROM;//支持ROM
    private String interfaceLanguage;//界面语言
    private Date updateDate;//更新日期
    private BigDecimal softwareSize;//软件大小（单位：M）
    private Integer devId;//开发者id
    private String appInfo;//应用简介
    private Integer status;//app状态id
    private Date onSaleDate;//上架时间
    private Date offSaleDate;//下架时间
    private Integer categoryLevel3;//所属三级分类id
    private Integer downloads;//下载量（单位：次）
    private Integer flatformId;//app所属平台id
    private Integer createdBy;//创建者
    private Date creationDate;//创建时间
    private Integer modifyBy;//更新者
    private Date modifyDate;//更新时间

    private String statusName;//app状态名称
    private String flatformName;//app所属平台名称
    private String categoryLevel3Name;//所属三级分类名称
    private String devName;//开发者名称

    private Integer categoryLevel1;//所属一级分类id
    private Integer categoryLevel2;//所属二级分类id

    private String categoryLevel1Name;//所属一级分类名称
    private String categoryLevel2Name;//所属二级分类名称

    private String logoPicPath;//LOGO图片URL路径
    private String logoLocPath;//LOGO图片的服务器存储路径

    private Integer versionId;//最新的版本id
    private String versionNo;//最新的版本号


}
