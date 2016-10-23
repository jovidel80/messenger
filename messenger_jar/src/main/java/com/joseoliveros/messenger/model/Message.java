package com.joseoliveros.messenger.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@Entity
public class Message implements Serializable {
    
    private static final long serialVersionUID = 1183234382351454796L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    private String message;
    private String author;
    private Date created;

    public Message() {
        
    }

    public Message(String message, String author) {
        this.message = message;
        this.author = author;
        this.created = new Date();
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", message='" + message + '\'' +
                ", author='" + author + '\'' +
                ", created=" + created +
                '}';
    }
}
