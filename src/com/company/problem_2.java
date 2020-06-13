package com.company;

import java.util.Scanner;


public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자A ,B를 입력하시오.");
        int a = sc.nextInt();

        int b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("=");

        }
    }
}
