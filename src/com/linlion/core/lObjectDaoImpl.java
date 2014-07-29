package com.linlion.core;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.linlion.core.models.lEntity;
import com.linlion.core.util.charUtil;
import com.linlion.core.util.classUtil;

public class lObjectDaoImpl implements lObjectDao {

	private Connection con;
	private PreparedStatement stat = null;

	public lObjectDaoImpl(Connection con) {
		this.con = con;
	}

	@Override
	public void doCreateTable() throws Exception {
		String sql = "CREATE TABLE ll_object_set (";
		Field[] fs = lObjectConfig.class.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			if (i != 0)
				sql += ",";
			Field f = fs[i];
			sql += " " + f.getName() + " " + f.get(null);
		}
		sql += ")";
		stat = con.prepareStatement(sql);
		stat.executeUpdate();
		stat.close();
	}

	@Override
	public void finalize() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void doCreate(lObject lo) throws Exception {
		String sql = "INSERT INTO ll_object_set  (" + "uuid," + "objNo,"
				+ "objName," + "objLabel," + "objAlias," + "objTableName,"
				+ "objAbbr," + "objType," + "higherNo," + "belongTo,"
				+ "createDatetime," + "createAccount," + "modifyDatetime,"
				+ "modifyAccount," + "version"
				+ ") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		stat = con.prepareStatement(sql);
		stat.setString(1, lo.getUuid());
		stat.setString(2, lo.getObjNo());
		stat.setString(3, lo.getObjName());
		stat.setString(4, lo.getObjLabel());
		stat.setString(5, lo.getObjAlias());
		stat.setString(6, lo.getObjTableName());
		stat.setString(7, lo.getObjAbbr());
		stat.setString(8, lo.getObjType());
		stat.setString(9, lo.getHigherNo());
		stat.setString(10, lo.getBelongTo());
		stat.setString(11, lo.getCreateDatetime());
		stat.setString(12, lo.getCreateAccount());
		stat.setString(13, lo.getModifyDatetime());
		stat.setString(14, lo.getModifyAccount());
		stat.setString(15, lo.getVersion());
		stat.executeUpdate();
		stat.close();

	}

	@Override
	public void doDelete(lObject lo) throws Exception {
		String sql = "DELETE FROM ll_object_set WHERE objNo=?";
		stat = con.prepareStatement(sql);
		stat.setString(1, lo.getObjNo());
		stat.executeUpdate();
		stat.close();

	}

	@Override
	public void doUpdate(lObject lo) throws Exception {
		String sql = "UPDATE ll_object_set SET uuid=?," + "objNo=?,"
				+ "objName=?," + "objLabel=?," + "objAlias=?,"
				+ "objTableName=?," + "objAbbr=?," + "objType=?,"
				+ "higherNo=?," + "belongTo=?," + "createDatetime=?,"
				+ "createAccount=?," + "modifyDatetime=?," + "modifyAccount=?,"
				+ "version=? " + "WHERE uuid=?";
		stat = con.prepareStatement(sql);
		stat.setString(1, lo.getUuid());
		stat.setString(2, lo.getObjNo());
		stat.setString(3, lo.getObjName());
		stat.setString(4, lo.getObjLabel());
		stat.setString(5, lo.getObjAlias());
		stat.setString(6, lo.getObjTableName());
		stat.setString(7, lo.getObjAbbr());
		stat.setString(8, lo.getObjType());
		stat.setString(9, lo.getHigherNo());
		stat.setString(10, lo.getBelongTo());
		stat.setString(11, lo.getCreateDatetime());
		stat.setString(12, lo.getCreateAccount());
		stat.setString(13, charUtil.date2String(new Date()));
		stat.setString(14, lo.getModifyAccount());
		stat.setString(15, lo.getVersion());
		stat.setString(16, lo.getUuid());
		stat.executeUpdate();
		stat.close();

	}

	@Override
	public <T> T findByNo(String no) throws Exception {
		String sql = "SELECT * FROM ll_object_set WHERE objNo=? order by version desc";
		stat = con.prepareStatement(sql);
		stat.setString(1, no);
		stat.setMaxRows(1);
		ResultSet rs = stat.executeQuery();
		lObject lo = new lObject();
		lo = classUtil.getBean(rs, lo).get(0);
		stat.close();
		return (T) lo;
	}

	@Override
	public <T> List<T> findAll() throws Exception {
		String sql = "SELECT * FROM ll_object_set ORDER BY objNo ASC";
		stat = con.prepareStatement(sql);
		ResultSet rs = stat.executeQuery();
		lObject lo = new lObject();
		List l = classUtil.getBean(rs, lo);
		return l;
	}

}
