package com.demo;

public class Arithmetic {
    public int add (int a, int b){

        return a+b;
    }
    public int sub (int a, int b){
        return a-b;
    }
    public int multiply (int a, int b){
        return a*b;

    }
    public int division (int a, int b){
        return a/b;


        }
        public static void main(String[] args){
        Arithmetic art = new Arithmetic();
        System.out.println("Addition of 5,10 is "+art.add(5,10));
        System.out.println("Subtracting of 10 from 30 is "+art.sub(30,10));
        System.out.println("Product of 5,10 is "+art.multiply(5,10));
        System.out.println("Dividing of 10 by 5 is "+art.division(5,10));






    }
}
