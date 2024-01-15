/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan2;

/**
 *
 * @author cr4zyb0t
 */
public class SumCaculator {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int numThreads = 5;
        SumCalc[] sums = new SumCalc[numThreads];
        Thread[] threads = new Thread[numThreads];
        for(int i = 0; i<numThreads;i++){
            int step = arr.length / numThreads;
            step = step * numThreads == arr.length ? step : step + 1;
            sums[i] = new SumCalc(arr, i*step, (i+1)*step);
            threads[i] = new Thread(sums[i]);
            threads[i].start();
        }
        int sum = 0;
        for(int i = 0; i< numThreads;i++){
            try {
                threads[i].join();
                sum += sums[i].getSum();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("SUM : " + sum);
    }
}
class SumCalc implements Runnable{
    private int[] arr;
    private int start, end, sum = 0;
    public SumCalc(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        if(end > arr.length) 
            this.end = arr.length;
        else 
            this.end = end;
        System.out.printf("START %d - END %d\n", this.start, this.end);
    }
    public int getSum(){
        return this.sum;
    }
    @Override
    public void run(){
        for(int i = start; i < end; i++){
            sum += arr[i];
        }
    }
}
