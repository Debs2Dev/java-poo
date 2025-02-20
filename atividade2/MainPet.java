package atividade2;

//import atividade2.Cliente;
//import atividade2.Pet;

public class MainPet {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Skill", "10", "pastor alemão");     
        Cliente cliente1 = new Cliente("Vinkin", "56", pet1);
        
        System.out.println(cliente1.toString());

       // Versão 2.
       Cliente cliente2 = new Cliente("Java", "39", new
       Pet("Java", "39", "vira-lata"));
       new Pet("new", "22", "labrador");
       
    }

}
