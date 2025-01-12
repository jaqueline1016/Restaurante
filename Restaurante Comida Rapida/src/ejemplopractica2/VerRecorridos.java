/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplopractica2;

import javax.swing.JLabel;
import ejemplopractica2.RegistrodeProductos;
import static ejemplopractica2.RegistrodeProductos.vardistancia;
import static ejemplopractica2.RegistrodeProductos.TypeV;
import static ejemplopractica2.RegistrodeProductos.contador;



/**
 *
 *  * @author jgcal
 */
public class VerRecorridos extends javax.swing.JFrame {
int cas1 =0;
int cas2 =0;
int cas3 =0;
    /**
     * Creates new form VerRecorridos
     */
    public VerRecorridos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DestinoLbl = new javax.swing.JLabel();
        Vehiculo1Lbl = new javax.swing.JLabel();
        EnviaraTodos = new javax.swing.JButton();
        Vehiculo2Lbl = new javax.swing.JLabel();
        Vehiculo3Lbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        motocicleta1 = new javax.swing.JButton();
        motocicleta2 = new javax.swing.JButton();
        motocicleta3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DestinoLbl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DestinoLbl.setBackground(new java.awt.Color(204, 0, 0));
        DestinoLbl.setOpaque(true);

        Vehiculo1Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor.png"))); // NOI18N

        EnviaraTodos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EnviaraTodos.setText("Enviar Todos");
        EnviaraTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviaraTodosActionPerformed(evt);
            }
        });

        Vehiculo2Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor.png"))); // NOI18N

        Vehiculo3Lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repartidor.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Motocicleta 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Motocicleta 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Motocicleta 3");

        int Valor2 = 0;
        if (RegistrodeProductos.TypeV == "2"){
            Valor2 = RegistrodeProductos.vardistancia;
        }else{
            Valor2 = 0;
        }
        jLabel5.setText("Distancia: "+ Valor2);

        int Valor3 = 0;
        if (RegistrodeProductos.TypeV == "3"){
            Valor3 = RegistrodeProductos.vardistancia;
        }else{
            Valor3 = 0;
        }
        jLabel6.setText("Distancia:"+Valor3);

        motocicleta1.setText("Enviar");
        motocicleta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motocicleta1ActionPerformed(evt);
            }
        });

        motocicleta2.setText("Enviar");
        motocicleta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motocicleta2ActionPerformed(evt);
            }
        });

        motocicleta3.setText("Enviar");
        motocicleta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motocicleta3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Visualización de Trayectorias");

        DestinoLbl1.setBackground(new java.awt.Color(204, 0, 0));
        DestinoLbl1.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Historial de Pedidos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Menu Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        int Valor1 = 0;
        if (RegistrodeProductos.TypeV == "1"){
            Valor1 = RegistrodeProductos.vardistancia;
        }else{
            Valor1 = 0;
        }
        jLabel8.setText("Distancia: "+ Valor1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(motocicleta1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)))
                        .addGap(36, 36, 36)
                        .addComponent(Vehiculo1Lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(motocicleta3))
                        .addGap(38, 38, 38)
                        .addComponent(Vehiculo3Lbl3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(motocicleta2))
                        .addGap(38, 38, 38)
                        .addComponent(Vehiculo2Lbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(92, 92, 92)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EnviaraTodos)
                        .addGap(403, 403, 403)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DestinoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestinoLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(motocicleta1))
                            .addComponent(Vehiculo1Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Vehiculo2Lbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(motocicleta2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(motocicleta3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(Vehiculo3Lbl3)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(669, 669, 669)
                        .addComponent(DestinoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(EnviaraTodos)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DestinoLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviaraTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviaraTodosActionPerformed
        // TODO add your handling code here:
        System.out.println(RegistrodeProductos.vardistancia);
        System.out.println(RegistrodeProductos.TypeV);
        
        /*int casv1 =0;
        int casv2 =0;
        int casv3 =0;
        
        if (RegistrodeProductos.TypeV == "1"){        
           casv1 = RegistrodeProductos.vardistancia;
            System.out.println(casv1);
           if (RegistrodeProductos.TypeV == "2"){              
               casv2 = RegistrodeProductos.vardistancia;
               System.out.println(casv2);
                if (RegistrodeProductos.TypeV == "3"){
                
                 casv3 = RegistrodeProductos.vardistancia;
                    System.out.println(casv3);
                }else{
                     casv3 =0;   
                }
           }else{
               casv2 =0;
           }
        }else{
        casv1 = 0;
        }
        */
       

        Recorrido rec1 = new Recorrido(Vehiculo1Lbl, cas1);
        Recorrido rec2 = new Recorrido(Vehiculo2Lbl, cas2);
        Recorrido rec3 = new Recorrido(Vehiculo3Lbl3, cas3);
        rec1.start();
        rec2.start();
        rec3.start();
   
    }//GEN-LAST:event_EnviaraTodosActionPerformed

    private void motocicleta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motocicleta1ActionPerformed
        // TODO add your handling code here:
        /*Recorrido rec1 = new Recorrido(Vehiculo1Lbl, cas1);
        rec1.start();
        */
        //int cas1 =0;

        if (RegistrodeProductos.TypeV == "1"){        
           cas1 = RegistrodeProductos.vardistancia;   
        }else{
        cas1 = 0;
        }
        
        Recorrido rec1 = new Recorrido(Vehiculo1Lbl, cas1);
        rec1.start();
       
    }//GEN-LAST:event_motocicleta1ActionPerformed

    private void motocicleta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motocicleta2ActionPerformed
        // TODO add your handling code here:
        /*Recorrido rec2 = new Recorrido(Vehiculo2Lbl, cas2);
        rec2.start();
        */
        //int cas2 =0;
        if (RegistrodeProductos.TypeV == "2"){        
           cas2 = RegistrodeProductos.vardistancia;   
        }else{
        cas2 = 0;
        }
       Recorrido rec2 = new Recorrido(Vehiculo2Lbl, cas2);
        rec2.start();
    }//GEN-LAST:event_motocicleta2ActionPerformed

    private void motocicleta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motocicleta3ActionPerformed
        // TODO add your handling code here:
         //int cas3 =0;
         
         /*Recorrido rec3 = new Recorrido(Vehiculo3Lbl3, cas3);
          rec3.start();
         */
         if (RegistrodeProductos.TypeV == "3"){        
           cas3 = RegistrodeProductos.vardistancia;   
        }else{
        cas3 = 0;
        }
         Recorrido rec3 = new Recorrido(Vehiculo3Lbl3, cas3);
          rec3.start();
         
    }//GEN-LAST:event_motocicleta3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
                RegistrodeProductos at = new RegistrodeProductos ();
                at.setVisible(true);
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegistrodeProductos.contador++;
        this.setVisible(false);
                HistorialdePedidos as = new HistorialdePedidos ();
                as.setVisible(true);
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
            java.util.logging.Logger.getLogger(VerRecorridos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerRecorridos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerRecorridos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerRecorridos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerRecorridos().setVisible(true);
            }
        });
    }
    
    public JLabel getDestino(){
        return DestinoLbl;
    }
    
    /*
    public JLabel getVehiculo(){
        return Vehiculo1Lbl;
    }
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel DestinoLbl;
    public static javax.swing.JLabel DestinoLbl1;
    private javax.swing.JButton EnviaraTodos;
    public static javax.swing.JLabel Vehiculo1Lbl;
    public static javax.swing.JLabel Vehiculo2Lbl;
    public static javax.swing.JLabel Vehiculo3Lbl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton motocicleta1;
    private javax.swing.JButton motocicleta2;
    private javax.swing.JButton motocicleta3;
    // End of variables declaration//GEN-END:variables
}
