package practice_7_.cost.userMonitor;

import java.util.HashMap;
import java.util.HashSet;

public class UserMonitor {
    private HashSet<String> sessions;

    public UserMonitor(){
        this.sessions = new HashSet<>();
    }

    public void  addNewSession(String session){
      sessions.add(session);
    }
    //доступ к сессии
    public HashSet<String> getSession(){
        return this.sessions;
    }

    //хранение уникальных сессий
    //доступ к сессии
    public void printSessions(){
        System.out.println("Все уникальные сесии:");
        sessions.forEach(System.out::println);
    }
}
