/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Aldo
 */
public class Cliente {
    private String nroDNI;
    private String nombre;
    private String apellido;
    private int tipoCliente;
    
    public Cliente()
    {
        nroDNI="";
        nombre="Sin nombre";
        apellido="Sin apellido";
        tipoCliente=1;
        
                
    }
    public Cliente(String dni , String nom, String ape , int t)
    {
        nroDNI=dni;
        nombre=nom;
        apellido=ape;
        if (t!=1 && t!=2) 
            tipoCliente=1;
        tipoCliente=t;
    }

    public String getNroDNI() {
        return nroDNI;
    }

    public void setNroDNI(String nroDNI) {
        this.nroDNI = nroDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    public String toString()
    {
        String tipo;
        if (tipoCliente==1) 
            tipo="cliente común";
        else
            tipo="cliente preferencial";
             
                    
        
        return "Nro DNI: "+nroDNI+" Nombre:  "+nombre+", Apellido: "+apellido+", Tipo de Cliente: "+tipo;
        
    }
            
    
}
