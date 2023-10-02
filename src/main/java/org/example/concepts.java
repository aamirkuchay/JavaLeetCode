package org.example;


abstract class Animal{
    abstract void run();
    void  sleep(){
        System.out.println("dog is sleeping");
    }
}
 class Alls extends Animal{
    int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

     @Override
     void run() {
         System.out.println("dog is running");
     }
 }
public class concepts {
    public static void main(String[] args) {
        Alls a = new Alls();
        a.run();
        a.sleep();
    }
}
