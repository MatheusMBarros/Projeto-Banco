/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package udesc.projetobanco;

import java.util.ArrayList;
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
    List<ContaCorrente> contaC;
    List<ContaPoupanca> contaP;

    public Banco(String nome) {
        this.nome = nome;
        this.codigo = ++geradorCodigo;
        this.codigoConta = 0;
        this.contaC = new ArrayList<ContaCorrente>();
        this.contaP = new ArrayList<ContaPoupanca>();

    }

    public void addContaCorrente(ContaCorrente conta) {
        contaC.add(conta);
    }
     public void addContaPoupanca(ContaPoupanca conta) {
        contaP.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public ContaCorrente criarContaCorrente(String nomeCorrentista) {
        ContaCorrente contaCorrente = new ContaCorrente(this, nomeCorrentista);
        this.codigoConta += codigoConta;
        return null;
    }

    public ContaPoupanca criarContaPoupanca(String nomeCorrentista) {
        this.codigoConta += codigoConta;
        ContaPoupanca contaPoupanca = new ContaPoupanca(this, nomeCorrentista);
        return null;
    }

    public ContaCorrente getConta(int codigo) {
        return null;
    }

}
