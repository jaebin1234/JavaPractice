package com.company;

/*구구단 구현*/

import java.util.Scanner;

public class gugudan_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 구구단의 숫자를 입력하시오.");
        int n = sc.nextInt(); //입력받을 n단 변수.

       int i = 1; // 반복변수
       int result; //구구단 결과값
       while(i<10){
           result = n*i;
           System.out.println(result);
           i++;
       }

       for(i=1;i<10;i++){
           result = n*i;
           System.out.println(result);
       }

    }
}

