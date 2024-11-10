/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sieuthimgmt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class HoaDon {
    private int hoaDonID;
    private KhachHang kh;
    private String ngayBan;
    private float tongTien;
    private ArrayList<MatHangMua> matHangMuaList = new ArrayList<>();

    public HoaDon(int hoaDonID, KhachHang kh, String ngayBan) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
    }

    public void ThemHoaDon(MatHangMua matHangMua) {
        matHangMuaList.add(matHangMua);
        tongTien += matHangMua.getMatHang().getGia() * matHangMua.getSoLuong();
    }

    public void InHoaDon() {
        System.out.println("Hoa don ID: " + hoaDonID);
        System.out.println("Khach hang: " + kh.getTenKH());
        System.out.println("Ngay ban: " + ngayBan);
        System.out.println("Danh sach mat hang:");
        for (MatHangMua mh : matHangMuaList) {
            System.out.println("Mat hang: " + mh.getMatHang().getTenMatHang() + 
                               ", So luong: " + mh.getSoLuong() + 
                               ", Gia: " + mh.getMatHang().getGia());
        }
        System.out.println("Tong tien: " + tongTien);
    }
}
