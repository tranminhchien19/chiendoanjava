/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doannhom4_qlnh;

/**
 *
 * @author Asus
 */
public class NhanVien implements Comparable<NhanVien>{

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String chucVu, int luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public String Xuat() {
        return maNV +"-"+ tenNV+"-"+chucVu+"-"+luong;
    }
    private String maNV;
    private String tenNV;
    private String chucVu;
    private int luong;

    @Override
    public int compareTo(NhanVien nV) {
        return tenNV.compareTo(nV.getTenNV());
    }
    
}
