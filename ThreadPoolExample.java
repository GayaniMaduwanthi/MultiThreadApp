/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadapp;

/**
 *
 * @author student
 /**
 * 
 * @author student
 */
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

       class Task implements Runnable {   
           private final int taskId;
           
           public Task(int taskId){
               this.taskId=taskId;
           }
           @Override
           public void run(){
               System.out.println("Task"+taskId+"is being processed by"+ Thread.currentThread().getName());
           }
       }
public class ThreadPoolExample{
    public static void main(String []args){
        ExecutorService executorService=Executors.newFixedThreadPool(3);
        
        for(int i=1; i<=5; i++){
            executorService.submit(new Task(i));
        }
        executorService.shutdown();
    }
}

   
   
     
