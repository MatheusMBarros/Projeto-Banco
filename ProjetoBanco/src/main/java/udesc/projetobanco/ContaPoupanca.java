/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.projetobanco;

/**
 *
 * @author mathe
 */
public class ContaPoupanca extends ContaCorrente{

    public ContaPoupanca(Banco banco, String nomeCorrentista) {
        super(banco, nomeCorrentista);
    }
    
    @Override
    public void saque (float valor){
        if(valor - saldo < 0.0){
            System.out.println("Não foi possível realiazar o saque");
        }else{
            super.saque(valor);
        }
    }
    
    
    
}
