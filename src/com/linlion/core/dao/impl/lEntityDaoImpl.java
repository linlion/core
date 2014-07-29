package com.linlion.core.dao.impl;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.linlion.core.lObject;
import com.linlion.core.lObjectConfig;
import com.linlion.core.dao.lEntityDao;
import com.linlion.core.model.config.lEntityConfig;
import com.linlion.core.models.lAttribute;
import com.linlion.core.models.lEntity;
import com.linlion.core.util.charUtil;
import com.linlion.core.util.classUtil;

public class lEntityDaoImpl implements lEntityDao {

	private Connection con;
	private PreparedStatement stat = null;

	public lEntityDaoImpl(Connection con) {
		this.con = con;
	}

	@Override
	public void doCreateTable() throws Exception {
		String sql = "CREATE TABLE ll_entity_set (";
		Field[] fs = lEntityConfig.class.getDeclaredFields();
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
	public void doCreate(lEntity le) throws Exception {
		// String sql = "INSERT INTO " + lRoot._lENTITY + " (" + "uuid,"
		// + "entNo," + "entName," + "entDisplayName," + "entAlias,"
		// + "entTableName," + "entAbbr," + "entType," + "higherNo,"
		// + "belongTo," + "createDatetime," + "createAccount,"
		// + "modifyDatetime," + "modifyAccount," + "version"
		// + ") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		// stat = con.prepareStatement(sql);
		// stat.setString(1, le.getUuid());
		// stat.setString(2, le.getEntNo());
		// stat.setString(3, le.getEntName());
		// stat.setString(4, le.getEntDisplayName());
		// stat.setString(5, le.getEntAlias());
		// stat.setString(6, le.getEntTableName());
		// stat.setString(7, le.getEntAbbr());
		// stat.setString(8, le.getEntType());
		stat.setString(9, le.getHigherNo());
		stat.setString(10, le.getBelongTo());
		stat.setString(11, le.getCreateDatetime());
		stat.setString(12, le.getCreateAccount());
		stat.setString(13, le.getModifyDatetime());
		stat.setString(14, le.getModifyAccount());
		stat.setString(15, le.getVersion());
		stat.executeUpdate();
		stat.close();

	}

	@Override
	public void doDelete(lEntity le) throws Exception {
		// String sql = "DELETE FROM " + lRoot._lENTITY + " WHERE entNo='"
		// + le.getEntNo() + "'";
		// stat = con.prepareStatement(sql);
		// stat.executeUpdate();
		// stat.close();

	}

	@Override
	public void doUpdate(lEntity le) throws Exception {
		// String sql = "UPDATE " + lRoot._lENTITY + " SET uuid=?," + "entNo=?,"
		// + "entName=?," + "entDisplayName=?," + "entAlias=?,"
		// + "entTableName=?," + "entAbbr=?," + "entType=?,"
		// + "higherNo=?," + "belongTo=?," + "createDatetime=?,"
		// + "createAccount=?," + "modifyDatetime=?," + "modifyAccount=?,"
		// + "version=? " + "WHERE uuid=?";
		// stat = con.prepareStatement(sql);
		// stat.setString(1, le.getUuid());
		// stat.setString(2, le.getEntNo());
		// stat.setString(3, le.getEntName());
		// stat.setString(4, le.getEntDisplayName());
		// stat.setString(5, le.getEntAlias());
		// stat.setString(6, le.getEntTableName());
		// stat.setString(7, le.getEntAbbr());
		// stat.setString(8, le.getEntType());
		stat.setString(9, le.getHigherNo());
		stat.setString(10, le.getBelongTo());
		stat.setString(11, le.getCreateDatetime());
		stat.setString(12, le.getCreateAccount());
		stat.setString(13, charUtil.date2String(new Date()));
		stat.setString(14, le.getModifyAccount());
		stat.setString(15, le.getVersion());
		stat.setString(16, le.getUuid());
		stat.executeUpdate();
		stat.close();

	}

	@Override
	public <T> T  findByNo(String no) throws Exception {
		String sql = "SELECT * FROM ll_entity_set WHERE No=?";
		stat = con.prepareStatement(sql);
		stat.setString(1, no);
		ResultSet rs = stat.executeQuery();
		lEntity le = new lEntity();
		le = classUtil.getBean(rs, le).get(0);
		stat.close();
		return (T)le;
	}

	@Override
	public <T> List<T> findAll() throws Exception {
		String sql = "SELECT * FROM ll_entity_set ORDER BY No ASC";
		stat = con.prepareStatement(sql);
		ResultSet rs = stat.executeQuery();
		lEntity le = new lEntity();
		List l = classUtil.getBean(rs, le);
		stat.close();
		return l;
	}

	@Override
	public List<lAttribute> getAttr(lEntity le) throws Exception {
		String sql = "select A.* from ll_atribute_set AS A,(select attrId FROM ll_entity_attr_map WHERE entId=?)as B where a.uuid=b.attrId";
		stat = con.prepareStatement(sql);
		stat.setString(1, le.getUuid());
		ResultSet rs = stat.executeQuery();
		lAttribute la = new lAttribute();
		List l = classUtil.getBean(rs, la);
		stat.close();
		return l;
	}
}
