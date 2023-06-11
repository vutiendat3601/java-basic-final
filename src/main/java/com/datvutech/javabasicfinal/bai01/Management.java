package com.datvutech.javabasicfinal.bai01;

import java.util.ArrayList;
import java.util.List;

import com.datvutech.javabasicfinal.bai01.model.Base;

public class Management {
    private List<Base> list;

    public Management() {
        list = new ArrayList<>();
    }

    public void them(Base base) {
        list.add(base);
    }

    public void xoa(Base base) {
        list.remove(base);
    }

}
