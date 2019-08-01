package com.chw.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloQuartz implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("hello quartz! excuting at " + new Date() );
		
	}

}
