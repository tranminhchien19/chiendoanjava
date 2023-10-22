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
import java.util.Collections;

/**
 *
 * @author Asus
 */
public class QuanLyNhanVien {

    private ArrayList<NhanVien> data;

    public ArrayList<NhanVien> getData() {
        return data;
    }

    public void setData(ArrayList<NhanVien> data) {
        this.data = data;
    }

    public QuanLyNhanVien(ArrayList<NhanVien> data) {
        this.data = data;
    }

    public QuanLyNhanVien() {
        data = new ArrayList<>();
    }

    public void Xuat() {
        for (NhanVien nhanVien : data) {
            System.out.println(nhanVien.Xuat());
        }
    }

    public int CoutNV() {
        return data.size();
    }

    public void ThemNhanVien(NhanVien nv) {
        data.add(nv);
    }

    public boolean Xoa(String maNV) {
        for (NhanVien nhanVien : data) {
            if (nhanVien.getMaNV().equals(maNV)) {
                data.remove(nhanVien);
                return true;
            }
        }
        return false;
    }

    public boolean Xoa(NhanVien maNV) {
        for (NhanVien nhanVien : data) {
            if (nhanVien.getMaNV().equals(maNV)) {
                data.remove(nhanVien);
                return true;
            }
        }
        return false;
    }

    //Ham sua 
    public boolean Sua(NhanVien nV) {
        for (NhanVien nhanVien : data) {
            if (nhanVien.getMaNV().equals(nV.getMaNV())) {
                nhanVien.setTenNV(nV.getTenNV());
                nhanVien.setChucVu(nV.getChucVu());
                nhanVien.setLuong(nV.getLuong());
                return true;
            }
        }
        return false;
    }

    //Ham sap xep mon an trong nha hang
    public void SapXep() {
        Collections.sort(data);
    }

    public void SapXepLuong() {
        Collections.sort(data, new SapXepLuongNV());
    }

    public void GhiDuLieu(String filename) {
        File f = new File(filename);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (NhanVien nhanVien : data) {
                bw.write(nhanVien.Xuat());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi file: " + ex);
        }
    }

    public ArrayList<NhanVien> DocDuLieu(String filename) {
        ArrayList<NhanVien> duLieu = new ArrayList<>();
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] item = line.split("-");
                NhanVien nV = new NhanVien(item[0], item[1], item[2], Integer.parseInt(item[3]));
                duLieu.add(nV);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("khong thay: " + ex);
        } catch (IOException ex) {
            System.out.println("Loi file: " + ex);
        }
        return duLieu;
    }
}
