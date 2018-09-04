
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuJFrame.java
 *
 * Created on Jun 18, 2014, 12:45:31 AM
 */
/**
 *
 * @author PROF AKINYOKUN
 */
public class Reduce extends javax.swing.JFrame {
     Connection conn = null ;
     private String PcMode , ImagePath; 

    /** Creates new form MenuJFrame */
    public Reduce()  {
        initComponents();
    this.setSize(1200, 800);
    this.setResizable(false);
                  final Toolkit toolkit = Toolkit.getDefaultToolkit();
    final Dimension screenSize = toolkit.getScreenSize();
    final int x = (screenSize.width - this.getWidth()) / 2;
    final int y = (screenSize.height - this.getHeight()) / 2;
    this.setLocation(x, y);
         this.getContentPane().setBackground(Color.white);
         setIcon() ; 
         
     	
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Back = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Back1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenu29 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FAKOB");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(txtDate);
        txtDate.setBounds(1482, 0, 138, 23);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REAPING REWARD");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1250, 30);

        Banner.setBackground(new java.awt.Color(255, 255, 255));
        Banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image20.png"))); // NOI18N
        Banner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

        welcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Banner.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image4.png"))); // NOI18N
        Banner.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("On-Site Fitness Offers");
        Banner.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 270, 50));

        jButton3.setBackground(new java.awt.Color(102, 0, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Mindfulness Videos");
        Banner.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 270, 50));

        jButton4.setBackground(new java.awt.Color(153, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Optum Health Referral (EAP)");
        Banner.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 270, 50));

        jButton5.setBackground(new java.awt.Color(102, 0, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("On-Site Massage");
        Banner.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 270, 50));

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Stress ToolBox");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Banner.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 270, 50));

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Active Health Coaching Programs");
        Banner.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 270, 50));

        jButton9.setBackground(new java.awt.Color(102, 0, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Activity Challenge");
        Banner.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 270, 50));

        Back.setBackground(new java.awt.Color(0, 0, 51));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FINISH");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        Back.add(jLabel13);

        Banner.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 240, 30));

        Back1.setBackground(new java.awt.Color(0, 0, 51));
        Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BACK");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        Back1.add(jLabel14);

        Banner.add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 240, 30));

        getContentPane().add(Banner);
        Banner.setBounds(0, 0, 1170, 740);

          jMenu5.setText(" Weight Management       ");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu15.setText("Reduce Stress        ");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu15);

        jMenu20.setText("Improve Hydration        ");
        jMenu20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu20MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu20);

        jMenu25.setText("Work/Life Balance       ");
        jMenu25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu25MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu25);

        jMenu26.setText("Improve Strenght & Stamina       ");
        jMenu26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu26MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu26);

        jMenu27.setText("Quit Smoking       ");
        jMenu27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu27MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu27);

        jMenu28.setText("Emotional Wellbeing         ");
        jMenu28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu28MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu28);

        jMenu29.setText("Financial       ");
        jMenu29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu29MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu29);

        jMenu30.setText("A Wealthy You");
        jMenu30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu30MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu30);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                
                // TODO add your handling code here:
                              conn = (Connection) mysqlconnect.ConnectDb();
                              welcome.setText("Welcome "+firstname);
                              if(!a){
            jMenu5.setVisible(false);
        }
                         if(!b){
            jMenu15.setVisible(false);
        }
                         if(!c){
            jMenu20.setVisible(false);
        }
                         if(!d){
            jMenu25.setVisible(false);
        }
                         if(!e){
            jMenu26.setVisible(false);
        }
                         if(!f){
            jMenu27.setVisible(false);
        }
                         if(!g){
            jMenu28.setVisible(false);
        }
                         if(!h){
            jMenu29.setVisible(false);
        }
                         if(!i){
            jMenu30.setVisible(false);
        }
                         

                            
}//GEN-LAST:event_formWindowOpened

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:

          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                      this.setVisible(false);          
              Finish.main(info,matter);
        
    }//GEN-LAST:event_BackMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void Back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Back1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
	  private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                      this.setVisible(false);          
                 Weight.main(info,matter);
               
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        // TODO add your handling code here:
        
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                      this.setVisible(false);          
                Reduce.main(info,matter);
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        // TODO add your handling code here:
        
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                     this.setVisible(false);           
                Improve.main(info,matter);
    }//GEN-LAST:event_jMenu20MouseClicked

    private void jMenu25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu25MouseClicked
        // TODO add your handling code here:
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                    this.setVisible(false);            
                 Work.main(info,matter);
    }//GEN-LAST:event_jMenu25MouseClicked

    private void jMenu26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu26MouseClicked
        // TODO add your handling code here:
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                     this.setVisible(false);           
                ImproveStamina.main(info,matter);
    }//GEN-LAST:event_jMenu26MouseClicked

    private void jMenu27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu27MouseClicked
        // TODO add your handling code here:
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                     this.setVisible(false);           
            Quit.main(info,matter);
    }//GEN-LAST:event_jMenu27MouseClicked

    private void jMenu28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu28MouseClicked
        // TODO add your handling code here:
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                      this.setVisible(false);          
              Emotional.main(info,matter);
    }//GEN-LAST:event_jMenu28MouseClicked

    private void jMenu29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu29MouseClicked
        // TODO add your handling code here:
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                         this.setVisible(false);       
                Financial.main(info,matter);
    }//GEN-LAST:event_jMenu29MouseClicked

    private void jMenu30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu30MouseClicked
        // TODO add your handling code here:
         
        
          boolean checkeda = a;
          boolean checkedb = b;
            boolean checkedc = c;
              boolean checkedd = d;
                boolean checkede = e;
                  boolean checkedf = f;
                    boolean checkedg = g;
                      boolean checkedh = h;
                        boolean checkedi = i;
                        
        
                         boolean matter[] = new boolean[9] ;
          matter[0] = checkeda ;
          matter[1] = checkedb ;
               matter[2] = checkedc;
                 matter[3] = checkedd;
                   matter[4] = checkede;
                     matter[5] = checkedf;
                       matter[6] = checkedg;
                         matter[7] = checkedh;
                           matter[8] = checkedi;
               
                 
                               String info[] = new String[3] ;
           info[0] = email ;
           info[1] = firstname;
               info[2] =lastname ;
                           
                  this.setVisible(false);
                A.main(info,matter);
    }//GEN-LAST:event_jMenu30MouseClicked
public static String email,firstname,lastname ;
   public static boolean a,b,c,d,e,f,g,h,i;
    
  /**
     * @param args the command line arguments
     */
    public static void main(String args[],boolean ar[]) {
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
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        email = args[0];
        firstname =  args[1];
        lastname =  args[2]  ;
           a = ar[0] ;
                b= ar[1] ;
                c= ar[2] ;
                        d= ar[3] ;
                        e= ar[4] ;
                                f= ar[5] ;
                                g= ar[6] ;
                                        h= ar[7] ;
                                        i= ar[8] ;
        
        
		        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
               new Reduce().setVisible(true);
                
            }
        });    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JPanel Back1;
    private javax.swing.JPanel Banner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtDate;
    private javax.swing.JButton welcome;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.jpg"))) ;
    }
}
