package com.linlion.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.linlion.core.knowledge.lAttribute;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class freemarkerDriver {

	private Configuration cfg;
	private String tmpName;
	private String exportPath;

	public String getExportPath() {
		return exportPath;
	}

	public void setExportPath(String exportPath) {
		this.exportPath = exportPath;
	}

	public freemarkerDriver(String _tmpName) {
		this.tmpName = _tmpName;
		cfg = new Configuration();
		cfg.setClassForTemplateLoading(getClass(), "");
	}

	public Configuration getConfiguration() {
		return cfg;
	}

	/*
	 * 执行入口
	 */
	public static void main(String[] args) throws Exception {

//		String tmp = "test.ftl";
//		freemarkerDriver fd = new freemarkerDriver("test.ftl");
//		String _Dao = "com.linlion.core.lObjectDaoProxy";
//		lObjectDao lod = DaoFactory.getInstance2(_Dao);
//		lObject clazz = lod.findByNo("000002");
//		Map<String, Object> root = new HashMap<String, Object>();
//		root.put("clazz", clazz);
//		fd.setRoot(root);
//		fd.process();
	}

	/*
	 * 将模版进行指定文件的输出
	 */
	public void process(Map<String, Object> root) throws IOException,
		TemplateException, Exception {
		Template t = cfg.getTemplate(tmpName);
		OutputStream out = new FileOutputStream(new File(exportPath));
		t.process(root, new OutputStreamWriter(out));
	}

}
