package com.seleniumpractice.first;

import java.lang.reflect.Method;
import org.testng.ITest;
import org.testng.annotations.BeforeMethod;

public class TestNameSetter implements ITest{

	private String newTestName = "";

    private void setTestName(String newTestName){
        this.newTestName = newTestName;
    }

    public String getTestName() {

        return newTestName;
    }


  //  @BeforeMethod(alwaysRun=true)
    public void getTheNameFromParemeters(Method method, Object [] parameters){
    	SetTestName setTestName = method.getAnnotation(SetTestName.class);
        String testCaseName = (String) parameters[setTestName.idx()];
        setTestName(testCaseName);
    }
	
		 
}
