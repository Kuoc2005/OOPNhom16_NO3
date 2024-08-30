package com.mycompany.app;

public class Sách {
    private String tenSach;
    private String tacGia;

    public Sách(String tenSach, String tacGia) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    public void hienThiThongTin() {
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
    }
}
