package com.datvutech.javabasicfinal.utils;

import java.util.Scanner;

public class AppScanner {
    private static final Scanner SYS_SCANNER;

    static {
        SYS_SCANNER = new Scanner(System.in);
    }

    public static Scanner getSystemScanner() {
        return SYS_SCANNER;
    }
}
