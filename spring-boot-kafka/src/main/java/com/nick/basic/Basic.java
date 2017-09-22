package com.nick.basic;

/**
 * Created by dreamcatchernick on 22/09/2017.
 */
public class Basic {
    private String messageId;
    private String messageContent;
    public Basic(){}

    public Basic(String messageId , String messageContent){
        this.messageId = messageId;
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String toString() {
        return String.format("%s:%s", messageId, messageContent);
    }
}
