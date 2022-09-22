package com.java;

public class OppsConcepts {
    public static void main(String[] args) {
        B b = new B();
        b.m(6);
        b.m1();

    }
}



class A{
    void m(int i){
        System.out.println("A of m() class method");
    }
}
class B extends A{
    void m(int i){
        System.out.println("B of m() class method");
    }
     void m1(){
         System.out.println("B of m1() class method");
     }

}


class C extends A{
    void m(int i){
        System.out.println("C of m() class method");
    }
    void m2(){
        System.out.println("C of m2() class method");
    }

}