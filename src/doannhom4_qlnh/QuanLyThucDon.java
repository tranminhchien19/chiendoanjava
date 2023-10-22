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
public class QuanLyThucDon {
    private ArrayList<ThucDon> data;

    public ArrayList<ThucDon> getData() {
        return data;
    }

    public void setData(ArrayList<ThucDon> data) {
        this.data = data;
    }

    public QuanLyThucDon() {
        data = new ArrayList<>();
    }

    public QuanLyThucDon(ArrayList<ThucDon> data) {
        this.data = data;
    }

    public void Xuat() {
        for (ThucDon thucDon : data) {
            System.out.println(thucDon.Xuat());
        }
    }

    public int CountMA() {
        return data.size();
    }

    public void ThemMonAn(ThucDon nH) {
        data.add(nH);
    }

    public boolean Xoa(String maMA) {
        for (ThucDon monAn : data) {
            if (monAn.getMaMonAn().equals(maMA)) {
                data.remove(monAn);
                return true;
            }
        }
        return false;
    }


    //Ham sap xep mon an trong nha hang


    public void GhiDuLieu(String filename) {
        File f = new File(filename);
        try {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (ThucDon monAn : data) {
                bw.write(monAn.Xuat());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("loi file: " + ex);
        }
    }

    public ArrayList<ThucDon> DocDuLieu(String filename) {
        ArrayList<ThucDon> duLieu = new ArrayList<>();
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] item = line.split("-");
                ThucDon mA = new ThucDon(item[0],item[1],item[2],Integer.parseInt(item[3]));
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
