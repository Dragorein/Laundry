/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.util.Date;
//import java.util.Calendar;
import java.text.SimpleDateFormat;
//import java.text.DateFormat;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import java.util.UUID;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author wulfric
 */
public class InputCucianKhusus extends javax.swing.JFrame {
    public static int role = 0;

    /**
     * Creates new form InputCucianKhusus
     */
    public InputCucianKhusus() {
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
        Bt_Submit = new javax.swing.JButton();
        Bt_Cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Lb_Nama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lb_Telp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Lb_Alamat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cb_Jenis = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SpinnerNumberModel model = new SpinnerNumberModel(0,0,100,1);
        Sp_Jumlah = new javax.swing.JSpinner(model);
        jLabel9 = new javax.swing.JLabel();
        Lb_Harga = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(215, 249, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 420));

        Bt_Submit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Bt_Submit.setText("Submit");
        Bt_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_SubmitActionPerformed(evt);
            }
        });

        Bt_Cancel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Bt_Cancel.setText("Cancel");
        Bt_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CancelActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 237, 225));
        jPanel2.setPreferredSize(new java.awt.Dimension(374, 319));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Nama");

        Lb_Nama.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Lb_Nama.setText("nama");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("No. Telp");

        Lb_Telp.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Lb_Telp.setText("telp");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Alamat");

        Lb_Alamat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Lb_Alamat.setText("alamat");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Jenis Cucian");

        Cb_Jenis.setBackground(new java.awt.Color(2, 242, 255));
        Cb_Jenis.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Cb_Jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jas", "Jaket", "Boneka", "Karpet" }));
        Cb_Jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_JenisActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Jumlah");

        Sp_Jumlah.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Sp_Jumlah.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sp_JumlahStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Pcs");

        Lb_Harga.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Lb_Harga.setText("0");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Rp");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Harga");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lb_Harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Sp_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(Cb_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 13, Short.MAX_VALUE)))))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Nama)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Telp)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_Alamat)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cb_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Sp_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(Lb_Harga))
                .addGap(25, 25, 25))
        );

        jPanel3.setBackground(new java.awt.Color(175, 203, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(751, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Input Cucian (Satuan)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\Marco Tugas\\TugasOOP\\Laundry\\Resoure Design\\Washer.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bt_Submit)
                .addGap(38, 38, 38)
                .addComponent(Bt_Cancel)
                .addGap(286, 286, 286))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Submit)
                    .addComponent(Bt_Cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_SubmitActionPerformed
        // TODO add your handling code here:
        
        //tanggal
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Date currentDate = new Date();
        String current = sdf.format(currentDate);
        
        //menambahan estimasi
        SimpleDateFormat ed = new SimpleDateFormat("yyyy-MM");
        SimpleDateFormat f = new SimpleDateFormat("dd");
        Date finishDate = new Date();
        String finishMY = ed.format(finishDate);
        String finishD = f.format(finishDate);
        
        int finishNew = Integer.parseInt(finishD) + 3;
        
        String finishNewD = String.valueOf(finishNew);
        
        String finish = finishMY+"-"+finishNewD;
        
        //Unique random
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        SimpleDateFormat uq = new SimpleDateFormat("yy-yyMMdd");
        String A = uq.format(timestamp);
        String time = A;
        String[] zone = time.split("-");
        String part1 = zone[1];
        UUID uid = UUID.randomUUID();
        String C = String.valueOf(uid);
        String string = C;
        String[] parts = string.split("-");
        String part2 = parts[1];
        
        String unique = part1 + part2;
        
        //buat pdf
        SimpleDateFormat dy = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Timestamp dayandtime = new Timestamp(System.currentTimeMillis());
        
        try {
            // Cetak PDF
            PDDocument data2 = new PDDocument();
            
            PDPage page = new PDPage();
            data2.addPage(page);
            String message = "                                        ~Eka Laundry~ ";
            String message1 ="                              Jl Taman Yasmin No 2 Bekasi";
            String message2 ="                                    " +dy.format(dayandtime);
            String message3 ="--------------------------------------------------------------------------------------";
            String message4 ="No.Cucian        : " +unique;
            String message5 ="Nama               : " +Lb_Nama.getText();
            String message6 ="No.Telp            : " +Lb_Telp.getText();
            String message7 ="Alamat             : " +Lb_Alamat.getText();
            String message8 ="Jenis Cucian    : " + Cb_Jenis.getSelectedItem();
            String message9 ="Jumlah Item     : " + Sp_Jumlah.getValue();
            String message10 ="Total Harga                                                                = Rp." + Lb_Harga.getText();
            PDFont font = PDType1Font.HELVETICA;
 
            PDPageContentStream contents = new PDPageContentStream(data2, page);
            contents.beginText();
            contents.setFont(font, 18);
            contents.setLeading(14.5f);
            contents.newLineAtOffset(25, 725);
            contents.showText(message);
            contents.newLine();
            contents.showText(message1);
            contents.newLine();
            contents.newLine();
            contents.showText(message2);
            contents.newLine();
            contents.showText(message3);
            contents.newLine();
            contents.showText(message3);
            contents.newLine();
            contents.newLine();
            contents.showText(message4);
            contents.newLine();
            contents.newLine();
            contents.showText(message5);
            contents.newLine();
            contents.newLine();
            contents.showText(message6);
            contents.newLine();
            contents.newLine();
            contents.showText(message7);
            contents.newLine();
            contents.newLine();
            contents.showText(message8);
            contents.newLine();
            contents.newLine();
            contents.showText(message9);
            contents.newLine();
            contents.newLine();
            contents.showText(message3);
            contents.newLine();
            contents.newLine();
            contents.showText(message10);
            contents.endText();
            contents.close();
            
            data2.save("D:/Marco Tugas/TugasOOP/laundry/Struk_PDF/Struk" +unique+ ".pdf");
            data2.close();

            //insert data ke database
            String sql = "INSERT INTO wash_list(wash_key,wash_cust_name, wash_cust_phone, wash_cust_address, wash_type, wash_qty, wash_price, wash_status, wash_date_in, wash_date_out) values('"+ unique +"','" + Lb_Nama.getText() + "','" + Lb_Telp.getText() + "','" + Lb_Alamat.getText() + "','" + Cb_Jenis.getSelectedItem() + "'," + Sp_Jumlah.getValue() + "," + Lb_Harga.getText() + ",'Antri','" + current +"','" + finish +"');";
            java.sql.Connection conn=(Connection)Connect.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            
            //option pane
            String[] options = {"Main Menu", "Input Cucian"};
           int x = JOptionPane.showOptionDialog(null, "Data berhasil di tambahkan\n\nSilakan pilih task selanjutnya\n", "Input Cucian", JOptionPane.DEFAULT_OPTION , JOptionPane.INFORMATION_MESSAGE , null, options, options[0]);
            
            if (x == 1){
                PilihInputCucian pilih = new PilihInputCucian();
                pilih.role = this.role;
                pilih.setVisible(true);
                dispose();
            } else if (x == 0){
                MainMenu menu = new MainMenu();
                if(this.role == 1) {
                    menu.role = 1;
                    menu.bt_harian.setVisible(true);
                    menu.bt_bulanan.setVisible(true);
                }
                menu.setVisible(true);
                dispose();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Penambahan Data Gagal "+e.getMessage());
        }
    }//GEN-LAST:event_Bt_SubmitActionPerformed

    private void Sp_JumlahStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sp_JumlahStateChanged
        
        String jenis = (String) Cb_Jenis.getSelectedItem();
        
        
        try {
            int harga;
            String sql = "select price from wash_price WHERE name ='" + jenis + "'";
            java.sql.Connection conn = (Connection) Connect.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                harga = rs.getInt(1);
                Lb_Harga.setText(Integer.toString((Integer)Sp_Jumlah.getValue() * harga));
            }
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada koneksi "+e.getMessage());
        }
        
        
    }//GEN-LAST:event_Sp_JumlahStateChanged

    private void Cb_JenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_JenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_JenisActionPerformed

    private void Bt_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CancelActionPerformed
        // TODO add your handling code here:
        PilihInputCucian pilihinput = new PilihInputCucian();
        pilihinput.role = this.role;
        pilihinput.setVisible(true);
        dispose();
    }//GEN-LAST:event_Bt_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(InputCucianKhusus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputCucianKhusus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputCucianKhusus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputCucianKhusus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputCucianKhusus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cancel;
    private javax.swing.JButton Bt_Submit;
    private javax.swing.JComboBox<String> Cb_Jenis;
    public static javax.swing.JLabel Lb_Alamat;
    private javax.swing.JLabel Lb_Harga;
    public static javax.swing.JLabel Lb_Nama;
    public static javax.swing.JLabel Lb_Telp;
    private javax.swing.JSpinner Sp_Jumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
