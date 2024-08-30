package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class NNCollection {
    private List<String> dsNN;

    public NNCollection() {
        dsNN = new ArrayList<>();
    }

    public void themNN(String ngonNgu) {
        dsNN.add(ngonNgu);
    }

    public void hienThiDanhSachNN() {
        System.out.println("Danh sách ngôn ngữ:");
        for (String nn : dsNN) {
            System.out.println(nn);
        }
    }
}
