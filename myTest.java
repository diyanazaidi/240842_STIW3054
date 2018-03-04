package myTest;

public class myTest extends Thread {

    public static void main(String[] args) {
        new Thread(new myTest()).start();
    	
    	/**MyThread t1 = new MyThread();
    	t1.start();
    	
    	MyThreadThread t2 = new MyThreadThread();
    	t2.start();**/
    	
    }
    @Override
    public void run() {
    	int j =5;
        try {
            for (int x = 1; x <= 20; x++) {
                System.out.print(j);
                sleep(500);
                j+=5;
                if (x%2==0) {
                	System.out.print("A");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}