package org.example.All;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {

    public static void main(String[] args) {
//        String str = "Programming";
//        StringBuffer sb = new StringBuffer();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str.charAt(i));
        //       System.out.println(sb);


        // Hashmap and Hash Tree --------------------

//         Map<String,Integer> data = new HashMap<>();
//         Map<String,Integer> data = new TreeMap<>();
//        data.put("wamir",4);
//        data.put("zahid",3);
//         data.put("riyaz",2);
//        data.put("aamir",1);
//        data.forEach((key,value)->{
//            System.out.println(key+" "+ value);
//        });




        //fail-safe collection and fail-fast collection ----------------------------------

        // List<String> list = new CopyOnWriteArrayList<>();
//         List<String> list = new ArrayList<>();
//        list.add("foo");
//        list.add("bar");
//
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//            list.add("bazz");  // modifies the list
//        }


        //properties in java ------------------------------
//        Properties props = new Properties();
//        try (InputStream input = new FileInputStream("config.properties")) {
//            props.load(input);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        String username = props.getProperty("username");
//        String password = props.getProperty("password");
//        System.out.println(username+""+password);


//        new Propertie in java collections --------------
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // numbers.forEach(System.out::println);

        //STREAM API ----------------------------------------------

//          List<Integer> numbers = Arrays.asList(1, 2, 3, 4,6, 5);
//        int sum = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .mapToInt(Integer::intValue)
//                .sum();
//         int count = (int) numbers.stream().filter(e -> e % 2 == 0).count();
//        System.out.println(sum+"   "+count);



//    EXAMPLE------------- pass by value in java ---------------------
//static void m1(int i){
//        i=i+ 10;
//    }
//
//    public static void main(String[] args) {
//        int i = 10;
//        System.out.println(i);
//        m1(i);
//        System.out.println(i);
//    }
        // exception handle with throw ----------------------------

//    public void divide(int a, int b) {
//
//        if(b == 0) {
//            throw new ArithmeticException("Cannot divide by zero");
//        }
//        int result = a / b;
//        System.out.println(result);
//    }

        //i have a third party api , i want to make an get call in springboot give me code --------------------
//
//    RestTemplate restTemplate = new RestTemplate();
//
//    String apiUrl = "https://api.example.com/data";
//
//    // Set any necessary headers or query parameters
//    HttpHeaders headers = new HttpHeaders();
//headers.set("Authorization", "Bearer abc123");
//
//    // Make the GET request and store the response in a String
//    ResponseEntity<String> response = restTemplate.exchange(
//            apiUrl,
//            HttpMethod.GET,
//            new HttpEntity<>(headers),
//            String.class
//    );
//    String responseBody = response.getBody();
//
//// Do something with the response, such as parse it as JSON or display it to the user
//System.out.println(responseBody);



        // public static void main(String[] args) {
        //------------------------- palendrome ------------------

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String::");
//        String inputString = sc.nextLine();
//        String reverseString="";
//
//        for(int i=inputString.length()-1;i>=0;i--){
//            reverseString += inputString.charAt(i);
//        }
//        if(inputString.equals(reverseString)){
//            System.out.println("IT is palenderome");
//        }
//        else {
//            System.out.println("not");
//        }

        // }

        // Anagram ------------------------------------------------------------
//  public static void main(String[] args) {
//        String str1 = "car";
//        String str2 = "rca";
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//        if(str1.length() == str2.length()){
        // convert strings to char array
//            char[] char1 = str1.toCharArray();
//            System.out.println(char1);
//            char[] char2 = str2.toCharArray();
//            System.out.println(char2);
//            Arrays.sort(char1);
//            Arrays.sort(char2);
//
//            boolean result = Arrays.equals(char1,char2);
//            if(result){
//                System.out.println(str1 +""+ str2 +" are anagrams");
//            }
//        }
//   }


        // fib series -----------------------------------------------------------------

        //  public static void main(String[] args) {
//        int n = 10;
//        int a= 0, b=1;
//        for(int i=1;i< n;i++){
//            int c = a + b;
//            System.out.println(c);
//            a = b;
//            b=c;
//        }


        // replace word -----------------
// public static void main(String[] args) {

//  String str = "  am programming";
//  int index =0;
//  char ch ='i';
//  StringBuffer sb = new StringBuffer(str);
//  sb.setCharAt(index,ch);
//  System.out.println(sb);


        // sort araylist in desc order -------------

//  ArrayList<String> list = new ArrayList<>();
//  list.add("AA");
//  list.add("ZZ");
//  list.add("CC");
//  list.add("FF");
//
//  System.out.println(list);
//   Collections.sort(list,Collections.reverseOrder());
//  System.out.println(list);

        //public static void main(String[] args) {
//       String str = "@#hG^%vgfd$*&hg";
//     String res =  str.replaceAll("[^a-zA-Z0-9]","");
//  System.out.println(res);


        //  add the two numbers using lemda expressions ------------------------------------------

//  addition value = (int a, int b)-> System.out.println(a+b);
//  value.add(10,12);
        //}
//@FunctionalInterface
        //public interface addition{
        //public void add(int a, int b);
        //select * from employee ORDERBY salry DESC LImit 2,1;
// }


        //public static void main(String[] args) {

        // find the missing number in the array--------------------------------------------

//   int arr[] = new int[]{1,2,4,5};
//   // n*n+1  find natural number
//  int sum = (5*6)/2;
//  int actualSum = 0;
//  for(int i=0;i<arr.length;i++){
//   actualSum = actualSum+ arr[i];
//  }
//  System.out.println((sum-actualSum));


        // remove the numbers in string ----------
//  String str = "hd7hfd5j4";
// String bb =  str.replaceAll("\\d","");
//  System.out.println(bb);

// rempve the duplicate---------------------------
//  List<Integer> oo = Arrays.asList(1,2,4,2,5,6,3,4);
//  Set<Integer> ss = new HashSet<>();
//  oo.stream().filter(i -> ss.add(i)).collect(Collectors.toSet() ).forEach(System.out::print);



        //multiply 2 nukbers using functional interface ---------------------


//  fInterface total = (a,b) -> a*b;
//  System.out.println(total.multiply(30,40));
//
//
// }

// @FunctionalInterface
// public interface  fInterface{
//  public  int multiply(int a, int b);

// }

        ////swapping two values in java ----------------

//        int a = 4;
//        int b = 6;

//        int temp = a;
//        a = b;
//        b = temp;

//        a = a+ b;
//        b = a-b;
//        a =a-b;
//        System.out.println(a);



        // pattern of trinagles  ---------------

//        int row = 5;
//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=row-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//  Length of string
//        String str = "Developer";
//        int l = 0;
//        for(char b : str.toCharArray()){
//            l++;
//        }

    }
}



















