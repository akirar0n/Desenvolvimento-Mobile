/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationbanco;

import controle.ContaCorrente;

/**
 *
 * @author laboratorio
 */
public class JavaApplicationBanco {

    public static void main(String[] args) throws Exception {
        ContaCorrente conta1 = new ContaCorrente();
//        ContaCorrente conta2 = new ContaCorrente();
        conta1.depositar(1500);
      conta1.sacar(1000);
        System.out.println("Saldo:" + conta1.getSaldo());
//      Construir um método para transferir o valor 
//      de uma conta pra outra
    }
    
}
