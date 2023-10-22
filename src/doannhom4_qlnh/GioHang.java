/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doannhom4_qlnh;

/**
 *
 * @author Asus
 */
public class GioHang {

   

    private String maMonAn;
    private String tenMonAn;
    private String hinh;
    private int giaBan;
    private int sdt;
    private String nguoiMua;

    public String getNguoiMua() {
        return nguoiMua;
    }

     public GioHang(String maMonAn, String tenMonAn, String hinh, int giaBan, int sdt, String nguoiMua) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.hinh = hinh;
        this.giaBan = giaBan;
        this.sdt = sdt;
        this.nguoiMua = nguoiMua;
    }
       public GioHang() {
    }
   
    public void setNguoiMua(String nguoiMua) {
        this.nguoiMua = nguoiMua;
    }

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

   
   

   

    public String Xuat() {
        String kq = maMonAn + "-" + tenMonAn + "-" + hinh + "-" + giaBan+"-"+sdt+"-"+nguoiMua;
        return kq;
    }
}
