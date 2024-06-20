package com.example.firstapplication.javaexs;

public class MessageImpl implements IMessage{
    @Override
    public void sendMessage() {
        System.out.println("Sending message from Impl");
    }
}
