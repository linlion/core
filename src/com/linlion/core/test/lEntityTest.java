package com.linlion.core.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.linlion.core.DaoFactory;
import com.linlion.core.freemarkerDriver;
import com.linlion.core.dao.lEntityDao;
import com.linlion.core.models.lEntity;

public class lEntityTest {

	public static void main(String[] args) throws Exception {
		lEntityDao led = DaoFactory
				.getInstance2("com.linlion.core.dao.proxy.lEntityDaoProxy");
		lEntity le2 = led.findByNo("ent-000001");
		System.out.println(le2.getClassName());
		// led.doCreateTable();
		List l = led.findAll();
		freemarkerDriver fd = new freemarkerDriver("test.ftl");
		for (int i = 0; i < l.size(); i++) {
			lEntity le = (lEntity) l.get(i);
			Map<String, Object> root = new HashMap<String, Object>();
			root.put("clazz", le);
			root.put("attrs", led.getAttr(le));
			fd.setExportPath("src/com/linlion/core/model/" + le.getClassName()
					+ ".java");
			fd.process(root);
			System.out.println(UUID.randomUUID());
		}
		
		// System.out.println(le.getUuid());
		// System.out.println(le.getCreateDatetime());
		led.finalize();

	}

}
