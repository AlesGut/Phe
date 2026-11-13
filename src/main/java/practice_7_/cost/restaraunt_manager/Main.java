package practice_7_.cost.restaraunt_manager;

public class Main {
    public static void  main(String[] args){
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Картошка фри");
        manager.printOrders();
        manager.addNewOrder("Спагетти");
        manager.printOrders();

        manager.getNextOrderForProcess();
        manager.printOrders();
    }
}
