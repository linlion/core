package com.linlion.core.models;

import java.util.Date;

import com.linlion.core.util.charUtil;

public class lEntity {

	public lEntity() {

	}

	private String uuid = charUtil.UUID();// ͨ��Ψһ��ʶ��

	private String No;// ʵ����

	private String packageName;// ����

	private String className;// ����

	private String label;// ʵ����ʾ����

	private String type;// ʵ������?class?interface

	private String higherNo;// �ϼ����

	private String belongTo;// �������Ǹ���֯

	private String createDatetime = new Date().toString();// ����ʱ��

	private String createAccount;// ʵ�崴�����˺�

	private String modifyDatetime = new Date().toString();// ʵ���޸�ʱ��

	private String modifyAccount;// ʵ���޸����˺�

	private String version = "0";// �汾
	
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
