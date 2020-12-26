package com.company;

public class Main {
    public static int number=89;//глобальная переменная

    public static void main(String[] args) {
	int a = 1; //локальная переменная для метода main
        System.out.println(a);
        System.out.println(number);
    }
    public static void test(int a){
        System.out.println(a);
        //System.out.println(b);
        double b=8.9;
        System.out.println(b);
        if(6>2){
            System.out.println(a+1);
            System.out.println(b);
            int c = 9;
            System.out.println(c);
            {
                c=7;
            }
        }

    }
}
