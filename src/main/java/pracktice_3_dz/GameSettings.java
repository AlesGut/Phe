package pracktice_3_dz;

public class GameSettings {
    static int maxPlayers = 20000; // общее ограничение игроков
    final String gameName; // название (нельзя менять)
    int currentPlayers; // сколько игроков в игре сейчас

    GameSettings(String someGameName, int someCurrentPlayers) { //конструктор для класса GameSettings
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayersCount) { //сеттер поля maxPlayersCount
        maxPlayers = newMaxPlayersCount;
    }

    void addPlayer() { //метод для увеличения числа игроков на +1
        this.currentPlayers++;
    }

    void printGameStatus() { // метод для вывода данных
        System.out.println("Название " + this.gameName + ", Текущее значение игроков " + this.currentPlayers + ", Максимальное число игроков " + maxPlayers);
    }
}
