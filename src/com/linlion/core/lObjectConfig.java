package com.linlion.core;

public class lObjectConfig {

	public final static String uuid = "CHAR(36) NOT NULL PRIMARY KEY";// 通用唯一标识符

	public final static String objNo = "CHAR(6)";// 实体编号

	public final static String objName = "CHAR(50)";// 实体名称

	public final static String objDisplayName = "CHAR(50)";// 实体显示名称

	public final static String objAlias = "CHAR(50)";// 实体别名

	public final static String objTableName = "CHAR(50)";// 实体存放表名

	public final static String objAbbr = "CHAR(50)";// 实体名称缩写

	public final static String objType = "CHAR(50)";// 实体类型

	public final static String higherNo = "CHAR(50)";// 上级编号

	public final static String belongTo = "CHAR(50)";// 所属于哪个组织

	public final static String createDatetime = "CHAR(50)";// 创建时间

	public final static String createAccount = "CHAR(50)";// 创建者账号

	public final static String modifyDatetime = "CHAR(50)";// 修改时间

	public final static String modifyAccount = "CHAR(50)";// 修改者账号

	public final static String version = "CHAR(6)";// 版本

	public final static String ststus = "CHAR(50)";// 版本

}
