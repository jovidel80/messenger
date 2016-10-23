package com.joseoliveros.messenger.dao;

import com.joseoliveros.messenger.model.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MessageDaoImplTest {
    
    @Autowired
    private MessageDao messageDao;

    @Test
    @Transactional
    @Rollback
    public void testSaveMessage() {
        Message message = new Message("mensaje a probar", "autor para probar");
        messageDao.saveMessage(message);
        System.out.println("mensaje creado: " + messageDao.findByMessageId(1L));

        List<Message> messages = messageDao.findAllMessages();
        assertEquals(message.getMessage(), messages.get(0).getMessage());
    }

}