package com.company;

/*구구단 구현*/

import java.util.Scanner;

public class gugudan_6 {
    public static void main(String[] args) {

        int [] result = new int[9];
        for(int j=0; j< result.length;j++)
        for(int i = 0; i< result.length;i++){
            result[i] = (j+1)*(i+1);
            System.out.println((j+1)+"*"+(i+1)+"="+result[i]);
        }

    }
}

