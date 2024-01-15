package tuan2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cr4zyb0t
 */
public class CreateThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new DNRunnable1());
        thread.start();
    }
}

class DNRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Luong bat dau chay");
    }
}
