
package forms;

import abstratas.popularListas;

public class frameMenu extends javax.swing.JFrame {

    public frameMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMarca = new javax.swing.JMenuItem();
        itemModelo = new javax.swing.JMenuItem();
        itemMecanico = new javax.swing.JMenuItem();
        itemProprietario = new javax.swing.JMenuItem();
        itemVeiculo = new javax.swing.JMenuItem();
        itemServico = new javax.swing.JMenuItem();
        itemOrdemServico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Ordem de Serviço");
        setBackground(new java.awt.Color(255, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenu1.setText("Arquivos");

        itemMarca.setText("Marca");
        itemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMarcaActionPerformed(evt);
            }
        });
        jMenu1.add(itemMarca);

        itemModelo.setText("Modelo");
        itemModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModeloActionPerformed(evt);
            }
        });
        jMenu1.add(itemModelo);

        itemMecanico.setText("Mecânico");
        itemMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMecanicoActionPerformed(evt);
            }
        });
        jMenu1.add(itemMecanico);

        itemProprietario.setText("Proprietário");
        itemProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProprietarioActionPerformed(evt);
            }
        });
        jMenu1.add(itemProprietario);

        itemVeiculo.setText("Veículo");
        itemVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVeiculoActionPerformed(evt);
            }
        });
        jMenu1.add(itemVeiculo);

        itemServico.setText("Serviço");
        itemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemServicoActionPerformed(evt);
            }
        });
        jMenu1.add(itemServico);

        itemOrdemServico.setText("Ordem de Serviço");
        itemOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrdemServicoActionPerformed(evt);
            }
        });
        jMenu1.add(itemOrdemServico);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        popularListas.addObjetos();
    }//GEN-LAST:event_formWindowOpened

    private void itemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMarcaActionPerformed

        new dialogMarca(this, true).setVisible(true);
    }//GEN-LAST:event_itemMarcaActionPerformed

    private void itemModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModeloActionPerformed
        
        new dialogModelo(this, true).setVisible(true);
    }//GEN-LAST:event_itemModeloActionPerformed

    private void itemMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMecanicoActionPerformed
        
        new dialogMecanico(this, true).setVisible(true);
    }//GEN-LAST:event_itemMecanicoActionPerformed

    private void itemProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProprietarioActionPerformed
        
        new dialogProprietario(this, true).setVisible(true);
    }//GEN-LAST:event_itemProprietarioActionPerformed

    private void itemOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrdemServicoActionPerformed
        
        new dialogOrdemServico(this, true).setVisible(true);
    }//GEN-LAST:event_itemOrdemServicoActionPerformed

    private void itemVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVeiculoActionPerformed
        
        new dialogVeiculo(this, true).setVisible(true);
    }//GEN-LAST:event_itemVeiculoActionPerformed

    private void itemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemServicoActionPerformed
        
        new dialogServico(this, true).setVisible(true);
    }//GEN-LAST:event_itemServicoActionPerformed

    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMarca;
    private javax.swing.JMenuItem itemMecanico;
    private javax.swing.JMenuItem itemModelo;
    private javax.swing.JMenuItem itemOrdemServico;
    private javax.swing.JMenuItem itemProprietario;
    private javax.swing.JMenuItem itemServico;
    private javax.swing.JMenuItem itemVeiculo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
