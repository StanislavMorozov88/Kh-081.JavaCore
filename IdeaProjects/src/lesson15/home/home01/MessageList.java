package lesson15.home.home01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class MessageList {
    List<String>list;
    int index;
    AtomicBoolean isReceived = new AtomicBoolean(false);

    private volatile boolean isReadyToRead = false;

    private int boundarySize;

    {
        list = new ArrayList<>();
        index = 0;
        boundarySize = 5;
    }

    public int getBoundarySize() {
        return boundarySize;
    }

    public int getIndex() {
        return index;
    }

    synchronized void sendMessage(String message){
        while (isReceived.get()){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        list.add(message);
        isReceived.set(true);
        System.out.println("Send message: " + message);
        notify();
    }

    synchronized String receivedMessage(){
        while (!isReceived.get()){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        String message = list.get(index++);
        if (index==boundarySize){
            isReadyToRead = true;
        }
        isReceived.set(false);
        notifyAll();
        System.out.println("Received message: " + message);
        return message;
    }

    synchronized String readAllMessage(int i){
        while (!isReadyToRead){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return list.get(i);
    }
}
