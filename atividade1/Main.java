public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "31", "Salvador");
        Clientes cliente1 = new Clientes("Marta", "33", endereco1);

        System.out.println(cliente1.toString());

        // Versão 2.
        Clientes cliente2 = new Clientes("Jose", "36", endereco1);
        new Endereco("Rua B", "16", Vancouver);
            

    }

}
