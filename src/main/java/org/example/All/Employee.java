package org.example.All;

import java.net.Inet4Address;

public class Employee {
    private String name;
    private String gender;
    private String department;
    private Integer age;

    public Employee(){}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Employee( String name, String gender, String department,Integer age) {

        this.name = name;
        this.gender = gender;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +

                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

