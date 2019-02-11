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
public class Cuenta {
    private int nroCta;
    private double saldo;
    private Cliente cliente;
    private static int num=2;
    
    public Cuenta()
    {
        nroCta=num;
        num=num+2;
        saldo=0d;
        cliente=new Cliente();
        
    }
    
    public Cuenta(int n, double s, Cliente c)
    {
        nroCta=num;
        num=num+2;
        saldo=s;
        cliente=c;
        
    }

    public int getNroCta() {
        return nroCta;
    }

    public void setNroCta(int nroCta) {
        this.nroCta = nroCta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public boolean depositar(double d)
    {
        boolean aux;
        aux=false;
        if (d>=0) {
            saldo=saldo+d;
            aux=true;
            if (cliente.getTipoCliente()==2) {
                saldo=saldo*1.1;
            }
                    
        }
        return aux;
                
    }
    public boolean extraer(double e)
    {
        boolean aux;
        aux=false;
        if (cliente.getTipoCliente()==1) 
            e=e*1.05;
        if (saldo>=e) {
                saldo=saldo-e;
                aux = true;    
            
        }
        return aux;
    }
    
    public String toString()
    {
        return "\nCuenta Nro: "+nroCta+"  Saldo: $"+saldo+"\nCliente\n"+cliente;
    }
    
    
    
    
    
}
