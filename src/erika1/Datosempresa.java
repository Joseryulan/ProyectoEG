/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erika1;

/**
 *
 * @author sena
 */
public class Datosempresa {
    public String nitempresa;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;
    
    public void setNitEmpresa(String NitEmpresaParametro){
        this.nitempresa=NitEmpresaParametro;
    }
    
    public String getNitEmpresa(){
    return this.nitempresa;
    
    }
 
     public void Nombre(String NombreParametro){
        this.nombre=NombreParametro;
    }
    
    public String getNombre(){
    return this.nombre;
    
    }
    
    
     public void Direccion(String DireccionParametro){
        this.direccion=DireccionParametro;
    }
    
    public String getDireccion(){
    return this.direccion;
    
    }
    
     public void Correo(String correoParametro){
        this.correo=correoParametro;
    }
    
    public String getCorreo(){
    return this.correo;
    
    }
    
     public void Telefono(String TelefonoParametro){
        this.telefono=TelefonoParametro;
    }
    
    public String getTelefono(){
    return this.telefono;
    
    }
    
    
 }
