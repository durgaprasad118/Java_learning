package com.dp.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swapPrim(a,b);// this won't swap bcz java is pass by value
        // when we pass the objects the refercne is passed


        final int INCREMENT =2;
//        INCREMENT =3;   throws error.
        // this too doesn't swap
//        Integer a = 10;
//        Integer b = 20;
//        swapObj(a,b);
//        System.out.println(a + " "+ b);

        final A kunal = new A("dp");
        kunal.name = "Durga Prasad";
        // but we cant do some thing like  kunal = new A("xyz") no reassigning

        System.out.println(kunal.name);

        A obj;
        for (int i = 0; i <100000000 ; i++) {
            obj = new A("random");
        }
    }
    static void swapPrim(int a, int b){
        int temp =a ;
        a= b;
        b = temp;
    }
    static void swapObj(Integer a, Integer b){
       int temp =a;
       a = b;
       b= temp;
    }
}

class A {
    final int num = 3;
    String name ;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destoryed");
    }
}