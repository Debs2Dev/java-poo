package Dispositivo;

public class MainProduto {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel", "Ryzen", 3.5);
        PlacaMae placaMae1 = new PlacaMae("AMD", "XVM", "AAA");

        System.out.println(processador1.toString());
        System.out.println(placaMae1.toString());


    }

}
