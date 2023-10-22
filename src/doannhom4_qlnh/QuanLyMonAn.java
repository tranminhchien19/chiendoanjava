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
public class QuanLyMonAn {

    private ArrayList<MonAn> data;

    public ArrayList<MonAn> getData() {
        return data;
    }

    public void setData(ArrayList<MonAn> data) {
        this.data = data;
    }

    public QuanLyMonAn() {
        data = new ArrayList<>();
    }

    public QuanLyMonAn(ArrayList<MonAn> data) {
        this.data = data;
    }

    public void Xuat() {
        for (MonAn monAn : data) {
            System.out.println(monAn.Xuat());
        }
    }

    public int CountMA() {
        return data.size();
    }

    public void ThemMonAn(MonAn nH) {
        data.add(nH);
    }

    public boolean Xoa(String maMA) {
        for (MonAn monAn : data) {
            if (monAn.getMaMonAn().equals(maMA)) {
                data.remove(monAn);
                return true;
            }
        }
        return false;
    }

    //Ham sua 
    public boolean Sua(MonAn nH) {
        for (MonAn monAn : data) {
            if (monAn.getMaMonAn().equals(nH.getMaMonAn())) {
                monAn.setTenMonAn(nH.getTenMonAn());
                monAn.setHinh(nH.getHinh());
                monAn.setGiaBan(nH.getGiaBan());
                return true;
            }
        }
        return false;
    }
     public MonAn TimTenMon(String tenMA){
        for (MonAn monAn: data) {
            if (monAn.getTenMonAn().equals(tenMA)) {
                    
                    return monAn;
            }
        }
        return null;
    }

    //Ham sap xep mon an trong nha hang
    public void SapXep() {
        Collections.sort(data);
    }

    public void SapXepGiaBan() {
        Collections.sort(data, new SapXepGiaBan());
    }

    public void GhiDuLieu(String filename) {
        File f = new File(filename);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (MonAn monAn : data) {
                bw.write(monAn.Xuat());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("loi file: " + ex);
        }
    }

    public ArrayList<MonAn> DocDuLieu(String filename) {
        ArrayList<MonAn> duLieu = new ArrayList<>();
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] item = line.split("-");
                MonAn mA = new MonAn(item[0],item[1],item[2],Integer.parseInt(item[3]));
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
