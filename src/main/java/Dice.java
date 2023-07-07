public class Dice {
    private int numOfDice;

    // Making a constructor
    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for(int i = 0; i < numOfDice; i++) {
            // toss all the dice once
            // might be getting random numbers?
            // keep track of the current sum of all the dice rolls
            sum += (int)(Math.random() * 6) + 1;
        }
        return sum;
    }
}
