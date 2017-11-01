package com.seleniumpractice.first;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


	@Retention(RetentionPolicy.RUNTIME)
	public @interface SetTestName {
	 
	 /**
	  * Index of the parameter to use as the Test Case ID.
	  */
	 
	 int idx() default 0;
	 
	
}
