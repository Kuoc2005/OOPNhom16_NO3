package com.mycompany.app;

public class TênSố {
    private int so;

    public TênSố(int so) {
        this.so = so;
    }

    public String tenSo() {
        switch (so) {
            case 1: return "Một";
            case 2: return "Hai";
            case 3: return "Ba";
            // Thêm các số khác nếu cần
            default: return "Số ngoài phạm vi";
        }
    }
}
