// Actually in this example it is executing simultaneously, but if we look closely what is happening.

/* If one thread execute first it will wait for another thread to execute in that mean time the execution of first
 thread in executing because of the speed of a system that's the reason we are getting multiple hello and multiple hii
 instead of Single hi and Single hello.
 */

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try{
            Thread.sleep(3);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        obj2.start();

        /* The priority of thread goes from 1 till 10, 1 is the least priority and 10 is the highest priority */
        System.out.println(obj1.getPriority());     // 5 is normal priority
        System.out.println(obj2.getPriority());

    }
}
