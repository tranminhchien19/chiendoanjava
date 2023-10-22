/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doannhom4_qlnh;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Asus
 */
public class frmDonHang extends javax.swing.JFrame {

    /**
     * Creates new form frmDonHang
     */
    public frmDonHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMonAn = new javax.swing.JTable();
        txtTenMA = new javax.swing.JTextField();
        txtHinh = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaMA = new javax.swing.JTextField();
        btnDoc = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNM = new javax.swing.JTextField();
        btnGiaoHang = new javax.swing.JButton();
        txtNgayGiao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        btnNHT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Quản lý đơn hàng");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 176, -1));

        jLabel2.setFont(new java.awt.Font("Zilla Slab Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Restaurant Food");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 16, -1, -1));

        tableMonAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMonAnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMonAn);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 491, 190));

        txtTenMA.setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().add(txtTenMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 197, 157, -1));

        txtHinh.setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().add(txtHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 230, 157, -1));

        txtGia.setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 264, 157, -1));

        jLabel3.setText("Mã món ăn:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 168, -1, -1));

        jLabel4.setText("Tên món ăn:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel5.setText("Hình ảnh:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 235, -1, -1));

        jLabel6.setText("Giá bán:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 269, -1, -1));

        txtMaMA.setBackground(new java.awt.Color(0, 255, 204));
        txtMaMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMAActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 161, 157, -1));

        btnDoc.setBackground(new java.awt.Color(204, 0, 204));
        btnDoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoc.setForeground(new java.awt.Color(153, 255, 255));
        btnDoc.setText("Xem DS Đơn hàng");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel7.setText("SDT:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        txtNM.setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().add(txtNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 157, -1));

        btnGiaoHang.setText("Giao hàng");
        btnGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoHangActionPerformed(evt);
            }
        });
        getContentPane().add(btnGiaoHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));
        getContentPane().add(txtNgayGiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, -1));

        jLabel8.setText("Nhập ngày giao");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        txtSDT.setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 157, -1));

        btnNHT.setText("Ngày hiện tại");
        btnNHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNHTActionPerformed(evt);
            }
        });
        getContentPane().add(btnNHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    QuanLyGioHang qlgh = new QuanLyGioHang();
    QuanLyDonHang qldh = new QuanLyDonHang();
    QuanLyDoanhThu qldt = new QuanLyDoanhThu();
    private void tableMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMonAnMouseClicked
        // TODO add your handling code here:
        int row = tableMonAn.getSelectedRow();
        GioHang nh = qlgh.getData().get(row);
        txtMaMA.setText(nh.getMaMonAn());
        txtTenMA.setText(nh.getTenMonAn());
        txtHinh.setText(nh.getHinh());
        txtGia.setText(String.valueOf(nh.getGiaBan()));
        txtSDT.setText(String.valueOf(nh.getSdt()));
        txtNM.setText(nh.getNguoiMua());
    }//GEN-LAST:event_tableMonAnMouseClicked

    private void txtMaMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaMAActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        // TODO add your handling code here:
        ArrayList<GioHang> nh = qlgh.DocDuLieu("DonHang.txt");
        for (GioHang monAn : nh) {
            qlgh.ThemMonAn(monAn);
        }
        HienThi();
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoHangActionPerformed
        // TODO add your handling code here:
        String maMA = txtMaMA.getText();
        String tenMA = txtTenMA.getText();
        String hinh = txtHinh.getText();
        int giaBan = Integer.parseInt(txtGia.getText());
        int sdt = Integer.parseInt(txtSDT.getText());
        String tenNM = txtNM.getText();
        String ngayGiao = txtNgayGiao.getText();
        
        qldt.ThemMonAn(new DoanhThu(maMA, tenMA, hinh, giaBan, sdt,tenNM,ngayGiao));
        HienThi();
        qldt.GhiDuLieu("DoanhThu.txt");
        boolean kt = qlgh.Xoa(maMA);
        if (kt) {
            JOptionPane.showMessageDialog(this, "Giao thành công");
            HienThi();

        } else {
            JOptionPane.showMessageDialog(this, "Không giao được");
        }
    }//GEN-LAST:event_btnGiaoHangActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
   
         this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNHTActionPerformed
        // TODO add your handling code here:
       Date date = new Date();           
      DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      String dateFormat = sdf.format(date);     
      txtNgayGiao.setText(dateFormat);
    }//GEN-LAST:event_btnNHTActionPerformed

      private void HienThi() {
        DefaultTableModel tableModel = (DefaultTableModel) tableMonAn.getModel();
        tableModel.setColumnCount(0);
        tableModel.setRowCount(0);
        tableModel.addColumn("Mã món ăn");
        tableModel.addColumn("Tên món ăn");
        tableModel.addColumn("Hình");
        tableModel.addColumn("Giá bán");
        tableModel.addColumn("Số điện thoại");
        tableModel.addColumn("Tên người mua");
        ArrayList<GioHang> data = qlgh.getData();
        for (GioHang monAn : data) {
            tableModel.addRow(new Object[]{monAn.getMaMonAn(), monAn.getTenMonAn(), monAn.getHinh(), monAn.getGiaBan(),monAn.getSdt(),monAn.getNguoiMua()});
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnGiaoHang;
    private javax.swing.JButton btnNHT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMonAn;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtHinh;
    private javax.swing.JTextField txtMaMA;
    private javax.swing.JTextField txtNM;
    private javax.swing.JTextField txtNgayGiao;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenMA;
    // End of variables declaration//GEN-END:variables
}
