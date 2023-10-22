/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package doannhom4_qlnh;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class QuanLyNhanVienTest {
    
   @Test
    public void testThemNhanVien() {
        System.out.println("Them Nhan Vien");
        NhanVien nv1 = new NhanVien("NV01", "Nguyễn Đắc Kiên", "Phó chủ tịch", 10000);
        NhanVien nv2 = new NhanVien("NV02", "Nguyễn Đắc Cường", "Phó giám đốc", 13000);
        NhanVien nv3= new NhanVien("NV03", "Nguyễn Thị Bé", "Trưởng phòng", 8000);
        QuanLyNhanVien instance = new QuanLyNhanVien();
        instance.ThemNhanVien(nv2);      
        int exResult = 1;
        int result = instance.CoutNV();
        assertEquals(exResult, result);
    }

    @Test
    public void testXoaNhanVien() {
        System.out.println("Xoa Nhan Vien");
        NhanVien nv1 = new NhanVien("NV01", "Nguyễn Đắc Kiên", "Phó chủ tịch", 10000);
        NhanVien nv2 = new NhanVien("NV02", "Trần Văn Ơn", "Phó giám đốc", 13000);
        NhanVien nv3= new NhanVien("NV03", "Nguyễn Thị Hồng", "Trưởng phòng", 8000);
        QuanLyNhanVien instance = new QuanLyNhanVien();
        instance.ThemNhanVien(nv2); 
        instance.ThemNhanVien(nv1); 
        instance.ThemNhanVien(nv3); 
        instance.Xoa("NV01");
        int exResult = 2;
        int result = instance.CoutNV();
        assertEquals(exResult, result);
    }


    /**
     * Test of Sua method, of class QuanLiNhaHang.
     */
    @Test
    public void testSuaNhanVien() {
        System.out.println("Sua thong tin Nhan vien");
        NhanVien nv1 = new NhanVien("NV01", "Nguyễn Đắc Kiên", "Phó chủ tịch", 10000);
        NhanVien nv2 = new NhanVien("NV02", "Trần Văn Ơn", "Phó giám đốc", 13000);
        NhanVien nv3= new NhanVien("NV01", "Nguyễn Thị Hồng", "Trưởng phòng", 8000);
        QuanLyNhanVien instance = new QuanLyNhanVien();
        instance.ThemNhanVien(nv2); 
        instance.ThemNhanVien(nv1);  
        instance.Sua(nv3);
        String exResult = nv3.Xuat();
        String result = instance.getData().get(1).Xuat();
        assertEquals(exResult, result);
    }

    @Test
    public void testConstructor() {
        System.out.println("Constructor");
        NhanVien nv= new NhanVien("D", "Mark", "Tester", 4000);
        String exResult = "D-Mark-Tester-4000";
        String result = nv.Xuat();
        assertEquals(exResult, result);
    }

    @Test
    public void testSapXepLuong() {
        System.out.println("SapXep luong");
        NhanVien nv1 = new NhanVien("NV01", "Nguyễn Đắc Kiên", "Phó chủ tịch", 10000);
        NhanVien nv2 = new NhanVien("NV02", "Trần Văn Ơn", "Phó giám đốc", 13000);
        NhanVien nv3= new NhanVien("NV03", "Nguyễn Thị Hồng", "Trưởng phòng", 8000);
        QuanLyNhanVien instance = new QuanLyNhanVien();
        instance.ThemNhanVien(nv1); 
        instance.ThemNhanVien(nv2); 
        instance.ThemNhanVien(nv3); 
        instance.SapXepLuong();
        assertEquals(nv3.Xuat(), instance.getData().get(0).Xuat());
        assertEquals(nv1.Xuat(), instance.getData().get(1).Xuat());
        assertEquals(nv2.Xuat(), instance.getData().get(2).Xuat());
    }

    @Test
    public void testDocGhiFile() {
        System.out.println("DocGhiFile");
       NhanVien nv1 = new NhanVien("NV01", "Nguyễn Đắc Kiên", "Phó chủ tịch", 10000);
        NhanVien nv2 = new NhanVien("NV02", "Trần Văn Ơn", "Phó giám đốc", 13000);
        NhanVien nv3= new NhanVien("NV03", "Nguyễn Thị Hồng", "Trưởng phòng", 8000);
        QuanLyNhanVien instance = new QuanLyNhanVien();
        instance.ThemNhanVien(nv1); 
        instance.ThemNhanVien(nv2); 
        instance.ThemNhanVien(nv3);
        instance.GhiDuLieu("NhanVien.txt");
        ArrayList<NhanVien> duLieudoc = instance.DocDuLieu("NhanVien.txt");
        assertEquals(nv1.Xuat(), duLieudoc.get(0).Xuat());
        assertEquals(nv2.Xuat(), duLieudoc.get(1).Xuat());
        assertEquals(nv3.Xuat(), duLieudoc.get(2).Xuat());
    }
    
}
