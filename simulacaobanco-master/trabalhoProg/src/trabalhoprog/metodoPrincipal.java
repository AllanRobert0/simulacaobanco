
package trabalhoprog;


public class metodoPrincipal {
    
    public static int ReadINT(String Msg){
        try{
            System.out.print(Msg);
            return(Input.readInt());
        }catch(Exception e){
            System.out.println(" ! Opcao Invalida !");
            return ReadINT(Msg);
        }
    }
    
    public static String ReadSTRING(String Msg){
        try{
            System.out.print(Msg);
            return(Input.readString());
        }catch(Exception e){
            System.out.println(" ! Opcao Invalida !");
            return ReadSTRING(Msg);
        }
    }
    
    public static void cadastraAgencia(Agencia vetAgencias[]){
        
        for (int i = 0; i < vetAgencias.length; i++) {
            
            vetAgencias[i] = new Agencia();
            vetAgencias[i].setEndereco(ReadSTRING("Digite o endereco da agencia: "));
            vetAgencias[i].setNumero(ReadINT("Digite o numero da agencia: "));   
        }
    }
    
    public static void cadastraCliente(Cliente vetCliente[]){
        
         for (int i = 0; i < vetCliente.length; i++) {
            
            vetCliente[i] = new Cliente();
            vetCliente[i].setNome(ReadSTRING("Digite o nome do cliente: "));
            vetCliente[i].setCpf(ReadSTRING("Digite o cpf do cliente: "));
            vetCliente[i].setNumeroTelefone(ReadINT("Digite o numero de telefone do cliente: "));   
            vetCliente[i].setCpfIndicacao(ReadINT("Digite o cpf do cliente que fez a indicacao: "));         
        }       
    }
    
    public static void cadastraConta(Conta vetConta[]){
        
         for (int i = 0; i < vetConta.length; i++) {
            
            vetConta[i] = new Conta();
            vetConta[i].setCpf(ReadSTRING("Digite o cpf do cliente: "));
            vetConta[i].setNumero(ReadINT("Digite o numero da Conta: "));
            vetConta[i].setAgencia(ReadINT("Digite o numero da agencia: "));   

        }       
    }
    
    public static void main(String[] args) {
        
       int numeroDeAgencias = ReadINT("Informe o numero de agencias: ");
       int numeroDeContas = ReadINT("Informe o numero de contas: ");
       int numeroDeClientes = ReadINT("Informe o numero de clientes: ");
       
       Agencia agencias[] = new Agencia[numeroDeAgencias];
       Cliente clientes[] = new Cliente[numeroDeClientes];
       Conta contas[] = new Conta[numeroDeContas];
               
       cadastraAgencia(agencias);
       cadastraCliente(clientes);
       cadastraConta(contas);
       
       
    }   
}
