package ATM;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    BankAccount account;

    public LoginPage() {

        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        USERNAME_INPUT = new javax.swing.JTextField();
        confirm_label = new javax.swing.JLabel();
        ENTER_USERNAME_LABEL = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 421));
        setMinimumSize(new java.awt.Dimension(748, 421));
        setPreferredSize(new java.awt.Dimension(748, 421));
        setResizable(false);
        getContentPane().setLayout(null);

        USERNAME_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAME_INPUTActionPerformed(evt);
            }
        });
        getContentPane().add(USERNAME_INPUT);
        USERNAME_INPUT.setBounds(320, 240, 130, 30);

        confirm_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirm_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ATM/ok.png"))); // NOI18N
        confirm_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_labelMouseClicked(evt);
            }
        });
        getContentPane().add(confirm_label);
        confirm_label.setBounds(340, 290, 100, 110);

        ENTER_USERNAME_LABEL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ENTER_USERNAME_LABEL.setForeground(new java.awt.Color(255, 255, 255));
        ENTER_USERNAME_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ENTER_USERNAME_LABEL.setText("Enter username : ");
        getContentPane().add(ENTER_USERNAME_LABEL);
        ENTER_USERNAME_LABEL.setBounds(280, 190, 220, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ATM/login_page.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -20, 760, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USERNAME_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAME_INPUTActionPerformed
    }//GEN-LAST:event_USERNAME_INPUTActionPerformed

    private void confirm_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_labelMouseClicked

        try {
            account = SaveDataInFile.searchAccount(USERNAME_INPUT.getText());
            if (account == null) {
                throw new NullPointerException();
            }

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ATMMenu(account).setVisible(true);
                }
            });
            dispose();
        } catch (IOException e) {

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Wrong username. try again." ,"Error",JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_confirm_labelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ENTER_USERNAME_LABEL;
    private javax.swing.JTextField USERNAME_INPUT;
    private javax.swing.JLabel background;
    private javax.swing.JLabel confirm_label;
    // End of variables declaration//GEN-END:variables
}
