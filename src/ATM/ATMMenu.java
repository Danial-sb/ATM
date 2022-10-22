package ATM;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ATMMenu extends javax.swing.JFrame {

    BankAccount account ;

    enum Action {

        WITHDRAW,
        DEPOSITE,
        TRANSFER,
        BALANCE,
        EXIT

    }

    Action choise;
    String destination_account ;

    public ATMMenu(BankAccount account) {
        JOptionPane.showMessageDialog(null,"Welcome to Khurazmi university " + account.getName() ,"Welcome",JOptionPane.PLAIN_MESSAGE);
        this.account = account ;
        initComponents();
        this.setLocationRelativeTo(null);
        INPUT_PANEL.setVisible(false);
        ACCOUNT_NUMBER_PANEL.setVisible(false);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INPUT_PANEL = new javax.swing.JPanel();
        ENTER_AMOUNT_LABEL = new javax.swing.JLabel();
        CONFIRM_BUTTON = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        CLEAR_BUTTON = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        BACKSPACE_BUTTON = new javax.swing.JButton();
        CANCEL_BUTTON = new javax.swing.JButton();
        INPUT_FIELD = new javax.swing.JFormattedTextField();
        Button10 = new javax.swing.JButton();
        ACCOUNT_NUMBER_PANEL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        account_number_field = new javax.swing.JFormattedTextField();
        CONFIRM_BUTTON1 = new javax.swing.JButton();
        CANCEL_BUTTON1 = new javax.swing.JButton();
        EXIT_BUTTON = new javax.swing.JButton();
        DOLLAR_SIGN = new javax.swing.JLabel();
        DEPOSITE_BUTTON1 = new javax.swing.JButton();
        DEPOSITE_BUTTON = new javax.swing.JButton();
        WITHDRAW_BUTTON = new javax.swing.JButton();
        TRANSFER_BUTTON = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 421));
        setMinimumSize(new java.awt.Dimension(748, 421));
        setPreferredSize(new java.awt.Dimension(748, 421));
        setResizable(false);
        getContentPane().setLayout(null);

        INPUT_PANEL.setLayout(null);

        ENTER_AMOUNT_LABEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ENTER_AMOUNT_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ENTER_AMOUNT_LABEL.setText("Enter amount :");
        INPUT_PANEL.add(ENTER_AMOUNT_LABEL);
        ENTER_AMOUNT_LABEL.setBounds(120, 10, 180, 40);

        CONFIRM_BUTTON.setBackground(new java.awt.Color(204, 255, 102));
        CONFIRM_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CONFIRM_BUTTON.setText("Confirm");
        CONFIRM_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRM_BUTTONActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(CONFIRM_BUTTON);
        CONFIRM_BUTTON.setBounds(190, 260, 100, 40);

        Button3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button3);
        Button3.setBounds(240, 100, 50, 40);

        Button2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button2);
        Button2.setBounds(190, 100, 50, 40);

        Button9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button9);
        Button9.setBounds(240, 180, 50, 40);

        Button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button1);
        Button1.setBounds(140, 100, 50, 40);

        Button4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button4);
        Button4.setBounds(140, 140, 50, 40);

        Button5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button5);
        Button5.setBounds(190, 140, 50, 40);

        Button6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button6);
        Button6.setBounds(240, 140, 50, 40);

        Button8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button8);
        Button8.setBounds(190, 180, 50, 40);

        Button7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button7);
        Button7.setBounds(140, 180, 50, 40);

        CLEAR_BUTTON.setBackground(new java.awt.Color(255, 0, 0));
        CLEAR_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CLEAR_BUTTON.setForeground(new java.awt.Color(153, 0, 51));
        CLEAR_BUTTON.setText("×");
        CLEAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_BUTTONActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(CLEAR_BUTTON);
        CLEAR_BUTTON.setBounds(240, 220, 50, 40);

        Button0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button0.setText(".");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button0);
        Button0.setBounds(140, 260, 50, 40);

        BACKSPACE_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BACKSPACE_BUTTON.setText("<-");
        BACKSPACE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKSPACE_BUTTONActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(BACKSPACE_BUTTON);
        BACKSPACE_BUTTON.setBounds(190, 220, 50, 40);

        CANCEL_BUTTON.setBackground(new java.awt.Color(255, 255, 255));
        CANCEL_BUTTON.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CANCEL_BUTTON.setText("Cancel");
        CANCEL_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCEL_BUTTONActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(CANCEL_BUTTON);
        CANCEL_BUTTON.setBounds(10, 300, 90, 30);

        INPUT_FIELD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        INPUT_FIELD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        INPUT_FIELD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        INPUT_FIELD.setEnabled(false);
        INPUT_FIELD.setOpaque(false);
        INPUT_FIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INPUT_FIELDActionPerformed(evt);
            }
        });
        INPUT_FIELD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                INPUT_FIELDKeyTyped(evt);
            }
        });
        INPUT_PANEL.add(INPUT_FIELD);
        INPUT_FIELD.setBounds(110, 50, 210, 40);

        Button10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button10.setText("0");
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });
        INPUT_PANEL.add(Button10);
        Button10.setBounds(140, 220, 50, 40);

        getContentPane().add(INPUT_PANEL);
        INPUT_PANEL.setBounds(170, 50, 400, 340);

        ACCOUNT_NUMBER_PANEL.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter account number :");
        ACCOUNT_NUMBER_PANEL.add(jLabel1);
        jLabel1.setBounds(50, 0, 320, 60);

        try {
            account_number_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        account_number_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        account_number_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_number_fieldActionPerformed(evt);
            }
        });
        ACCOUNT_NUMBER_PANEL.add(account_number_field);
        account_number_field.setBounds(100, 50, 230, 40);

        CONFIRM_BUTTON1.setBackground(new java.awt.Color(204, 255, 102));
        CONFIRM_BUTTON1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CONFIRM_BUTTON1.setText("Confirm");
        CONFIRM_BUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRM_BUTTON1ActionPerformed(evt);
            }
        });
        ACCOUNT_NUMBER_PANEL.add(CONFIRM_BUTTON1);
        CONFIRM_BUTTON1.setBounds(160, 100, 110, 30);

        CANCEL_BUTTON1.setBackground(new java.awt.Color(255, 255, 255));
        CANCEL_BUTTON1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CANCEL_BUTTON1.setText("Cancel");
        CANCEL_BUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCEL_BUTTON1ActionPerformed(evt);
            }
        });
        ACCOUNT_NUMBER_PANEL.add(CANCEL_BUTTON1);
        CANCEL_BUTTON1.setBounds(0, 100, 90, 30);

        getContentPane().add(ACCOUNT_NUMBER_PANEL);
        ACCOUNT_NUMBER_PANEL.setBounds(160, 150, 420, 140);

        EXIT_BUTTON.setBackground(new java.awt.Color(204, 204, 255));
        EXIT_BUTTON.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        EXIT_BUTTON.setForeground(new java.awt.Color(51, 51, 51));
        EXIT_BUTTON.setText("Exit");
        EXIT_BUTTON.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EXIT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_BUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT_BUTTON);
        EXIT_BUTTON.setBounds(20, 330, 120, 40);

        DOLLAR_SIGN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(DOLLAR_SIGN);
        DOLLAR_SIGN.setBounds(160, 10, 70, 110);

        DEPOSITE_BUTTON1.setBackground(new java.awt.Color(204, 204, 255));
        DEPOSITE_BUTTON1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        DEPOSITE_BUTTON1.setForeground(new java.awt.Color(51, 51, 51));
        DEPOSITE_BUTTON1.setText("Show balance");
        DEPOSITE_BUTTON1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DEPOSITE_BUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITE_BUTTON1ActionPerformed(evt);
            }
        });
        getContentPane().add(DEPOSITE_BUTTON1);
        DEPOSITE_BUTTON1.setBounds(580, 90, 140, 50);

        DEPOSITE_BUTTON.setBackground(new java.awt.Color(204, 204, 255));
        DEPOSITE_BUTTON.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        DEPOSITE_BUTTON.setForeground(new java.awt.Color(51, 51, 51));
        DEPOSITE_BUTTON.setText("Deposite money");
        DEPOSITE_BUTTON.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DEPOSITE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITE_BUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(DEPOSITE_BUTTON);
        DEPOSITE_BUTTON.setBounds(10, 100, 140, 50);

        WITHDRAW_BUTTON.setBackground(new java.awt.Color(204, 204, 255));
        WITHDRAW_BUTTON.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        WITHDRAW_BUTTON.setForeground(new java.awt.Color(51, 51, 51));
        WITHDRAW_BUTTON.setText("Withdraw money");
        WITHDRAW_BUTTON.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WITHDRAW_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAW_BUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(WITHDRAW_BUTTON);
        WITHDRAW_BUTTON.setBounds(10, 30, 140, 50);

        TRANSFER_BUTTON.setBackground(new java.awt.Color(204, 204, 255));
        TRANSFER_BUTTON.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        TRANSFER_BUTTON.setForeground(new java.awt.Color(51, 51, 51));
        TRANSFER_BUTTON.setText("Transfer money");
        TRANSFER_BUTTON.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TRANSFER_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSFER_BUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(TRANSFER_BUTTON);
        TRANSFER_BUTTON.setBounds(580, 20, 140, 50);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ATM/main_menu.jpg"))); // NOI18N
        background.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(background);
        background.setBounds(-10, 0, 748, 421);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DEPOSITE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITE_BUTTONActionPerformed
        choise = Action.DEPOSITE;
        showInputPanel();
    }//GEN-LAST:event_DEPOSITE_BUTTONActionPerformed

    private void WITHDRAW_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAW_BUTTONActionPerformed

        choise = Action.WITHDRAW;
        showInputPanel();
    }//GEN-LAST:event_WITHDRAW_BUTTONActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 2);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 9);
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 1);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void CANCEL_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCEL_BUTTONActionPerformed
        INPUT_PANEL.setEnabled(false);
        INPUT_PANEL.setVisible(false);
    }//GEN-LAST:event_CANCEL_BUTTONActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed

        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 8);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed

        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 7);
    }//GEN-LAST:event_Button7ActionPerformed

    private void CLEAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR_BUTTONActionPerformed
        INPUT_FIELD.setText("");
    }//GEN-LAST:event_CLEAR_BUTTONActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed

        if (INPUT_FIELD.getText().length() > 10 || INPUT_FIELD.getText().contains(".")) {
            return;
        }

        INPUT_FIELD.setText(INPUT_FIELD.getText() + ".");

    }//GEN-LAST:event_Button0ActionPerformed

    private void BACKSPACE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKSPACE_BUTTONActionPerformed
        int len = INPUT_FIELD.getText().length();
        if (len == 0) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText().substring(0, len - 1));
    }//GEN-LAST:event_BACKSPACE_BUTTONActionPerformed

    private void CONFIRM_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRM_BUTTONActionPerformed

        try {

            switch (choise) {
                case WITHDRAW:
                    account.withdraw(Double.parseDouble(INPUT_FIELD.getText()));
                    withdrawSuccessAnimation();
                    break;

                case DEPOSITE:
                    account.deposite(Double.parseDouble(INPUT_FIELD.getText()));
                    dipositeSuccessAnimation();
                    break;

                case TRANSFER:
                    account.Trnasfer(destination_account , Double.parseDouble(INPUT_FIELD.getText()));
                    DOLLAR_SIGN.setVisible(false);
                    break;

            }

            INPUT_PANEL.setVisible(false);
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }catch (BankExceptions e) {
            if(e instanceof BankExceptions.AcocuntNotFoundException)
                INPUT_PANEL.setVisible(false);
            JOptionPane.showMessageDialog(null,e.message ,"Error",JOptionPane.WARNING_MESSAGE);

        }catch (IOException e) {

        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid number" ,"Error",JOptionPane.WARNING_MESSAGE);
        }
        finally{
            INPUT_FIELD.setText("");

        }


    }//GEN-LAST:event_CONFIRM_BUTTONActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        if (INPUT_FIELD.getText().length() > 10) {
            return;
        }
        INPUT_FIELD.setText(INPUT_FIELD.getText() + 0);
    }//GEN-LAST:event_Button10ActionPerformed

    private void INPUT_FIELDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_INPUT_FIELDKeyTyped

    }//GEN-LAST:event_INPUT_FIELDKeyTyped

    private void DEPOSITE_BUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITE_BUTTON1ActionPerformed
        JOptionPane.showMessageDialog(null,"Your balacne : " + account.getBalance() ,"Account Balance",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_DEPOSITE_BUTTON1ActionPerformed

    private void TRANSFER_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSFER_BUTTONActionPerformed
        choise = Action.TRANSFER ;

        ACCOUNT_NUMBER_PANEL.setVisible(true);


    }//GEN-LAST:event_TRANSFER_BUTTONActionPerformed

    private void CONFIRM_BUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRM_BUTTON1ActionPerformed

        destination_account = account_number_field.getText();

        if(!destination_account.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")){
            JOptionPane.showMessageDialog(null,"Fill the blanks " ,"Error",JOptionPane.WARNING_MESSAGE);
            return;
        }

        showInputPanel();
        account_number_field.setText(null);
        ACCOUNT_NUMBER_PANEL.setVisible(false);
    }//GEN-LAST:event_CONFIRM_BUTTON1ActionPerformed

    private void account_number_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_number_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_number_fieldActionPerformed

    private void INPUT_FIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INPUT_FIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INPUT_FIELDActionPerformed

    private void CANCEL_BUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCEL_BUTTON1ActionPerformed
        ACCOUNT_NUMBER_PANEL.setVisible(false);
    }//GEN-LAST:event_CANCEL_BUTTON1ActionPerformed

    private void EXIT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXIT_BUTTONActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_EXIT_BUTTONActionPerformed

    BankAccount getAccount(String account_number) throws IOException {
        BufferedReader my_reader = new BufferedReader(new FileReader("src\\accounts.txt"));
        String line;
        BankAccount result = null;
        while ((line = my_reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data[3].equals(account_number)) {
                result = new BankAccount(data[0], data[1],data[2], data[3], Double.parseDouble(data[4]));
            }
        }
        my_reader.close();
        return result;
    }



    void showInputPanel() {
        DOLLAR_SIGN.setLocation(this.getWidth() / 2 - DOLLAR_SIGN.getWidth() / 2, 50);
        for (Component c : this.getComponents()) {
            c.setEnabled(false);
        }
        INPUT_PANEL.setVisible(true);

    }


    void withdrawSuccessAnimation() {
        DOLLAR_SIGN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ATM/dollar.gif")));
        DOLLAR_SIGN.setVisible(true);
        new Animation(DOLLAR_SIGN, -1).start();

    }

    void dipositeSuccessAnimation() {
        DOLLAR_SIGN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ATM/dollar.gif")));
        DOLLAR_SIGN.setVisible(true);
        new Animation(DOLLAR_SIGN, 1).start();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ACCOUNT_NUMBER_PANEL;
    private javax.swing.JButton BACKSPACE_BUTTON;
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton CANCEL_BUTTON;
    private javax.swing.JButton CANCEL_BUTTON1;
    private javax.swing.JButton CLEAR_BUTTON;
    private javax.swing.JButton CONFIRM_BUTTON;
    private javax.swing.JButton CONFIRM_BUTTON1;
    private javax.swing.JButton DEPOSITE_BUTTON;
    private javax.swing.JButton DEPOSITE_BUTTON1;
    private javax.swing.JLabel DOLLAR_SIGN;
    private javax.swing.JLabel ENTER_AMOUNT_LABEL;
    private javax.swing.JButton EXIT_BUTTON;
    private javax.swing.JFormattedTextField INPUT_FIELD;
    private javax.swing.JPanel INPUT_PANEL;
    private javax.swing.JButton TRANSFER_BUTTON;
    private javax.swing.JButton WITHDRAW_BUTTON;
    private javax.swing.JFormattedTextField account_number_field;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
