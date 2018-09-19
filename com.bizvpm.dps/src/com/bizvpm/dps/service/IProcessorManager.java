package com.bizvpm.dps.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 * 
 */
@WebService(name = "IProcessorManager", targetNamespace = "http://service.dps.bizvpm.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IProcessorManager {

	/**
	 * 
	 * @param processorType
	 * @param task
	 * @return returns com.bizvpm.dps.service.Result
	 * @throws ProcessException
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/runRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/runResponse", fault = { @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/run/Fault/ProcessException") })
	public Result run(
			@WebParam(name = "task", partName = "task") Task task,
			@WebParam(name = "processorTypeId", partName = "processorTypeId") String processorTypeId)
			throws ProcessException;

	/**
	 * 
	 * @return returns com.bizvpm.dps.service.ProcessorList
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorsRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorsResponse")
	public ProcessorList getProcessors();

	/**
	 * 
	 * @param processorType
	 * @param task
	 * @throws ProcessException
	 */
	@WebMethod
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/scheduleRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/scheduleResponse", fault = { @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/schedule/Fault/ProcessException") })
	public void schedule(
			@WebParam(name = "task", partName = "task") Task task,
			@WebParam(name = "processorTypeId", partName = "processorTypeId") String processorTypeId)
			throws ProcessException;

	/**
	 * 
	 * @param processorType
	 * @param task
	 * @throws ProcessException
	 */
	@WebMethod
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/scheduleTaskRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/scheduleTaskResponse", fault = { @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/scheduleTask/Fault/ProcessException") })
	public void scheduleTask(
			@WebParam(name = "task", partName = "task") Task task,
			@WebParam(name = "processorTypeId", partName = "processorTypeId") String processorTypeId)
			throws ProcessException;

	/**
	 * 
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/isIdleRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/isIdleResponse")
	public boolean isIdle();

	/**
	 * 
	 * @return returns double
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getProformenceScoreRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getProformenceScoreResponse")
	public double getProformenceScore();

	/**
	 * 
	 * @param processorTypeId
	 * @return returns com.bizvpm.dps.service.ProcessorState
	 * @throws ProcessException
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorStateRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorStateResponse", fault = { @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/getProcessorState/Fault/ProcessException") })
	public ProcessorState getProcessorState(
			@WebParam(name = "processorTypeId", partName = "processorTypeId") String processorTypeId)
			throws ProcessException;

	/**
	 * 
	 * @param processorType
	 * @param task
	 * @return returns com.bizvpm.dps.service.Result
	 * @throws ProcessException
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/runTaskRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/runTaskResponse", fault = { @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/runTask/Fault/ProcessException") })
	public Result runTask(
			@WebParam(name = "task", partName = "task") Task task,
			@WebParam(name = "processorTypeId", partName = "processorTypeId") String processorTypeId)
			throws ProcessException;

	/**
	 * 
	 * @param processorType
	 * @param task
	 * @return returns com.bizvpm.dps.service.Result
	 * @throws ProcessException
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/getParametersRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/getParametersResponse", fault = { @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/runTask/Fault/ProcessException") })
	public ParameterList getParameters(
			@WebParam(name = "processorTypeId", partName = "processorTypeId") String processorTypeId)
			throws ProcessException;

	/**
	 * 
	 * @param processorType
	 * @param task
	 * @return returns com.bizvpm.dps.service.Result
	 * @throws ProcessException
	 */
	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://service.dps.bizvpm.com/IProcessorManager/lookupParametersRequest", output = "http://service.dps.bizvpm.com/IProcessorManager/lookupParametersParametersResponse", fault = { @FaultAction(className = ProcessException.class, value = "http://service.dps.bizvpm.com/IProcessorManager/runTask/Fault/ProcessException") })
	public ParameterList lookupParameters(
			@WebParam(name = "processorTypeId", partName = "processorTypeId") String processorTypeId)
			throws ProcessException;

}
