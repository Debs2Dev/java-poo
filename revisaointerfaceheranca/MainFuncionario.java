package revisaointerfaceheranca;

public class MainFuncionario {
    
    public static void main(String[] args) {
        Funcionario diretor = new Diretor("João", "01/01/1990", Sexo.MASCULINO, Setor.RECURSOS_HUMANOS, 10000);
        Motoboy motoboy = new Motoboy("Maria", "01/01/1990", Sexo.FEMININO, Setor.FINANCEIRO, 1000, "123456");

        
        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());

        System.out.println(diretor.contratar(motoboy));

        diretor.admitir(motoboy);


    }
}
