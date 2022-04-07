package com.prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if(num == 1){
            System.out.println("Not prime");
        }
        boolean isPrime = true;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime");
        }else{
            System.out.println("It is not a prime");
        }
    }
}
