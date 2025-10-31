package org.example.All;
import java.util.Objects;

public class Equals {
}



 class Employees {
    private int id;
    private String name;
    private String department;


    @Override
    public boolean equals(Object o) {
        // 1. Self check
        if (this == o) return true;
        // 2. Null and class check
        if (o == null || getClass() != o.getClass()) return false;
        // 3. Cast and compare
        Employees employee = (Employees) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }




    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }

}

