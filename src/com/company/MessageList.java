package com.company;


import java.util.ArrayList;

public class MessageList {
    public ArrayList<Message> messages = new ArrayList<Message>();
    public String title = "";

    public MessageList(String t){
        title = t;
    }

    public void add(Message m){
        int count = 0;
        long time = m.getReceivedTime().getTime();
        for(Message msg: messages){
            if(time > msg.getReceivedTime().getTime()){
                count++;
            }
        }
        messages.add(count, m);
    }

    public void remove(int position){
        messages.remove(position);
    }

    public void clear(){
        messages.clear();
    }

    public Message get(int position){
        return messages.get(position);
    }

    public void move(int position, MessageList ml1, MessageList ml2){
        if(ml1 == null){
            System.out.println("The message list you specified does not exist.");
        }
        else{
            ml1.add(ml2.get(position));
            ml2.remove(position);
        }
    }

    public void displayMsgs(){
        System.out.println("From: " + title);
        for(Message m: messages){
            System.out.println("\t" + m.getMessage() + "   Recieved: " + m.getFormattedReceivedTime() + "\n");
        }
    }

    public String getNum(){
        return title;
    }


}
