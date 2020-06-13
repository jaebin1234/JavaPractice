package com.company;

import java.util.Scanner;


public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 N을 입력하시오.");
        int a = sc.nextInt();

        for (int i=1;i<=9;i++)
        {
            System.out.printf("%d * %d = %d \n",a,i,a*i);
        }


    }
}
