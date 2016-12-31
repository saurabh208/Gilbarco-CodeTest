package com.codetest.timesapi.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codetest.timesapi.model.TimeModel;
import com.codetest.timesapi.repository.TimesRepository;

@Service
public class TimeService {

	@Autowired
	private TimesRepository timesDAO;
	
	private static final AtomicLong counter = new AtomicLong();
	
	public TimeModel getTimeModel() {
		long call = counter.incrementAndGet();
		String currentTimeStamp = timesDAO.getCurrentTimeStamp();
		return new TimeModel(currentTimeStamp, call);
	}
}
