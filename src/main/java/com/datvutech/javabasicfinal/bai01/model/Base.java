package com.datvutech.javabasicfinal.bai01;

import java.util.Scanner;

import com.datvutech.javabasicfinal.utils.AppScanner;

public class Base {
    /* #: Properties */
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    /* # Properties */

    /* #: Constructors */
    public Base() {
    }

    /* # Constructors */

    /* #: Getters, setters */
    /* # Getters, setters */

    /* #: Input, output */
    public void nhap() {
        Scanner sysScanner = AppScanner.getSystemScanner();
        System.out.print(" = ");

    }

    public void xuat() {
        System.out.println(this);
    }
    /* # Input, output */

    /* #: Bussiness */
    @Override
    public String toString() {
        return """

                """;
    }
    /* # Bussiness */
}
