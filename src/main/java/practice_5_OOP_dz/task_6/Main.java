package practice_5_OOP_dz.task_6;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        botanicalGarden.setPlant(new Orchid());
        botanicalGarden.demonstrate();
        botanicalGarden.setPlant(new Cactus());
        botanicalGarden.demonstrate();
    }
}
