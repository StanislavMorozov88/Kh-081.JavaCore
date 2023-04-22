package Lesson15.Homeworks;
    public class Hw3 {

        public static void main(String[] args) {
            Thread thread = new Thread(() -> {
                new Thread(() -> {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(Thread.currentThread().getName());
                    }; new Thread(() -> {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName());
                        }
                    },"Thread 3").start();
                },"Thread 2").start();
            });
            thread.start();
        }
    }

