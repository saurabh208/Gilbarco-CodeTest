package com.codetest.timesapi.repository;

import org.springframework.stereotype.Repository;

import com.codetest.timesapi.util.ISO8601;

@Repository
public class TimesRepository {

	public String getCurrentTimeStamp() {
		return ISO8601.now();
	}
}
