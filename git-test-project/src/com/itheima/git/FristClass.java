package com.itheima.git;

public class FristClass {
    int i;
    public static void main(String[] args) {
        int i=1;
        FristClass d=new FristClass();
        d.first();
        System.out.println("hello git");
        System.out.println(d.first());
        System.out.println("hello git");
        System.out.println(i);
    }
    public int first(){

        int i=0;
        i+=10;

        i++;
        return i;
    }
}
