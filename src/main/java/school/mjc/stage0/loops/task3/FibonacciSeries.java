package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int first = 0;
        int second = 1;
        for (int i = 0; i < 4; i++) {
              if(i==0)
            System.out.println(first);
            System.out.println(second);
            int temp = second;
            second = first + second;
            first = temp;
        }
    }
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries=new FibonacciSeries();
        fibonacciSeries.printFibonacci(4);
    }
}
