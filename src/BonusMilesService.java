public class BonusMilesService {
    public int calculate(int cost) {
        int amountRubles = 20;
        int miles = cost / amountRubles;
        return miles;
    }
}
