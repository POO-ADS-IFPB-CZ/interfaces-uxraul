public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(123, "João Silva");

        contaPoupanca.depositar(1000.00);
        System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());

        contaPoupanca.reajustar(0.05);
        System.out.println("Saldo após reajuste de 5%: " + contaPoupanca.getSaldo());
    }
}
