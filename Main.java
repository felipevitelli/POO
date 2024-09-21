import br.com.felipe.polimorfismo.Atleta;
import br.com.felipe.polimorfismo.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoaNormal = new Pessoa("Alucard", 83, 205);
        pessoaNormal.resultadoIMC();

        Atleta atleta = new Atleta ("Simone Biles", 47, 142, "Ginastica Artistica");
        atleta.resultadoIMC();

    }
}