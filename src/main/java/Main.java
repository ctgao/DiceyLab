public class Main {
    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1_000_000);

        sim.runSimulation();

        sim.printResults();
    }
}
