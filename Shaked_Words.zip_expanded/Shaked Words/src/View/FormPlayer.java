/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JLabel;
import model.Players;

/**
 *
 * @author PC-José
 */
public class FormPlayer extends javax.swing.JDialog {

    //Creates new form FormPlayer
    
    JLabel lb;
    int min;
    public FormPlayer(JLabel jLabel1, int min) {
        this.lb = jLabel1;
        this.min = min;
        initComponents();
    }
    
    /*public Players jButton1actionPerformed(java.awt.event.ActionEvent evt, MainMenu m) {
        Players p = new Players();
        
        p.setNome(nomeJTextField.getText());
        p.setFrase(fraseJTextField.getText());
        
        m.randomizeWords(p);
        dispose();
        return p;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJTextField = new javax.swing.JTextField();
        fraseJLabel = new javax.swing.JLabel();
        fraseJTextField = new javax.swing.JTextField();
        nomePlayerJLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        timerJFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        nomeJTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        fraseJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fraseJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fraseJLabel.setText("Frase do Jogador");

        fraseJTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        nomePlayerJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nomePlayerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomePlayerJLabel.setText("Nome do Jogador");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        try {
            timerJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeJTextField)
                    .addComponent(fraseJTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fraseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomePlayerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(timerJFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomePlayerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fraseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fraseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timerJFormattedTextField)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Players p = new Players();
        MainMenu m = new MainMenu();
        p.setNome(nomeJTextField.getText());
        p.setFrase(fraseJTextField.getText());
        
        min = Integer.parseInt(timerJFormattedTextField.getText());
        
        lb.setText(m.randomizeWords(p));
        m.Cronometro(1);
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fraseJLabel;
    private javax.swing.JTextField fraseJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField nomeJTextField;
    private javax.swing.JLabel nomePlayerJLabel;
    private javax.swing.JFormattedTextField timerJFormattedTextField;
    // End of variables declaration//GEN-END:variables
}
