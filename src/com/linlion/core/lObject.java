package com.linlion.core;

import java.io.Serializable;
import java.util.Date;

import com.linlion.core.util.charUtil;

public class lObject implements Serializable {

	public lObject() {

	}

	private String uuid = charUtil.UUID();// ͨ��Ψһ��ʶ��

	private String objNo;// ʵ����

	private String objName;// ʵ������

	private String objLabel;// ʵ����ʾ����

	private String objAlias;// ʵ�����

	private String objTableName;// ʵ���ű���

	private String objAbbr;// ʵ��������д

	private String objType;// ʵ������

	private String higherNo;// �ϼ����

	private String belongTo;// �������Ǹ���֯

	private String createDatetime = new Date().toString();// ����ʱ��

	private String createAccount;// ʵ�崴�����˺�

	private String modifyDatetime = new Date().toString();// ʵ���޸�ʱ��

	private String modifyAccount;// ʵ���޸����˺�

	private String version = "0";// �汾
	
	private String status;//״̬

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getObjNo() {
		return objNo;
	}

	public void setObjNo(String objNo) {
		this.objNo = objNo;
	}

	public String getObjName() {
		return objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}

	public String getObjLabel() {
		return objLabel;
	}

	public void setObjLabel(String objLabel) {
		this.objLabel = objLabel;
	}

	public String getObjAlias() {
		return objAlias;
	}

	public void setObjAlias(String objAlias) {
		this.objAlias = objAlias;
	}

	public String getObjTableName() {
		return objTableName;
	}

	public void setObjTableName(String objTableName) {
		this.objTableName = objTableName;
	}

	public String getObjAbbr() {
		return objAbbr;
	}

	public void setObjAbbr(String objAbbr) {
		this.objAbbr = objAbbr;
	}

	public String getObjType() {
		return objType;
	}

	public void setObjType(String objType) {
		this.objType = objType;
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
