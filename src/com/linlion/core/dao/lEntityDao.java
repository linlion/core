package com.linlion.core.dao;

import java.util.List;

import com.linlion.core.models.lAttribute;
import com.linlion.core.models.lEntity;

public interface lEntityDao {

	public void doCreateTable() throws Exception;

	public void doCreate(lEntity le) throws Exception;

	public void doDelete(lEntity le) throws Exception;

	public void doUpdate(lEntity le) throws Exception;

	public <T> T findByNo(String no) throws Exception;

	public <T> List<T> findAll() throws Exception;

	public List<lAttribute> getAttr(lEntity le) throws Exception;

	public void finalize() throws Exception;

}
