package com.qa.Runner;

import java.util.List;

import javax.swing.plaf.synth.SynthStyle;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class Runner {
	
	public static void main(String[] args)  {
		  List<String> suites = Lists.newArrayList();
		
		  System.out.println("Test message");
		  
	       TestListenerAdapter tla = new TestListenerAdapter();
	       TestNG testng = new TestNG();
	       suites.add(System.getProperty("user.dir")+"//testng.xml");
	       testng.setTestSuites(suites);
	       testng.addListener(tla);
	       testng.run();
	       
	}

}
