/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.projetobanco;

/**
 *
 * @author Matheus
 */
public class Main {
   
    public static void main(String[] args) {
        Banco itau = new Banco ("Itau");
        System.out.println(itau.getCodigo());
        System.out.println(itau.getNome());
        ContaCorrente maria = itau.criarContaCorrente("Maria");
        System.out.println(maria);
        ContaCorrente b = itau.getConta(1);
        b = itau.getConta(2);
     
    }
    
}
