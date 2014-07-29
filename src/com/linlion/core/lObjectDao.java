package com.linlion.core;

import java.util.List;

public interface lObjectDao {

	public void doCreateTable() throws Exception;

	public void doCreate(lObject lo) throws Exception;

	public void doDelete(lObject lo) throws Exception;
	
	public void doUpdate(lObject lo) throws Exception;
	
	public <T> T findByNo(String no) throws Exception;
	
	public <T> List<T> findAll() throws Exception;

	public void finalize() throws Exception;

}
