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
public class SapXepGiaBan implements Comparator<MonAn> {
    @Override
    public int compare(MonAn nH1, MonAn nH2) {
        if(nH1.getGiaBan()==nH2.getGiaBan()){
            return 0;
        }
        if(nH1.getGiaBan()>nH2.getGiaBan()){
            return 1;
        }
        return -1;
                
    }
    
}
