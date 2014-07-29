package com.linlion.core;

import java.util.List;

import com.linlion.core.DatabaseConnection;

public class lObjectDaoProxy implements lObjectDao {

	private DatabaseConnection dbc;
	private lObjectDao dao = null;

	public lObjectDaoProxy() throws Exception {
		dbc = new DatabaseConnection();
		dao = new lObjectDaoImpl(dbc.getConnection());
	}

	@Override
	public void doCreateTable() throws Exception {
		dao.doCreateTable();
	}

	@Override
	public void finalize() throws Exception {
		dbc.finalize();

	}

	@Override
	public void doCreate(lObject lo) throws Exception {
		dao.doCreate(lo);

	}

	@Override
	public void doDelete(lObject lo) throws Exception {
		dao.doDelete(lo);

	}

	@Override
	public void doUpdate(lObject lo) throws Exception {
		dao.doUpdate(lo);

	}

	@Override
	public lObject findByNo(String no) throws Exception {
		return dao.findByNo(no);
	}

	@Override
	public List<?> findAll() throws Exception {
		return dao.findAll();
	}
}
