/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sieuthimgmt;

/**
 *
 * @author User
 */
public class MatHangMua {
    private HoaDon hd;
    private MatHang m;
    private int soLuong;

    public MatHangMua(HoaDon hd, MatHang m, int soLuong) {
        this.hd = hd;
        this.m = m;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public MatHang getMatHang() {
        return m;
    }

    public void ThemMatHangMuaHoaDon() {
        hd.ThemHoaDon(this);
    }
}
