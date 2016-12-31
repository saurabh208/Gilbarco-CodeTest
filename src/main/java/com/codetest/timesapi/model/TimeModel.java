package com.codetest.timesapi.model;

import java.io.Serializable;

public class TimeModel implements Serializable {

	private static final long serialVersionUID = 20161231160000L;
	private String timeStamp;
	private long call;
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public long getCall() {
		return call;
	}
	public void setCall(long call) {
		this.call = call;
	}
	public TimeModel(String timeStamp, long call) {
		super();
		this.timeStamp = timeStamp;
		this.call = call;
	}
	@Override
	public String toString() {
		return "TimeModel [Current TimeStamp=" + timeStamp + ", Counter=" + call + "]";
	}
	

}
