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
    private List<MatHangMua> matHangMuaList = new ArrayList<>();

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
        System.out.println("Hóa đơn ID: " + hoaDonID);
        System.out.println("Khách hàng: " + kh.getTenKH());
        System.out.println("Ngày bán: " + ngayBan);
        System.out.println("Danh sách mặt hàng:");
        for (MatHangMua mh : matHangMuaList) {
            System.out.println("Mặt hàng: " + mh.getMatHang().getTenMatHang() + 
                               ", Số lượng: " + mh.getSoLuong() + 
                               ", Giá: " + mh.getMatHang().getGia());
        }
        System.out.println("Tổng tiền: " + tongTien);
    }
}
