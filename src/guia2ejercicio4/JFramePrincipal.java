
package guia2ejercicio4;

import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Monitor_Plano
 */
public class JFramePrincipal extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProductos = new TreeSet<>();

    public JFramePrincipal() {
        initComponents();
        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeTodo SA");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem3.setText("Por rubro...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Por nombre...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Por precio...");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Método del item de menu Por nombre
        
        escritorio.removeAll(); // remueve todo lo que esta en el componente escritorio
        escritorio.repaint();  // vuelve a iniciarse el escritorio
        ViewBusquedaNombre nuevaVentana = new ViewBusquedaNombre(); // inicializamos una nueva ventana
        nuevaVentana.setVisible(true); // hacemos que sea visible la ventana instanciada
        escritorio.add(nuevaVentana);// agregamos la nueva ventana al escritorio
        escritorio.moveToFront(nuevaVentana); // traemo hacia el frente del escritorio la nueva ventana
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Método del Item Salir
        
        int opcion = JOptionPane.showConfirmDialog(this,"¿Quiere ssalir?","Salir",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Mètodo que maneja el evento clic del Item Pruducto
        
        escritorio.removeAll(); 
        escritorio.repaint();  
        ViewProductos nuevaVentana = new ViewProductos(listaProductos); 
        nuevaVentana.setVisible(true); 
        escritorio.add(nuevaVentana);
        escritorio.moveToFront(nuevaVentana); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Métedo que maneja el evento clic del item de menu "Por Rubro"
        
        escritorio.removeAll(); 
        escritorio.repaint();  
        ViewListadoRubro nuevaVentana = new ViewListadoRubro(listaProductos); 
        nuevaVentana.setVisible(true); 
        escritorio.add(nuevaVentana);
        escritorio.moveToFront(nuevaVentana);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Método maneja el evento clic del item de menu "Listado por precio"
        escritorio.removeAll(); 
        escritorio.repaint();  
        ViewListadoPrecio nuevaVentana = new ViewListadoPrecio(listaProductos); 
        nuevaVentana.setVisible(true); 
        escritorio.add(nuevaVentana);
        escritorio.moveToFront(nuevaVentana);      
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables

   private void cargarProductos() {

        listaProductos.add(new Producto(10, "Azucar x 1 Kg", 156.32, 20, "COMESTIBLE"));
        listaProductos.add(new Producto(15, "Dulce de leche  x 1 Kg", 125.32, 10, "COMESTIBLE"));
        listaProductos.add(new Producto(20, "Lavandina x 5 litros", 362.58, 100, "LIMPIEZA"));
        listaProductos.add(new Producto(25, "Detergente  x 500 cc", 563.85, 60, "LIMPIEZA"));
        listaProductos.add(new Producto(30, "Talco Borita x 250grm", 56.32, 10, "PERFUMERIA"));
        listaProductos.add(new Producto(35, "Perfume para mujer 100ml", 5156.32, 40, "PERFUMERIA"));
   }

}
