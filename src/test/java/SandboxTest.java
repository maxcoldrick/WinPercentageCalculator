import org.junit.Assert;
import org.junit.Test;

public class SandboxTest {

    @Test
    public void testWinPercentageCalculator() {
        Sandbox c = new Sandbox();

        //Given I have played x games
        int played = 14442;

        //And I have won y games
        int won = 7670;

        //Then my win percentage should be
        float winPc = c.calculateWinPercentage(won,played);
        Assert.assertEquals(53.1, winPc, 0.01);
    }

    @Test
    public void testGamesRequired() {
        Sandbox c = new Sandbox();

        //Given I have played x games
        int played = 2819;

        //And I have won y games
        int won = 1783;

        //And I win an average of 3/4 games from then on
        int averageWinStreak = 4;

        //And I am aiming for 70 win percentage
        int targetPercentage = 70;

        //Then I would need to play x games before I could reach my target win percentage
        int gamesRequired = c.gamesRequiredForPercentage(played,won,averageWinStreak,targetPercentage);
        Assert.assertEquals(gamesRequired, 6563);
    }

}

