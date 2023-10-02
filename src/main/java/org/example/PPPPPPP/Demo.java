package org.example.PPPPPPP;
// every time we create an object we call a constructor automatically..
interface Computer{
     void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("dev  running codeing");
    }
}
class Desktop implements Computer{
   private int age;
    public Desktop(){
         age = 22;
        System.out.println("i im constructor");
    }
    public Desktop(int age){
        this.age = age;
        System.out.println("i im constructor");
    }
    public void code(){
        System.out.println("ddesktopping..");
    }


}

 class Developer{

    public void  devApp(Computer lap){
        lap.code();
        System.out.println("coding");
    }
}


public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Developer dev = new Developer();
        Computer desk = new Desktop(23);

        dev.devApp(desk);


    }

}
