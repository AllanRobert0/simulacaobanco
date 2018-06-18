
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
            vetConta[i].setAgencia(Input.readInt("Digite o numero da agencia: "));   
        }       
    }
    
    public static void listaContaAgencia(Conta vetConta[], Cliente vetCliente[]){
        
        int pesquisaAgencia = Input.readInt("\nDigite o numero da agencia que deseja buscar:");
        int contaEncontrada;
        
        for (int i = 0; i < vetConta.length; i++) {
            
            if (vetConta[i].getAgencia() == pesquisaAgencia) {
                
                contaEncontrada = vetCliente[i].getCpf();
                
                System.out.println("Nome:"+vetCliente[comparaCpf(contaEncontrada, vetCliente)].getNome());
                
                System.out.println("Numero da conta: "+vetConta[i].getNumero());
            }
        }
    }
    
    public static int comparaCpf(int numeroCpf, Cliente vetCliente[]){
        
        
        
        for (int i = 0; i < vetCliente.length; i++) {
            
            if (numeroCpf == vetCliente[i].getCpf()) {
                
                return i;
            }
        }
        
        return 404;
    }
    
    public static void listaContaCliente(Conta vetConta[]){
        
        int buscaCpf = Input.readInt("Informe o Cpf do cliente: ");
        
        for (int i = 0; i < vetConta.length; i++) {
            
            if (buscaCpf == vetConta[i].getCpf()) {
                
                System.out.println("Numero da agencia: "+vetConta[i].getAgencia());
                System.out.println("Numero da conta: "+vetConta[i].getNumero());
            }
        }
    }
    
    public static void listaClienteAgencia(Conta vetAgencia[], Cliente vetCliente[], Conta vetConta[]){
        
        int buscaAgencia = Input.readInt("Informe o numero da agencia: ");
        
        for (int i = 0; i < vetAgencia.length; i++) {
            
            if (buscaAgencia == vetConta[i].getAgencia()) {
                
                System.out.println("Nome: "+vetCliente[comparaCpf(vetConta[i].getCpf(), vetCliente)].getNome());
                System.out.println("Telefone: "+vetCliente[comparaCpf(vetConta[i].getCpf(), vetCliente)].getNumeroTelefone());                
            }
        }
    }
    
    public static void main(String[] args) {
        
       int numeroDeAgencias = Input.readInt("Informe o numero de agencias: ");
       int numeroDeContas = Input.readInt("Informe o numero de contas: ");
       int numeroDeClientes = Input.readInt("Informe o numero de clientes: ");
       
       Agencia agencias[] = new Agencia[numeroDeAgencias];
       Cliente clientes[] = new Cliente[numeroDeClientes];
       Conta contas[] = new Conta[numeroDeContas];
                      
       int op = Input.readInt("\nMENU: \n1 - Cadastrar Agencia. \n2 - Cadastrar cliente. \n3 - Cadastrar conta. \n4 - Listar conta por agencia. \n5 -  Listar de contas por cliente. \n6 - Listar de clientes por agência. \n7 - Sair. \n");
        
       while (op != 7) {            
            
           switch(op){
               case 1:
                  cadastraAgencia(agencias);
               break;
                
               case 2:
                   cadastraCliente(clientes);
               break;
                
               case 3:
                   cadastraConta(contas);
               break;
                
               case 4:
                   listaContaAgencia(contas,clientes);
               break;
                
               case 5:
                   listaContaCliente(contas);
               break;
                
               case 6:
                   listaClienteAgencia(contas, clientes, contas);
               break;
                
               case 7:
               break;
            }
           
            op = Input.readInt("\nMENU: \n1 - Cadastrar Agencia. \n2 - Cadastrar cliente. \n3 - Cadastrar conta. \n4 - Listar conta por agencia. \n5 -  Listar de contas por cliente. \n6 - Listar de clientes por agência. \n7 - Sair. \n");
        }
    }   
}
