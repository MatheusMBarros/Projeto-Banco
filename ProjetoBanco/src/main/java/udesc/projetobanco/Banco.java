/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package udesc.projetobanco;

import java.util.List;

/**
 *
 * @author Matheus Barros
 */
public class Banco {

    private String nome;
    private int codigo;

    private static int geradorCodigo = 0;
    private int codigoConta;
    List<ContaCorrente> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.codigo = ++geradorCodigo;
        this.codigoConta = 0;
              
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public ContaCorrente criarContaCorrente(String nomeCorrentista){
        ContaCorrente contaCorrente = new ContaCorrente(this,nomeCorrentista);
                
        
        return null;
    }

    public ContaPoupanca criarContaPoupanca() {
        return null;
    }

    public ContaCorrente getConta(int codigo) {
        return null;
    }

}
