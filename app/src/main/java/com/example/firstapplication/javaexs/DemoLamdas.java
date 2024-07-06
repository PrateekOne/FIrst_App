package com.example.firstapplication.javaexs;

public class DemoLamdas {

    public static void main(String[] args) {
        //life before lamdas
        MessageImpl message = new MessageImpl();
        message.sendMessage();

        OnClickImpl onClickimpl = new OnClickImpl();
        onClickimpl.onClick(12);

        //life after lamdas
        IMessage iMessage = () -> {
            System.out.println("sending message from lamda");
        };
        iMessage.sendMessage();
        OnClickListener onClickListener = (v) -> {
            System.out.println("Handling Lamda Click");
        };
        onClickListener.onClick(121);
    }
}
