package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   
	   ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	   
	   context.start();
	   
	   HelloWorld obj =  (HelloWorld) context.getBean("helloWorld");
	   obj.getMessage1();
	   
	   context.stop();
	   
	  /*ApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      objA.getMessage1();
      objA.getMessage2();*/
      
      /*HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();*/
      
      /*TextEditor te=(TextEditor) context.getBean("textEditor");
      te.spellCheck();*/
      
      /*JavaCollection jc=(JavaCollection) context.getBean("javaCollection");
      
      jc.getAddressList();
      jc.getAddressSet();
      jc.getAddressMap();
      jc.getAddressPrps();*/
      
      /*HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();*/
   }
}