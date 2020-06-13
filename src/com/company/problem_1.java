package com.company;

import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("첫번째 세자리수를 입력하시오.");
        int a = sc.nextInt();
        System.out.println("두번째 세자리수를 입력하시오.");
        int b = sc.nextInt();



        System.out.printf("%d \n",a*(b%10));
        System.out.printf("%d \n",a*((b%100)/10));
        System.out.printf("%d \n",a*(b/100));
        System.out.printf("%d \n",a*b);


    }
}
