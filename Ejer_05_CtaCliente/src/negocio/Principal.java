package negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cl1, cl2, cl3, cl4, cl5;
        cl1= new Cliente("10649258","Perez","Juan",1);
        cl2= new Cliente("20649258","Cliente 2","Dos",2);
        cl3= new Cliente("30649258","Cliente 3","Tres",1);
        cl4= new Cliente("40649258","Cliente 4","Cuatro",2);
        cl5= new Cliente("50649258","Cliente 5","Cinco",2);


        Cuenta c1,c2,c3,c4,c5;
        c1 = new Cuenta(2,1250,cl5);
        c2 = new Cuenta(4,2000,cl4);
        c3 = new Cuenta(6,3600,cl3);
        c4 = new Cuenta(8,4500,cl2);
        c5 = new Cuenta(10,5250,cl1);
        
        System.out.println("Lista de Cuentas\n");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());
        
        c1.depositar(200);
        c1.depositar(300);
        c1.depositar(500);
        c1.extraer(50);
        c1.extraer(1034.5);
        System.out.println(c1.toString());
        
        c2.depositar(230);
        c2.depositar(150);
        c2.depositar(50);
        c2.extraer(150);
        c2.extraer(1000.5);
        
        
        c3.depositar(530);
        c3.depositar(250);
        c3.depositar(500);
        c3.extraer(850);
        c3.extraer(384);
        
        c4.depositar(830);
        c4.depositar(450);
        c4.extraer(800);
        c4.extraer(250);
        c4.extraer(348);
        
        c5.depositar(150);
        c5.depositar(850);
        c5.extraer(650);
        c5.extraer(450);
        c5.extraer(788);
        
        
        
        System.out.println("Lista de Cuentas Con saldos modificados\n");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());

    }
    
}
