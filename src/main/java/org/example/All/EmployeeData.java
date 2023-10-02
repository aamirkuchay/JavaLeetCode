package org.example.All;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData {

    public static void main(String[] args) {
        List<Employee> employee = getEmployee();
         Map<String, Long> result = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        // System.out.println(result + "ress");

         List<Employee> emp = employee.stream().filter(e -> e.getDepartment().equals("wood")&&  e.getAge() < 13).collect(Collectors.toList());
//        System.out.println(emp+"collectttttttttt");

        Optional<Employee> highestAge = employee.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
//        System.out.println(highestAge + "  AGE");

        Optional<Integer> thirdHighestSalary = employee.stream().map(e->e.getAge()).sorted(Comparator.reverseOrder())
                .skip(2).findFirst();
//        System.out.println(thirdHighestSalary.get()+"  highestt");

        List<String> collect = employee.stream().map(i -> i.getDepartment()).collect(Collectors.toList());
//        System.out.println(collect);
        // get all the object fron the name---------------
         employee.stream().collect(Collectors.groupingBy(Employee::getName))
                .entrySet().forEach(x -> {
                     System.out.println(x.getKey()+"="+x.getValue().stream()
                             .map(Employee::getDepartment).collect(Collectors.joining(",")));
                });
    }


    public  static List<Employee> getEmployee(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("aamir","male","nature",120));
        list.add(new Employee("zahid","female","wood",23));
        list.add(new Employee("wahid","female","science",10));
        list.add(new Employee("sdla","male","wood",7));
        list.add(new Employee("sankk","male", "science", 9));
        return list;
    }


    interface EmployeeFilter {
        boolean filter(Employee employee);
    }

    public class Lamda {
        public static void main(String[] args) {
            EmployeeFilter adder = (e) ->e.getAge() > 30;
            List<Employee> filteredEmployees = filterEmployees(getEmployee(), adder);
            System.out.println("Filtered employees:");
            for (Employee employee : filteredEmployees) {
                System.out.println("Name: " + employee.getName() +
                        ", Age: " + employee.getAge() +
                        ", Salary: " + employee.getDepartment());
            }

        }
    }

    private static List<Employee> filterEmployees(List<Employee> employee, EmployeeFilter adder) {
        List<Employee> filteredList = new ArrayList<>();
        for (Employee emp : employee) {
            if (adder.filter(emp)) {
                filteredList.add(emp);
            }
        }

        return filteredList;


    }




}


