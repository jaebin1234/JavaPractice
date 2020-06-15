package com.company;

/*난이도 있는 구구단 문제*/



import java.util.Scanner;



public class Gugudan_ex {
    public static int[] calculate(int n){
        int result[] = new int[n];

        if(n<2){
            System.out.println("1단은 안되용");

        }else if(n>=2) {
            for (int i = 0; i < result.length; i++) {
                result[i] = n * (i + 1);
            }

        }
        return result;

    }
    public static void print(int n,int i,int result[]){
        System.out.println(n + "*" + (i+1) + "=" + result[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇단?");
        int n = sc.nextInt();



        int result[] = calculate(n);


        for(int i=0;i<result.length;i++) {
            print(n,i,result);
        }
    }
    
}

