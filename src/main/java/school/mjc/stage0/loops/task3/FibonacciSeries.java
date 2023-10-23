package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0, b = 0, c,d,e;
        if (lastFibonacci == 0)
            //System.out.println(a);
        for (int i = 1; i <= lastFibonacci; i++) {
            c = a + b;
            d = a + b + c;
            e = a+ b+ c + d;
            a = b;
            b = c;
            c = d;
            d = e;
         }
        System.out.println(a + "  " +b);

    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries=new FibonacciSeries();
        fibonacciSeries.printFibonacci(9);
    }
}
