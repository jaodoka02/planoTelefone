
import java.util.Locale;
import java.util.Scanner;

public class planoTelefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);    



System.out.println("Temos 3 planos \n -Plano Basico -B-\n Com 100 minutos de ligação \n -Plano Médio  -M-\n Com o mesmo benificio do B mas com Whats app e insta grátis \n -Plano Turbo  -T-\n Com os mesmos benefícios do M mas também com 5GB de Youtube ");
System.out.println("\n\n Digite um dos planos apresentados anteriormente digitando suas respectivas letras que os acompanham ");
String plano = scanner.next();


    switch (plano) {
            case "B":
                System.out.println("Parabéns, selecionou o Plano Básico");
                break;
            case "M":
                System.out.println("Parabéns, selecionou o Plano Médio");
                break;
            case "T":
                System.out.println("Parabéns, selecionou o Plano Turbo");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida (B, M ou T).");
                break;

}
    }
}
