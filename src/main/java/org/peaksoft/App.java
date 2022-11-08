package org.peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);



        context.close();

    }
}
