package com.linlion.core.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.linlion.core.test.dao.IEmpDAO;
import com.linlion.core.test.vo.Emp;

public class EmpDAOImpl implements IEmpDAO {
	private Connection con;
	private PreparedStatement stat = null;

	public EmpDAOImpl(Connection con) {
		this.con = con;
	}

	public boolean doCreate(Emp emp) throws Exception {
		String sql = "INSERT INTO emp(empno,ename,job,hiredate,sal) VALUES(?,?,?,?,?)";
		stat = con.prepareStatement(sql);
		stat.setInt(1, emp.getEmpno());
		stat.setString(2, emp.getEname());
		stat.setString(3, emp.getJob());
		stat.setDate(4, new java.sql.Date(emp.getHireDate().getTime()));
		stat.setFloat(5, emp.getSal());
		int update = stat.executeUpdate();
		if (update > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<Emp> findAll() throws Exception {
		String sql = "SELECT empno,ename,job,hiredate,sal FROM emp";
		stat = con.prepareStatement(sql);
		ResultSet rs = stat.executeQuery();
		Emp emp = null;
		List<Emp> list = new ArrayList<Emp>();
		while (rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			float sal = rs.getFloat(5);
			emp = new Emp();
			emp.setEmpno(empno);
			emp.setEname(ename);
			emp.setJob(job);
			emp.setHireDate(rs.getDate(4));
			emp.setSal(sal);
			list.add(emp);
		}
		return list;
	}

	public Emp findById(int empno) throws Exception {
		String sql = "SELECT empno,ename,job,hiredate,sal FROM emp WHERE empno=?";
		stat = con.prepareStatement(sql);
		stat.setInt(1, empno);
		ResultSet rs = stat.executeQuery();
		Emp emp = null;
		if (rs.next()) {
			String ename = rs.getString(2);
			String job = rs.getString(3);
			float sal = rs.getFloat(5);
			emp = new Emp();
			emp.setEmpno(empno);
			emp.setEname(ename);
			emp.setJob(job);
			emp.setHireDate(rs.getDate(4));
			emp.setSal(sal);
		}
		return emp;
	}
}