package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {

        int sum = 0;

        for (int i = firstBoarder; i <= secondBoarder; i++)
            sum = sum + i;
        System.out.println (sum);
    }

    public static void main(String[] args) {
        RangeSum rangeSum=new RangeSum();
        rangeSum.printSumInclusive(3,7);
    }
}
