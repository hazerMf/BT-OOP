/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sieuthimgmt;

/**
 *
 * @author User
 */
public class SieuThiMGMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatHang matHang1 = new MatHang(1, "X", 10.0f, 100);
        MatHang matHang2 = new MatHang(2, "Y", 15.0f, 200);
        MatHang matHang3 = new MatHang(3, "Z", 20.0f, 300);

        KhachHang khachHang = new KhachHang(1, "123 ABC Street", "Nguyễn Văn A");


        HoaDon hoaDon = new HoaDon(1, khachHang, "2024-11-06");

        MatHangMua matHangMua1 = new MatHangMua(hoaDon, matHang1, 2);
        MatHangMua matHangMua2 = new MatHangMua(hoaDon, matHang2, 3);

        matHangMua1.ThemMatHangMuaHoaDon();
        matHangMua2.ThemMatHangMuaHoaDon();

        hoaDon.InHoaDon();
    }
    
}
