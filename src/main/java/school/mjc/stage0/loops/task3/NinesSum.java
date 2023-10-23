package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int p=9,i;
        int sum=0;
        for(i=1;i<=lengthOfLastNumber;i++)
        {
            sum+=p;
            p=(p*10)+9;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        NinesSum ninesSum= new NinesSum();
        ninesSum.calculateSum(9);
    }
}
