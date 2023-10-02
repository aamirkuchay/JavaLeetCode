package org.example.junit;

public class SimpleCalculator implements  Calculation,Calculation2 {



    public static void main(String[] args) {
       SimpleCalculator calculator = new SimpleCalculator();
       calculator.i1();

    }


    @Override
    public void i1() {
        System.out.println("i1");
    }
}
