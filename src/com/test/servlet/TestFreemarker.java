package com.test.servlet;  
  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.Date;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class TestFreemarker extends HttpServlet {  
  
    private static final long serialVersionUID = 1L;  
  
    @Override  
    protected void service(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        String strValue = "this is String";  
        Date myDate  = new Date();  
        Object[] objectArray = new Object[]{1,"str",1.2};  
          
        Set<Object> setData = new HashSet<Object>();  
        setData.add("dataValue1");  
        setData.add("dataValue2");  
        setData.add("dataValue3");  
          
        List<String> strList = new ArrayList<String>();  
        strList.add("字符串1");  
        strList.add("字符串2");  
        strList.add("字符串3");  
          
        Map<String,Object> map = new HashMap<String, Object>();  
        map.put("key1", "value1");  
        map.put("key2", "value2");  
        map.put("key3", "value3");  
          
        req.setAttribute("strValue", strValue);  
        req.setAttribute("objectArray", objectArray);  
        req.setAttribute("strList", strList);  
        req.setAttribute("map", map);  
        req.setAttribute("myDate", myDate);  
        req.setAttribute("setData", setData);  
        req.getRequestDispatcher("/WEB-INF/view/chahua3109/index.html").forward(req, resp);  
    }  
}  