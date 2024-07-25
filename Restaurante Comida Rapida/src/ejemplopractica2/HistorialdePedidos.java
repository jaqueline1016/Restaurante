/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplopractica2;

import static ejemplopractica2.RegistrodeProductos.vardistancia;
import ejemplopractica2.RegistrodeProductos;
import static ejemplopractica2.RegistrodeProductos.totalaPagarString;
import static ejemplopractica2.RegistrodeProductos.tipovehiculo;
import static ejemplopractica2.RegistrodeProductos.creacion;
import static ejemplopractica2.Recorrido.dateTimeString;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ejemplopractica2.RegistrodeProductos.contador;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author jgcal
 */
public class HistorialdePedidos extends javax.swing.JFrame {

    public static int fila;

    public static RegistroHistorial registros[] = new RegistroHistorial[50];
    public static int contadorRegistros = 0;

    /**
     * Creates new form HistorialdePedidos
     */
    public HistorialdePedidos() {

        initComponents();
        this.setLocationRelativeTo(null);
        // Object datos[] = new Object[50];
        //int contar = Historial.getRowCount();
        System.out.println(RegistrodeProductos.contador);
        if (RegistrodeProductos.contador == 2){
            System.out.println("PRIMERA VEZ");
            
            
            /*
            try{
                FileInputStream archivoread = new FileInputStream("Respaldo.bin");
                    ObjectInputStream entrada = new ObjectInputStream(archivoread);

                    Registro R1 = (Registro) entrada.readObject();
                    System.out.println(R1.dato2 + " " + R1.dato1 + " " + R1.dato3 + " " + R1.dato4 + " " + R1.dato5);
                    RegistroHistorial reg1 = new RegistroHistorial(R1.dato2, R1.dato1, R1.dato3,
                        R1.dato4, R1.dato5);
                    actualizarRegistros(reg1);
                    archivoread.close();
            }catch (Exception e) {
                    System.out.println(e);
            }
            */
            
        }
        if (tipovehiculo != ".") { //v1
            RegistroHistorial reg = new RegistroHistorial(tipovehiculo, vardistancia, totalaPagarString,
                    creacion, dateTimeString);
            
            actualizarRegistros(reg);

            } else{
                System.out.println("error");
        }
        
        
        

        

        /*int contar = Historial.getRowCount();
        System.out.println(contar);
        DefaultTableModel model = (DefaultTableModel) Historial.getModel();
        model.addRow(new Object[]{tipovehiculo, vardistancia, totalaPagarString,"Column4","Column5"});       
        DefaultTableModel dtm = new DefaultTableModel(); 
         */
    }

    void insertedata() {
        /*
        DefaultTableModel model = (DefaultTableModel) Historial.getModel();
        model.addRow(new Object[]{RegistrodeProductos.tipovehiculo, RegistrodeProductos.vardistancia, RegistrodeProductos.totalaPagarString,"Column4","Column5"});
        
         */
        //fila = Historial.getSelectedRow();

        // Añade una nueva fila con estos datos
        /*
        DefaultTableModel modell = (DefaultTableModel) Historial.getModel();
        modell.addRow(new Object[]{Vehiculo,vardistancia,Vehiculo,Vehiculo,Vehiculo});//no toques este
        System.out.println(vardistancia);
        System.out.println(Vehiculo);
        System.out.println("DATOS AGREGADOS");
        
        RegistrodeProductos as = new RegistrodeProductos();
        
        /*
        
         */
 /*
          if (contadorCursos > 0) {

            // actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoCursos.getModel();
            modeloListado.setRowCount(contadorCursos);

            for (int i = 0; i < contadorCursos; i++) {
                modeloListado.setValueAt(cursos[i].codigo, i, 0);
                modeloListado.setValueAt(cursos[i].nombre, i, 1);
                modeloListado.setValueAt(cursos[i].creditos, i, 2);
                modeloListado.setValueAt(cursos[i].alumnos, i, 3);
                modeloListado.setValueAt(cursos[i].profesor, i, 4);
            }
         */
    }

    public void actualizarRegistros(RegistroHistorial reg) {
        // se agrega el nuevo registro al arreglo
        registros[contadorRegistros] = reg;
        contadorRegistros++;
        //System.out.println(contadorRegistros);

        // actualizar tablita
        DefaultTableModel modeloListado = (DefaultTableModel) Historial.getModel();
        modeloListado.setRowCount(contadorRegistros);

        for (int i = 0; i < contadorRegistros; i++) {
            modeloListado.setValueAt(registros[i].vehiculo, i, 0);
            modeloListado.setValueAt(registros[i].distancia, i, 1);
            modeloListado.setValueAt(registros[i].monto, i, 2);
            modeloListado.setValueAt(registros[i].fecha_hora_creacion, i, 3);
            modeloListado.setValueAt(registros[i].fecha_hora_entrega, i, 4);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historial = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Historial de Pedidos");

        Historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehiculo", "Distancia", "Pago", "Hora y Fecha de Creacion", "Hora y Fecha de Entrega"
            }
        ));
        jScrollPane1.setViewportView(Historial);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Vover al Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(396, 396, 396))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(372, 372, 372))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        RegistrodeProductos at = new RegistrodeProductos();
        at.setVisible(true);

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
            java.util.logging.Logger.getLogger(HistorialdePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialdePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialdePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialdePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialdePedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Historial;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
