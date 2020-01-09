/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author ENNVYX
 */
public class LaporanBulanan extends javax.swing.JFrame {
    public static int role = 1;
    
    /**
     * Creates new form LaporanBulanan
     */
    public LaporanBulanan() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_Tbulanan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        B_Search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDCdari = new com.toedter.calendar.JDateChooser();
        jDCsampai = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        Lb_Back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 242, 255));

        jPanel1.setBackground(new java.awt.Color(215, 249, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 395));

        t_Tbulanan.setBackground(new java.awt.Color(255, 237, 225));
        t_Tbulanan.setForeground(new java.awt.Color(40, 38, 39));
        t_Tbulanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Telepon", "Alamat", "Tipe Cuci", "Jumlah Cucian", "Harga", "Tangal Masuk", "Tanggal Keluar", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        t_Tbulanan.setGridColor(new java.awt.Color(40, 38, 39));
        jScrollPane1.setViewportView(t_Tbulanan);
        if (t_Tbulanan.getColumnModel().getColumnCount() > 0) {
            t_Tbulanan.getColumnModel().getColumn(0).setPreferredWidth(3);
            t_Tbulanan.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 38, 39));
        jLabel1.setText("Jumlah transaksi");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 38, 39));
        jLabel2.setText("Total Harga");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(40, 38, 39));
        jLabel4.setText(" ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(40, 38, 39));
        jLabel5.setText(" ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(40, 38, 39));
        jLabel7.setText("Transaksi Bulanan");

        B_Search.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B_Search.setForeground(new java.awt.Color(40, 38, 39));
        B_Search.setText("Search");
        B_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SearchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(40, 38, 39));
        jLabel8.setText("Dari");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(40, 38, 39));
        jLabel9.setText("Sampai");

        jDCdari.setForeground(new java.awt.Color(40, 38, 39));

        jDCsampai.setForeground(new java.awt.Color(40, 38, 39));

        jPanel2.setBackground(new java.awt.Color(175, 203, 255));

        Lb_Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Lb_Back.setText("Back");
        Lb_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\GitHub_Repos\\laundry\\Resoure Design\\Monthly.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDCdari, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(jDCsampai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(B_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(224, 224, 224)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDCdari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jDCsampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_Search)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SearchActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Telp");
        model.addColumn("Alamat");
        model.addColumn("Tipe Cuci");
        model.addColumn("Jumlah cucian");
        model.addColumn("Harga");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Keluar");
        model.addColumn("Status");
        
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d = jDCdari.getDate();
        String dari = dateFormat.format(d);
        System.out.println(dari);
        
        java.util.Date s = jDCsampai.getDate();
        String sampai = dateFormat.format(s);
        System.out.println(sampai);
        
        try {
            int harga = 0;
            int jumlah = 0;  
            String sql = "select * from wash_list WHERE wash_date_out BETWEEN'"+dari+"' AND '"+sampai+"'";
            java.sql.Connection conn = (Connection) Connect.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            while (rs.next()){
                model.addRow(new Object[]{rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
                harga = harga + Integer.parseInt(rs.getString(8));
                jumlah = jumlah + 1;
        }
            t_Tbulanan.setModel(model);
            jLabel5.setText("Rp."+Integer.toString(harga));
            jLabel4.setText(Integer.toString(jumlah));
        } catch (Exception e) {
    }        
        
//        String dari = jDCdari.getText();
//        String sampai = jDCsampai.getDateFormatString();
//        
//        System.out.println(dari);
//        System.out.println(sampai);
//                
//        SimpleDateFormat sdf;
//        sdf = new SimpleDateFormat("yyyy-M-d");
//        jTextField1.setText(sdf.format(jDCdari.getDate()));
    }//GEN-LAST:event_B_SearchActionPerformed

    private void jDCdariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDCdariInputMethodTextChanged
        // TODO add your handling code here
    }//GEN-LAST:event_jDCdariInputMethodTextChanged

    private void Lb_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_BackMouseClicked
        // TODO add your handling code here:
        MainMenu menu = new MainMenu();
        if(this.role == 1) {
            menu.role = 1;
            menu.bt_harian.setVisible(true);
            menu.bt_bulanan.setVisible(true);
        }
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_Lb_BackMouseClicked

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
            java.util.logging.Logger.getLogger(LaporanBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaporanBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaporanBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaporanBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaporanBulanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Search;
    private javax.swing.JLabel Lb_Back;
    private com.toedter.calendar.JDateChooser jDCdari;
    private com.toedter.calendar.JDateChooser jDCsampai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t_Tbulanan;
    // End of variables declaration//GEN-END:variables
}
