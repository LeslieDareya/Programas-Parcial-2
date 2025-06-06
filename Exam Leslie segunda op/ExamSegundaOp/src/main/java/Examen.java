
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Darey
 */
public class Examen extends javax.swing.JFrame {
DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Examen
     */
    public Examen() throws IOException {
        initComponents();
        
        String[] titulos = {"Producto","Costo","Precio"};
        modelo = new DefaultTableModel(null,titulos);
        Tabla.setModel(modelo);
        crearArchivo();
        
        //costo * .16 = precio + costo
       }
    private void crearArchivo() throws IOException{
       File ar = new File("Datos.txt");
    if (ar.exists()){
           
        CargarDatos();
    }else{
      JOptionPane.showMessageDialog(null, "Los archivos no existen");
    }
    }
    
    public void LeerArchivo() throws IOException {

        try {
            BufferedReader leer = new BufferedReader(new FileReader("Datos.txt"));

            String renglon = "";
       
            while ((renglon = leer.readLine()) != null) {
         
                String[] datos = renglon.split(" _ ");
                String producto = datos[0];
                String costo = datos[1];
                String precio = datos[2];

                modelo.addRow(new Object[]{producto,costo,precio});
                Tabla.setModel(modelo);
            }
            leer.close();

        } catch (FileNotFoundException ex) {

        }
    }
 void CargarDatos() throws IOException{
        File ar = new File("Datos.txt");
        
        if (ar.exists()){

              try {
                  BufferedReader leer = new BufferedReader(new FileReader("Datos.txt"));
                  String renglon = "";
                  while((renglon = leer.readLine()) != null){
                     String [] a = renglon.split(" _ ");
                      JOptionPane.showMessageDialog(null,"Arreglo"+ a.length);
                     String producto= a[0];
                     String costo= a[1];
                    String precio= a[2];
                 
                    modelo.addRow(new Object[]{producto,costo,precio});
                    Tabla.setModel(modelo);
                
                  }
                   leer.close();
                  
                  
              } catch (FileNotFoundException ex) {
                  Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
              }

              
        }else{
           JOptionPane.showMessageDialog(null, "Los archivos no existen");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        jLabel1.setText("Producto");
        jPanel2.add(jLabel1);

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        jPanel2.add(txtProducto);

        jLabel2.setText("Costo");
        jPanel2.add(jLabel2);

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCosto);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(439, 150));
        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jPanel4.add(jScrollPane1);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel5.setLayout(new java.awt.GridLayout(2, 1));
        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ((c >= 97 && c <= 122)|| (c == 8)){
        }else{
        evt.consume();
        }
    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        // TODO add your handling code here:
         int c = evt.getKeyChar();
        if (( c >= 48 && c <=57)|| (c == 8)){
        }else{
           evt.consume();
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
                System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
         String producto = txtProducto.getText();
      String costo = txtCosto.getText();
    
    float pc = Float.parseFloat(costo);
    float precio = (float) ((pc * 0.16)+pc);
    
    String precio2 = Float.toString(precio);
    
    if ((producto.length() == 0)||(costo.length() == 0)){
            JOptionPane.showMessageDialog(null, "Faltan datos");
        } else {
            try {
                modelo.addRow(new Object[]{producto,costo,precio});
                Tabla.setModel(modelo);
                try (FileWriter leer = new FileWriter("Datos.txt",true)) {
                    
                    leer.write(producto+" _ "+costo+" _ "+precio2+"\n");
                    leer.close();  
                }
            } catch (IOException ex) {
                Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
            }
                

           //costo + 16 %

    }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Examen().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Examen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
