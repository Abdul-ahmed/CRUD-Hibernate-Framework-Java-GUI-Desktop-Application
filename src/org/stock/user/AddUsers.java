package org.stock.user;

import java.util.Date;
import javax.swing.JOptionPane;

public class AddUsers extends javax.swing.JFrame {
    
    public void setTable(Object obj[][]){
        this.jtList.setModel(
                new javax.swing.table.DefaultTableModel(
                        obj,
                        new String[]{
                            "SN", "Username", "Level", "Status"
                        }
                )
        );
    }

    public AddUsers() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        bntAddUser = new javax.swing.JButton();
        txtLevel = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtList = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUpdateUsername = new javax.swing.JTextField();
        lblUpdateUsername = new javax.swing.JLabel();
        txtVerifyPassword = new javax.swing.JPasswordField();
        lblVerifyPassword = new javax.swing.JLabel();
        lblUpdateLevel = new javax.swing.JLabel();
        cboUdateLevel = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        lblUpdatePassword = new javax.swing.JLabel();
        txtUpdatePassword = new javax.swing.JPasswordField();
        lblUpdateStatus = new javax.swing.JLabel();
        chkUpdateStatus = new javax.swing.JCheckBox();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Users Account");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New User");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(5);
        jLabel1.setName("txtTitle"); // NOI18N

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 102));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 102));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Password:");

        lblLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLevel.setForeground(new java.awt.Color(0, 0, 102));
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLevel.setText("Level:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 102));
        txtUsername.setToolTipText("Add Full name e.g. John Wood");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        bntAddUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntAddUser.setForeground(new java.awt.Color(0, 0, 102));
        bntAddUser.setText("Add User");
        bntAddUser.setToolTipText("Submit Button");
        bntAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddUserActionPerformed(evt);
            }
        });

        txtLevel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLevel.setForeground(new java.awt.Color(0, 0, 102));
        txtLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Administrator", "Cashier", "Product Manager", "Customer", "Supplier" }));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntAddUser)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblLevel)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPassword)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bntAddUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtList.setForeground(new java.awt.Color(0, 0, 102));
        jtList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S/N", "Username", "Level", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtList);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("List of Users");

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 102));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btnDelete))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Update User Account");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setIconTextGap(5);
        jLabel6.setName("txtTitle"); // NOI18N

        txtUpdateUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUpdateUsername.setForeground(new java.awt.Color(0, 0, 102));
        txtUpdateUsername.setToolTipText("Add Full name e.g. John Wood");
        txtUpdateUsername.setEnabled(false);
        txtUpdateUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateUsernameActionPerformed(evt);
            }
        });

        lblUpdateUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUpdateUsername.setForeground(new java.awt.Color(0, 0, 102));
        lblUpdateUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateUsername.setText("Username:");

        txtVerifyPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtVerifyPassword.setEnabled(false);

        lblVerifyPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVerifyPassword.setForeground(new java.awt.Color(0, 0, 102));
        lblVerifyPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVerifyPassword.setText("Verify Password:");

        lblUpdateLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUpdateLevel.setForeground(new java.awt.Color(0, 0, 102));
        lblUpdateLevel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateLevel.setText("Level:");

        cboUdateLevel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboUdateLevel.setForeground(new java.awt.Color(0, 0, 102));
        cboUdateLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Administrator", "Cashier", "Product Manager", "Customer", "Supplier" }));
        cboUdateLevel.setEnabled(false);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 102));
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("Submit Button");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblUpdatePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUpdatePassword.setForeground(new java.awt.Color(0, 0, 102));
        lblUpdatePassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdatePassword.setText("Password:");

        txtUpdatePassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUpdatePassword.setEnabled(false);

        lblUpdateStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUpdateStatus.setForeground(new java.awt.Color(0, 0, 102));
        lblUpdateStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateStatus.setText("Status:");

        chkUpdateStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkUpdateStatus.setForeground(new java.awt.Color(0, 0, 102));
        chkUpdateStatus.setText("Enable");
        chkUpdateStatus.setEnabled(false);
        chkUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUpdateStatusActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 102));
        btnEdit.setText("Edit");
        btnEdit.setToolTipText("Submit Button");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUpdateUsername)
                        .addGap(52, 52, 52)
                        .addComponent(txtUpdateUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUpdatePassword)
                        .addGap(54, 54, 54)
                        .addComponent(txtUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblVerifyPassword)
                        .addGap(10, 10, 10)
                        .addComponent(txtVerifyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUpdateLevel)
                        .addGap(86, 86, 86)
                        .addComponent(cboUdateLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUpdateStatus)
                        .addGap(76, 76, 76)
                        .addComponent(chkUpdateStatus))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel6)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblUpdateUsername))
                    .addComponent(txtUpdateUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblUpdatePassword))
                    .addComponent(txtUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblVerifyPassword))
                    .addComponent(txtVerifyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblUpdateLevel))
                    .addComponent(cboUdateLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblUpdateStatus))
                    .addComponent(chkUpdateStatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnUpdate))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("UserAcct");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
//         txtUpdateUsername.setEnabled(true);
        txtUpdatePassword.setEnabled(true);
        txtVerifyPassword.setEnabled(true);
        cboUdateLevel.setEnabled(true);
        chkUpdateStatus.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnEdit.setEnabled(false);
        userFrame.jtList.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked

    }//GEN-LAST:event_btnEditMouseClicked

    private void chkUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUpdateStatusActionPerformed
        
    }//GEN-LAST:event_chkUpdateStatusActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        UsersManager um = new UsersManager();
        
        System.out.println(ID + level + status + password);    
        
        level = cboUdateLevel.getSelectedItem().toString();
        status = chkUpdateStatus.isSelected();
        password = txtUpdatePassword.getText();
        
        if (txtUpdatePassword.getText().isEmpty() || txtVerifyPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password Field Empty!", "Alert!", JOptionPane.WARNING_MESSAGE);
        } else if (txtUpdatePassword.getText() == null ? txtVerifyPassword.getText() != null : !txtUpdatePassword.getText().equals(txtVerifyPassword.getText())) {
            JOptionPane.showMessageDialog(this, "Password not the same!", "Alert!", JOptionPane.WARNING_MESSAGE);
        } else {
            um.updateUser(ID, level, status, password);
            UsersManager theUserTable = new UsersManager();
            theUserTable.fillTable(userFrame);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtUpdateUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateUsernameActionPerformed

    private void bntAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddUserActionPerformed

        UsersDeclarationClass udc = new UsersDeclarationClass();

        udc.setUsername(txtUsername.getText().toUpperCase());
        udc.setPassword(txtPassword.getText());
        udc.setLevels(txtLevel.getSelectedItem().toString());
        udc.setDates(new Date());
        udc.setTimes(new Date());
        udc.setStatus(true);

        if (txtUsername.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty() ||"   ".equals(txtLevel.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "All Field Required!", "Error!", JOptionPane.WARNING_MESSAGE);
        } else if (txtPassword.getText().trim().length() <= 7) {
            JOptionPane.showMessageDialog(null, "Password must be 8 digit and above!", "Error!", JOptionPane.WARNING_MESSAGE);
        } else {
            UsersManager usersacct = new UsersManager();
            usersacct.AddUser(udc);
            JOptionPane.showMessageDialog(null, "Successful!", "Alert!", JOptionPane.INFORMATION_MESSAGE);
            
            UsersManager fillTable = new UsersManager();
            fillTable.fillTable(userFrame);
        }

    }//GEN-LAST:event_bntAddUserActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jtListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListMouseClicked
        ID = Long.parseLong(jtList.getValueAt(jtList.getSelectedRow(), 0).toString());
        userName = jtList.getValueAt(jtList.getSelectedRow(), 1).toString();
        level = jtList.getValueAt(jtList.getSelectedRow(), 2).toString();
        String statusValue = jtList.getValueAt(jtList.getSelectedRow(), 3).toString();
        
        if(statusValue.equals("false")){
            status = false;
        }else{
            status=true;
        }
        
        txtUpdateUsername.setText(userName);
        cboUdateLevel.getModel().setSelectedItem(level);
        chkUpdateStatus.setSelected(status);
    }//GEN-LAST:event_jtListMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        UsersManager du = new UsersManager();
        
        System.out.println(ID + level + status + password);    
        
        level = cboUdateLevel.getSelectedItem().toString();
        status = chkUpdateStatus.isSelected();
        password = txtUpdatePassword.getPassword().toString();
        
        du.DeleteUser(ID, level, status, password);
        
        UsersManager theUserTable = new UsersManager();
        theUserTable.fillTable(userFrame);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
        
            UsersManager theUser = new UsersManager();
            theUser.fillTable(userFrame);
            userFrame.setVisible(true);
            
        }   
    });    
            
  }
            
static AddUsers userFrame = new AddUsers();
private String userName,password,level;
private long ID;
private boolean status;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAddUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboUdateLevel;
    private javax.swing.JCheckBox chkUpdateStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtList;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUpdateLevel;
    private javax.swing.JLabel lblUpdatePassword;
    private javax.swing.JLabel lblUpdateStatus;
    private javax.swing.JLabel lblUpdateUsername;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVerifyPassword;
    private javax.swing.JComboBox<String> txtLevel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtUpdatePassword;
    private javax.swing.JTextField txtUpdateUsername;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtVerifyPassword;
    // End of variables declaration//GEN-END:variables
}
