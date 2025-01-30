package org.example.code;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CodeJava {
    public static void main(String[] args) {

//     var integer =    Arrays.asList(1,2,3,4,5,6,7,8).stream().filter(i->i % 2 == 0).reduce(Integer::sum);


        List<Integer> list = Arrays.asList(1, 23, 45, 67, 89, 0);

        Optional<Integer> ll = list.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst();
        System.out.println(ll.get());

//        ArrayList<Integer> ll = new ArrayList(Arrays.asList(2,3,4,5,6));
//        Collections.sort(ll,Collections.reverseOrder());
//        Collections.reverse(ll);

    }


//
//    public static void main(String[] args) throws IllegalAccessException{
//
////        List<String> list = new ArrayList<>();
//        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
//        list.add("apple");
//        list.add("banana");
//        list.add("orange");
//
//        for(String s : list){
////            System.out.println(s);
//            if(s.equals("apple")){
//                list.add("mobile");
//                System.out.println("add mobile while reading");
//            }
//        }
//        System.out.println(list);
//
//    }
}
