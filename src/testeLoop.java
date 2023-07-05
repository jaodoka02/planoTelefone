import java.util.Locale;
import java.util.Scanner;

public class testeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        boolean executar = true;

        while (executar) {
            System.out.println("Temos 3 planos:");
            System.out.println("- Plano Básico - B - Com 100 minutos de ligação");
            System.out.println("- Plano Médio - M - Com o mesmo benefício do B, mas com WhatsApp e Instagram grátis");
            System.out.println("- Plano Turbo - T - Com os mesmos benefícios do M, mas também com 5GB de YouTube");
            System.out.println("Selecione um dos planos apresentados anteriormente digitando suas respectivas letras que os acompanham");

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

            System.out.println("Deseja selecionar outro plano? (S/N)");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                executar = false;
            }
        }
    }
}