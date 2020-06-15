package com.company;

/*난이도 있는 구구단 문제*/

import java.util.Scanner;


public class Gugudan_ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("두 숫자를 입력하시오.단 n1,n2 형식으로 ,붙여서 입력하시오.");
        String inputValue = sc.nextLine();

        String[] s_Value = inputValue.split(",");

        int n1 =Integer.parseInt(s_Value[0]);
        int n2 =Integer.parseInt(s_Value[1]);
        int result[][]= new int[n1][n2];

        for(int j= 1;j<n1;j++) {
            for (int i = 0; i < n2; i++) {
                result[j][i] = (j+1)*(i+1);
                System.out.println((j+1)+"*"+(i+1)+"="+result[j][i]);
            }
        }

    }
    
}

