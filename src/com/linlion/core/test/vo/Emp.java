package com.linlion.core.test.vo;

import java.util.*;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private Date hireDate;
	private float sal;

	public Emp() {

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public String toString(){
		return "com.linlion.core.test.vo.Emp";
	}
}