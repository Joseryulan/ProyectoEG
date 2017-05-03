/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador.pkg1;

/**
 *
 * @author sena
 */
public class Administrador {
    private String Nombre;
            private String Apellido;
                    private String Direccion;
                            private String Telefono;
 public void setNombre (String  NombreP)
    { 
        this.Nombre = NombreP;                    
}
  public void setApellido (String ApellidoP)
    { 
        this.Apellido = ApellidoP;
}
   public void setDireccion (String DireccionP)
    { 
        this.Direccion = DireccionP;
}
    public void setTelefono (String TelefonoP)
    { 
        this.Telefono = TelefonoP;
}
    public void Administrar()
{       
        String Administrar ="esta caminando";
 System.out.print (Administrar );
}
}
