package com.joseoliveros.messenger.dao;

import com.joseoliveros.messenger.model.Message;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class MessageDaoImpl implements MessageDao {

    @PersistenceContext
    private EntityManager em;


    public Message findByMessageId(Long messageId) {
        return em.find(Message.class, messageId);
    }

    public List<Message> findAllMessages() {
        return em.createQuery("SELECT m FROM Message m").getResultList();
    }

    public void saveMessage(Message message) {
        em.persist(message);
    }

    public void updateMessage(Long messageId, Message message) {
        message.setMessageId(messageId);
        em.merge(message);
    }

    public void deleteMessage(Long messageId) {
        Message message = em.find(Message.class, messageId);
        em.remove(message);
    }
}
