package revisaointerface;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Galo galo1 = new Galo();
        Pato pato1 = new Pato();
        
        System.out.println("Cachorro: " + cachorro1.emitirSom() + " " + cachorro1.comer());
        System.out.println("Galo: " + galo1.emitirSom() + " " + galo1.comer()); 
        System.out.println("Pato: " + pato1.emitirSom() + " " + pato1.comer());
    }

}
