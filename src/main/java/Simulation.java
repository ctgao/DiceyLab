public class Simulation {
    private int numOfRolls;
    private int numOfDice;
    private Dice theGame;
    private Bins tracker;

    // Constructor
    public Simulation(int numberOfDies, int numberOfTosses){
        this.numOfDice = numberOfDies;
        this.numOfRolls = numberOfTosses;

        this.theGame = new Dice(numberOfDies);
        this.tracker = new Bins(numberOfDies * 1, numberOfDies * 6);
    }

    public void runSimulation(){
        Integer curRoll;

        for(int i = 0; i < this.numOfRolls; i++){
            curRoll = theGame.tossAndSum();
            tracker.incrementBin(curRoll);
        }
    }

    public void printResults(){
//        ***
//        Simulation of 2 dice tossed for 1000000 times.
//                ***
//
//        2 :    27917: 0.03 **
//        3 :    55422: 0.06 *****
//        4 :    83457: 0.08 ********
//        5 :   110961: 0.11 ***********
//        6 :   139098: 0.14 *************
//        7 :   166977: 0.17 ****************
//        8 :   138386: 0.14 *************
//        9 :   111102: 0.11 ***********
//        10 :    83367: 0.08 ********
//        11 :    55799: 0.06 *****
//        12 :    27514: 0.03 **

        StringBuilder sb = new StringBuilder();

        // my basic strings
        String intro = "Simulation of %d dice tossed for %,d times.\n";
        String lineBreaker = "-----------------------------------------------\n\n";
//        String header = "Number\tTimes";
        String resulting = "%2d :\t%,7d :\t%.2f\n";

        sb.append(String.format(intro, numOfDice, numOfRolls));
        sb.append(lineBreaker);

        // Probabilities
        for (int i = numOfDice; i <= numOfDice * 6; i++){
            Integer binVal = tracker.getBin(i);
            sb.append(String.format(resulting, i, binVal, binVal/(double) numOfRolls));
        }

        // Now go print
        System.out.print(sb.toString());
    }
}
