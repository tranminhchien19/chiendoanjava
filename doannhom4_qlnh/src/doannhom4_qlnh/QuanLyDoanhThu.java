/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doannhom4_qlnh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class QuanLyDoanhThu {
    private ArrayList<DoanhThu> data;

    public ArrayList<DoanhThu> getData() {
        return data;
    }

    public void setData(ArrayList<DoanhThu> data) {
        this.data = data;
    }

    public QuanLyDoanhThu() {
        data = new ArrayList<>();
    }

    public QuanLyDoanhThu(ArrayList<DoanhThu> data) {
        this.data = data;
    }

    public void Xuat() {
        for (DoanhThu monAn : data) {
            System.out.println(monAn.Xuat());
        }
    }

    public int CountMA() {
        return data.size();
    }

    public void ThemMonAn(DoanhThu nH) {
        data.add(nH);
    }

    public boolean Xoa(String maMA) {
        for (DoanhThu monAn : data) {
            if (monAn.getMaMonAn().equals(maMA)) {
                data.remove(monAn);
                return true;
            }
        }
        return false;
    }
    
    public DoanhThu TimTheoThangNam(String thang,String nam){
        for (DoanhThu monAn: data) {
            if (monAn.getNgayThangNam().substring(3,5).equals(thang) || monAn.getNgayThangNam().substring(6,8).equals(nam)) {
                    
                    return monAn;
            }
        }
        return null;
    }
    public DoanhThu TimTenMon(String tenMA){
        for (DoanhThu monAn: data) {
            if (monAn.getTenMonAn().equals(tenMA)) {
                    
                    return monAn;
            }
        }
        return null;
    }

    //Ham sua 
    public boolean Sua(GioHang nH) {
        for (DoanhThu monAn : data) {
            if (monAn.getMaMonAn().equals(nH.getMaMonAn())) {
                monAn.setTenMonAn(nH.getTenMonAn());
                monAn.setHinh(nH.getHinh());
                monAn.setGiaBan(nH.getGiaBan());
                return true;
            }
        }
        return false;
    }
    
     public void GhiDuLieu(String filename) {
        File f = new File(filename);
        try {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (DoanhThu monAn : data) {
                bw.write(monAn.Xuat());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("loi file: " + ex);
        }
    }
       public void GhiDuLieuDe(String filename) {
        File f = new File(filename);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (DoanhThu monAn : data) {
                bw.write(monAn.Xuat());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("loi file: " + ex);
        }
    }

    public ArrayList<DoanhThu> DocDuLieu(String filename) {
        ArrayList<DoanhThu> duLieu = new ArrayList<>();
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] item = line.split("-");
                DoanhThu mA = new DoanhThu(item[0],item[1],item[2],Integer.parseInt(item[3]),Integer.parseInt(item[4]),item[5],item[6]);
                duLieu.add(mA);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("khong thay: " + ex);
        } catch (IOException ex) {
            System.out.println("Loi file: " + ex);
        }
        return duLieu;
    }
}
