package sieuthimgmt;

import java.util.ArrayList;

public class SieuThiMGMT {
    public static void main(String[] args) {
        MatHang matHang1 = new MatHang(1, "Ao phong", 15f, 100);
        MatHang matHang2 = new MatHang(2, "Ao khoac", 30f, 200);
        MatHang matHang3 = new MatHang(3, "Quan", 20f, 300);

        KhachHang k1 = new KhachHang(1, "Hanoi", "Nguyen Van A");
        KhachHang k2 = new KhachHang(1, "HCM", "Trinh Thi B");
        KhachHang k3 = new KhachHang(1, "Hue", "Tran Van C");
        
        ArrayList<MatHang> khoHang = new ArrayList<>();

        khoHang.add(matHang1);
        khoHang.add(matHang2);
        khoHang.add(matHang3);
        
        HoaDon HoaDonK1 = new HoaDon(001, k1, "11/9/2001");
        
        MatHangMua sp1 = new MatHangMua(HoaDonK1, matHang1, 5);
        MatHangMua sp2 = new MatHangMua(HoaDonK1, matHang3, 6);
        
        HoaDonK1.ThemHoaDon(sp1);
        HoaDonK1.ThemHoaDon(sp2);
        HoaDonK1.InHoaDon();
    }
    
}
