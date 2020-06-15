package com.company;

/*구구단 구현*/
/* 메소드 활용하기 */


import java.util.Scanner;

public class Gugudan_practiceSub {
        public static int[] calculate(int n){
            int result[] = new int[9];
            for(int i=0;i<result.length;i++){
                result[i]= n * (i+1);
            }
            return result;
        }
        public static void print(int dan,int i,int []result){
            System.out.println(dan +"*"+ (i+1) +"="+result[i]);
        }


    }


