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
public class QuanLyMonAnTest {

    @Test
    public void testThemMonAn() {
        System.out.println("Them");
        MonAn nh1 = new MonAn("P", "Phở", "abc.jpg", 30000);
        MonAn nh2 = new MonAn("HT", "Hủ tiếu", "abc.jpg", 25000);
        MonAn nh3 = new MonAn("BR", "Bún riêu", "abc.jpg", 30000);
        QuanLyMonAn instance = new QuanLyMonAn();
        instance.ThemMonAn(nh1);
        instance.ThemMonAn(nh2);
        int exResult = 2;
        int result = instance.CountMA();
        assertEquals(exResult, result);
    }

    @Test
    public void testXoa() {
        System.out.println("Xoa");
        MonAn nh1 = new MonAn("P", "Phở", "abc.jpg", 30000);
        MonAn nh2 = new MonAn("HT", "Hủ tiếu", "abc.jpg", 25000);
        MonAn nh3 = new MonAn("BR", "Bún riêu", "abc.jpg", 30000);
        QuanLyMonAn instance = new QuanLyMonAn();
        instance.ThemMonAn(nh1);
        instance.ThemMonAn(nh2);
        instance.ThemMonAn(nh3);
        instance.Xoa("P");
        int exResult = 2;
        int result = instance.CountMA();
        assertEquals(exResult, result);
    }

    /**
     * Test of TimTenMon method, of class QuanLiNhaHang.
     */
    @Test
    public void testTimTenMon() {
        System.out.println("TimKiem");
        MonAn nh1 = new MonAn("P", "Phở", "abc.jpg", 30000);
        MonAn nh2 = new MonAn("HT", "Hủ tiếu", "abc.jpg", 25000);
        MonAn nh3 = new MonAn("BR", "Bún riêu", "abc.jpg", 30000);
        QuanLyMonAn instance = new QuanLyMonAn();
        instance.ThemMonAn(nh1);
        instance.ThemMonAn(nh2);
        instance.ThemMonAn(nh3);
        MonAn result1 = instance.TimTenMon("Bánh mì");
        MonAn result2 = instance.TimTenMon("Bún riêu");
        assertNotNull(result2);
        assertNull(result1);
    }

    /**
     * Test of Sua method, of class QuanLiNhaHang.
     */
    @Test
    public void testSua() {
        System.out.println("Sua");
        MonAn nh1 = new MonAn("P", "Phở", "abc.jpg", 30000);
        MonAn nh2 = new MonAn("P", "Hủ tiếu", "abc.jpg", 25000);
        MonAn nh3 = new MonAn("BR", "Bún riêu", "abc.jpg", 30000);
        QuanLyMonAn instance = new QuanLyMonAn();
        instance.ThemMonAn(nh1);
        instance.ThemMonAn(nh3);
        instance.Sua(nh2);
        String exResult = nh2.Xuat();
        String result = instance.getData().get(0).Xuat();
        assertEquals(exResult, result);
    }

    @Test
    public void testConstructor() {
        System.out.println("Constructor");
        MonAn nh = new MonAn("V", "Vịt quay", "abc.png", 400000);
        String exResult = "V-Vịt quay-abc.png-400000";
        String result = nh.Xuat();
        assertEquals(exResult, result);
    }

    @Test
    public void testSapXepGiaBan() {
        System.out.println("SapXepGiaBan");
        MonAn nh1 = new MonAn("P", "Phở", "abc.jpg", 30000);
        MonAn nh2 = new MonAn("HT", "Hủ tiếu", "abc.jpg", 25000);
        MonAn nh3 = new MonAn("BR", "Bún riêu", "abc.jpg", 40000);
        QuanLyMonAn instance = new QuanLyMonAn();
        instance.ThemMonAn(nh1);
        instance.ThemMonAn(nh2);
        instance.ThemMonAn(nh3);
        instance.SapXepGiaBan();
        assertEquals(nh2.Xuat(), instance.getData().get(0).Xuat());
        assertEquals(nh1.Xuat(), instance.getData().get(1).Xuat());
        assertEquals(nh3.Xuat(), instance.getData().get(2).Xuat());
    }

    @Test
    public void testDocGhiFile() {
        System.out.println("DocGhiFile");
        MonAn nh1 = new MonAn("P", "Phở", "abc.jpg", 30000);
        MonAn nh2 = new MonAn("HT", "Hủ tiếu", "abc.jpg", 25000);
        MonAn nh3 = new MonAn("BR", "Bún riêu", "abc.jpg", 40000);
        QuanLyMonAn instance = new QuanLyMonAn();
        instance.ThemMonAn(nh1);
        instance.ThemMonAn(nh2);
        instance.ThemMonAn(nh3);
        instance.GhiDuLieu("MonAn.txt");
        ArrayList<MonAn> duLieudoc = instance.DocDuLieu("MonAn.txt");
        assertEquals(nh1.Xuat(), duLieudoc.get(0).Xuat());
        assertEquals(nh2.Xuat(), duLieudoc.get(1).Xuat());
        assertEquals(nh3.Xuat(), duLieudoc.get(2).Xuat());
    }

}
