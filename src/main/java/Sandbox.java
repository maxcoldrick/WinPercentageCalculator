import java.math.BigDecimal;
class Sandbox {

    float calculateWinPercentage(int won, int played) {
        float winPc = (float)won / played * 100;
        return round(winPc);
    }

    private static float round(float number) {
        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

    int gamesRequiredForPercentage(int played, int won, int averageWinStreak, int targetPercentage){
        int counter;
        float currentPercentage = calculateWinPercentage(won,played);
        for (counter = 0; currentPercentage < targetPercentage; counter++) {
            played++;
            won++;
            if (counter % averageWinStreak == 0) won--;
            currentPercentage = calculateWinPercentage(won,played);
        }
        return played;
    }
}
