
package trabalhoprog;


public class metodoPrincipal {
    
    public static void cadastraAgencia(Agencia vetAgencias[]){
        
        for (int i = 0; i < vetAgencias.length; i++) {
            
            vetAgencias[i] = new Agencia();
            vetAgencias[i].setEndereco(Input.readString("Digite o endereco da agencia: "));
            vetAgencias[i].setNumero(Input.readInt("Digite o numero da agencia: "));   
        }
    }
    
    public static void cadastraCliente(Cliente vetCliente[]){
        
         for (int i = 0; i < vetCliente.length; i++) {
            
            vetCliente[i] = new Cliente();
            vetCliente[i].setNome(Input.readString("Digite o nome do cliente: "));
            vetCliente[i].setCpf(Input.readInt("Digite o cpf do cliente: "));
            vetCliente[i].setNumeroTelefone(Input.readInt("Digite o numero de telefone do cliente: "));   
            vetCliente[i].setCpfIndicacao(Input.readInt("Digite o cpf do cliente que fez a indicacao: "));         
        }       
    }
    
    public static void cadastraConta(Conta vetConta[]){
        
         for (int i = 0; i < vetConta.length; i++) {
            
            vetConta[i] = new Conta();
            vetConta[i].setCpf(Input.readInt("Digite o cpf do cliente: "));
            vetConta[i].setNumero(Input.readInt("Digite o numero da agencia: "));
            vetConta[i].setAgencia();   

        }       
    }
    public static void main(String[] args) {
        
       int numeroDeAgencias = Input.readInt("Informe o numero de agencias: ");
       int numeroDeContas = Input.readInt("Informe o numero de contas: ");
       int numeroDeClientes = Input.readInt("Informe o numero de clientes: ");
       
       Agencia agencias[] = new Agencia[numeroDeAgencias];
       Cliente clientes[] = new Cliente[numeroDeClientes];
       Conta contas[] = new Conta[numeroDeContas];
               
       cadastraAgencia(agencias);
       cadastraCliente(clientes);
       cadastraConta(contas);
       
       
    }   
}
