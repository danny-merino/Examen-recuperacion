
package Vista;

import javax.swing.JFrame;
import javax.swing.JTextField;
import utilidades.utilidades;


public class RegistroPacientes {
    private JTextField txtCedula;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private utilidades utilidades;
    private JFrame frameRegistro_Pacientes;

    public RegistroPacientes(JTextField txtCedula, JTextField txtNombre, JTextField txtApellido, JTextField txtDireccion, JTextField txtCorreo, JTextField txtTelefono, utilidades utilidades, JFrame frameRegistro_Pacientes) {
        this.txtCedula = txtCedula;
        this.txtNombre = txtNombre;
        this.txtApellido = txtApellido;
        this.txtDireccion = txtDireccion;
        this.txtCorreo = txtCorreo;
        this.txtTelefono = txtTelefono;
        this.utilidades = utilidades;
        this.frameRegistro_Pacientes = frameRegistro_Pacientes;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public utilidades getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(utilidades utilidades) {
        this.utilidades = utilidades;
    }

    public JFrame getFrameRegistro_Pacientes() {
        return frameRegistro_Pacientes;
    }

    public void setFrameRegistro_Pacientes(JFrame frameRegistro_Pacientes) {
        this.frameRegistro_Pacientes = frameRegistro_Pacientes;
    }
    
      
}
