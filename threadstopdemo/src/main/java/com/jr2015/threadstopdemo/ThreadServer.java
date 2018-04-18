/**
 * Java Program to demonstrate how to stop a thread in Java.
 * There is a stop() method in Thread class but its deprecated
 * because of deadlock and other issue, but its easy to write
 * your own stop() method to stop a thread in Java.
 * @author java67
 */

package com.jr2015.threadstopdemo;

public class ThreadServer implements Runnable {

    private volatile boolean exit = false;

    public void run() {
        while(!exit){
            System.out.println("Server is running.....");
        }

        System.out.println("Server is stopped....");
    }


    public void stop() {
        exit = true;
    }

}

