/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package arbolgenealogico;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author massi
 */
public class Interfaz extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Barra1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Barra2 = new javax.swing.JPanel();
        Btn_Home = new javax.swing.JButton();
        Btn_Service = new javax.swing.JButton();
        Btn_About = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Pagina3 = new javax.swing.JPanel();
        Pg3 = new javax.swing.JLabel();
        Pagina2 = new javax.swing.JPanel();
        Pg2 = new javax.swing.JLabel();
        Pagina1 = new javax.swing.JPanel();
        Pg1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(0, 150, 136));

        Barra1.setBackground(new java.awt.Color(27, 23, 36));
        Barra1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout Barra1Layout = new javax.swing.GroupLayout(Barra1);
        Barra1.setLayout(Barra1Layout);
        Barra1Layout.setHorizontalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra1Layout.createSequentialGroup()
                .addGap(623, 623, 623)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Barra1Layout.setVerticalGroup(
            Barra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        Barra2.setBackground(new java.awt.Color(27, 23, 36));
        Barra2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        Btn_Home.setBackground(new java.awt.Color(22, 160, 133));
        Btn_Home.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Btn_Home.setText("HOME");
        Btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HomeActionPerformed(evt);
            }
        });

        Btn_Service.setBackground(new java.awt.Color(22, 160, 133));
        Btn_Service.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Btn_Service.setText("ABOUT");
        Btn_Service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ServiceActionPerformed(evt);
            }
        });

        Btn_About.setBackground(new java.awt.Color(22, 160, 133));
        Btn_About.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Btn_About.setText("SERVICE");
        Btn_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Barra2Layout = new javax.swing.GroupLayout(Barra2);
        Barra2.setLayout(Barra2Layout);
        Barra2Layout.setHorizontalGroup(
            Barra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(Btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(Btn_About, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(Btn_Service, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        Barra2Layout.setVerticalGroup(
            Barra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(Barra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_About, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Btn_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn_Service, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        Pagina3.setBackground(new java.awt.Color(27, 23, 36));

        Pg3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Pg3.setForeground(new java.awt.Color(22, 160, 133));
        Pg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pg3.setText("3");

        javax.swing.GroupLayout Pagina3Layout = new javax.swing.GroupLayout(Pagina3);
        Pagina3.setLayout(Pagina3Layout);
        Pagina3Layout.setHorizontalGroup(
            Pagina3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagina3Layout.createSequentialGroup()
                .addGap(0, 728, Short.MAX_VALUE)
                .addComponent(Pg3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pagina3Layout.setVerticalGroup(
            Pagina3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pg3)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", Pagina3);

        Pagina2.setBackground(new java.awt.Color(27, 23, 36));

        Pg2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Pg2.setForeground(new java.awt.Color(22, 160, 133));
        Pg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pg2.setText("2");

        javax.swing.GroupLayout Pagina2Layout = new javax.swing.GroupLayout(Pagina2);
        Pagina2.setLayout(Pagina2Layout);
        Pagina2Layout.setHorizontalGroup(
            Pagina2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina2Layout.createSequentialGroup()
                .addContainerGap(728, Short.MAX_VALUE)
                .addComponent(Pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pagina2Layout.setVerticalGroup(
            Pagina2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pg2)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", Pagina2);

        Pagina1.setBackground(new java.awt.Color(27, 23, 36));

        Pg1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Pg1.setForeground(new java.awt.Color(22, 160, 133));
        Pg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pg1.setText("1");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 160, 133));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Árbol Genealógico");

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro de Linajes");

        javax.swing.GroupLayout Pagina1Layout = new javax.swing.GroupLayout(Pagina1);
        Pagina1.setLayout(Pagina1Layout);
        Pagina1Layout.setHorizontalGroup(
            Pagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Pagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pagina1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Pg1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pagina1Layout.createSequentialGroup()
                        .addGroup(Pagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(Pagina1Layout.createSequentialGroup()
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 498, Short.MAX_VALUE))))
        );
        Pagina1Layout.setVerticalGroup(
            Pagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pg1)
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", Pagina1);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Barra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(Barra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HomeActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_Btn_HomeActionPerformed

    private void Btn_ServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ServiceActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_Btn_ServiceActionPerformed

    private void Btn_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AboutActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_Btn_AboutActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
     private void pintarImagen(JLabel lb1, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lb1.getWidth(),
                        lb1.getHeight(),
                        Image.SCALE_DEFAULT
                )
        );
        lb1.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra1;
    private javax.swing.JPanel Barra2;
    private javax.swing.JButton Btn_About;
    private javax.swing.JButton Btn_Home;
    private javax.swing.JButton Btn_Service;
    private javax.swing.JPanel Pagina1;
    private javax.swing.JPanel Pagina2;
    private javax.swing.JPanel Pagina3;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel Pg1;
    private javax.swing.JLabel Pg2;
    private javax.swing.JLabel Pg3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
