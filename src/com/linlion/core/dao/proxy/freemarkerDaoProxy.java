package com.linlion.core.dao.proxy;

import com.linlion.core.DatabaseConnection;
import com.linlion.core.freemarkerDriver;
import com.linlion.core.dao.freemakerDAO;

import freemarker.template.Configuration;

public class freemarkerDaoProxy implements freemakerDAO {

	private freemarkerDriver fd;

	public freemarkerDaoProxy() {
		Configuration fmc = fd.getConfiguration();
	}

	@Override
	public void doCreate() throws Exception {
		// TODO Auto-generated method stub

	}

}
