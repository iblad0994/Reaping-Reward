
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Index.java
 *
 * Created on Oct 19, 2014, 1:34:12 PM
 */
/**
 *
 * @author olacoy
 */
public class Index extends javax.swing.JFrame {
   static int interval;
 static Timer timer;
    private String  TiMerLimit,ipstring,PcMode ;
    public static String Session,SplashMessage,AboutSplashMessage,IPCheck;
    private int  counter ;
     public static Date date = new Date();
//remember this work perfectly in window8 but not well enough in window xp
    //  public static int KillProcessInt = 0 ;
 Connection conn = null ;
 ResultSet rs = null;
PreparedStatement pst = null ;

    /** Creates new form Index */
    public Index() {
        //remove the title i.e max,min and close
        
        this.setUndecorated(true);
    
        initComponents();
     
  //disable all close event
 this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       Toolkit tk = Toolkit.getDefaultToolkit();  
int xSize = 1200 ;  
int ySize = 600 ;  
this.setSize(xSize,ySize); 
    this.setResizable(false);
final Toolkit toolkit = Toolkit.getDefaultToolkit();
    final Dimension screenSize = toolkit.getScreenSize();
    final int x = (screenSize.width - this.getWidth()) / 2;
    final int y = (screenSize.height - this.getHeight()) / 2;
    this.setLocation(x, y);
         this.getContentPane().setBackground(Color.white); 
        
  }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banner = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        iplabel = new javax.swing.JLabel();
        errorbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        l = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FAKOB");
        setBackground(new java.awt.Color(102, 0, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Banner.setBackground(new java.awt.Color(255, 255, 255));
        Banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("LOGIN");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);

        Banner.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 240, 30));

        iplabel.setForeground(new java.awt.Color(255, 255, 255));
        Banner.add(iplabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 290, 50));

        errorbtn.setBackground(new java.awt.Color(51, 0, 102));
        errorbtn.setForeground(new java.awt.Color(255, 255, 255));
        errorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorbtnActionPerformed(evt);
            }
        });
        Banner.add(errorbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image4.png"))); // NOI18N
        Banner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image5.png"))); // NOI18N
        Banner.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 220, 180));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("EMPLOYEE NO:");
        Banner.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("FIRST NAME:");
        Banner.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("  LAST NAME:");
        Banner.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 120, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image20.png"))); // NOI18N
        Banner.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, -1, -1));

        e.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Banner.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 380, 50));

        f.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Banner.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 380, 50));

        l.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Banner.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 380, 50));

        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1270, 930));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REAPING REWARD");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
// TODO add your handling code here:
    
}//GEN-LAST:event_jLabel13MouseClicked

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
    errorbtn.setVisible(false);
     conn = mysqlconnect.ConnectDb();
     InetAddress ip;
	  try {
 
		ip = InetAddress.getLocalHost();
                iplabel.setText("Current IP address : " + ip.getHostAddress());
                ipstring = ip.getHostAddress() ;
	  } catch (UnknownHostException e) {
 
		e.printStackTrace();
 
	  }
      
          
          
           
}//GEN-LAST:event_formWindowOpened

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
// TODO add your handling code here:
    
}//GEN-LAST:event_formKeyPressed

private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
// TODO add your handling code here:
       errorbtn.setVisible(false);

       conn = mysqlconnect.ConnectDb();
       String sql = " Select * from user where personnelno= ? and firstname = ? and lastname =? " ;
       try{
           String info[] = new String[3] ;
           info[0] = e.getText().toString() ;
           info[1] = f.getText().toString() ;
               info[2] = l.getText().toString() ;
           pst = conn.prepareStatement (sql) ;
           pst.setString(1,e.getText().toString()  ) ;
           pst.setString(2,f.getText().toString() ) ;
            pst.setString(3,l.getText().toString() ) ;
           rs = pst.executeQuery() ;
           if (rs.next()){
               //JOptionPane.showMessageDialog(null, "You have successfully login,Please click ok to continue");
               /* QueryJFrame s = new QueryJFrame() ;
               s.setVisible(true) ;
               */
               
               
               MenuJFrame.main(info);
               
               this.setVisible(false);
               conn.close();
           } else {
               
               errorbtn.setText("Invalid UserName or Password");
               errorbtn.setVisible(true);
           }
       }
       catch (Exception e){
           conn = mysqlconnect.ConnectDb() ;
           JOptionPane.showMessageDialog(null,e) ;
           
       }

}//GEN-LAST:event_jPanel1MouseClicked

    private void errorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorbtnActionPerformed
      

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
          new Index().setVisible(true);
                
                                
            }
            
        });
    
  
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JTextField e;
    private javax.swing.JButton errorbtn;
    private javax.swing.JTextField f;
    private javax.swing.JLabel iplabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField l;
    // End of variables declaration//GEN-END:variables
 private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.jpg"))) ;
    }

     
}
