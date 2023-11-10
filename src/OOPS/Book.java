package OOPS;

public class Book {
    private int noOfCopies;

    public void setNoOfCopies(int noOfCopies){
        if (noOfCopies>0)
            this.noOfCopies = noOfCopies;
        System.out.println("The number of book copies is: "+this.noOfCopies);
    }
    void increaseNoOfCopies(int howmuch){
        setNoOfCopies(this.noOfCopies + howmuch);;
    }
    void decreaseNoOfCopies(int howmuch){
        setNoOfCopies(this.noOfCopies - howmuch);;
    }
}
