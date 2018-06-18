
package trabalhoprog;


public class Conta {
    
    public int numero, cpf;
    public Agencia agencia;

    public Conta() {
    }
    
    public Conta(int numero, int cpf, Agencia agencia) {
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

    public Agencia getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setAgencia() {
        agencia.setEndereco(Input.readString("Digite o numero da agencia: ")); 
        agencia.setNumero(Input.readInt("Digite o numero da agencia: ")); 
    }
}
