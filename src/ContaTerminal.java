import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        String[] dados = capturarDados();

        System.out.println(
            String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,conta %s e seu saldo R$%s já estádisponível para saque",
                dados[2],
                dados[1],
                dados[0],
                dados[3]
                )
        );

    }

    public static String[] capturarDados() {
        String[] dados = new String[4];
        Scanner input = new Scanner(System.in);

        System.out.print("Digite Número da Conta: \n");
        String numeroConta = input.nextLine();
        dados[0] = numeroConta;

        System.out.print("Digite Número da Agência: \n");
        String numeroAgencia = input.nextLine();
        dados[1] = numeroAgencia;

        System.out.print("Digite Nome do Cliente: \n");
        String nomeCliente = input.nextLine();
        dados[2] = nomeCliente;
        
        System.out.print("Digite Saldo da Conta: \n");
        String saldoConta = input.nextLine();
        dados[3] = saldoConta;

        input.close();

        return dados;
    }
}