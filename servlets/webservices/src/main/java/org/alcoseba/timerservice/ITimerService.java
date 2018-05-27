package org.alcoseba.timerservice;

import javax.jws.WebMethod;

public interface ITimerService {
	@WebMethod
	String getTime();

	@WebMethod
	long getElapseTime();
}
