package practice_7_.cost;

public class Main {
    public static void main(String[] args){
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 123.12);
        costCounter.addCosts(2, 1122.2);
        costCounter.addCosts(3, 3728.1);
        costCounter.addCosts(4, 743.2);
        costCounter.addCosts(5, 1233.2);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());
    }
}
