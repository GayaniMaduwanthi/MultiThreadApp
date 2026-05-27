/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadapp;

/**
 *
 * @author student
 */
public class RunnableTask implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId()+"is executing the runnable task.");
    }
     public static void main (String[] args){
         RunnableTask task1=new RunnableTask();
         RunnableTask task2=new RunnableTask();
         
         Thread thread1=new Thread(task1);
         Thread thread2=new Thread(task2);
         
         thread1.start();
         thread2.start();
     }
}
