package exemploHeranca;

public class MainPC {
    public static void main(String[] args) {
        PC pc1 = new PC("Dell", "Inspiron");
        Processador processador1 = new Processador("Intel", "Core i5", "3.2 GHz");
        Memoria memoria1 = new Memoria("Kingston", "DDR4", "8 GB");

        System.out.println(pc1.toString());
        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());

    }
    

}


