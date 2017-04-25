/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author sena
 */
public class Datospersonales {
    
    
    public String tipoCargo;
    public String nombreCargo;
    public String area;
    
    public void setTipoCargo (String tipoCargoParametro){
    this.tipoCargo=tipoCargoParametro;
    }
    public String getTipoCargo(){
    return this.tipoCargo;
    }
    public void setNombreCargo (String nombreCargoParametro){
        this.nombreCargo=nombreCargoParametro;
    }   
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public void setArea ( String areaParametro){
        this.area=areaParametro;
    }
    public String getId(){
        return this.area;
    }
}
