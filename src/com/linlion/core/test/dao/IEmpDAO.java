package com.linlion.core.test.dao;

import java.util.List;

import com.linlion.core.test.vo.Emp;

public interface IEmpDAO {
	public boolean doCreate(Emp emp) throws Exception;

	public List<Emp> findAll() throws Exception;

	public Emp findById(int empno) throws Exception;
}