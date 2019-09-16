package com.company2;

import java.util.*;
//Demonstrate a lambda expression that takes a parameter.
//Another functional interface.
interface FunctInterface {
    boolean test(int n);
}
class LambdaDemo {
    public static void main(String args[])
    {
//A lambda expression that tests if a number is even.
        FunctInterface isEven = (n) -> (n % 2)==0;
        if(isEven.test(10)) System.out.println("10 is even");
        isEven = (n) -> n > 0;
        if(!isEven.test(9)) System.out.println("9 is not even");
    }
}
