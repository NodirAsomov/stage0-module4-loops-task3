package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char c;
        /*for(c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + "\n");

        System.out.println();*/

        for(c = 'a'; c <= 'z'; ++c)
            System.out.print(c + "\n");
    }

    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter=new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
}
