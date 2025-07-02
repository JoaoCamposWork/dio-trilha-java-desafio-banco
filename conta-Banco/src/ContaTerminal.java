import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: CONHECER E IMPORTAR A CLASSE SCANNER 

        //EXIBIR AS MENSAGENS PARA O NOSSO USUÁRIO 
        
        //OBETR PELA SCANNER OS VALORES DIGITADOS NO TERMINAL 

        //EXIBIR A MENSAGEM CONTA CRIADA.

        Scanner scanner = new Scanner(System.in);

        // SOLICITAÇÃO DO NUMERO DA AGENCIA DO USUARIO...
        System.out.print("Por favor, digite o número da Agência: ");
           int numeroAgencia = scanner.nextInt();
           scanner.nextLine();

        // SOLICITAÇÃO DO NUMERO DA CONTA DO USUARIO...
        System.out.print("Por favor, digite o número da Conta: ");
           int numeroConta = scanner.nextInt();
           scanner.nextLine(); 

        // SOLICITAÇÃO DO NOME DO USUARIO...
        System.out.print("Por favor, digite o nome do Cliente: ");
           String nomeCliente = scanner.nextLine();

        // SOLICITAÇÃO DO SALDO DA CONTA DO USUARIO...
        System.out.print("Por favor, digite o saldo da Conta: ");
           double saldo = scanner.nextDouble();
        
        // EXIBIR A MENSAGEM FINAL DO USUARIO
        String mensagemFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque." + " OBRIGADO !";
        System.out.println(mensagemFinal);

        String saidaNova = "muito obrigado por ser nosso cliente " + nomeCliente + " nos ficamos sastifeitos em ter o senhor como cliente ";
        System.out.println (saidaNova);

        scanner.close(); 
    }
}
