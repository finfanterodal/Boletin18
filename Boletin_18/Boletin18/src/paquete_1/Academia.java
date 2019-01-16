/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_1;

import javax.swing.JOptionPane;
import paquete_2.Persoal;

/**
 *
 * @author finfanterodal
 */
public class Academia {

    //Atributos
    private static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Persoal alum;

    //Constructores
    public Academia() {
        numReferencia=numReferencia+1;
        alum=new Persoal();
    }
    //Métodos

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        Academia.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota."));
            if (nota < 0 || nota > 10) {
                System.out.println("La nota no es correcta.");
            }
        } while (nota < 0 || nota > 10);
        this.nota = nota;
    }



    public void setAlum(String correo,String telefono) {
        alum.setCorreo(correo);
        alum.setTelefono(telefono);
    }
//Visualización

    @Override
    public String toString() {
        return "numReferencia=" + numReferencia + ", nome=" + nome + ", nota=" + nota + ", alum=" + alum;
    }

}
