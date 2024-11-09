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
    
    public float tinhTongTien(){
        return soLuong * m.getGia();
    }
    
    public void setSoLuong(int soLuong){
        if(soLuong <= m.getSoLuong()){
            this.soLuong = soLuong;
            m.setSoLuong(m.getSoLuong() - soLuong);
        }  
        else
            System.out.println("Khong du so luong");
    }
    
    public MatHang getMd(){
        return m;
    }
}
