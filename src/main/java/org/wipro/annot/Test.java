package org.wipro.annot;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");
        context.registerShutdownHook();


        //Student student = (Student) context.getBean("student");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);

    }
}
