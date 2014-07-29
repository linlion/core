package com.linlion.${clazz.packageName};

/**
 *@author ${clazz.createAccount}${clazz.belongTo}
 *@link <a href="http://www.linlion.com">大连霖联科技有限公司</a> 
 *@version $Revision: ${clazz.version} $ $Date: ${clazz.modifyDatetime}
 */
public class ${clazz.className} {
 <#list attrs as being>  

    private ${being.type} ${being.name}; 
      </#list>  
      
   <#list attrs as being>      
    public ${being.type} get${being.name?cap_first}() {  
        return ${being.name};  
    }  
      
    public void set${being.name?cap_first}(${being.type} ${being.name}) {  
        this.${being.name} = ${being.name};  
    }  
 </#list>  

}