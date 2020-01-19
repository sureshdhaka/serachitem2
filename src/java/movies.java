/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.simple.JSONObject;
/**
 *
 * @author ADMIN
 */
@WebService(serviceName = "movies")
public class movies {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "products")
    public String products(@WebParam(name = "p1") String p1) {
    JSONObject ob=new JSONObject();
    ob.put("p1", p1);
    String data =ob.toJSONString();
    return "movies list="+data;
    }
}
