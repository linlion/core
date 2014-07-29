package com.linlion.core.test.dao.factory;
import com.linlion.core.test.dao.IEmpDAO;
import com.linlion.core.test.dao.impl.EmpDAOProxy;
public class DAOFactory{
	public static IEmpDAO getInstance(){
		IEmpDAO dao = null;
		try{
			dao = new EmpDAOProxy();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return dao;
	}
}