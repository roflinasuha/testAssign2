package test.testAssignment;


import java.util.Calendar;


public class totalDay extends ReadPdf implements Runnable {

	 @Override
	    public void run() {
	    	
	        Calendar cal = Calendar.getInstance();
	       	   int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
	       	   int total = days - 14;
	            System.out.println(Thread.currentThread().getName() +
	                    "\tTotal number of days : " + total);
	            
	    }
	}