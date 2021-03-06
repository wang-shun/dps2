
package com.bizvpm.dps.client;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IProcessorManager", targetNamespace = "http://service.dps.bizvpm.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IProcessorManager {


    /**
     * 
     * @param task
     * @param processorTypeId
     * @return
     *     returns javax.xml.ws.Response<com.bizvpm.dps.client.Result>
     */
    @WebMethod(operationName = "run")
    public Response<Result> runAsync(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId);

    /**
     * 
     * @param task
     * @param asyncHandler
     * @param processorTypeId
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "run")
    public Future<?> runAsync(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId,
        @WebParam(name = "asyncHandler", partName = "asyncHandler")
        AsyncHandler<Result> asyncHandler);

    /**
     * 
     * @param task
     * @param processorTypeId
     * @return
     *     returns com.bizvpm.dps.client.Result
     * @throws ProcessException
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/runRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/runResponse", fault = {
        @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/run/Fault/ProcessException")
    })
    public Result run(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId)
        throws ProcessException
    ;

    /**
     * 
     * @param processorTypeId
     * @return
     *     returns com.bizvpm.dps.client.ParameterList
     * @throws ProcessException
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getParametersRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getParametersResponse", fault = {
        @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/runTask/Fault/ProcessException")
    })
    public ParameterList getParameters(
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId)
        throws ProcessException
    ;

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/isIdleRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/isIdleResponse")
    public boolean isIdle();

    /**
     * 
     * @return
     *     returns com.bizvpm.dps.client.ProcessorList
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorsRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorsResponse")
    public ProcessorList getProcessors();

    /**
     * 
     * @param task
     * @param processorTypeId
     * @throws ProcessException
     */
    @WebMethod
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/scheduleRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/scheduleResponse", fault = {
        @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/schedule/Fault/ProcessException")
    })
    public void schedule(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId)
        throws ProcessException
    ;

    /**
     * 
     * @param task
     * @param processorTypeId
     * @throws ProcessException
     */
    @WebMethod
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/scheduleTaskRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/scheduleTaskResponse", fault = {
        @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/scheduleTask/Fault/ProcessException")
    })
    public void scheduleTask(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId)
        throws ProcessException
    ;

    /**
     * 
     * @param processorTypeId
     * @return
     *     returns com.bizvpm.dps.client.ParameterList
     * @throws ProcessException
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/lookupParametersRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/lookupParametersParametersResponse", fault = {
        @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/runTask/Fault/ProcessException")
    })
    public ParameterList lookupParameters(
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId)
        throws ProcessException
    ;

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getProformenceScoreRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getProformenceScoreResponse")
    public double getProformenceScore();

    /**
     * 
     * @param processorTypeId
     * @return
     *     returns com.bizvpm.dps.client.ProcessorState
     * @throws ProcessException
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorStateRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorStateResponse", fault = {
        @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorState/Fault/ProcessException")
    })
    public ProcessorState getProcessorState(
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId)
        throws ProcessException
    ;

    /**
     * 
     * @param task
     * @param processorTypeId
     * @return
     *     returns javax.xml.ws.Response<com.bizvpm.dps.client.Result>
     */
    @WebMethod(operationName = "runTask")
    public Response<Result> runTaskAsync(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId);

    /**
     * 
     * @param task
     * @param asyncHandler
     * @param processorTypeId
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "runTask")
    public Future<?> runTaskAsync(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId,
        @WebParam(name = "asyncHandler", partName = "asyncHandler")
        AsyncHandler<Result> asyncHandler);

    /**
     * 
     * @param task
     * @param processorTypeId
     * @return
     *     returns com.bizvpm.dps.client.Result
     * @throws ProcessException
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.dps.bizvpm.com/IProcessorManager/runTaskRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/runTaskResponse", fault = {
        @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/runTask/Fault/ProcessException")
    })
    public Result runTask(
        @WebParam(name = "task", partName = "task")
        Task task,
        @WebParam(name = "processorTypeId", partName = "processorTypeId")
        String processorTypeId)
        throws ProcessException
    ;

}
