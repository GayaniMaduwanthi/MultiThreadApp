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
class Counter {
     private int count = 0;
     
     public synchronized void increment(){
         count++;
     }
    public int getCount() {    
        return count;
    }    
    }
public class synchronizedExample extends Thread{
    private Counter counter;
    
    public Synchronizedexample (Counter counter){
        this.counter=counter;
    }
    @Override
    public void run(){
        for (int i=0; i<1000; i++){
            counter.increment();
        }
    }
    public static void main(String args[]) throws InterruptedException {
        Counter counter = new Counter();
        
        Thread thread1 = new SynchronizedExample(counter);      
        Thread thread2 = new SynchronizedExample(counter);  
        
        thread1.start();     
        thread2.start();
        
         thread1.join();  
         thread2.join();  
        System.out.println("Final counter value: " + counter.getCount());     
    } 
    }

    
