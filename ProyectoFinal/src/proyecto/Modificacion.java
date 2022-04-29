package proyecto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Properties;
import javax.swing.JOptionPane;


public class Modificacion extends javax.swing.JFrame {
    
    public Modificacion() {
        initComponents();
        this.setExtendedState(6);
        mostrar_combo();
    }

    Registro_paciente rp = new Registro_paciente();
    
    File contenedor = new File(rp.ubicacion);
    File[] registros = contenedor.listFiles();
    
    private void mostrar_combo(){
        for(int i=0; i<registros.length; i++){
            combo.addItem(registros[i].getName().replace(".txt", ""));
        }
    }
    
    private void mostrar(){
               
        File url = new File(rp.ubicacion+txtRut.getText()+".txt");
           
           if(url.exists()){
               
            try{
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                mostrar.load(fis);
                txtNombre.setText(mostrar.getProperty("Nombre"));
                txtRut.setText(mostrar.getProperty("Rut"));
                txtDireccion.setText(mostrar.getProperty("Direccion"));
                txtNacimiento.setText(mostrar.getProperty("Fecha_de_nacimiento"));
                txtTelefono.setText(mostrar.getProperty("Telefono"));
                txtCorreo.setText(mostrar.getProperty("Correo_electronico"));
                txtFon.setText(mostrar.getProperty("Fonasa/isapre"));
                txtSexo.setText(mostrar.getProperty("Sexo"));
                txtPCR.setText(mostrar.getProperty("Fecha_PCR"));
                txtEN.setText(mostrar.getProperty("Enfermedades"));
                txtContacto.setText(mostrar.getProperty("Nombre_persona_de_contacto"));
                txtTel.setText(mostrar.getProperty("Telefono_persona_de_contacto"));
                txtNom.setText(mostrar.getProperty("Nombre_establecimiento"));
                txtDir.setText(mostrar.getProperty("Direccion_establecimiento"));
                txtDire.setText(mostrar.getProperty("Director_establecimiento"));
                txtSector.setText(mostrar.getProperty("Sector_establecimiento"));
                txtNo.setText(mostrar.getProperty("Nombre_residencia_sanitaria"));
                txtDi.setText(mostrar.getProperty("Direccion_residencia_sanitaria"));
                txtMed.setText(mostrar.getProperty("Medicamentos"));
                txtProc.setText(mostrar.getProperty("Procedimientos"));
                txtNomMed.setText(mostrar.getProperty("Nombre_medico"));
                txtRutMed.setText(mostrar.getProperty("Rut_medico"));
                txtEstado.setText(mostrar.getProperty("Estado"));
                
            }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Error "+e);
                }
            
            }
                
    }
    
    private void editar(){
        
        File url = new File(rp.ubicacion+txtRut.getText()+".txt");
        
            if(url.exists()){
               try{
                   
                    FileWriter permite_escrito = new FileWriter(rp.ubicacion+txtRut.getText()+".txt");
                    String name = "Nombre=";
                    String rut = "Rut=";
                    String direccion = "Direccion=";
                    String nacimiento = "Fecha_de_nacimiento=";
                    String telefono = "Telefono=";
                    String correo = "Correo_electronico=";
                    String fon = "Fonasa/isapre=";
                    String sexo = "Sexo=";
                    String pcr = "Fecha_PCR=";
                    String en = "Enfermedades=";
                    String peco = "Nombre_persona_de_contacto=";
                    String teco = "Telefono_persona_de_contacto=";
                    String noes = "Nombre_establecimiento=";
                    String dies = "Direccion_establecimiento=";
                    String dires = "Director_establecimiento=";
                    String sees = "Sector_establecimiento=";
                    String nore = "Nombre_residencia_sanitaria=";
                    String dire = "Direccion_residencia_sanitaria=";
                    String medi = "Medicamentos=";
                    String proce = "Procedimientos=";
                    String nomed = "Nombre_medico=";
                    String rumed = "Rut_medico=";
                    String est = "Estado=";
                
                    PrintWriter guardar = new PrintWriter(permite_escrito);
                    
                    guardar.println(name+txtNombre.getText());
                    guardar.println(rut+txtRut.getText());
                    guardar.println(direccion+txtDireccion.getText());
                    guardar.println(nacimiento+txtNacimiento.getText());
                    guardar.println(telefono+txtTelefono.getText());
                    guardar.println(correo+txtCorreo.getText());
                    guardar.println(fon+txtFon.getText());
                    guardar.println(sexo+txtSexo.getText());
                    guardar.println(pcr+txtPCR.getText());
                    guardar.println(en+txtEN.getText());
                    guardar.println(peco+txtContacto.getText());
                    guardar.println(teco+txtTel.getText());
                    guardar.println(noes+txtNom.getText());
                    guardar.println(dies+txtDir.getText());
                    guardar.println(dires+txtDire.getText());
                    guardar.println(sees+txtSector.getText());
                    guardar.println(nore+txtNo.getText());
                    guardar.println(dire+txtDi.getText());
                    guardar.println(medi+txtMed.getText());
                    guardar.println(proce+txtProc.getText());
                    guardar.println(nomed+txtNomMed.getText());
                    guardar.println(rumed+txtRutMed.getText());
                    guardar.println(est+txtEstado.getText());
                    
                    permite_escrito.close();
                    JOptionPane.showMessageDialog(rootPane, "Modificacion exitosa!");                                      
                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error "+e);
                }
               
            }
        
        
    }
    
    private void eliminar(){
        
       File url = new File(rp.ubicacion+txtRut.getText()+".txt");
       
       String btns[] = {"Eliminar", "Cancelar"};
              
           if(url.exists()){
               try{
                   FileInputStream cerrar = new FileInputStream(url);
                   cerrar.close();
                   System.gc();
                   
                   int seguro = JOptionPane.showOptionDialog(rootPane, "¿Esta seguro de eliminar el siguiente registro? "+txtRut.getText(),
                           "Eliminacion", 0, 0, null, btns, null);
                   
                   if(seguro == JOptionPane.YES_OPTION){
                       url.delete();
                       JOptionPane.showMessageDialog(rootPane, "Registro eliminado");
                       combo.removeItem(txtRut.getText());                      
                       
                   }
                   
                   if(seguro == JOptionPane.NO_OPTION){
                      JOptionPane.showMessageDialog(rootPane, "Se cancelo");
                   }
               }catch(Exception e){
                   JOptionPane.showMessageDialog(rootPane, "Error "+e);
               }
           }
       
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtFon = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtPCR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEN = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDire = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSector = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtDi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        eliminar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMed = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtProc = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNomMed = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtRutMed = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Coest = new javax.swing.JComboBox<>();
        comboFon = new javax.swing.JComboBox<>();
        comboSex = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre y apellido:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        jLabel2.setText("Rut:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 37, -1));

        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 59, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 280, -1));
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 330, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 330, -1));

        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 121, -1));

        jLabel6.setText("Numero de telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 121, -1));

        jLabel7.setText("Correo electronico:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, -1));

        jLabel8.setText("Fonasa/isapre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 89, -1));

        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 37, -1));

        jLabel10.setText("Fecha PCR:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 70, -1));
        getContentPane().add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 270, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 270, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 270, -1));

        txtFon.setEditable(false);
        getContentPane().add(txtFon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 140, -1));

        txtSexo.setEditable(false);
        getContentPane().add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 140, -1));
        getContentPane().add(txtPCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 270, -1));

        jLabel11.setText("Enfermedades cronicas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 160, -1));

        jLabel12.setText("y/o otras enfermedades");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 150, -1));

        txtEN.setColumns(20);
        txtEN.setRows(5);
        jScrollPane1.setViewportView(txtEN);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 261, -1));

        jLabel13.setText("Nombre y apellido:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 112, -1));

        jLabel14.setText("Numero de telefono:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 112, -1));
        getContentPane().add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 275, -1));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 275, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("...:::Persona de contacto:::...");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 230, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("...:::Establecimiento:::...");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 180, -1));

        jLabel17.setText("Nombre:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 55, -1));
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 270, -1));

        jLabel19.setText("Direccion:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 64, -1));
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 270, -1));

        jLabel20.setText("Director:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 58, -1));
        getContentPane().add(txtDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 270, -1));

        jLabel21.setText("Sector:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 43, -1));
        getContentPane().add(txtSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 270, -1));

        jLabel23.setText("\"Si no fue internado no llene esta parte del formulario\"");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 500, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("...:::Residencia sanitaria:::...");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 223, -1));

        jLabel25.setText("Nombre:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 59, -1));

        jLabel26.setText("\"Si el paciente no puede realizar cuarentena en su hogar porfavor llenar los siguientes campos\"");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 650, -1));

        jLabel27.setText("Direccion:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 59, -1));
        getContentPane().add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 280, -1));
        getContentPane().add(txtDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 280, -1));

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 600, -1, -1));

        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, 130, -1));

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 600, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("...:::Paciente:::...");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Bienvenido a modificacion de datos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Medicamentos y procedimientos medicos a suministrar para el paciente");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, -1, -1));

        txtMed.setColumns(20);
        txtMed.setRows(5);
        jScrollPane2.setViewportView(txtMed);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 180, 300, -1));

        jLabel28.setText("Medicamentos:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 90, -1));

        txtProc.setColumns(20);
        txtProc.setRows(5);
        jScrollPane3.setViewportView(txtProc);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, 300, -1));

        jLabel29.setText("Procedimientos:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 310, 90, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Medico que atendio al paciente");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 400, -1, -1));

        jLabel31.setText("Nombre y apellido:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 450, -1, -1));
        getContentPane().add(txtNomMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, 300, -1));

        jLabel32.setText("Rut:");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, -1, -1));
        getContentPane().add(txtRutMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 490, 300, -1));

        txtEstado.setEditable(false);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 180, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Estado:");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 80, 40));

        Coest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recuperado", "Fallecido" }));
        Coest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoestActionPerformed(evt);
            }
        });
        getContentPane().add(Coest, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 100, 30));

        comboFon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fonasa ", "Isapre" }));
        comboFon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFonActionPerformed(evt);
            }
        });
        getContentPane().add(comboFon, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 340, 90, -1));

        comboSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        comboSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexActionPerformed(evt);
            }
        });
        getContentPane().add(comboSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 90, -1));

        jLabel34.setText("\"Llenar solo si es necesario para el paciente durante su estadia en un establecimiento o residencia\"");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String copiar = (String) combo.getSelectedItem();
        txtRut.setText(copiar);
        mostrar();
    }//GEN-LAST:event_comboActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CoestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoestActionPerformed
        String estado="";
        estado=estado+Coest.getSelectedItem().toString();
        txtEstado.setText(estado);
    }//GEN-LAST:event_CoestActionPerformed

    private void comboFonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFonActionPerformed
        String fon="";
        fon=fon+comboFon.getSelectedItem().toString();
        txtFon.setText(fon);
    }//GEN-LAST:event_comboFonActionPerformed

    private void comboSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexActionPerformed
        String sex="";
        sex=sex+comboSex.getSelectedItem().toString();
        txtSexo.setText(sex);
    }//GEN-LAST:event_comboSexActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Coest;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> comboFon;
    private javax.swing.JComboBox<String> comboSex;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDi;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDire;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextArea txtEN;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFon;
    private javax.swing.JTextArea txtMed;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNomMed;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPCR;
    private javax.swing.JTextArea txtProc;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtRutMed;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
