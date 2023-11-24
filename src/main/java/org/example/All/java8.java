package org.example.All;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.sql.SQLOutput;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {

    public static void main(String[] args) {
//        LocalTime base = LocalTime.of(0,0,0);
//        LocalTime newTime = base.plus(2,ChronoUnit.HOURS).plus(30,ChronoUnit.MINUTES).plus(49,ChronoUnit.SECONDS);
//        System.out.println("The new time is: " + newTime);


        //   bubble sort -----------------------------------------------
//        int[] number = {2,4,3,6,8,6,1,7,0};
//        for(int i=0;i<number.length-1;i++){
//            for(int j =0;j<number.length-i-1;j++){
//                if(number[j] > number[j+1]){
//                    int temp =number[j];
//                    number[j]= number[j+1];
//                    number[j+1]= temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(number));

  //------------------------ Binary search --------------------------------------------------------------
//        public static int binarySearch(int[] arr, int target){
//            int left = 0;
//            int right = arr.length - 1;
//            while (left <= right){
//                int mid = (left + right) / 2;
//                if(arr[mid] == target){
//                    return  mid;
//                } else if (arr[mid] < target) {
//                    left = mid + 1;
//                } else if (arr[mid] > target) {
//                    right = mid - 1;
//                }
//            }
//            return -1;
//        }
//        public static void main(String[] args) {
//            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int target = 10;
//            int result = binarySearch(arr,target);

// -----------------IS PRIME----------------------------------------------------
//        public static boolean isPrime(int number){
//            if(number <= 1){
//                return false;
//            }
//            for(int i=2;i*i <= number;i++){
//                if(number % i == 0 ){
//                    return false;
//                }
//            }
//            return true;
//        }


            //duplicate string find------------------------

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a string of comma-separated values:");
//            String input = sc.nextLine();
//            String[] strings = input.split(",");
//
//            Set<String> set = new HashSet<>();
//            Set<String> duplicates = new HashSet<>();
//
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            //            for (String s : strings) {
//                if (!set.add(s)) {
//                    duplicates.add(s);
//                }
//            }
//
//            if (!duplicates.isEmpty()) {
//                System.out.println("Duplicates found: " + duplicates);
//            } else {
//                System.out.println("No duplicates found.");
//            }


            //  Write a program that can process two sequences of strings and return sorted sequences. ------
            // public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the first sequence of strings separated by commas: ");
//        String input1 = scanner.nextLine();
//        String[] strings1 = input1.split(",");
//        System.out.print("Enter the second sequence of strings separated by commas: ");
//        String input2 = scanner.nextLine();
//        String[] strings2 = input2.split(",");
//        String[] allStrings = new String[strings1.length + strings2.length];
//        System.arraycopy(strings1, 0, allStrings, 0, strings1.length);
//        System.arraycopy(strings2, 0, allStrings, strings1.length, strings2.length);
//        Arrays.sort(allStrings);
//        System.out.println("The sorted sequence of strings is: " + Arrays.toString(allStrings));


            //  }
   //---------------LIST CONCAT ----------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> list2 = Arrays.asList(6,7,8,9,10,2);
//        List<Integer> mergeList = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
//         System.out.println(mergeList);


//        List<Integer> unique = mergeList.stream().distinct().collect(Collectors.toList());
//        // System.out.println(unique );

            // List<String> name = Arrays.asList("php","aamir","python","java","s","c*");
//        List<String> res = name.stream().filter(e -> e.length() > 3).collect(Collectors.toList());
            // System.out.println(res);

            // Random random = new Random();
            // random.ints(1,100).limit(1).forEach(System.out::println);

            // List<String> countries = Arrays.asList("india","pakistan","china","russia");
//       String str =  countries.stream().map(i->i.toUpperCase()).collect(Collectors.joining(", "));
//        System.out.println(str);

            // add sum of the array to each element pof the array in java 8 -----

//        List<Integer> ss = Arrays.asList(10,20,30,40);
//       Integer sum = ss.stream().reduce(0,Integer::sum);
            // System.out.println(sun);
//        List<Integer> sums = ss.stream().map(i -> i+ sum).collect(Collectors.toList());
            // System.out.println(sums);


            //find the character that starts and ends with same character-------------------
            //  List<String> jj = Arrays.asList("mnm","adgf","onu","tyt");
//           jj.stream().filter(i->i.length() > 0 && i.endsWith(String.valueOf(i.charAt(0))))
//                           .forEach(System.out::print);

// ------------------------- show how many times is string is repeated-----------------------------------------------
//             String stra = "welcome to sun the sun is welcome you";
//        List<String> list = Arrays.asList(stra.split(" "));
//        Map<String, Long> sst = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(sst);

// ---------------------  sort the string  -----------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        char[] chars = input.toCharArray();
//        Arrays.sort(chars);
//        String sortedString = new String(chars);
//        System.out.println("Sorted string: " + sortedString);

//      ----------give me the largest second largest and third-largest element in array---------------------------
//        int[] arr = {1,34,65,78,99,32,45,76};
//        int largest = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//
//        for(int num: arr){
//            if(num > largest){
//                second = largest;
//                largest = num;
//            } else if (num > second && num != largest) {
//                second = num;
//            }
//        }


            // converting a map into list -------------------------
            // keySet() is used to get the keys only and values() is used to get the values
            // of map into list -----------------------------------------------

//        Map<Integer,String> news = new HashMap<>();
//        news.put(1,"aamir");
//        news.put(2,"zahid");
//        news.put(3,"salam");
//        news.put(4,"gulam");
//
//        news.forEach((key,value) -> System.out.println(key+":" +value));
//        List<Integer> uu = news.keySet().stream().collect(Collectors.toList());
//        System.out.println(uu);
//        List<String> vv = news.values().stream().collect(Collectors.toList());
//        System.out.println(vv);

            //find first non repeating char in the string -------------
//        String input = "aamir";
//        for(char i: input.toCharArray()){
//            if(input.indexOf(i) == input.lastIndexOf(i)){
//                System.out.println(i);
//                break;
//            }
//        }

            // find the second, third , 4th highest number in an array ---------
            // List<Integer>  list = Arrays.asList(1,23,45,67,89,0);
            // Optional<Integer> ll = list.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst();
            //  System.out.println(ll.get());



        // DUPLICATE STRINGS _______________________________________________________________
//        List<String> str1 = Arrays.asList("aamir","abide","sajid","aamir","wahid","sajid");
//        Set<String> us = new HashSet<>();
//        List<String> ds = new ArrayList<>();
//        for(String str:str1){
//            if(us.contains(str)){
//                ds.add(str);
//            }else{
//                us.add(str);
//            }
//        }
//        System.out.println(us);
//        System.out.println(ds);

//  ----------RESHUFFLE THE ARRAY-------------------------------------------
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        Random random = new Random();
//        for(int i=array.length-1;i>0;i--){
//            int j = random.nextInt(i+1);
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;
//        }
//
//        for(int num:array){
//            System.out.print(num);
//        }



        // hwo many times the character is repeated ------------
//        String name = "aamirr";
//        Map<Character,Integer> charcount = new HashMap<>();
//        for(char c: name.toCharArray()){
//            charcount.put(c,charcount.getOrDefault(c,0)+1);
//        }
//        for(Map.Entry<Character,Integer> ll: charcount.entrySet()){
//            System.out.println(ll.getKey()  +"  "  + ll.getValue());
//        }


 //        Square of sorted array -------------------------------------
//        int[] nums = {2,3,4,5,6,7};
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        System.out.println(nums);


        }
    }
