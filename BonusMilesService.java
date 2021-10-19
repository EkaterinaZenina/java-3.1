public class BonusMilesService {
    public int calculate(int cost) {
        int amount = 20;
        int bonus = cost / amount;
        return bonus;
    }
}
