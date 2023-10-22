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
public class QuanLyGioHang {
     private ArrayList<GioHang> data;

    public ArrayList<GioHang> getData() {
        return data;
    }

    public void setData(ArrayList<GioHang> data) {
        this.data = data;
    }

    public QuanLyGioHang() {
        data = new ArrayList<>();
    }

    public QuanLyGioHang(ArrayList<GioHang> data) {
        this.data = data;
    }

    public void Xuat() {
        for (GioHang monAn : data) {
            System.out.println(monAn.Xuat());
        }
    }

    public int CountMA() {
        return data.size();
    }

    public void ThemMonAn(GioHang nH) {
        data.add(nH);
    }

    public boolean Xoa(String maMA) {
        for (GioHang monAn : data) {
            if (monAn.getMaMonAn().equals(maMA)) {
                data.remove(monAn);
                return true;
            }
        }
        return false;
    }

    //Ham sua 
    public boolean Sua(GioHang nH) {
        for (GioHang monAn : data) {
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
            for (GioHang monAn : data) {
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
            for (GioHang monAn : data) {
                bw.write(monAn.Xuat());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("loi file: " + ex);
        }
    }

    public ArrayList<GioHang> DocDuLieu(String filename) {
        ArrayList<GioHang> duLieu = new ArrayList<>();
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] item = line.split("-");
                GioHang mA = new GioHang(item[0],item[1],item[2],Integer.parseInt(item[3]),Integer.parseInt(item[4]),item[5]);
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
