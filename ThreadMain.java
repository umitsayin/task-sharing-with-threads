public class ThreadMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ArrayListManager arrayManager = new ArrayListManager();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                arrayManager.addArray();
                arrayManager.addArray2();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                arrayManager.addArray();
                arrayManager.addArray2();

            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                arrayManager.addArray();
                arrayManager.addArray2();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Elapsed Time : " + (endTime - startTime) + ", number of elements : " + arrayManager.size());
    }
}
