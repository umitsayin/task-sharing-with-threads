import java.util.ArrayList;
import java.util.Random;

public class ArrayListManager {

    Random rand = new Random();
    ArrayList<Integer> array = new ArrayList<Integer>();

    Object lock1 = new Object();
    Object lock2 = new Object();

    public synchronized void arrayPush(){
        array.add(rand.nextInt(500));

    }
    public void addArray(){
      synchronized (lock1){
          for (int i = 0;i<2000;i++){

            arrayPush();
              try{
                  Thread.sleep(1);
              }catch (InterruptedException e){
                  e.printStackTrace();
              }

          }
      }
    }

    public void addArray2(){
        synchronized (lock2){
            for (int i = 0;i<2000;i++){

                arrayPush();
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public int size(){
        return array.size();
    }
    public void addArrayNotThread(){
        for (int i = 0;i<12000;i++){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Integer value = new Integer(rand.nextInt(1000));
            array.add(value);
        }
    }
}
