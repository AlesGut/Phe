package practice_7_dz.collection.OptionalTask;

import java.util.HashMap;
import java.util.Map;

public class UserID {
    private HashMap<Integer, String> users;

    public UserID() {
        this.users = new HashMap<>();
    }

    public void addUser(Integer id, String name) {

        users.put(id, name);

    }

    public void searсhUser(Integer id) {
        if (users.containsKey(id)) {
            System.out.println(users.get(id));
        } else {
            System.out.println("Нет такого пользователя");
        }
    }

    public void printAllUser() {
        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
