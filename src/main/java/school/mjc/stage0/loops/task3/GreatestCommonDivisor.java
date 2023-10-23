package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {


        int gcd=1;



        for (int k = 2; k <= first / 2 && k <= second / 2; k++)
        {
            if (first % k == 0 && second % k == 0) gcd = k;
        }
        System.out.println(gcd);
    }






    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor=new GreatestCommonDivisor();
        greatestCommonDivisor.printGCD(40,10);
    }
}
