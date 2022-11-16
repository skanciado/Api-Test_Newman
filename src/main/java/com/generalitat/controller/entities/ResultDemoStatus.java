package com.generalitat.controller.entities;
 

public class ResultDemoStatus {
	public enum Status {
		SUCCES, FAIL
	};
	public static ResultDemoStatus getStatusOK() {
		ResultDemoStatus r= new ResultDemoStatus();
		r.status= Status.SUCCES;
		return  r; 
	}
	public static ResultDemoStatus getStatusKO(String msg) {
		ResultDemoStatus r= new ResultDemoStatus();
		r.status= Status.FAIL;
		r.message=msg;
		return  r; 
	}
	public ResultDemoStatus() {
		this.status= Status.FAIL;
		 
	}

	private Status status;
	private String message; 
  

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	 

}