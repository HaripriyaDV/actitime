package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass 
{
	@Test
	public void createCustomer()
	{
	  Reporter.log("Create Customer",true);
	  EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
	  et.setTaskTab();
	  TaskListPage tp=new TaskListPage(driver);
	  tp.setAddNewBtn();
	}
	
	

}
