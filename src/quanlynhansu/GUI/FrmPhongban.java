/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.GUI;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import quanlynhansu.Model.PhongBan;
import quanlynhansu.DAO.PhongBanDAO;

/**
 *
 * @author Acer
 */
public class FrmPhongban extends javax.swing.JInternalFrame {

    ArrayList<PhongBan> listpb = new ArrayList<>();
    PhongBanDAO pbdao = new PhongBanDAO();
    DefaultTableModel model;
    PhongBan nv = new PhongBan();
    Date date;

    /**
     * Creates new form FromPhongban
     */
    public FrmPhongban() {
        initComponents();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbMaPB = new javax.swing.JLabel();
        lnTenPB = new javax.swing.JLabel();
        lbTenBP = new javax.swing.JLabel();
        lbNgayThanhLap = new javax.swing.JLabel();
        lbChucVu = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbGhiCHu = new javax.swing.JLabel();
        txtTenPB = new javax.swing.JTextField();
        txtTenBoPhan = new javax.swing.JTextField();
        txtPCChucVu = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        dateNgayThanhLap = new org.jdesktop.swingx.JXDatePicker();
        txtMaPB = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnexportExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhongBan = new javax.swing.JTable();

        setTitle("Phòng ban");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setNextFocusableComponent(btnThem);

        lbMaPB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbMaPB.setText("Mã PB");

        lnTenPB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lnTenPB.setText("Tên PB");

        lbTenBP.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbTenBP.setText("Tên bộ phận");

        lbNgayThanhLap.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbNgayThanhLap.setText("Ngày thành lập");

        lbChucVu.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbChucVu.setText("PC Chức vụ");

        lbSoLuong.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbSoLuong.setText("Số Lượng");

        lbGhiCHu.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbGhiCHu.setText("Ghi chú");

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setToolTipText("Tiềm kiếm theo mã nhân  hoặc tên");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.setText("Tìm kiếm theo mã phòng ban hoặc tên phòng");
        txtSearch.setName(""); // NOI18N
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSearchMouseExited(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhansu/Icon/icons8-search-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnTenPB)
                    .addComponent(lbMaPB)
                    .addComponent(lbTenBP))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenPB, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtTenBoPhan)
                    .addComponent(txtMaPB))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNgayThanhLap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbChucVu)
                    .addComponent(lbSoLuong))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateNgayThanhLap, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(lbGhiCHu)
                        .addGap(42, 42, 42)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPCChucVu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dateNgayThanhLap, txtGhiChu, txtPCChucVu, txtSoLuong});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTenPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lnTenPB)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(lbMaPB)
                            .addGap(103, 103, 103)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbTenBP)
                                .addComponent(txtTenBoPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(122, 122, 122)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbSoLuong)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaPB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNgayThanhLap)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateNgayThanhLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbGhiCHu)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbChucVu)
                                            .addComponent(txtPCChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateNgayThanhLap, txtGhiChu, txtMaPB, txtPCChucVu, txtSoLuong, txtTenBoPhan, txtTenPB});

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnThem.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhansu/Icon/icons8-add-property-30.png"))); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhansu/Icon/icons8-edit-property-30.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhansu/Icon/icons8-delete-30.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnexportExcel.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        btnexportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhansu/Icon/icons8-export-excel-24.png"))); // NOI18N
        btnexportExcel.setText("Xuất Excel");
        btnexportExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua)
                .addGap(155, 155, 155)
                .addComponent(btnXoa)
                .addGap(139, 139, 139)
                .addComponent(btnexportExcel)
                .addGap(28, 28, 28))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSua, btnThem, btnXoa});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa)
                    .addComponent(btnexportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSua, btnThem, btnXoa});

        tbPhongBan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbPhongBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PB", "Tên PB", "Tên BP", "Ngày thành lập", "PC Chức vụ", "Số lượng", "Ghi chú"
            }
        ));
        tbPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPhongBan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (checkform() == true) {
            insert();
            load();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongBanMouseClicked
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_tbPhongBanMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (checkform() == true) {
            update();
            load();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
        load();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        txtSearch.setText(null);
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (!txtSearch.getText().isEmpty()) {
            loadSearch();
        } else {
            load();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseExited
        // TODO add your handling code here:
        txtSearch.setText("Tìm kiếm theo mã phòng ban hoặc tên phòng");
    }//GEN-LAST:event_txtSearchMouseExited

    private void btnexportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportExcelActionPerformed
        // TODO add your handling code here:
        try {
            excel();
        } catch (IOException ex) {
            Logger.getLogger(FrmPhongban.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnexportExcelActionPerformed
 
    private void excel() throws IOException {
        FileOutputStream outFile = null;
        JFileChooser chooser = null;
        try {
            model = (DefaultTableModel) tbPhongBan.getModel();
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sh = workbook.createSheet("Employees sheet");
            Row row = sh.createRow(0);
            for (int i = 0; i < model.getColumnCount(); i++) {
                Cell cell = row.createCell(i);
                cell.setCellValue(model.getColumnName(i));
            }
            for (int i = 0; i < model.getRowCount(); i++) {
                row = sh.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                }
            }
            chooser = new JFileChooser();
            int i = chooser.showSaveDialog(chooser);
            if (i == JFileChooser.APPROVE_OPTION);
            File file = chooser.getSelectedFile();
            file.getParentFile().mkdirs();
            outFile = new FileOutputStream(file + ".xls");
            try {
                workbook.write(outFile);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FrmThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Xuất file thành công");

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPhongban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                outFile.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FrmPhongban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

    }
    private boolean checkform() {
        if (txtMaPB.getText().equals("")) {
            txtMaPB.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã phòng ban","Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txtTenPB.getText().equals("")) {
            txtTenPB.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên phòng ban","Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (txtTenBoPhan.getText().equals("")) {
            txtTenBoPhan.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên bộ phận","Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (!(txtPCChucVu.getText().matches(".*[0-9].*"))) 
// đoạn này em sử dụng biểu thức chính quy của java để kiểm tra nhập vào chỉ là số
        {
            txtPCChucVu.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Yêu cầu nhập số cho phụ cấp chức vụ","Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!(txtSoLuong.getText().matches(".*[0-9].*")))
            // đoạn này em sử dụng biểu thức chính quy của java để kiểm tra nhập vào chỉ là số
        {
            txtSoLuong.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Yêu cầu nhập số cho số lượng","Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        return true;
    }

    public void loadSearch() {
        listpb = pbdao.Search(txtSearch.getText());
        model = (DefaultTableModel) tbPhongBan.getModel();
        model.setRowCount(0);
        for (PhongBan phongban : listpb) {
            model.addRow(new Object[]{
                phongban.getMaPB(),
                phongban.getTenPB(),
                phongban.getTenBoPhan(),
                phongban.getNgayThanhLap(),
                phongban.getPCChucVu(),
                phongban.getSoluong(),
                phongban.getGhichu(),});
        }
    }

    private void load() {
        listpb = pbdao.load();
        model = (DefaultTableModel) tbPhongBan.getModel();
        model.setRowCount(0);
        for (PhongBan pb : listpb) {
            model.addRow(new Object[]{
                pb.getMaPB(),
                pb.getTenPB(),
                pb.getTenBoPhan(),
                pb.getNgayThanhLap(),
                pb.getPCChucVu(),
                pb.getSoluong(),
                pb.getGhichu()
            });
        }
    }
// Hiển thị dữ liệu ra lên khi click vào table
    private void display() {
        try {
            int current = tbPhongBan.getSelectedRow();
            nv = listpb.get(current);
            txtMaPB.setText((String) tbPhongBan.getModel().getValueAt(current, 0));
            txtTenPB.setText((String) tbPhongBan.getModel().getValueAt(current, 1));
            txtTenBoPhan.setText((String) tbPhongBan.getModel().getValueAt(current, 2));
            model = (DefaultTableModel) tbPhongBan.getModel();
            date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(current, 3));
            dateNgayThanhLap.setDate(date);
            txtPCChucVu.setText(tbPhongBan.getModel().getValueAt(current, 4).toString());
            txtSoLuong.setText(tbPhongBan.getModel().getValueAt(current, 5).toString());
            txtGhiChu.setText((String) tbPhongBan.getModel().getValueAt(current, 6));
        } catch (ParseException ex) {
            Logger.getLogger(FrmPhongban.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void insert() {
        try {
            PhongBan pb = new PhongBan();
            pb.setMaPB(txtMaPB.getText());
            pb.setTenPB(txtTenPB.getText());
            pb.setTenBoPhan(txtTenBoPhan.getText());
            try {
                date = dateNgayThanhLap.getDate();
                String df = new SimpleDateFormat("yyyy-MM-dd").format(date);
                pb.setNgayThanhLap(df);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            pb.setPCChucVu(Integer.parseInt(txtPCChucVu.getText()));
            pb.setSoluong(Integer.parseInt(txtSoLuong.getText()));
            pb.setGhichu(txtGhiChu.getText());

            PhongBanDAO pbDao = new PhongBanDAO();
            if (pbDao.insert(pb) > 0) {
                JOptionPane.showMessageDialog(null, "Thêm  phòng ban thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Mã phòng ban [ " + txtMaPB.getText() + " ] đã tồn tại không thể thêm");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void update() {
        try {
            PhongBan pb = new PhongBan();
            pb.setMaPB(txtMaPB.getText());
            pb.setTenPB(txtTenPB.getText());
            pb.setTenBoPhan(txtTenBoPhan.getText());
            try {
                date = dateNgayThanhLap.getDate();
                String df = new SimpleDateFormat("yyyy-MM-dd").format(date);
                pb.setNgayThanhLap(df);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            pb.setPCChucVu(Integer.parseInt(txtPCChucVu.getText()));
            pb.setSoluong(Integer.parseInt(txtSoLuong.getText()));
            pb.setGhichu(txtGhiChu.getText());

            PhongBanDAO pbDao = new PhongBanDAO();
            if (pbDao.update(pb) > 0) {
                JOptionPane.showMessageDialog(null, "Sửa  phòng ban thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Mã phòng ban [ " + txtMaPB.getText() + " ]  không thể sửa");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void delete() {
        int index = tbPhongBan.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 phòng ban trong bảng để xóa", "Thông Báo", 1);
            return;
        }
        int tk = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
        if (tk == JOptionPane.YES_OPTION) {
            if (pbdao.delete(txtMaPB.getText())) {
                JOptionPane.showMessageDialog(this, "Xóa Phòng Ban thành công", "Thông Báo", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi hệ thống", "Thông Báo", 0);
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnexportExcel;
    private org.jdesktop.swingx.JXDatePicker dateNgayThanhLap;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lbGhiCHu;
    private javax.swing.JLabel lbMaPB;
    private javax.swing.JLabel lbNgayThanhLap;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbTenBP;
    private javax.swing.JLabel lnTenPB;
    private javax.swing.JTable tbPhongBan;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaPB;
    private javax.swing.JTextField txtPCChucVu;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenBoPhan;
    private javax.swing.JTextField txtTenPB;
    // End of variables declaration//GEN-END:variables
}
