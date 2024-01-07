/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pengelolaan_krs;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRFAN
 */
public class data_spp extends javax.swing.JFrame {

    /**
     * Creates new form tampilan
     */
    public data_spp() {
        initComponents();
        tampil_data(); {
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("ID");
    tabel.addColumn("NAMA");
    tabel.addColumn("ALAMAT");
    tabel.addColumn("JENIS KELAMIN");
    tabel.addColumn("JURUSAN");
    tabel.addColumn("FAKULTAS");

    try {
        java.sql.Connection conn = Config.configDB();
        String sql = "SELECT * FROM krs";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        // Bersihkan baris yang ada dalam model tabel
        tabel.setRowCount(0);

        while (rs.next()) {
            tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8)
            });
        }

        jTable1.setModel(tabel);
    } catch (Exception e) {
        e.printStackTrace();
    }
};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void tampil_data() {
    DefaultTableModel tabel = new DefaultTableModel();
    tabel.addColumn("ID");
    tabel.addColumn("NAMA");
    tabel.addColumn("JENIS KELAMIN");
    tabel.addColumn("TTL");
    tabel.addColumn("AGAMA");
    tabel.addColumn("ALAMAT");
    tabel.addColumn("NO HP");
    tabel.addColumn("EMAIL");
    tabel.addColumn("KETERANGAN");

    try {
        java.sql.Connection conn = Config.configDB();
        String sql = "SELECT * FROM krs";
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        // Bersihkan baris yang ada dalam model tabel
        tabel.setRowCount(0);

        while (rs.next()) {
            tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8)
            });
        }

        jTable1.setModel(tabel);
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        cbJk = new javax.swing.JComboBox<>();
        txtJurusan = new javax.swing.JTextField();
        txtFakultas = new javax.swing.JTextField();
        txtCari = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btCari = new javax.swing.JButton();
        btCetak = new javax.swing.JButton();
        btKembali = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 103, 180, -1));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 146, 180, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 185, 180, -1));

        cbJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        cbJk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJkActionPerformed(evt);
            }
        });
        getContentPane().add(cbJk, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 226, 180, -1));
        getContentPane().add(txtJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 268, 180, -1));
        getContentPane().add(txtFakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 310, 180, -1));

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 105, 161, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 330, 200));

        btCari.setText("Cari");
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });
        getContentPane().add(btCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 384, 90, -1));

        btCetak.setText("Cetak");
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });
        getContentPane().add(btCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 384, 90, -1));

        btKembali.setText("Kembali");
        btKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 384, 90, -1));

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 384, 80, -1));

        btBatal.setText("Batal");
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 384, 80, -1));

        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 384, 80, -1));

        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 384, 80, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/table spp.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void cbJkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJkActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO data_krs values('"
                    +txtID.getText()+"','"
                    +txtNama.getText()+"','"
                    +txtAlamat.getText()+"','"
                    +cbJk.getSelectedItem()+"','"
                    +txtJurusan.getText()+"','"
                    +txtFakultas.getText()+"')";
            java.sql.Connection conn = Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "berhasil di simpan");
                    tampil_data();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal di simpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
        // TODO add your handling code here:
               try {
                    java.sql.Connection conn = Config.configDB();
                    String sql = "Select * from data_krs where id='"+txtCari.getText()+"' or nama='"+txtCari.getText()+"'";
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery(sql);
                    if (rs.next()){
                        txtID.setText(rs.getString(1));
                        txtNama.setText(rs.getString(2));
                        txtAlamat.setText(rs.getString(3));
                        cbJk.setSelectedItem(rs.getString(4));
                        txtJurusan.setText(rs.getString(5));
                        txtFakultas.setText(rs.getString(6));
                        JOptionPane.showMessageDialog(null,"Data krs : "
                        + txtCari.getText() + " ditemukan, Apakah Anda Ingin Mengedit atau Menghapus?");
                    }
                } catch (Exception e){}
                txtCari.requestFocus();
    }//GEN-LAST:event_btCetakActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        try{
                String sql = "UPDATE data_krs SET "
                    + "nama=?, "
                    + "alamat=?, "
                    + "jk=?, "
                    + "jurusan=?, "
                    + "fakultas=? "
                    + "WHERE id=?";

            java.sql.Connection conn = Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            // Set nilai parameter
            pst.setString(1, txtNama.getText());
            pst.setString(2, txtAlamat.getText());
            pst.setString(3, (String) cbJk.getSelectedItem());
            pst.setString(4, txtJurusan.getText());
            pst.setString(5, txtFakultas.getText());
            pst.setString(8, txtID.getText());

            // Jalankan pernyataan SQL
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil diperbarui");
            tampil_data();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal diperbarui");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection conn = Config.configDB();
            String sql = "delete from data_krs where id='"+txtID.getText()+"' ";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.executeUpdate(); JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
            tampil_data();
            }
        catch (Exception e){
        JOptionPane.showMessageDialog(null,"Proses Penghapusan Gagal");
        System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        cbJk.setSelectedItem("");
        txtJurusan.setText("");
        txtFakultas.setText("");
        txtID.requestFocus(); 
    }//GEN-LAST:event_btBatalActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
               try {
                    java.sql.Connection conn = Config.configDB();
                    String sql = "Select * from data_krs where id='"+txtCari.getText()+"' or nama='"+txtCari.getText()+"'";
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery(sql);
                    if (rs.next()){
                        txtID.setText(rs.getString(1));
                        txtNama.setText(rs.getString(2));
                        txtAlamat.setText(rs.getString(3));
                        cbJk.setSelectedItem(rs.getString(4));
                        txtJurusan.setText(rs.getString(5));
                        txtFakultas.setText(rs.getString(6));
                        JOptionPane.showMessageDialog(null,"Data krs : "
                        + txtCari.getText() + " ditemukan, Apakah Anda Ingin Mengedit atau Menghapus?");
                    }
                } catch (Exception e){}
                txtCari.requestFocus();
    }//GEN-LAST:event_btCariActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new pengelolaan_krs.home().setVisible(true);
    }//GEN-LAST:event_btKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(data_spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(data_spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new data_spp().setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btKembali;
    private javax.swing.JButton btSimpan;
    private javax.swing.JComboBox<String> cbJk;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtFakultas;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJurusan;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
