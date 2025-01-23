package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Stream {
    // lemda expression -> no name , no Return Type, No access modifier, Its used to implement Functional Interface,
//   those interface which has only 1 Abstract method(method without body) public abstract void run();
//    class Task implements Runnable{
//        @Override
//        public void run() {
//            System.out.println("hello");
//        }
//    }
//    public static void main(String[] args) {
////        Thread t1 = new Thread( new Task());
//        Thread t1 = new Thread(()->{
//            System.out.println("hello");
//        });
//        t1.start();
//        // for functional interface example============================
//        MathOperation sumOpertion = (int a, int b) ->{
//           return a + b;
//        };
//        MathOperation subtract = (int a, int b) ->{
//            return  a - b;
//        };
//      int sub =  subtract.operate(3, 2);
//      int sum =  sumOpertion.operate(4,8);
//        System.out.println(sub + " Sum  " + sum);
//    }


//    class SubOperation implements MathOperation{
//
//        @Override
//        public int operate(int a, int b) {
//            return a + b;
//        }
//    }

//    interface MathOperation{
//        int operate(int a, int b);
//    }


    // ============================Predicate=========================================================
// its also a functional interface (Boolean valued Function), having 1 abstract method muktiple default method, boolean test(T t);


//    public static void main(String[] args) {
//        Predicate<Integer> isEven = x -> x % 2 == 0;
////        System.out.println( isEven.test(4));
//        Predicate<String> isWordStatsWithA = x -> x.toLowerCase().startsWith("A");
////        System.out.println(isWordStatsWithA.test("alamdar"));
//        Predicate<String> iswordEndsWith = x -> x.toLowerCase().endsWith("x");
////        System.out.println(iswordEndsWith.test("alamdax"));
//        Predicate<String> both = isWordStatsWithA.and(iswordEndsWith);
//        System.out.println(both.test("Alamx"));
//
//    }


    //==================================FUNCTION===================================================
    //<input,return> --fucntional interface

//    public static void main(String[] args) {
//        Function<Integer,Integer> doubleit = x -> 2 * x;
//        Function<Integer,Integer> tripleIt = x -> 3 * x;
////        System.out.println(doubleit.andThen(tripleIt).apply(20));
////        System.out.println(doubleit.apply(100));
//        Function<Integer,Integer> indentity = Function.identity();
//        System.out.println(indentity.apply(5));
//    }

    //==================================CONSUMER===================================================
    // Functional Interface with no return type

//    public static void main(String[] args) {
//        Consumer<Integer> print = (x) ->System.out.println(x);
//        print.accept(5);
//       List<Integer> list =  Arrays.asList(1,2,3);
//       Consumer<List<Integer>> printList = x ->{
//           for(int i : x){
//               System.out.println(i);
//           }
//       };
//       printList.accept(list);
//    }


    //==================================SUPPLIER===================================================
   // functional interface, no input only output

//    public static void main(String[] args) {
//        Supplier<String> supp = () -> "Hello developer";
//        System.out.println(supp.get());
//    }


    //==================================COMBINED EXAMPLE===================================================

//    public static void main(String[] args) {
//        Predicate<Integer> predicate = (x) -> x % 2 == 0;  // Check for even numbers
//        Function<Integer, Integer> function = (x) -> x * x;  // Square the number
//        Consumer<Integer> consumer = (x) -> System.out.println(x);  // Print the number
//        Supplier<Integer> supplier = () -> 122;  // Supply the number 122
//
//        if (predicate.test(supplier.get())) {  // Predicate will return true for 122
//            consumer.accept(function.apply(supplier.get()));  // This will print the square of 122
//        }
//    }


    //==================================METHOD REFRENCE===================================================
    // we can use method without invoking & use in place of lemda expressions

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("zaid","majid","water","soil");
//        list.forEach(x -> System.out.println(x));
//        list.forEach(System.out::println);

 // ==========CONSTRUCTOR REFRENCE=========================================
//        List<String> names = List.of("book","copy","sakib");
//       List<MobilePhone> mobile = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
//        List<MobilePhone> mobile = names.stream().map(x -> MobilePhone::new).collect(Collectors.toList());
//        mobile.forEach(phone -> System.out.println(phone.name));



    }

 static class MobilePhone{
        String name;
    public MobilePhone(String name) {
        this.name = name;
    }
}




}
