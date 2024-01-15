/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan2;

/**
 *
 * @author cr4zyb0t
 */
public class CycleLifeThread {
    public static void main(String[] args) {
        Thread th = new Thread(new DNRunnable2());
        th.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        th.interrupt();
    }
}

class DNRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread bat dau chay ! - "+Thread.currentThread().getState());
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Thread bi ngat - "+Thread.currentThread().getState());
        }
        System.out.println("Thread ket thuc - "+Thread.currentThread().getState());
    }
    
}