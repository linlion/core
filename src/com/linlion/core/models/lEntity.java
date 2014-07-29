package com.linlion.core.models;

import java.util.Date;

import com.linlion.core.util.charUtil;

public class lEntity {

	public lEntity() {

	}

	private String uuid = charUtil.UUID();// 通用唯一标识符

	private String No;// 实体编号

	private String packageName;// 包名

	private String className;// 类名

	private String label;// 实体显示名称

	private String type;// 实体类型?class?interface

	private String higherNo;// 上级编号

	private String belongTo;// 所属于那个组织

	private String createDatetime = new Date().toString();// 创建时间

	private String createAccount;// 实体创建者账号

	private String modifyDatetime = new Date().toString();// 实体修改时间

	private String modifyAccount;// 实体修改者账号

	private String version = "0";// 版本
	
	private String status;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHigherNo() {
		return higherNo;
	}

	public void setHigherNo(String higherNo) {
		this.higherNo = higherNo;
	}

	public String getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(String belongTo) {
		this.belongTo = belongTo;
	}

	public String getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(String createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}

	public String getModifyDatetime() {
		return modifyDatetime;
	}

	public void setModifyDatetime(String modifyDatetime) {
		this.modifyDatetime = modifyDatetime;
	}

	public String getModifyAccount() {
		return modifyAccount;
	}

	public void setModifyAccount(String modifyAccount) {
		this.modifyAccount = modifyAccount;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
