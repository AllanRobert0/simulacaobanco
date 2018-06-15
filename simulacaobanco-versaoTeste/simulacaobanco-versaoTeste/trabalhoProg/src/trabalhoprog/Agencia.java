
package trabalhoprog;


public class Agencia {
    
    public String endereco;
    
    public int numero;

    public Agencia() {
    }
    
    public Agencia(String endereco, int numero) {
        this.endereco = endereco;
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
