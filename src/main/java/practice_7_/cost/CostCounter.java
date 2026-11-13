package practice_7_.cost;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    //private ArrayListNumm<Double> costsPerMont = new ArrayListNumm<>();
    private ArrayList<Double> costPerMonth;

    //массив, индекс = номер месяца


    public CostCounter() {
        this.costPerMonth = new ArrayList<>();
    }

    // метод добавления значения по номеру месяца (ОТ 1 ДО 12) и расходам в этом месяце
    public void addCosts(int month, Double costs) {
        costPerMonth.add(month - 1, costs);
    }

    //метод получения значения расхода по месяцу
    public Double getCosts(int month) {
        return costPerMonth.get(month - 1);
    }

    /*// считать месяц с минимальнымрасходом
    public int getMinCostMonth(){
      double  min = costPerMonth.getFirst();
       costPerMonth.forEach(
               costs ->{

               }
       );
        return 0;
    }*/
    //считать минимальный расход за месяц
    public Double minCostsPerMonth() {
        AtomicReference<Double> min = new AtomicReference<>(costPerMonth.getFirst());
        costPerMonth.forEach(
                costPerMonth -> {
                    if (costPerMonth < min.get()) {
                        min.set(costPerMonth);
                    }

                }
        );
        return min.get();
    }
}