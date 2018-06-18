
package trabalhoprog;


public class Conta {
    
    public int numero, cpf;
    public int agencia;

    public Conta() {
    }
    
    public Conta(int numero, int cpf, int agencia) {
        this.numero = numero;
        this.cpf = cpf;
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getCpf() {
        return cpf;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }    
}
