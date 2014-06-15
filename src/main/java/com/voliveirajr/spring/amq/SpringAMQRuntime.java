package com.voliveirajr.spring.amq;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQRuntime {

    public static void main(String args[]) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springamq_receiver.xml");
        context.registerShutdownHook();
    }

}
