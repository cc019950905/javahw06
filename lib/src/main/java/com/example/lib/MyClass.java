package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int x= y%4;
        if(x==0){
            System.out.println("是閏年");
        }else{
            System.out.println("不是閏年");
        }

    }
}
