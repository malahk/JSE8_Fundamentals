package ua.oracle.academy;

/**
 * Created by Admin on 24.06.2015.
 */
public class Threads {

    static class MyThread extends Thread {


        @Override
        public void run() {
            for(int i = 0; i < 100; ++i){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Thread th = new MyThread();
        th.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


