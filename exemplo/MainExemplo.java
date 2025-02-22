package exemplo;

public class MainExemplo {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Marta", 31, "01/02/2026", "PIX");
        Funcionario funcionario1 = new Funcionario("João", 25, "1234", "Analista", 5000.0);

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());
    }

}


