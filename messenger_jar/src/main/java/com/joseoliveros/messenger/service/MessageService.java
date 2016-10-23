package com.joseoliveros.messenger.service;

import com.joseoliveros.messenger.model.Message;

import java.util.Collection;
import java.util.List;

public interface MessageService {

    List<Message> listAll();

    Message listById(Long messageId);
    
    void add(Message message);

    void addAll(Collection<Message> messages);

    void update(Long messageId, Message message);

    void delete(Long messageId);
}
