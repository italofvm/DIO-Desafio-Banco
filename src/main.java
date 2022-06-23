public class main {
    public static void main(String[] args) {
        Cliente italo = new Cliente();
        italo.setNome("Italo");

        Conta cc = new ContaCorrente(italo);
        cc.depositar(200);

        Conta poupanca = new ContaPoupanca(italo);
        cc.transferir(150, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
