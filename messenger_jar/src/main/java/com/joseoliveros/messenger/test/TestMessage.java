package com.joseoliveros.messenger.test;

import com.joseoliveros.messenger.model.Message;
import com.joseoliveros.messenger.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/application-context.xml");

        MessageService messageService = context.getBean(MessageService.class);

        messageService.add(new Message("mensaje nuevo", "jose"));

//        System.out.println("list all: " + messageService.listAll());

//        Message message = messageService.listById(3L);
//        System.out.println(message);
//        messageService.update(3L, new Message("mensaje actualizado", "autor actualizado"));
//        System.out.println(messageService.listById(3L));
//        System.out.println();
//        messageService.delete(1L);
        for (Message message1 : messageService.listAll()) {
            System.out.println(message1);
        }
    }
}
