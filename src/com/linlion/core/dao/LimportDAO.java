package com.linlion.core.dao;

import java.util.List;

import com.linlion.core.model.Limport;

public interface LimportDAO {

	public void doCreate(Limport li) throws Exception;

	public void doUpdate(Limport li) throws Exception;

	public void doDelete(Limport li) throws Exception;

	public Limport selectOne(String str) throws Exception;

	public List<Limport> selectPart(String str) throws Exception;

	public List<Limport> selectAll() throws Exception;

}
