package com.linlion.core.dao.proxy;

import java.util.List;

import com.linlion.core.DatabaseConnection;
import com.linlion.core.dao.lEntityDao;
import com.linlion.core.dao.impl.lEntityDaoImpl;
import com.linlion.core.models.lAttribute;
import com.linlion.core.models.lEntity;

public class lEntityDaoProxy implements lEntityDao {

	private DatabaseConnection dbc;
	private lEntityDao dao = null;

	public lEntityDaoProxy() throws Exception {
		dbc = new DatabaseConnection();
		dao = new lEntityDaoImpl(dbc.getConnection());
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
	public void doCreate(lEntity le) throws Exception {
		dao.doCreate(le);

	}

	@Override
	public void doDelete(lEntity le) throws Exception {
		dao.doDelete(le);

	}

	@Override
	public void doUpdate(lEntity le) throws Exception {
		dao.doUpdate(le);

	}

	@Override
	public <T> T findByNo(String no) throws Exception {
		return dao.findByNo(no);
	}

	@Override
	public <T> List<T> findAll() throws Exception {
		return dao.findAll();
	}

	@Override
	public List<lAttribute> getAttr(lEntity le) throws Exception {
		return dao.getAttr(le);
	}
}
