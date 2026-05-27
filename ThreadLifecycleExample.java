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
public class ThreadLifecycleExample extends Thread {
    @Override
    public void run() {   
        System.out.println(Thread.currentThread().getName() + " - State: " + Thread.currentThread().getState());
     try {          
    Thread.sleep(2000);
} 
catch (InterruptedException e) {    
    e.printStackTrace();      
}         
    System.out.println(Thread.currentThread().getName() + " - State after sleep: " + Thread.currentThread().getState());     }  
    
    public static void main(String[] args) { 
    ThreadLifecycleExample thread = new ThreadLifecycleExample();    
    System.out.println(thread.getName() + " - State before start: " + thread.getState());  
    thread.start();       
    System.out.println(thread.getName() + " - State after start: " + thread.getState());   
} 
}

