/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan2;

/**
 *
 * @author cr4zyb0t
 */
public class XuLyDaLuong {
    public static void main(String[] args) {
        Thread th1 = new Thread(new DNRunnable("Thread 1"));
        Thread th2 = new Thread(new DNRunnable("Thread 2"));
        th1.start();
        th2.start();
    }
}

class DNRunnable implements Runnable{
    private String threadName;
    public DNRunnable(String name){
        this.threadName = name;
    }
    @Override
    public void run() {
        for(int i = 1 ; i<=5; i++){
            try {
                System.out.printf("Thread %s - Buoc %d\n",this.threadName, i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}