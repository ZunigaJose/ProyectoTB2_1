/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1_tb2_josezuniga31841432;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.ConnectionString;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;


/**
 *
 * @author josez
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public MongoClient mongoClient = null;
    public MongoDatabase database = null;
    MongoCollection<Alumno> clAlumno = null;
    public Alumno alumnoIngresado = null;
    public Principal() {
        initComponents();
        ConnectionString connString = new ConnectionString(System.getenv("MongoURI"));
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .codecRegistry(codecRegistry)
                .retryWrites(true)
                .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("TB2Proyecto");
        clAlumno = database.getCollection("Alumno", Alumno.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaRegistro = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registroNombre = new javax.swing.JTextField();
        registroLogin = new javax.swing.JTextField();
        registroPass = new javax.swing.JPasswordField();
        registroRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        principalIngresar = new javax.swing.JButton();
        princilalRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        principalPassword = new javax.swing.JPasswordField();
        principalLogin = new javax.swing.JTextField();

        jLabel2.setText("Nombre Completo:");

        jLabel3.setText("Login:");

        jLabel4.setText("Contraseña:");

        registroRegistrar.setText("Registrar");
        registroRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroRegistrarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registroNombre)
                    .addComponent(registroLogin)
                    .addComponent(registroPass, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(registroRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(registroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(registroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(registroPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registroRegistrar)
                    .addComponent(jButton1))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout pantallaRegistroLayout = new javax.swing.GroupLayout(pantallaRegistro.getContentPane());
        pantallaRegistro.getContentPane().setLayout(pantallaRegistroLayout);
        pantallaRegistroLayout.setHorizontalGroup(
            pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pantallaRegistroLayout.setVerticalGroup(
            pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalIngresar.setText("Ingresar");
        principalIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalIngresarActionPerformed(evt);
            }
        });

        princilalRegistro.setText("Registrarse");
        princilalRegistro.setName("principal.registro"); // NOI18N
        princilalRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                princilalRegistroActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel5.setText("Password");

        principalLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(principalLogin)
                            .addComponent(principalPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(principalIngresar)
                        .addGap(72, 72, 72)
                        .addComponent(princilalRegistro)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(principalIngresar)
                    .addComponent(princilalRegistro))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void princilalRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_princilalRegistroActionPerformed
        pantallaRegistro.pack();
        this.setVisible(false);
        pantallaRegistro.setModal(true);
        pantallaRegistro.setVisible(true);
    }//GEN-LAST:event_princilalRegistroActionPerformed

    private void registroRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroRegistrarActionPerformed
        String nombre, pass, login;
        int id = (int) clAlumno.countDocuments() + 1;
        nombre = registroNombre.getText();
        pass = registroPass.getText();
        login = registroLogin.getText();
        Alumno alumno = new Alumno(nombre, login, pass, id);
        try {
            clAlumno.insertOne(alumno);
        } catch (com.mongodb.MongoWriteException we) {
            String errormsg;
            if (we.getCode() == 11000) {
                errormsg = "El Login ingresado ya existe favor ingrese uno nuevo";
            } else {
                registroNombre.setText("");
                registroPass.setText("");
                errormsg = "Ocurrio un error al intentar ingresar el usuario, favor intente nuevamente";
            }
            registroLogin.setText("");
            JOptionPane.showMessageDialog(pantallaRegistro, errormsg, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registroRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
        databases.forEach(db -> System.out.println(db.toJson()));
        List<Alumno> prueba = clAlumno.find().into(new ArrayList<>());
        prueba.forEach(al -> System.out.println(al));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void principalIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalIngresarActionPerformed
        String pass = null;
        try {
            pass = getUserPassword(principalLogin.getText());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(pantallaRegistro, "Login no encontrado. Favor vuelva a intentar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            principalLogin.setText("");
            principalPassword.setText("");
        } finally {

            if (pass != null) {
                if ((sha(principalPassword.getText())).equals(pass)) {
                    //loginexitoso
                } else {
                    JOptionPane.showMessageDialog(pantallaRegistro, "Contraseña Incorrecta, Favor Vuelva a intentar.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    principalPassword.setText("");
                }
            }
        }
    }//GEN-LAST:event_principalIngresarActionPerformed

    private void principalLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_principalLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDialog pantallaRegistro;
    private javax.swing.JButton princilalRegistro;
    private javax.swing.JButton principalIngresar;
    private javax.swing.JTextField principalLogin;
    private javax.swing.JPasswordField principalPassword;
    private javax.swing.JTextField registroLogin;
    private javax.swing.JTextField registroNombre;
    private javax.swing.JPasswordField registroPass;
    private javax.swing.JButton registroRegistrar;
    // End of variables declaration//GEN-END:variables

    byte[] generarllave() {
        byte[] llave = new byte[96];
        new SecureRandom().nextBytes(llave);
        return llave;
    }
    
    void guardarLlave(String file, byte[] llave) {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(llave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void leerLlave(String file, byte[] llave) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(llave, 0, 96);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String getUserPassword(String user) throws NullPointerException {
        return clAlumno.find(eq("login", user)).first().getPass();
    }
    
    String sha(String pass){
        final MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA3-256");
            final byte[] hashbytes = digest.digest(
                pass.getBytes(StandardCharsets.UTF_8));
            String sha3Hex;
            sha3Hex = bytesToHex(hashbytes);
            return sha3Hex;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
