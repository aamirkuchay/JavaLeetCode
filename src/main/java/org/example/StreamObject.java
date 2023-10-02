package org.example;


interface  A {
    // variables in interface is  final and static
 int age = 55;
 String area = "kashmir";
 void show();
 void buy();
}
interface X {
    void run();
}
interface Y extends X{

}
class B implements A,Y{

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void buy() {
        System.out.println("in buy");
    }

    @Override
    public void run() {

    }
}

public class StreamObject{
    public static void main(String[] args) {
                    A obj;
                    X obj1 = new B();
                    obj = new B();
                    obj.buy();
                    obj.show();
                    obj1.run();



        System.out.println(A.age+""+A.area);
    }
}



