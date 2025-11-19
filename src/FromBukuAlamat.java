
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class FromBukuAlamat extends javax.swing.JFrame {
    private final KontakController kontakController = new KontakController();

    public FromBukuAlamat() {
        initComponents();
        loadTable();

    }

private void loadTable() {
    try {
        KontakController controller = new KontakController();
        List<Kontak> list = controller.getAllContacts();

        String[] column = {"ID", "Nama", "Telepon", "Email", "Alamat"};
        Object[][] data = new Object[list.size()][5];

        for (int i = 0; i < list.size(); i++) {
            Kontak k = list.get(i);
            data[i][0] = k.getId();
            data[i][1] = k.getNama();
            data[i][2] = k.getNomorTelepon();
            data[i][3] = k.getEmail();
            data[i][4] = k.getAlamat();
        }

        tableKontak.setModel(new javax.swing.table.DefaultTableModel(data, column));

    } catch (SQLException e) {
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        tblKontak = new javax.swing.JScrollPane();
        tableKontak = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnTambah1 = new javax.swing.JButton();
        btnTambah2 = new javax.swing.JButton();
        btnHapus1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi Buku Alamat");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telepon :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat :");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        tblKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKontakMouseClicked(evt);
            }
        });

        tableKontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Telepon", "Email", "Alamat"
            }
        ));
        tableKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKontakMouseClicked(evt);
            }
        });
        tblKontak.setViewportView(tableKontak);

        btnTambah.setBackground(new java.awt.Color(204, 0, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 0, 204));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 0, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Cari :");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariKeyTyped(evt);
            }
        });

        btnTambah1.setBackground(new java.awt.Color(204, 0, 204));
        btnTambah1.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah1.setText("Import");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnTambah2.setBackground(new java.awt.Color(204, 0, 204));
        btnTambah2.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah2.setText("Export");
        btnTambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah2ActionPerformed(evt);
            }
        });

        btnHapus1.setBackground(new java.awt.Color(204, 0, 51));
        btnHapus1.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus1.setText("Keluar");
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete))
                    .addComponent(txtNama)
                    .addComponent(txtTelepon)
                    .addComponent(txtEmail)
                    .addComponent(jScrollPane1)
                    .addComponent(txtCari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblKontak))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambah2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tblKontak, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1)
                    .addComponent(btnTambah2)
                    .addComponent(btnHapus1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
            try {
        KontakController controller = new KontakController();
        controller.addContact(
            txtNama.getText(),
            txtTelepon.getText(),
            txtEmail.getText(),
            txtAlamat.getText()
        );
        JOptionPane.showMessageDialog(this,"Berhasil ditambahkan!");
        loadTable();
        clear();
    } catch (SQLException e) {
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
        int id = Integer.parseInt(tableKontak.getValueAt(tableKontak.getSelectedRow(), 0).toString());

        KontakController controller = new KontakController();
        controller.updateContact(
            id,
            txtNama.getText(),
            txtTelepon.getText(),
            txtEmail.getText(),
            txtAlamat.getText()
        );
        JOptionPane.showMessageDialog(this,"Berhasil diubah!");
        loadTable();
    } catch (HeadlessException | NumberFormatException | SQLException e) {
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
        int id = Integer.parseInt(tableKontak.getValueAt(tableKontak.getSelectedRow(), 0).toString());

        KontakController controller = new KontakController();
        controller.deleteContact(id);
        JOptionPane.showMessageDialog(this,"Berhasil dihapus!");
        loadTable();
    } catch (HeadlessException | NumberFormatException | SQLException e) {
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKontakMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_tblKontakMouseClicked

    private void btnTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah2ActionPerformed
            try {
        JFileChooser fc = new JFileChooser();
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {

            File f = fc.getSelectedFile();
            try (FileWriter fw = new FileWriter(f + ".csv")) {
                for (int i = 0; i < tableKontak.getRowCount(); i++) {
                    fw.write(tableKontak.getValueAt(i, 0) + "," +
                            tableKontak.getValueAt(i, 1) + "," +
                            tableKontak.getValueAt(i, 2) + "," +
                            tableKontak.getValueAt(i, 3) + "," +
                            tableKontak.getValueAt(i, 4) + "\n");
                }
            }
            JOptionPane.showMessageDialog(this, "Export berhasil!");
        }

    } catch (HeadlessException | IOException e) {
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambah2ActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
            try {
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File f = fc.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String line;
                
                KontakController controller = new KontakController();
                
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    
                    // data[0] = id (abaikan)
                    controller.addContact(data[1], data[2], data[3], data[4]);
                }
            }
            loadTable();
            JOptionPane.showMessageDialog(this, "Import berhasil!");
        }

    } catch (HeadlessException | IOException | SQLException e) {
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void tableKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKontakMouseClicked
    int row = tableKontak.getSelectedRow();
    txtNama.setText(tableKontak.getValueAt(row, 1).toString());
    txtTelepon.setText(tableKontak.getValueAt(row, 2).toString());
    txtEmail.setText(tableKontak.getValueAt(row, 3).toString());
    txtAlamat.setText(tableKontak.getValueAt(row, 4).toString()); 
    }//GEN-LAST:event_tableKontakMouseClicked

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
    int confirm = JOptionPane.showConfirmDialog(this, 
        "Yakin ingin keluar?", "Konfirmasi", 
        JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void txtCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyTyped
            String keyword = txtCari.getText().trim();

    try {
        List<Kontak> hasil = kontakController.searchContacts(keyword);

        DefaultTableModel model = (DefaultTableModel) tableKontak.getModel();
        model.setRowCount(0); // hapus semua baris lama

        for (Kontak k : hasil) {
            model.addRow(new Object[]{
                k.getId(),
                k.getNama(),
                k.getNomorTelepon(),
                k.getEmail(),
                k.getAlamat()
            });
        }

    } catch (SQLException e) {
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariKeyTyped
private void clear() {
    txtNama.setText("");
    txtTelepon.setText("");
    txtEmail.setText("");
    txtAlamat.setText("");
}
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(() -> {
            new FromBukuAlamat().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btnTambah2;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableKontak;
    private javax.swing.JScrollPane tblKontak;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

}
