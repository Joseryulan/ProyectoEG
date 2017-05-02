/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author sena
 */
public class Egresado {
    private String idEgresado;
    public void setIdEgresado(String idEgresadoP){
        this.idEgresado= idEgresadoP;
                   
    }
    public String getIdEgresado(){
        return idEgresado;
    }
    public void solicitar(){
        System.out.println("solicitar_documentos");
    }
}
