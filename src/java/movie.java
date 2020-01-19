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
@WebService(serviceName = "movie")
public class movie {

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
    @WebMethod(operationName = "first")
    public String first(@WebParam(name = "Jumanji") String Jumanji, @WebParam(name = "the dark knight") String thedarkknight) {
        //TODO write your implementation code here:
        JSONObject ob =new JSONObject();
        ob.put("Jumanji", Jumanji);
        ob.put("the darkknight", thedarkknight);
        String data=ob.toJSONString();
        return data;
    }
}
