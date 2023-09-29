package org.examples.java8.lambdaexpressions;

public class RunnableTask {

    public void oldWay() {
        /* Old way: Using an anonymous inner class or seperate implementation class */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Old Way Runnable!");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }

    public void newWay() {
        Runnable runnable = () -> {
            System.out.println("Hello from New Way Runnable!");
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }

    public static void main(String[] args) {
        RunnableTask task = new RunnableTask();
        System.out.println("Before calling threads");
        task.oldWay();
        task.newWay();
        System.out.println("After calling threads");
    }
}
