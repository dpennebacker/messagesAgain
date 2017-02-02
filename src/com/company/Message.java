package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Message {
    public String phoneNumber, message;
    private Date received;

    public Message(String num, String msg){
        phoneNumber = num;
        message = msg;
        received = new Date(System.currentTimeMillis());
    }

    public Date getReceivedTime(){
        return received;
    }

    public String getFormattedReceivedTime(){
        DateFormat df = new SimpleDateFormat("HH:mm");
        return df.format(received);
    }

    public void changeData(String n, String m){
        phoneNumber = n;
        message = m;
    }
    public String getNumber(){
        return phoneNumber;
    }

    public String getMessage(){
        return message;
    }
}
