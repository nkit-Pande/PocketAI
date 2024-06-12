package com.example.chatgbt_mybot;
public class Message {
    public static String SENT_BYT_ME = "me";
    public static String SENT_BYT_BOT = "bot";
    String msg, sentBy;

    public Message(String msg, String sentBy) {
        this.msg = msg;
        this.sentBy = sentBy;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

}
