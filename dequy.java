package com.mycompany.app;

public class Đệ quy {
    public int tinhGiaiThua(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * tinhGiaiThua(n - 1);
        }
    }
}
