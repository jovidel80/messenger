package com.joseoliveros.messenger.service.impl;

import com.joseoliveros.messenger.dao.MessageDao;
import com.joseoliveros.messenger.model.Message;
import com.joseoliveros.messenger.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Component
public class MessageServiceImpl implements MessageService {
    
    @Autowired
    private MessageDao messageDao;

    @Transactional(readOnly = true)
    public List<Message> listAll() {
        return messageDao.findAllMessages();
    }

    @Transactional(readOnly = true)
    public Message listById(Long messageId) {
        return messageDao.findByMessageId(messageId);
    }

    @Transactional
    public void add(Message message) {
        messageDao.saveMessage(message);
    }

    @Transactional
    public void addAll(Collection<Message> messages) {
        for (Message message : messages) {
            messageDao.saveMessage(message);
        }
    }

    @Transactional
    public void update(Long messageId, Message message) {
        messageDao.updateMessage(messageId, message);
    }

    @Transactional
    public void delete(Long messageId) {
        messageDao.deleteMessage(messageId);
    }
}
