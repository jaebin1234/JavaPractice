package com.company;

import java.util.Scanner;


public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 N을 입력하시오.");
        int a = sc.nextInt();
        int i=1;


        for(int j = 1;j <= a;j++) {
            for (i = 1; i <= a-j; i++) {

                System.out.printf(" ");

            }
            for(i=1;i<=j;i++){
                System.out.printf("*");
            }
            System.out.printf("\n");

        }
    }
}
