import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void testTossAndSum1(){
        // Given (a single dice)
        int numOfDice = 1;
        Dice dice = new Dice(numOfDice);

        // When (toss and sum that dice)
        Integer expectedSum = dice.tossAndSum();

        // Then (is it within the range of 1-6?)
        Assert.assertTrue(expectedSum > 1 * numOfDice);
        Assert.assertTrue(expectedSum < 6 * numOfDice);
    }

    @Test
    public void testTossAndSum2(){
        // Given (a single dice)
        int numOfDice = 5;
        Dice dice = new Dice(numOfDice);

        // When (toss and sum that dice)
        Integer expectedSum = dice.tossAndSum();

        // Then (is it within the range of 1-6?)
        Assert.assertTrue(expectedSum > 1 * numOfDice);
        Assert.assertTrue(expectedSum < 6 * numOfDice);
    }
}
