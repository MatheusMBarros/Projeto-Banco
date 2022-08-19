/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udesc.projetobanco;

/**
 *
 * @author mathe
 */
public class ContaCorrente {
    private Banco banco;
    private String nomeCorrentista;
    protected float saldo;

    public ContaCorrente(Banco banco, String nomeCorrentista) {
        this.banco = banco;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0f;
    }
    
    
    public void deposita(float valor){
        this.saldo += valor;
        //receeb o saldo e adc o valor
       
    }
    public void saque(float valor){
        this.saldo-=valor;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }
    
    
    
}
