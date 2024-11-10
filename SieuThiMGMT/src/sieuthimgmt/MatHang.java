package sieuthimgmt;

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
    
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }

    public void ThemMatHangVaoKho(int soLuongThem) {
        this.soLuong += soLuongThem;
    }
}
