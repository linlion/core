package com.linlion.core.test.dao.impl;

import java.util.List;

import com.linlion.core.DatabaseConnection;
import com.linlion.core.test.dao.IEmpDAO;
import com.linlion.core.test.vo.Emp;

public class EmpDAOProxy implements IEmpDAO {
	private DatabaseConnection dbc;
	private IEmpDAO dao = null;

	public EmpDAOProxy() throws Exception {
		dbc = new DatabaseConnection();
		dao = new EmpDAOImpl(dbc.getConnection());
	}

	public boolean doCreate(Emp emp) throws Exception {
		boolean flag = false;
		if (dao.findById(emp.getEmpno()) == null) {
			flag = dao.doCreate(emp);
		}
		dbc.close();
		return flag;
	}

	public List<Emp> findAll() throws Exception {
		List<Emp> list = dao.findAll();
		dbc.close();
		return list;
	}

	public Emp findById(int empno) throws Exception {
		Emp emp = dao.findById(empno);
		dbc.close();
		return emp;
	}
}