package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (ar[i] == v) System.out.println(i);
        }
    }
}
