package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Execution started" );
        
        ApplicationContext AppContext = new ClassPathXmlApplicationContext("springcfg.xml");
        
        Employee emp1=(Employee)AppContext.getBean("emp");
        
        System.out.println(emp1);
        
        
        
    }
}
