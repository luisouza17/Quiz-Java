package telas;

import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 396301368
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form VirtualQuiz
     */
    public Splash() {
        initComponents();
        new Thread(){
            public void run(){
                for (int i=0;i<=101;i++){
                    try{
                        sleep(60);
                        jProgressBar1.setValue(i);
                        
                        if(jProgressBar1.getValue()<=30){
                            info.setText("Iniciando o quiz ...");   
                        }else
                            if (jProgressBar1.getValue()<=60){
                                info.setText("Abrindo e carregando o banco de dados...");    
                            }else
                                if(jProgressBar1.getValue()<=90){
                                info.setText("Definindo questões...");
                                }else{
                                    info.setText("Abertura do quiz concluída...");
                                }
                        
                    }catch(InterruptedException ex){
                    }
                }
                question1 ig = new question1 ();
                ig.setVisible(true);
                dispose();
            }
         }.start();
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
        jProgressBar1 = new javax.swing.JProgressBar();
        info = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Programmation Quiz");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 90, 250, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 420, 70, 30);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(190, 380, 430, 30);

        info.setBackground(new java.awt.Color(255, 255, 255));
        info.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(info);
        info.setBounds(260, 420, 410, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg1.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-200, 10, 1010, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
