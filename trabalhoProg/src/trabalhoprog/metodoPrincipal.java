
package trabalhoprog;


public class metodoPrincipal {
    
    public static void cadastraAgencia(Agencia vetAgencias[]){
        
        for (int i = 0; i < vetAgencias.length; i++) {
            
            vetAgencias[i] = new Agencia();
            vetAgencias[i].setEndereco(Input.readString("Digite o endereco da agencia: "));
            vetAgencias[i].setNumero(Input.readInt("Digite o numro da agencia: "));   
        }
    }

    public static void main(String[] args) {
        
       int numeroDeAgencias = Input.readInt("Informe o numero de agencias: ");
       int numeroDeContas = Input.readInt("Informe o numero de contas: ");
       int numeroDeClientes = Input.readInt("Informe o numero de clientes: ");
       
       Agencia agencias[] = new Agencia[numeroDeAgencias];
       
       cadastraAgencia(agencias);
    }   
}
