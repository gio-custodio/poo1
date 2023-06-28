package com.poo1.ui;

import com.poo1.controlador.Controlador;
import com.poo1.modelo.Departamento;
import com.poo1.ui.cadastros.CadastroDepartamentoDialog;
import com.poo1.ui.cadastros.CadastroDocenteEfetivoDialog;
import com.poo1.ui.cadastros.CadastroDocenteSubstitutoDialog;
import com.poo1.ui.cadastros.CadastroTecnicoDialog;
import com.poo1.ui.listagens.DocenteEfetivoDialog;
import com.poo1.ui.listagens.DocenteSubstitutoDialog;
import com.poo1.ui.listagens.TecnicosDialog;
import com.poo1.ui.listagens.TodosDocentesDialog;
import com.poo1.ui.listagens.TodosFuncionariosDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.swing.table.DefaultTableModel;

public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        Menu1 = new javax.swing.JMenu();
        Menu1Item1 = new javax.swing.JMenuItem();
        Menu1Item2 = new javax.swing.JMenuItem();
        Menu1Item3 = new javax.swing.JMenuItem();
        Menu1Item4 = new javax.swing.JMenuItem();
        Menu2 = new javax.swing.JMenu();
        Menu2Item1 = new javax.swing.JMenuItem();
        Menu2Item2 = new javax.swing.JMenuItem();
        Menu2Item3 = new javax.swing.JMenuItem();
        Menu3 = new javax.swing.JMenu();
        Menu3Item1 = new javax.swing.JMenuItem();
        Menu3Item2 = new javax.swing.JMenuItem();
        Menu3Item3 = new javax.swing.JMenuItem();
        Menu3Item4 = new javax.swing.JMenuItem();
        Menu3Item5 = new javax.swing.JMenuItem();
        Menu3Item6 = new javax.swing.JMenuItem();
        Menu3Item7 = new javax.swing.JMenuItem();
        Menu3Item8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel1.setText("Resumo dos Departamentos");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jLabel2.setText("(clique na linha para mais informações)");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade de funcionários", "Gasto total com funcionários"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        Controlador controlador = new Controlador();

        ArrayList<Departamento> departamentos = controlador.getAllDepartamentos();

        DefaultTableModel dtm = new DefaultTableModel();

        dtm.addColumn("Código");
        dtm.addColumn("Nome");
        dtm.addColumn("Quantidade de funcionários");
        dtm.addColumn("Gasto total com funcionários");

        for (Departamento d :  departamentos) {
            dtm.addRow(new Object [] { d.codigo, d.nome, d.getFuncionarios().size(), d.getGastosFuncionarios() });
        }

        jTable1.setModel(dtm);

        jButton1.setText("Atualizar lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Menu1.setText("Cadastros");

        Menu1Item1.setText("Cadastrar departamento");
        Menu1Item1.setToolTipText("");
        Menu1Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1Item1ActionPerformed(evt);
            }
        });
        Menu1.add(Menu1Item1);

        Menu1Item2.setText("Cadastrar docente efetivo");
        Menu1Item2.setToolTipText("");
        Menu1Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1Item2ActionPerformed(evt);
            }
        });
        Menu1.add(Menu1Item2);

        Menu1Item3.setText("Cadastrar docente substituto");
        Menu1Item3.setToolTipText("");
        Menu1Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1Item3ActionPerformed(evt);
            }
        });
        Menu1.add(Menu1Item3);

        Menu1Item4.setText("Cadastrar técnico");
        Menu1Item4.setToolTipText("");
        Menu1Item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1Item4ActionPerformed(evt);
            }
        });
        Menu1.add(Menu1Item4);

        MenuBar.add(Menu1);

        Menu2.setText("Departamentos");

        Menu2Item1.setText("Relatório geral");
        Menu2Item1.setToolTipText("");
        Menu2Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu2Item1ActionPerformed(evt);
            }
        });
        Menu2.add(Menu2Item1);

        Menu2Item2.setText("Resumo de todos");
        Menu2Item2.setToolTipText("");
        Menu2Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu2Item2ActionPerformed(evt);
            }
        });
        Menu2.add(Menu2Item2);

        Menu2Item3.setText("Buscar por faixa de gasto");
        Menu2Item3.setToolTipText("");
        Menu2Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu2Item3ActionPerformed(evt);
            }
        });
        Menu2.add(Menu2Item3);

        MenuBar.add(Menu2);

        Menu3.setText("Funcionários");

        Menu3Item1.setText("Todos");
        Menu3Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item1ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item1);

        Menu3Item2.setText("Técnicos");
        Menu3Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item2ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item2);

        Menu3Item3.setText("Docentes");
        Menu3Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item3ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item3);

        Menu3Item4.setText("Docentes Efetivos");
        Menu3Item4.setToolTipText("");
        Menu3Item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item4ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item4);

        Menu3Item5.setText("Docentes Substitutos");
        Menu3Item5.setToolTipText("");
        Menu3Item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item5ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item5);

        Menu3Item6.setText("Buscar por código");
        Menu3Item6.setToolTipText("");
        Menu3Item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item6ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item6);

        Menu3Item7.setText("Buscar por nome");
        Menu3Item7.setToolTipText("");
        Menu3Item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item7ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item7);

        Menu3Item8.setText("Buscar por faixa de salário");
        Menu3Item8.setToolTipText("");
        Menu3Item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu3Item8ActionPerformed(evt);
            }
        });
        Menu3.add(Menu3Item8);

        MenuBar.add(Menu3);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(463, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu3Item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item1ActionPerformed
        
        TodosFuncionariosDialog dialog = new TodosFuncionariosDialog(this, true);
        dialog.setVisible(true);
       
    }//GEN-LAST:event_Menu3Item1ActionPerformed

    private void Menu3Item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item2ActionPerformed
         TecnicosDialog dialog = new TecnicosDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu3Item2ActionPerformed

    private void Menu3Item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item3ActionPerformed
         TodosDocentesDialog dialog = new TodosDocentesDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu3Item3ActionPerformed

    private void Menu3Item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item4ActionPerformed
        DocenteEfetivoDialog dialog = new DocenteEfetivoDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu3Item4ActionPerformed

    private void Menu3Item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item5ActionPerformed
        DocenteSubstitutoDialog dialog = new DocenteSubstitutoDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu3Item5ActionPerformed

    private void Menu3Item6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu3Item6ActionPerformed

    private void Menu3Item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu3Item7ActionPerformed

    private void Menu3Item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu3Item8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu3Item8ActionPerformed

    private void Menu2Item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu2Item2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu2Item2ActionPerformed

    private void Menu2Item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu2Item3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu2Item3ActionPerformed

    private void Menu1Item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1Item1ActionPerformed
        CadastroDepartamentoDialog dialog = new CadastroDepartamentoDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu1Item1ActionPerformed

    private void Menu1Item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1Item2ActionPerformed
        CadastroDocenteEfetivoDialog dialog = new CadastroDocenteEfetivoDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu1Item2ActionPerformed

    private void Menu1Item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1Item3ActionPerformed
         CadastroDocenteSubstitutoDialog dialog = new CadastroDocenteSubstitutoDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu1Item3ActionPerformed

    private void Menu1Item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1Item4ActionPerformed
        CadastroTecnicoDialog dialog = new CadastroTecnicoDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_Menu1Item4ActionPerformed

    private void Menu2Item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu2Item1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu2Item1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controlador controlador = new Controlador();
        
        ArrayList<Departamento> departamentos = controlador.getAllDepartamentos();
        
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.addColumn("Código");
        dtm.addColumn("Nome");
        dtm.addColumn("Quantidade de funcionários");
        dtm.addColumn("Gasto total com funcionários");
        
        for (Departamento d :  departamentos) {
            dtm.addRow(new Object [] { d.codigo, d.nome, d.getFuncionarios().size(), d.getGastosFuncionarios() });
        }
        
        jTable1.setModel(dtm);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu1;
    private javax.swing.JMenuItem Menu1Item1;
    private javax.swing.JMenuItem Menu1Item2;
    private javax.swing.JMenuItem Menu1Item3;
    private javax.swing.JMenuItem Menu1Item4;
    private javax.swing.JMenu Menu2;
    private javax.swing.JMenuItem Menu2Item1;
    private javax.swing.JMenuItem Menu2Item2;
    private javax.swing.JMenuItem Menu2Item3;
    private javax.swing.JMenu Menu3;
    private javax.swing.JMenuItem Menu3Item1;
    private javax.swing.JMenuItem Menu3Item2;
    private javax.swing.JMenuItem Menu3Item3;
    private javax.swing.JMenuItem Menu3Item4;
    private javax.swing.JMenuItem Menu3Item5;
    private javax.swing.JMenuItem Menu3Item6;
    private javax.swing.JMenuItem Menu3Item7;
    private javax.swing.JMenuItem Menu3Item8;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
