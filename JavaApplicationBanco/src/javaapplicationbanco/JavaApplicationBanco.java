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
        ContaCorrente conta2 = new ContaCorrente();

        conta1.depositar(1500);
        conta2.depositar(500);

        System.out.println("Antigo saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Antigo saldo da conta 2: " + conta2.getSaldo());
        System.out.println("-------------------------------------------");

        conta1.transferir(conta2, 1000);

        System.out.println("Novo saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Novo saldo da conta 2: " + conta2.getSaldo());
    }
    
}