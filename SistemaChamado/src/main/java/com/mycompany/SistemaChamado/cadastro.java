/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.SistemaChamado;

import javax.swing.JOptionPane;

/**
 *
 * @author gablinux
 */
public class cadastro extends javax.swing.JFrame {
    boolean verif;
    TelaPrincipal inf = new TelaPrincipal();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(cadastro.class.getName());

    public cadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelFundoCinza2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        AvisoNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        avisoEmail = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        AvisoTelefone = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jtxtSenha = new javax.swing.JPasswordField();
        AvisoSenha = new javax.swing.JLabel();
        caixaTermo = new javax.swing.JCheckBox();
        jButtonCadastrar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel29.setText("Telefone");

        jTextField5.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1248, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 749, 1248, 0);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanelFundoCinza2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Criar uma conta");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nome Exibido");

        AvisoNome.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        AvisoNome.setForeground(new java.awt.Color(255, 0, 0));
        AvisoNome.setText("*");

        txtNome.setBackground(new java.awt.Color(51, 51, 51));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("E-mail");

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        avisoEmail.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        avisoEmail.setForeground(new java.awt.Color(255, 0, 0));
        avisoEmail.setText("*");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Telefone");

        txtTelefone.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });

        AvisoTelefone.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        AvisoTelefone.setForeground(new java.awt.Color(255, 0, 0));
        AvisoTelefone.setText("*");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Senha");

        jtxtSenha.setBackground(new java.awt.Color(51, 51, 51));
        jtxtSenha.setForeground(new java.awt.Color(255, 255, 255));
        jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jtxtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtSenhaFocusLost(evt);
            }
        });
        jtxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSenhaActionPerformed(evt);
            }
        });

        AvisoSenha.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        AvisoSenha.setForeground(new java.awt.Color(255, 0, 0));
        AvisoSenha.setText("*");

        caixaTermo.setBackground(new java.awt.Color(51, 51, 51));
        caixaTermo.setForeground(new java.awt.Color(255, 255, 255));
        caixaTermo.setText("ACEITO OS TERMOS E CONDIÇÕES DO PROGRAMA.");
        caixaTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTermoActionPerformed(evt);
            }
        });

        jButtonCadastrar.setBackground(new java.awt.Color(51, 102, 255));
        jButtonCadastrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.setMaximumSize(new java.awt.Dimension(101, 34));
        jButtonCadastrar.setMinimumSize(new java.awt.Dimension(101, 34));
        jButtonCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundoCinza2Layout = new javax.swing.GroupLayout(jPanelFundoCinza2);
        jPanelFundoCinza2.setLayout(jPanelFundoCinza2Layout);
        jPanelFundoCinza2Layout.setHorizontalGroup(
            jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(caixaTermo))
                            .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AvisoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(avisoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AvisoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AvisoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtNome)))))
                    .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanelFundoCinza2Layout.setVerticalGroup(
            jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(91, 91, 91)
                .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(AvisoNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(jPanelFundoCinza2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avisoEmail)
                        .addGap(20, 20, 20)))
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(AvisoTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanelFundoCinza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(AvisoSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(caixaTermo)
                .addGap(42, 42, 42)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanelFundoCinza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanelFundoCinza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, -10, 720, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void VerificarCadastro(){
        verif=true;
        
        if(txtEmail.getText().indexOf('@')==-1){
            avisoEmail.setText("* E-mail Invalido, Digite Novamente !");
            txtEmail.setText("");
            txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;

        }else if(txtEmail.getText().length()<7 ){
            avisoEmail.setText("* Email Incompleto ! ");
            txtEmail.setText("");
            verif = false;
        }

        if(jtxtSenha.getText().length()<8){
            AvisoSenha.setText("* Mínimo 8 Digitos !");
            jtxtSenha.setText("");
            jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;

        }
        if (txtNome.getText().length() <= 0) {
            AvisoNome.setText("* Nome incompleto !");
            txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;
        }

        if (txtTelefone.getText().length() <= 0) {
            AvisoTelefone.setText("* Telefone incompleto !");
            txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,51)));
            verif = false;
        }
        if(verif==false){
        return;
        }
        
        
    }
    
    
    
    
    
    
    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        
        VerificarCadastro();
        caixaTermo();
        
        
        //integração para tela inicial caso tudo ocorrer bem...
        if(caixaTermo.isSelected() && verif == true){
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso !");
            setVisible(false);
            inf.setVisible(true);
        
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void caixaTermo(){
    if(caixaTermo.isSelected() && verif == true){
            char[] senha = jtxtSenha.getPassword();
            String senhaTexto = new String(senha);
            inf.setSenha(senhaTexto);
            inf.setNome(txtNome.getText());
            inf.setEmail(txtEmail.getText());
            inf.setTelefone((txtTelefone.getText().replaceAll("\\D", "")));
            
            //remove os textos
            txtNome.setText("");
            txtEmail.setText("");
            txtTelefone.setText("");
            jtxtSenha.setText("");

            //Remove As bordas Vermelhas.

            txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            
        }else if(!caixaTermo.isSelected()){
        
            JOptionPane.showMessageDialog(null, "Ative os termos e serviços ! ");
            return;
            
        }
    
    }
    
    
    private void caixaTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTermoActionPerformed

    }//GEN-LAST:event_caixaTermoActionPerformed

    private void jtxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSenhaActionPerformed
        
    }//GEN-LAST:event_jtxtSenhaActionPerformed

    private void jtxtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSenhaFocusLost
        jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jtxtSenhaFocusLost

    private void jtxtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtSenhaFocusGained
        jtxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));
    }//GEN-LAST:event_jtxtSenhaFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 215)));

    }//GEN-LAST:event_txtNomeFocusGained

  
    public static void main(String args[]) {
        
        
       
        
        
        java.awt.EventQueue.invokeLater(() -> new cadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoNome;
    private javax.swing.JLabel AvisoSenha;
    private javax.swing.JLabel AvisoTelefone;
    private javax.swing.JLabel avisoEmail;
    private javax.swing.JCheckBox caixaTermo;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFundoCinza2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPasswordField jtxtSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
