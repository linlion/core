package com.linlion.core.model.config;

public class lEntityConfig {
	
	public final static String uuid =  "CHAR(36) NOT NULL PRIMARY KEY";// 通用唯一标识符

	public final static String No = "CHAR(50)";// 编号

	public final static String packageName = "CHAR(50)";// 包名

	public final static String className = "CHAR(50)";// 类名

	public final static String importList = "CHAR(50)";// 导入表名

	public final static String label = "CHAR(50)";// 实体显示名称

	public final static String type = "CHAR(50)";// 实体类型?class?interface

	public final static String higherNo = "CHAR(50)";// 上级编号

	public final static String belongTo = "CHAR(50)";// 所属于哪个组织

	public final static String createDatetime = "CHAR(50)";// 创建时间

	public final static String createAccount = "CHAR(50)";// 创建者账号

	public final static String modifyDatetime = "CHAR(50)";// 修改时间

	public final static String modifyAccount = "CHAR(50)";// 修改者账号

	public final static String version  = "CHAR(6)";// 版本
	
	public final static String status= "CHAR(50)";// 版本

}
