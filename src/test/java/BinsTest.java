import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void testGetBin() {
        // Given: max number of bins
        int maxBinLabel = 13;

        // When: bins get created
        Bins diceHistory = new Bins(0, maxBinLabel);

        // Then: bin value should be 0
        Assert.assertEquals(new Integer(0), diceHistory.getBin(maxBinLabel));
    }

    @Test
    public void testGetBin1() {
        // Given: number of dice and the max bin label
        int expectedBinValue = 7;
        int minBinLabel = 10;
        int maxBinLabel = 13;

        // When: Roll the dice and increment the bin
        Bins diceHistory = new Bins(minBinLabel, maxBinLabel);
        diceHistory.setBin(minBinLabel, expectedBinValue);

        // Then: bin value should increase
        Assert.assertEquals(new Integer(expectedBinValue), diceHistory.getBin(minBinLabel));
    }

    @Test
    public void testIncrementBin() {
        // Given: number of dice and the max bin label
        int numOfDice = 1;
        int maxBinLabel = numOfDice * 6;

        // When: bins get created
        Bins diceHistory = new Bins(numOfDice * 1, maxBinLabel);
        diceHistory.incrementBin(maxBinLabel);

        // Then: bin value should be 0
        Assert.assertEquals(new Integer(1), diceHistory.getBin(maxBinLabel));
    }

    @Test
    public void testIncrementBin1() {
        // Given: number of dice and the max bin label
        int numOfDice = 5;
        int maxBinLabel = numOfDice * 6;

        // When: bins get created
        Bins diceHistory = new Bins(numOfDice * 1, maxBinLabel);
        diceHistory.incrementBin(maxBinLabel);

        // Then: bin value should be 0
        Assert.assertEquals(new Integer(1), diceHistory.getBin(maxBinLabel));
    }
}
