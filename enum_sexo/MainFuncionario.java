package enum_sexo;

public class MainFuncionario {

    public static void main(String[] args) {
        Funcionario  funcionario1 = new Funcionario("João", Sexo.MASCULINO, Estado.BAHIA);

        System.out.println(funcionario1.toString());


}
   
}