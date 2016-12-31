package com.codetest.timesapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codetest.timesapi.model.TimeModel;
import com.codetest.timesapi.service.TimeService;

@RestController
@RequestMapping(value="/timeservice")
public class TimeController {

	private static final Logger LOG = LoggerFactory.getLogger(TimeController.class);
	
	@Autowired
	private TimeService timeService;
	
	@RequestMapping(method=RequestMethod.GET, value="/getTime")
	public TimeModel getCurrentTime() {
		LOG.info("Called...");
		return timeService.getTimeModel(); 
	}
}
