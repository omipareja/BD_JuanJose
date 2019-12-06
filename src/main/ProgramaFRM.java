/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package main;

import classDAO.concesionarioDAO;
import classDAO.marcaDAO;

import classVO.concesionarioVO;
import classVO.marcaVO;

import javax.swing.ImageIcon;

/**
 *
 * @author JUAN MANUEL
 */
public class ProgramaFRM extends javax.swing.JFrame {

    /**
     * Creates new form ProgramaFRM
     */
    public ProgramaFRM() {
        
        initComponents();
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setTitle("TRANSITO");
        setIconImage(new ImageIcon(getClass().getResource("/Iconcos/icon.png")).getImage());
        

       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        registrar_marca = new javax.swing.JButton();
        actualizar_provedor = new javax.swing.JButton();
        buscar_marca = new javax.swing.JButton();
        eliminar_concesionario = new javax.swing.JButton();
        limpiar_marca = new javax.swing.JButton();
        estado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_marca = new javax.swing.JLabel();
        marcasss = new javax.swing.JLabel();
        IDM = new javax.swing.JTextField();
        marcaM = new javax.swing.JTextField();
        LimpiarM = new javax.swing.JButton();
        EliminarM = new javax.swing.JButton();
        BuscarM = new javax.swing.JButton();
        actualizarM = new javax.swing.JButton();
        registrarM = new javax.swing.JButton();
        estadoM = new javax.swing.JTextField();
        concesionarioM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        IDC = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("ID");

        jLabel5.setText("Nombre concesionario");

        jLabel6.setText("Direccion");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        registrar_marca.setText("Registrar");
        registrar_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_marcaActionPerformed(evt);
            }
        });

        actualizar_provedor.setText("Actualizar");
        actualizar_provedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_provedorActionPerformed(evt);
            }
        });

        buscar_marca.setText("Buscar");
        buscar_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_marcaActionPerformed(evt);
            }
        });

        eliminar_concesionario.setText("Eliminar");
        eliminar_concesionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_concesionarioActionPerformed(evt);
            }
        });

        limpiar_marca.setText("Limpiar ");
        limpiar_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_marcaActionPerformed(evt);
            }
        });

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Informacion Concesionario");

        jButton3.setText("Mostrar Registros");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registrar_marca)))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(actualizar_provedor)
                        .addGap(98, 98, 98)
                        .addComponent(buscar_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(eliminar_concesionario)
                        .addGap(74, 74, 74)
                        .addComponent(limpiar_marca)
                        .addGap(19, 19, 19))
                    .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar_marca)
                    .addComponent(actualizar_provedor)
                    .addComponent(buscar_marca)
                    .addComponent(eliminar_concesionario)
                    .addComponent(limpiar_marca))
                .addGap(47, 47, 47)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Concesionario", jPanel3);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Informacion Marca");

        id_marca.setText("ID");

        marcasss.setText("Marca");

        IDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDMActionPerformed(evt);
            }
        });

        LimpiarM.setText("Limpiar");
        LimpiarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarMActionPerformed(evt);
            }
        });

        EliminarM.setText("Eliminar");
        EliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarMActionPerformed(evt);
            }
        });

        BuscarM.setText("Buscar");
        BuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMActionPerformed(evt);
            }
        });

        actualizarM.setText("Actualizar");
        actualizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMActionPerformed(evt);
            }
        });

        registrarM.setText("Registrar");
        registrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMActionPerformed(evt);
            }
        });

        estadoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoMActionPerformed(evt);
            }
        });

        concesionarioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concesionarioMActionPerformed(evt);
            }
        });

        jLabel3.setText("ID concesionario");

        jButton4.setText("consultas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marcasss)
                    .addComponent(id_marca))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(marcaM))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarM)
                .addGap(79, 79, 79)
                .addComponent(actualizarM)
                .addGap(119, 119, 119)
                .addComponent(BuscarM)
                .addGap(80, 80, 80)
                .addComponent(EliminarM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(LimpiarM)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estadoM)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(concesionarioM)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_marca)
                    .addComponent(IDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcasss)
                    .addComponent(marcaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(concesionarioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarM)
                    .addComponent(actualizarM)
                    .addComponent(BuscarM)
                    .addComponent(EliminarM)
                    .addComponent(LimpiarM))
                .addGap(18, 18, 18)
                .addComponent(estadoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Marca", jPanel1);

        javax.swing.GroupLayout IDCLayout = new javax.swing.GroupLayout(IDC);
        IDC.setLayout(IDCLayout);
        IDCLayout.setHorizontalGroup(
            IDCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        IDCLayout.setVerticalGroup(
            IDCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", IDC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Consultas abrirM = new Consultas();
        abrirM.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void concesionarioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concesionarioMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_concesionarioMActionPerformed

    private void estadoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoMActionPerformed

    private void registrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMActionPerformed

        //  concesionarioVO conce = (concesionarioVO)   Lista_concesionario.getSelectedItem();
        marcaVO marca = new marcaVO();
        //Integer conce_M=conce.getId_concesionario();
        marca.setId_marca(Integer.parseInt(IDM.getText()));
        marca.setNombre_marca(marcaM.getText());
        marca.setId_concesionario(Integer.parseInt(concesionarioM.getText())); //sin el combo box
        // marca.setId_concesionario(conce_M);//para el combo box
   

        String resp= marcaDAO.registrarmarcas(marca);
        estadoM.setText(resp);
        IDM.setText("");
        marcaM.setText("");
        concesionarioM.setText("");
    }//GEN-LAST:event_registrarMActionPerformed

    private void actualizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMActionPerformed
        // TODO add your handling code here:
        // concesionarioVO conce = (concesionarioVO)   Lista_concesionario.getSelectedItem();
        marcaVO marca = new marcaVO();
        //  Integer conce_M = conce.getId_concesionario();
        marca.setId_marca(Integer.parseInt(IDM.getText()));
        marca.setNombre_marca(marcaM.getText());
        marca.setId_concesionario(Integer.parseInt(concesionarioM.getText()));

        //marca.setId_concesionario(conce_M); // para el combo box
        String resp = marcaDAO.actualizarmarcas(marca);
        IDM.setText("");
        marcaM.setText("");
        concesionarioM.setText("");
        estadoM.setText(resp);
        
    }//GEN-LAST:event_actualizarMActionPerformed

    private void BuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMActionPerformed
        // TODO add your handling code here:

        marcaVO marca  = marcaDAO.buscarmarcas(IDM.getText());
        IDM.setText(marca.getId_marca()+"");
        marcaM.setText(marca.getNombre_marca());
        concesionarioM.setText(marca.getId_concesionario()+"");
        estado.setText(marca.getResultado());
        //  cargaconcesionarios(marca.getId_concesionario());// para el combo box
    }//GEN-LAST:event_BuscarMActionPerformed

    private void EliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarMActionPerformed
        String resp = marcaDAO.eliminarmarcas(IDM.getText());
        estadoM.setText(resp);
        IDM.setText("");
        marcaM.setText("");
        concesionarioM.setText("");// sin combo box
  
    }//GEN-LAST:event_EliminarMActionPerformed

    private void LimpiarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarMActionPerformed
        // TODO add your handling code here:
        estadoM.setText("");
        IDM.setText("");
        marcaM.setText("");
        concesionarioM.setText("");
        // cargaconcesionarios(0);
    }//GEN-LAST:event_LimpiarMActionPerformed

    private void IDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDMActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Tabla_concesionario abrir = new Tabla_concesionario();
        abrir.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void limpiar_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_marcaActionPerformed
        // TODO add your handling code here:
        ID.setText("");
        direccion.setText("");
        Nombre.setText("");
    }//GEN-LAST:event_limpiar_marcaActionPerformed

    private void eliminar_concesionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_concesionarioActionPerformed
        // TODO add your handling code here:

        String resp = concesionarioDAO.eliminarconcesionarios(ID.getText());
        estado.setText(resp);
        ID.setText("");
        direccion.setText("");
        Nombre.setText("");
        //   cargaconcesionarios(0);
    }//GEN-LAST:event_eliminar_concesionarioActionPerformed

    private void buscar_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_marcaActionPerformed
        // TODO add your handling code here:

        concesionarioVO concesionario  =concesionarioDAO.buscarconcesionarios(ID.getText());
        ID.setText(concesionario.getId_concesionario()+"");
        Nombre.setText(concesionario.getNombre_concesionario());
        direccion.setText(concesionario.getDireccion_concesionario());
        estado.setText(concesionario.getResultado());
    }//GEN-LAST:event_buscar_marcaActionPerformed

    private void actualizar_provedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_provedorActionPerformed
        concesionarioVO concesionario = new concesionarioVO();

        concesionario.setId_concesionario(Integer.parseInt(ID.getText()));
        concesionario.setDireccion_concesionario(direccion.getText());
        concesionario.setNombre_concesionario((Nombre.getText()));

        String resp= concesionarioDAO.actualizarconcesionarios(concesionario);
        estado.setText(resp);
        ID.setText("");
        direccion.setText("");
        Nombre.setText("");

        //// cargaconcesionarios(0);
    }//GEN-LAST:event_actualizar_provedorActionPerformed

    private void registrar_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_marcaActionPerformed
        concesionarioVO concesionario = new concesionarioVO();
        concesionario.setId_concesionario(Integer.parseInt(ID.getText()));
        concesionario.setDireccion_concesionario(direccion.getText());
        concesionario.setNombre_concesionario((Nombre.getText()));

        String resp= concesionarioDAO.registrarconcesionarios(concesionario);
        estado.setText(resp);
        ID.setText("");
        direccion.setText("");
        Nombre.setText("");

        //  cargaconcesionarios(0);
    }//GEN-LAST:event_registrar_marcaActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaFRM().setVisible(true);
            }

        });  
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarM;
    private javax.swing.JButton EliminarM;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel IDC;
    private javax.swing.JTextField IDM;
    private javax.swing.JButton LimpiarM;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton actualizarM;
    private javax.swing.JButton actualizar_provedor;
    private javax.swing.JButton buscar_marca;
    private javax.swing.JTextField concesionarioM;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminar_concesionario;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField estadoM;
    private javax.swing.JLabel id_marca;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton limpiar_marca;
    private javax.swing.JTextField marcaM;
    private javax.swing.JLabel marcasss;
    private javax.swing.JButton registrarM;
    private javax.swing.JButton registrar_marca;
    // End of variables declaration//GEN-END:variables
}