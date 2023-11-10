package OOPS;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfProgramming.setNoOfCopies(362);
        effectiveJava.setNoOfCopies(612);
        cleanCode.setNoOfCopies(312);

        artOfProgramming.increaseNoOfCopies(112);
        effectiveJava.increaseNoOfCopies(34);
        cleanCode.increaseNoOfCopies(40);

        artOfProgramming.decreaseNoOfCopies(112);
        effectiveJava.decreaseNoOfCopies(34);
        cleanCode.decreaseNoOfCopies(40);


    }
}
