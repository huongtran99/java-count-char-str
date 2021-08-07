package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập vào một chuỗi: ");
        String str = sc.nextLine();

        char kyTu = 'a';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.print("Số lần xuất hiện của '" + kyTu + "' trong chuỗi là: " + count);
    }
}
