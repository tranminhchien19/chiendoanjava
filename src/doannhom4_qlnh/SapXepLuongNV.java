/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doannhom4_qlnh;

import java.util.Comparator;

/**
 *
 * @author Asus
 */
public class SapXepLuongNV implements Comparator<NhanVien>{

    @Override
    public int compare(NhanVien nv1, NhanVien nv2) {
         if(nv1.getLuong()==nv2.getLuong()){
            return 0;
        }
        if(nv1.getLuong()>nv2.getLuong()){
            return 1;
        }
        return -1;
    }
    
}
