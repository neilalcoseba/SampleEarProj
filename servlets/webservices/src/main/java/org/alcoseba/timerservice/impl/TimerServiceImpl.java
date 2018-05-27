package org.alcoseba.timerservice.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.alcoseba.timerservice.ITimerService;

@SOAPBinding(style = SOAPBinding.Style.RPC)
@WebService
public class TimerServiceImpl implements ITimerService {

	@Override
	public String getTime() {
		return null;
	}

	@Override
	public long getElapseTime() {
		return 0;
	}
}
