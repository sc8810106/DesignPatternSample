package StructuralPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public void remove(Employee subordinate) {
        subordinates.remove(subordinate);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
