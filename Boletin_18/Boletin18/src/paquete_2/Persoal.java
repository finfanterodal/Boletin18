/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_2;

/**
 *
 * @author finfanterodal
 */
public class Persoal {
    //Atributos
    private String telefono;
    private String correo;
    //Constructor
        public Persoal() {
    }
    //Metodos

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

//Visualizar

    @Override
    public String toString() {
        return "Persoal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
