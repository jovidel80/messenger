package com.joseoliveros.messenger.dao;

import com.joseoliveros.messenger.model.Message;

import java.util.List;

public interface MessageDao {

    Message findByMessageId(Long messageId);

    List<Message> findAllMessages();

    void saveMessage(Message message);

    void updateMessage(Long messageId, Message message);

    void deleteMessage(Long messageId);
}
