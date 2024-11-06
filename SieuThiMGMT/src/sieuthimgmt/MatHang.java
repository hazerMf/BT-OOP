/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sieuthimgmt;

/**
 *
 * @author User
 */
public class MatHang {
    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMatHang;

    public MatHang(int matHangID, String tenMatHang, float gia, int soLuong) {
        this.matHangID = matHangID;
        this.tenMatHang = tenMatHang;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getMatHangID() {
        return matHangID;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public float getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void ThemMatHangVaoKho(int soLuongThem) {
        this.soLuong += soLuongThem;
    }
}
