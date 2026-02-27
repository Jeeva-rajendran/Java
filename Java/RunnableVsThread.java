// class A implements Runnable{
//     public void run(){
//        for (int i = 1; i <= 5; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } 
//             catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

public class RunnableVsThread {
    public static void main(String[] args) {

        // Here we are using Anonymous Class instead of creating a class and implement
        // the Runnable interface we can
        // directly use a Ananymous class.

        // Runnable is a Functional Interface so instead of using method name we can do
        // with lambda

        // Runnable obj1 = new A();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

            }
        };
        // Runnable obj2 = new B();

        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
