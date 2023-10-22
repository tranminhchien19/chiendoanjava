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
public class QuanLyAdmin {
    private ArrayList<Admin> data;

    public ArrayList<Admin> getData() {
        return data;
    }

    public void setData(ArrayList<Admin> data) {
        this.data = data;
    }

    public QuanLyAdmin() {
        data = new ArrayList<>();
    }

    public QuanLyAdmin(ArrayList<Admin> data) {
        this.data = data;
    }
    public ArrayList<Admin> DocDuLieu(String filename) {
        ArrayList<Admin> duLieu = new ArrayList<>();
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] item = line.split("-");
                Admin mA = new Admin(item[0],item[1]);
                duLieu.add(mA);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("khong thay: " + ex);
        } catch (IOException ex) {
            System.out.println("Loi file: " + ex);
        }
        return duLieu;
    }
     public void Them(Admin nH) {
        data.add(nH);
    }
     public void GhiDuLieu(String filename) {
         File f = new File(filename);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Admin monAn : data) {
                bw.write(monAn.Xuat());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("loi file: " + ex);
        }
    }

}
