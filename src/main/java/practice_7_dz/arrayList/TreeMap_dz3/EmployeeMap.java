package practice_7_dz.arrayList.TreeMap_dz3;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap {
    private TreeMap<Integer, String> employees;

    public EmployeeMap() {
        this.employees = new TreeMap<>();
    }

    public void addEmployees(int id, String name) {
        employees.put(id, name);
    }

    public void printAll() {
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public void firstEmployee(Integer id) {
        System.out.println("Ближайший наибольший " + employees.higherKey(id));
    }

    public void lastEmployes(Integer id) {
        System.out.println("Ближайший наименьший " + employees.lowerKey(id));
    }


}
