/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sieuthimgmt;

/**
 *
 * @author User
 */
public class KhachHang {
    private String diaChi;
    private int khachHangID;
    private String tenKH;

    public KhachHang(int khachHangID, String diaChi, String tenKH) {
        this.khachHangID = khachHangID;
        this.diaChi = diaChi;
        this.tenKH = tenKH;
    }

    public int getKhachHangID() {
        return khachHangID;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
