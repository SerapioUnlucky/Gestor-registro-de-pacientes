
package proyecto;

import java.io.File;
import java.util.Formatter;
import javax.swing.JOptionPane;


public class Registro_paciente extends javax.swing.JFrame {
   
    public Registro_paciente() {
        initComponents();
        this.setExtendedState(6);
        
    }   
    
    String barra = File.separator; 
    String ubicacion = System.getProperty("user.dir")+barra+"Registros_pacientes"+barra;
    
    private void crear(){
        
        String archivo = txtRut.getText()+".txt";
        File crea_ubicacion = new File(ubicacion);
        File crea_archivo = new File(ubicacion+archivo);
                                 
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese nombre del paciente");
        }else if(txtRut.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese Rut del paciente");
        }else if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese Direccion del paciente");
        }else if(txtNacimiento.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese fecha de nacimiento del paciente");
        }else if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese numero de telefono del paciente");
        }else if(txtCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese correo electronico del paciente");
        }else if(txtFon.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese si el paciente pertenece a fonasa o isapre");
        }else if(txtSexo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese el sexo del paciente");
        }else if(txtPCR.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese fecha de PCR del paciente");
        }else if(txtContacto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese nombre de alguna persona de contacto del paciente");
        }else if(txtTel.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese numero de telefono de la persona de contacto del paciente");
        }else if(txtNomMed.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese nombre del medico que atendio al paciente");
        }else if(txtRutMed.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ingrese rut del medico que atendio al paciente");
        }else{
            
            try{
                if(crea_archivo.exists()){
                    JOptionPane.showMessageDialog(rootPane, "Un registro asociado a este rut ya existe");
                }else{
                    crea_ubicacion.mkdirs();
                    Formatter crea = new Formatter(ubicacion+archivo);
                    crea.format("%s\r\n%s\r\n%s\r\r%s\r\n%s\r\n%s\r\r%s\r\n%s\r\n%s\r\r%s\r\n%s\r\n%s\r\r%s\r\n%s\r\n%s\r\r%s\r\n%s\r\n%s\r\n%s\r\n%s\r\r%s\r\n%s\r\n%s",
                    "Nombre="+txtNombre.getText(),
                    "Rut="+txtRut.getText(),
                    "Direccion="+txtDireccion.getText(),
                    "Fecha_de_nacimiento="+txtNacimiento.getText(),
                    "Telefono="+txtTelefono.getText(),
                    "Correo_electronico="+txtCorreo.getText(),
                    "Fonasa/isapre= "+txtFon.getText(),
                    "Sexo="+txtSexo.getText(),
                    "Fecha_PCR="+txtPCR.getText(),
                    "Enfermedades="+txtEN.getText(),
                    "Nombre_persona_de_contacto="+txtContacto.getText(),
                    "Telefono_persona_de_contacto="+txtTel.getText(),
                    "Nombre_establecimiento="+txtNom.getText(),
                    "Direccion_establecimiento="+txtDir.getText(),
                    "Director_establecimiento="+txtDire.getText(),
                    "Sector_establecimiento="+txtSector.getText(),
                    "Nombre_residencia_sanitaria="+txtNo.getText(),
                    "Direccion_residencia_sanitaria="+txtDi.getText(),
                    "Medicamentos="+txtMed.getText(),
                    "Procedimientos="+txtProc.getText(),
                    "Nombre_medico="+txtNomMed.getText(),
                    "Rut_medico="+txtRutMed.getText(),
                    "Estado="+txtEstado.getText());                    
                    
                    crea.close();
                    JOptionPane.showMessageDialog(rootPane, "Registro exitoso!");
                    
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Hubo un error "+e);
                }
            
        }
               
            }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMed = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtProc = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNomMed = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtRutMed = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        comboFon = new javax.swing.JComboBox<>();
        comboSex = new javax.swing.JComboBox<>();
        comboEs = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 290, -1));

        jLabel1.setText("Nombre y apellido:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel2.setText("Rut:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 37, -1));
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 290, -1));

        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 290, -1));

        crear.setText("Registrar");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 750, 120, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Bienvenido al registro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 121, -1));

        jLabel6.setText("Numero de telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 121, -1));

        jLabel7.setText("Correo electronico:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, -1));

        jLabel8.setText("Fonasa/isapre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 89, -1));

        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 37, -1));

        jLabel10.setText("Fecha PCR:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 70, -1));
        getContentPane().add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 280, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 280, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 280, -1));

        txtFon.setEditable(false);
        getContentPane().add(txtFon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 140, -1));

        txtSexo.setEditable(false);
        getContentPane().add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 140, -1));
        getContentPane().add(txtPCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 280, -1));

        jLabel11.setText("Enfermedades cronicas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, -1));

        jLabel12.setText("y/o otras enfermedades");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 150, -1));

        txtEN.setColumns(20);
        txtEN.setRows(5);
        jScrollPane1.setViewportView(txtEN);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 261, 110));

        jLabel13.setText("Nombre y apellido:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 112, -1));

        jLabel14.setText("Numero de telefono:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 112, -1));
        getContentPane().add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 275, -1));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 275, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("...:::Persona de contacto:::...");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 230, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("...:::Establecimiento para internar:::...");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 310, -1));

        jLabel17.setText("Nombre:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 55, -1));
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 280, -1));

        jLabel19.setText("Direccion:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 64, -1));
        getContentPane().add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 280, -1));

        jLabel20.setText("Director:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 58, -1));
        getContentPane().add(txtDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 280, -1));

        jLabel21.setText("Sector:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 43, -1));
        getContentPane().add(txtSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 280, -1));

        jLabel23.setText("\"Si el paciente no fue internado no llene esta parte del formulario\"");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 420, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("...:::Residencia sanitaria:::...");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 223, -1));

        jLabel25.setText("Nombre:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 59, -1));

        jLabel26.setText("\"Si el paciente no puede realizar cuarentena en su hogar porfavor llenar los siguientes campos\"");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 550, -1));

        jLabel27.setText("Direccion:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 59, -1));
        getContentPane().add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 280, -1));
        getContentPane().add(txtDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 280, -1));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Medicamentos y procedimientos medicos a suministrar para el paciente");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));

        txtMed.setColumns(20);
        txtMed.setRows(5);
        jScrollPane2.setViewportView(txtMed);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 180, 300, -1));

        jLabel22.setText("Medicamentos:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 90, -1));

        txtProc.setColumns(20);
        txtProc.setRows(5);
        jScrollPane3.setViewportView(txtProc);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, 300, -1));

        jLabel28.setText("Procedimientos:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 100, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Medico que atendio al paciente");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 400, -1, -1));

        jLabel30.setText("Nombre y apellido:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 450, -1, -1));
        getContentPane().add(txtNomMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, 300, -1));

        jLabel31.setText("Rut:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, -1, -1));
        getContentPane().add(txtRutMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 490, 300, -1));

        txtEstado.setEditable(false);
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEstado.setText("Activo");
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 220, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel32.setText("Estado:");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 90, -1));

        comboFon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fonasa", "Isapre" }));
        comboFon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFonActionPerformed(evt);
            }
        });
        getContentPane().add(comboFon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 80, -1));

        comboSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        comboSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexActionPerformed(evt);
            }
        });
        getContentPane().add(comboSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 80, -1));

        comboEs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Cuarentena en su hogar", "Hospitalizado" }));
        comboEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEsActionPerformed(evt);
            }
        });
        getContentPane().add(comboEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 220, 30));

        jLabel33.setText("\"Llenar solo si es necesario para el paciente durante su estadia en un establecimiento o residencia\"");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        crear();
    }//GEN-LAST:event_crearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu M = new Menu();
        M.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void comboEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEsActionPerformed
        String estado="";
        estado=estado+comboEs.getSelectedItem().toString();
        txtEstado.setText(estado);
    }//GEN-LAST:event_comboEsActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboEs;
    private javax.swing.JComboBox<String> comboFon;
    private javax.swing.JComboBox<String> comboSex;
    private javax.swing.JButton crear;
    private javax.swing.JButton jButton1;
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
