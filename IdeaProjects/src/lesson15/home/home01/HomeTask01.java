package lesson15.home.home01;

import java.util.concurrent.TimeUnit;

public class HomeTask01 {
    public static void main(String[] args) {
        MessageList messageList = new MessageList();
        Thread sendMessage = new Thread(new SendMessage(messageList),"SendMessageThread");
        Thread receivedMessage = new Thread(new ReceivedMessage(messageList),"ReceivedMessageThread");
        Thread readAllMessages = new Thread(new ReadAllMessages(messageList),"ReadAllMessagesThread");
        sendMessage.start();
        receivedMessage.start();
        try {
            receivedMessage.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        readAllMessages.start();

    }
}

class SendMessage implements Runnable {
    String[] message = {"I", "do", "joga", "almost", "every day"};
    MessageList messageList;

    public SendMessage(MessageList messageList) {
        this.messageList = messageList;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        for (String s : message) {
            messageList.sendMessage(s);
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

class ReceivedMessage implements Runnable {
    MessageList messageList;

    public ReceivedMessage(MessageList messageList) {
        this.messageList = messageList;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        for (int i = 0; i < messageList.getBoundarySize(); i++) {
            messageList.receivedMessage();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

class ReadAllMessages implements Runnable {
    MessageList messageList;

    public ReadAllMessages(MessageList messageList) {
        this.messageList = messageList;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        for (int i = 0; i < messageList.getIndex(); i++) {
            System.out.println(messageList.readAllMessage(i));
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
