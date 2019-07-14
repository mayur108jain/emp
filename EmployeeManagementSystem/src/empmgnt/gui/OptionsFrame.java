/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgnt.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author mayur
 */
public class OptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form Choice
     */
    public OptionsFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbShowEmp = new javax.swing.JRadioButton();
        jrbSearchEmp = new javax.swing.JRadioButton();
        jrbQuit = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jrbUpdate = new javax.swing.JRadioButton();
        jrbDelete = new javax.swing.JRadioButton();

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select your choice");

        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbAddEmp.setText("Add Employee");

        buttonGroup1.add(jrbShowEmp);
        jrbShowEmp.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbShowEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbShowEmp.setText("Show All Employee");

        buttonGroup1.add(jrbSearchEmp);
        jrbSearchEmp.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbSearchEmp.setText("Search Employee");

        buttonGroup1.add(jrbQuit);
        jrbQuit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbQuit.setForeground(new java.awt.Color(255, 255, 255));
        jrbQuit.setText("Quit");

        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDoTask.setText("DO TASK");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jrbUpdate.setBackground(new java.awt.Color(0, 0, 0));
        jrbUpdate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jrbUpdate.setText("UpdateEmployee");

        jrbDelete.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbDelete);
        jrbDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jrbDelete.setForeground(new java.awt.Color(255, 255, 255));
        jrbDelete.setText("Delete Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbSearchEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbAddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbShowEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbAddEmp)
                .addGap(37, 37, 37)
                .addComponent(jrbSearchEmp)
                .addGap(39, 39, 39)
                .addComponent(jrbShowEmp)
                .addGap(38, 38, 38)
                .addComponent(jrbUpdate)
                .addGap(42, 42, 42)
                .addComponent(jrbDelete)
                .addGap(29, 29, 29)
                .addComponent(jrbQuit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnDoTask)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(jrbAddEmp.isSelected())
        {
            AddEmployeeFrame addEmp=new  AddEmployeeFrame();
            addEmp.setVisible(true);
            this.dispose();
        }
        else if(jrbSearchEmp.isSelected())
        {
            SearchEmployeeFrame searchEmp=new SearchEmployeeFrame();
            searchEmp.setVisible(true);
            this.dispose();
        }
        else if(jrbShowEmp.isSelected())
        {
            ViewAllEmployee viewEmp =new  ViewAllEmployee();
            viewEmp.setVisible(true);
            this.dispose();
        }
        else if(jrbUpdate.isSelected())
        {   
            UpdateFrame uf=new UpdateFrame();
            uf.setVisible(true);
            this.dispose();
        }
         else if(jrbDelete.isSelected())
        {   
            DeleteFrame df=new DeleteFrame();
            df.setVisible(true);
            this.dispose();
        }
        else if(jrbQuit.isSelected())
                {
                    System.exit(0);
                }
        else
        {
            JOptionPane.showMessageDialog(null,"plese make a choice","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbDelete;
    private javax.swing.JRadioButton jrbQuit;
    private javax.swing.JRadioButton jrbSearchEmp;
    private javax.swing.JRadioButton jrbShowEmp;
    private javax.swing.JRadioButton jrbUpdate;
    // End of variables declaration//GEN-END:variables
}
