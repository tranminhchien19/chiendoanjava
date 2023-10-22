/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doannhom4_qlnh;

/**
 *
 * @author Asus
 */
public class DonHang {
      private String maMonAn;
    private String tenMonAn;
    private String hinh;
    private int giaBan;
    private int sdt;

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public DonHang(String maMonAn, String tenMonAn, String hinh, int giaBan, int sdt) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.hinh = hinh;
        this.giaBan = giaBan;
        this.sdt = sdt;
    }
     public DonHang() {

    }
 
    public String Xuat() {
        String kq = maMonAn + "-" + tenMonAn + "-" + hinh + "-" + giaBan+"-"+sdt;
        return kq;
    }
}
