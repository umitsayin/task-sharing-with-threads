
public class NonThreadMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayListManager array = new ArrayListManager();
        array.addArrayNotThread();
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed Time : " + (endTime - startTime) +", number of elements : " + array.size());
    }
}
