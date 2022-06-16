package com.constructor.org;

public class Employee {
	
	String timesheettype;
	String WeekDay;
	//define a parameterized constructor
	//Parameterized constructor has arguments and it is used to provide different values to distinct objects.
	Employee(String type,String Day ) {
		timesheettype=type;
		WeekDay=Day;
		}

	public void StausOfTimesheet(){
		System.out.println("The Timesheet Type is "+timesheettype+ " and the Day applied is "+WeekDay);
		
	}
	public static void main(String[] args) {
		Employee timesheet= new Employee("Training", "Monday.");
		timesheet.StausOfTimesheet();
		Employee timesheet2= new Employee("SrumMeet", "Tuesday.");
		timesheet2.StausOfTimesheet();
		

	}

}
