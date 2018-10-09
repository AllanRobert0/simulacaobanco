
package trabalhoprog;


public class Conta {
    
    public int NumeroAgencia;
    public String cpf;
    public int agencia;

    public Conta() {
    }
    
    public Conta(int numero, String cpf, int agencia) {
        this.NumeroAgencia = numero;
        this.cpf = cpf;
        this.agencia = agencia;
    }

    public int getNumero() {
        return NumeroAgencia;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.NumeroAgencia = numero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAgencia(int Numero) {        
        this.setNumero(NumeroAgencia);
    }
}
