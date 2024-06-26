import java.util.Locale;
import java.util.Random;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception
    {

        // INSTANCIANDO UM OBJETO CONTA
         Conta conta = new Conta();

        // INSTANCIANDO UM SCANNER
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         // EXTRA.. INSTANCIANDO UM OBJETO RANDOM PARA GERAR VALOR ALEATÓRIO AO SALDO
        Random random = new Random();




        // MENU E RESOLVENDO REQUISITOS DO PROJETO
         System.out.println("Bem vindo ao GabGardenBank");
        System.out.println("Para iniciarmos, nos diga seu nome: ");

        conta.setNomeCliente(scanner.next());

         System.out.println("Por favor, digite o número da agência: ");

         conta.setAgencia(scanner.next());

        System.out.println("Agora, digite o número da conta: ");

        conta.setNumeroConta(scanner.nextInt());



        conta.setSaldo(random.nextDouble());


        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ conta.getAgencia() + ", conta " + conta.getNumeroConta() + ", e seu saldo R$" + conta.getSaldo() +
                " já está disponível para saque.");


         scanner.close();





    }
}
