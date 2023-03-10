/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Emprestimos;
import dao.DaoEmprestimos;


public class FrmCadEmprestimos extends javax.swing.JInternalFrame {

    DaoEmprestimos distri = new DaoEmprestimos();
    List<Emprestimos> lista = new ArrayList<Emprestimos>();
    int indice = 0;
    
    
          
    public FrmCadEmprestimos() {
        initComponents();
                
         lista = distri.getEmprestimos();
  
        if(lista.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Não há dados cadastrados na tabela!!!","Atenção",JOptionPane.WARNING_MESSAGE);
        }
        else{
            
        exibirDados();
        
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

        lblNome = new javax.swing.JLabel();
        lblNCadastro = new javax.swing.JLabel();
        lblCodLivro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDataEmprestimo = new javax.swing.JLabel();
        lblDataDevolucao = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtDataDevolucao = new javax.swing.JFormattedTextField();
        txtDataEmprestimo = new javax.swing.JFormattedTextField();
        lblIDEmprestimo = new javax.swing.JLabel();
        txtIDEmprestimo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNCadastro = new javax.swing.JTextField();
        cbxCodLivro = new javax.swing.JComboBox<>();
        txtTitulo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(211, 231, 211));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Empréstimo");

        lblNome.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblNCadastro.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblNCadastro.setText("Nº do Cadastro:");

        lblCodLivro.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblCodLivro.setText("CodLivro:");

        lblTitulo.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblTitulo.setText("Título:");

        lblStatus.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lblStatus.setText("Status:");

        lblDataEmprestimo.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblDataEmprestimo.setText("Data Empréstimo:");

        lblDataDevolucao.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblDataDevolucao.setText("Data Prevista Devolução:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        try {
            txtDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEmprestimo.setToolTipText("");
        txtDataEmprestimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataEmprestimoKeyPressed(evt);
            }
        });

        lblIDEmprestimo.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblIDEmprestimo.setText("ID Empréstimo:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        txtNCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNCadastroKeyPressed(evt);
            }
        });

        cbxCodLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--selecionar--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148" }));

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIDEmprestimo)
                                    .addComponent(lblNome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNCadastro)
                                    .addComponent(lblCodLivro)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(cbxCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitulo))))
                        .addContainerGap(174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar)
                                .addGap(154, 154, 154)
                                .addComponent(btnSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDataEmprestimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDataDevolucao)))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIDEmprestimo)
                    .addComponent(txtIDEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNCadastro)
                    .addComponent(txtNCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodLivro)
                    .addComponent(cbxCodLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStatus)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEmprestimo)
                    .addComponent(lblDataDevolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar))
                .addGap(42, 42, 42))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtIDEmprestimo.setText("");
        txtNome.setText("");
        txtNCadastro.setText("");
        cbxCodLivro.setSelectedItem("--selecionar--");
        txtTitulo.setText("");
        txtDataEmprestimo.setText("");
        txtDataDevolucao.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       Emprestimos empt = new Emprestimos();
       
       empt.idEmprestimo = Integer.parseInt(txtIDEmprestimo.getText());
       empt.nome = txtNome.getText();
       empt.nCadastro = Integer.parseInt(txtNCadastro.getText());
       empt.codLivro =  Integer.parseInt(cbxCodLivro.getSelectedItem().toString());
       empt.titulo = txtTitulo.getText();
       empt.dataEmpre = txtDataEmprestimo.getText();
       empt.dataDevo = txtDataDevolucao.getText();
       
       distri.registrarEmprestimo(empt);
       lista.clear();
       lista = distri.getEmprestimos();
       
       indice = lista.size()-1;
       exibirDados();
        
       JOptionPane.showMessageDialog(this, "Empréstimo registrado");
       
        txtIDEmprestimo.setText("" + lista.get(0).idEmprestimo);
        txtNome.setText(lista.get(0).nome);
        txtNCadastro.setText(""+lista.get(0).nCadastro);
        cbxCodLivro.setSelectedItem(String.valueOf(lista.get(0).codLivro));
        txtTitulo.setText(lista.get(0).titulo);
        txtDataEmprestimo.setText(""+lista.get(0).dataEmpre);
        txtDataDevolucao.setText(""+lista.get(0).dataDevo);
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtNCadastro.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtNCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCadastroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cbxCodLivro.requestFocus();
        }
    }//GEN-LAST:event_txtNCadastroKeyPressed

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtDataEmprestimo.requestFocus();
        }
    }//GEN-LAST:event_txtTituloKeyPressed

    private void txtDataEmprestimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataEmprestimoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtDataDevolucao.requestFocus();
        }
    }//GEN-LAST:event_txtDataEmprestimoKeyPressed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         Emprestimos empt = new Emprestimos();
        
       empt.idEmprestimo = Integer.parseInt(txtIDEmprestimo.getText());
       empt.nome = txtNome.getText();
       empt.nCadastro = Integer.parseInt(txtNCadastro.getText());
       empt.codLivro =  Integer.parseInt(cbxCodLivro.getSelectedItem().toString());
       empt.titulo = txtTitulo.getText();
       empt.dataEmpre = txtDataEmprestimo.getText();
       empt.dataDevo = txtDataDevolucao.getText();
        
       distri.alterarEmprestimo(empt);
       lista.clear();
       lista = distri.getEmprestimos();
       
       indice = lista.size()-1;
       exibirDados();
       
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCodLivro;
    private javax.swing.JLabel lblCodLivro;
    private javax.swing.JLabel lblDataDevolucao;
    private javax.swing.JLabel lblDataEmprestimo;
    private javax.swing.JLabel lblIDEmprestimo;
    private javax.swing.JLabel lblNCadastro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txtDataDevolucao;
    private javax.swing.JFormattedTextField txtDataEmprestimo;
    private javax.swing.JTextField txtIDEmprestimo;
    private javax.swing.JTextField txtNCadastro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
    public void exibirDados() {
        txtIDEmprestimo.setText("" + lista.get(indice).idEmprestimo);
        txtNome.setText(lista.get(indice).nome);
        txtNCadastro.setText(""+lista.get(indice).nCadastro);
        cbxCodLivro.setSelectedItem(String.valueOf(lista.get(indice).codLivro));
        txtTitulo.setText(lista.get(indice).titulo);
        txtDataEmprestimo.setText(""+lista.get(indice).dataEmpre);
        txtDataDevolucao.setText(""+lista.get(indice).dataDevo);  
      }
}


