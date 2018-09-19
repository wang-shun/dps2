
package com.bizvpm.dps.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DPServer", targetNamespace = "http://server.dps.bizvpm.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DPServer {


    /**
     * 
     * @return
     *     returns com.bizvpm.dps.client.StringList
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.dps.bizvpm.com/DPServer/listOnlineProcessServiceRequest", output = "http://server.dps.bizvpm.com/DPServer/listOnlineProcessServiceResponse")
    public StringList listOnlineProcessService();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.dps.bizvpm.com/DPServer/getNamedProcessServiceRequest", output = "http://server.dps.bizvpm.com/DPServer/getNamedProcessServiceResponse")
    public String getNamedProcessService(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.dps.bizvpm.com/DPServer/getProcessServiceRequest", output = "http://server.dps.bizvpm.com/DPServer/getProcessServiceResponse")
    public String getProcessService();

}