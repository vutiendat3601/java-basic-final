package com.datvutech.javabasicfinal.bai01.model;

import java.util.Scanner;

import com.datvutech.javabasicfinal.utils.AppScanner;

public class SubBase2 extends Base {
    /* #: Properties */
    private String subB;
    /* # Properties */

    /* #: Constructors */
    public SubBase2() {
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
        return super.toString() +
                """

                        """;
    }
    /* # Bussiness */
}
