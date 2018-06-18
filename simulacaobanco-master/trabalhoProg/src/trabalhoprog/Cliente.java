
package trabalhoprog;


public class Cliente {
    
    public String nome;
    public int cpf, numeroTelefone, cpfIndicacao;

    public Cliente() {
    }
    
    public Cliente(String nome, int cpf, int numeroTelefone, int cpfIndicacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.cpfIndicacao = cpfIndicacao;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public int getCpfIndicacao() {
        return cpfIndicacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void setCpfIndicacao(int cpfIndicacao) {
        this.cpfIndicacao = cpfIndicacao;
    }
}
