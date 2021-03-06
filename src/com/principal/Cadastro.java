/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.principal;

import com.bean.Roteiros;
import com.dao.RoteirosJpaDAO;
import com.utils.Tabela;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author thiago.napoleao
 */
public class Cadastro extends javax.swing.JPanel {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        defaults();
        rotaTxt.requestFocus();
        
    }
    
    public void defaults(){
        tabela();
        rotaTxt.requestFocus(true);
    }
        
    public void cadastro(){
        
     Roteiros rt = new Roteiros();
     rt.setCodigo(rotaTxt.getText());
     rt.setRoteiro(roteiroTxt.getText());
     rt.setSequencia(seqTxt.getText());
     RoteirosJpaDAO.getInstance().persist(rt);
     tabela();
     
     roteiroTxt.setText("");
     seqTxt.setText("");
     roteiroTxt.requestFocus();
    }
    
    public void excluir(){
        
        int idProduto = (int) tblRoteiros.getValueAt(tblRoteiros.getSelectedRow(), tblRoteiros.getSelectedColumn());
        
        RoteirosJpaDAO.getInstance().removeById(idProduto);
        System.out.println("Linha removida...");
        
        tabela();
        System.out.println("Tabela atualizada...");
        
    }
    
    
    public void tabela(){
        try{
           ArrayList dados = new ArrayList();
           String[] Colunas = new String[]{"Id" ,"Rota", "Roteiro", "Sequencia"};
           List<Roteiros> rt = RoteirosJpaDAO.getInstance().findByCodigo(rotaTxt.getText());
           for(int b = 0; b < rt.size(); b ++){
               dados.add(new Object[]{rt.get(b).getId(), rt.get(b).getCodigo(), rt.get(b).getRoteiro(), rt.get(b).getSequencia()});
           }
           Tabela tabela = new Tabela(dados, Colunas);
           tblRoteiros.setModel(tabela);
           tblRoteiros.setRowSorter(new TableRowSorter(tabela));
           tblRoteiros.getColumnModel().getColumn(0).setPreferredWidth(100);
           tblRoteiros.getColumnModel().getColumn(0).setResizable(false);
           tblRoteiros.getColumnModel().getColumn(1).setPreferredWidth(100);
           tblRoteiros.getColumnModel().getColumn(1).setResizable(false);
           tblRoteiros.getColumnModel().getColumn(2).setPreferredWidth(100);
           tblRoteiros.getColumnModel().getColumn(2).setResizable(false);
           tblRoteiros.getColumnModel().getColumn(3).setPreferredWidth(100);
           tblRoteiros.getColumnModel().getColumn(3).setResizable(false);
           tblRoteiros.getTableHeader().setReorderingAllowed(false);
           tblRoteiros.setAutoResizeMode(tblRoteiros.AUTO_RESIZE_OFF);
           tblRoteiros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                       
        }catch(Exception ex){
          ex.printStackTrace();
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblH10 = new javax.swing.JLabel();
        rotaTxt = new javax.swing.JTextField();
        roteiroTxt = new javax.swing.JTextField();
        lblH11 = new javax.swing.JLabel();
        seqTxt = new javax.swing.JTextField();
        lblH12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoteiros = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(18, 33, 71));

        lblH10.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH10.setForeground(new java.awt.Color(255, 255, 255));
        lblH10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH10.setText("Rota");
        lblH10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        rotaTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        rotaTxt.setForeground(new java.awt.Color(0, 51, 102));
        rotaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rotaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rotaTxtKeyReleased(evt);
            }
        });

        roteiroTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        roteiroTxt.setForeground(new java.awt.Color(0, 51, 102));
        roteiroTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roteiroTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                roteiroTxtKeyReleased(evt);
            }
        });

        lblH11.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH11.setForeground(new java.awt.Color(255, 255, 255));
        lblH11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH11.setText("Roteiro");
        lblH11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        seqTxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        seqTxt.setForeground(new java.awt.Color(0, 51, 102));
        seqTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seqTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seqTxtKeyReleased(evt);
            }
        });

        lblH12.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lblH12.setForeground(new java.awt.Color(255, 255, 255));
        lblH12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH12.setText("Sequencia");
        lblH12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblRoteiros.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        tblRoteiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRoteiros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblRoteiros.setGridColor(new java.awt.Color(255, 255, 255));
        tblRoteiros.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblRoteiros);

        btnSalvar.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro de Rota e Roteiro");

        jDesktopPane5.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane5Layout = new javax.swing.GroupLayout(jDesktopPane5);
        jDesktopPane5.setLayout(jDesktopPane5Layout);
        jDesktopPane5Layout.setHorizontalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane5Layout.setVerticalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/logo15.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Lucida Fax", 1, 55)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 51));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/logo1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblH10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rotaTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblH11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roteiroTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblH12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(seqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(jDesktopPane5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblH10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roteiroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblH11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblH12))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnExcluir))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 253, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rotaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rotaTxtKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
            try {
                tabela();
                roteiroTxt.requestFocus(true);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_rotaTxtKeyReleased

    private void roteiroTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roteiroTxtKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
            try{
                seqTxt.requestFocus(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }            
        }
    }//GEN-LAST:event_roteiroTxtKeyReleased

    private void seqTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seqTxtKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10){
            try{
                btnSalvar.requestFocus();
            }catch(Exception ex){
                ex.printStackTrace();
            }            
        }
    }//GEN-LAST:event_seqTxtKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        cadastro();
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblH10;
    private javax.swing.JLabel lblH11;
    private javax.swing.JLabel lblH12;
    private javax.swing.JTextField rotaTxt;
    private javax.swing.JTextField roteiroTxt;
    private javax.swing.JTextField seqTxt;
    private javax.swing.JTable tblRoteiros;
    // End of variables declaration//GEN-END:variables
}
