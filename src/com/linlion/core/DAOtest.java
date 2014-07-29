package com.linlion.core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.linlion.core.dao.lEntityDao;
import com.linlion.core.models.lEntity;

public class DAOtest {

	public static void main(String[] args) throws Exception {
		// String _Dao = "com.linlion.core.knowledge.lEntityDaoProxy";
		String _Dao = "com.linlion.core.lObjectDaoProxy";
		lObjectDao lod = DaoFactory.getInstance2(_Dao);
//		 lod.doCreateTable();
		lObject lo = new lObject();
		lo.setObjNo("000006");
		lo.setObjName("lDictionary ");
		lo.setObjLabel("字典");
		lo.setObjTableName("ll_dictionary _set");
		lo.setObjAlias("");
		lo.setObjAbbr("dict");
		lo.setObjType("public");
		lo.setBelongTo("@linlion.com");
		lo.setCreateAccount("alex.ge");
//		lod.doCreate(lo);
		List l=lod.findAll();
		System.out.println(l.size());
		lObject loo=  lod.findByNo("000002");
		System.out.println(loo.getCreateDatetime());
		lod.finalize();
		

		// ed.doCreateTable();
		// lEntity le = new lEntity();
		// le.setEntNo("ent-140617-0001");
		// le.setEntName("lEntityName");
		// le.setEntDisplayName("实体管理");
		// le.setEntTableName("ll_entity_set");
		// le.setEntAlias("");
		// le.setEntAbbr("ent");
		// le.setEntType("public");
		// le.setBelongTo("@linlion.com");
		// le.setCreateAccount("alex.ge");
		// // ed.doCreate(le);
		// lEntity le2 = ed.findByNo("ent-140617-0002");
		// le2.setEntAbbr("att");
		// le2.setEntTableName("ll_attribute_set");
		// ed.doUpdate(le2);
		// // ed.doDelete(le);
		// ed.finalize();

	}

}
