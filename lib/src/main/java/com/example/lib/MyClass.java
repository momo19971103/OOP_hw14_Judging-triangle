package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J�H�N�T���");
        int a,b,c,N;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        for(int i = 0;i<2;i++){ //�]��������A�T�i�֤@��
            if(a>b){
                N=a;
                a=b;
                b=N;
            }
            if (b>c){
                N=b;
                b=c;
                c=N;
            }
        }
        if((a+b)>c){
            System.out.print("�i�H�զ��T����");
        }
        else {
            System.out.print("����զ��T����");
        }
    }
}
