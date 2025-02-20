import java.util.Scanner;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Geração de um ID único para o computador
        String idComputador = UUID.randomUUID().toString();

        // Solicitar nomes dos modelos
        System.out.print("Digite o modelo da placa mãe: ");
        String placaMae = scanner.nextLine();

        System.out.print("Digite o modelo da fonte: ");
        String fonte = scanner.nextLine();

        System.out.print("Digite o modelo do processador: ");
        String processador = scanner.nextLine();

        System.out.print("Digite o modelo do gabinete: ");
        String gabinete = scanner.nextLine();

        System.out.print("Digite o modelo do HD: ");
        String hd = scanner.nextLine();

        System.out.print("Digite o modelo do cooler: ");
        String cooler = scanner.nextLine();

        System.out.print("Digite o modelo da placa de vídeo: ");
        String placaDeVideo = scanner.nextLine();

        // Solicitar informações da memória RAM
        System.out.print("Quantos pentes de memória RAM foram adquiridos? ");
        int quantidadeMemoriaRam = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        String[] modelosMemoriaRam = new String[quantidadeMemoriaRam];
        for (int i = 0; i < quantidadeMemoriaRam; i++) {
            System.out.print("Digite o modelo da memória RAM " + (i + 1) + ": ");
            modelosMemoriaRam[i] = scanner.nextLine();
        }

        System.out.print("Digite o modelo do SSD: ");
        String ssd = scanner.nextLine();

        // Solicitar custos extras
        System.out.print("Quantos custos extras você deseja adicionar? ");
        int quantidadeCustosExtras = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        String[] nomesCustosExtras = new String[quantidadeCustosExtras];
        double[] valoresCustosExtras = new double[quantidadeCustosExtras];

        for (int i = 0; i < quantidadeCustosExtras; i++) {
            System.out.print("Digite o nome do custo extra " + (i + 1) + ": ");
            nomesCustosExtras[i] = scanner.nextLine();

            System.out.print("Digite o valor do custo extra " + (i + 1) + ": ");
            valoresCustosExtras[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
        }

        // Solicitar valores pagos em cada item
        System.out.print("Digite o valor pago na placa mãe: ");
        double valorPlacaMae = scanner.nextDouble();

        System.out.print("Digite o valor pago na fonte: ");
        double valorFonte = scanner.nextDouble();

        System.out.print("Digite o valor pago no processador: ");
        double valorProcessador = scanner.nextDouble();

        System.out.print("Digite o valor pago no gabinete: ");
        double valorGabinete = scanner.nextDouble();

        System.out.print("Digite o valor pago no HD: ");
        double valorHd = scanner.nextDouble();

        System.out.print("Digite o valor pago no cooler: ");
        double valorCooler = scanner.nextDouble();

        System.out.print("Digite o valor pago na placa de vídeo: ");
        double valorPlacaDeVideo = scanner.nextDouble();

        System.out.print("Digite o valor total pago pelas memórias RAM: ");
        double valorTotalMemoriaRam = scanner.nextDouble();

        System.out.print("Digite o valor pago no SSD: ");
        double valorSsd = scanner.nextDouble();

        // Calcular o total investido
        double valorCustosExtras = 0.0;
        for (double valor : valoresCustosExtras) {
            valorCustosExtras += valor;
        }

        double totalInvestido = valorPlacaMae + valorFonte + valorProcessador + valorGabinete + valorHd
                + valorCooler + valorPlacaDeVideo + valorTotalMemoriaRam + valorSsd + valorCustosExtras;

        // Exibir soma dos valores pagos antes do valor de venda
        System.out.printf("\nA soma dos valores pagos em cada item é: R$ %.2f\n", totalInvestido);

        // Exibir opções de preços com base em percentuais
        System.out.println("\nSugestões de preços de venda:");
        for (int i = 10; i <= 100; i += 10) {
            double sugestaoPreco = totalInvestido + (totalInvestido * i / 100);
            System.out.printf("%d%% acima do total investido: R$ %.2f\n", i, sugestaoPreco);
        }

        // Solicitar valor de venda
        System.out.print("\nDigite o valor de venda: ");
        double valorVenda = scanner.nextDouble();

        // Calcular lucro total e percentual de lucro
        double lucroTotal = valorVenda - totalInvestido;
        double percentualLucro = (lucroTotal / totalInvestido) * 100;

        // Gerar nome fantasia para o computador
        String nomeFantasia = gerarNomeFantasia(placaMae, processador, placaDeVideo);

        // Exibir resultados
        System.out.println("\nEspecificações do modelo vendido:");
        System.out.println("ID do Computador: " + idComputador);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Placa Mãe: " + placaMae);
        System.out.println("Fonte: " + fonte);
        System.out.println("Processador: " + processador);
        System.out.println("Gabinete: " + gabinete);
        System.out.println("HD: " + hd);
        System.out.println("Cooler: " + cooler);
        System.out.println("Placa de Vídeo: " + placaDeVideo);
        for (int i = 0; i < quantidadeMemoriaRam; i++) {
            System.out.println("Memória RAM " + (i + 1) + ": " + modelosMemoriaRam[i]);
        }
        System.out.println("SSD: " + ssd);

        System.out.println("\nCustos Extras:");
        for (int i = 0; i < quantidadeCustosExtras; i++) {
            System.out.printf("%s: R$ %.2f\n", nomesCustosExtras[i], valoresCustosExtras[i]);
        }

        System.out.printf("\nTotal Investido: R$ %.2f\n", totalInvestido);
        System.out.printf("Valor de Venda: R$ %.2f\n", valorVenda);
        System.out.printf("Lucro Total: R$ %.2f\n", lucroTotal);
        System.out.printf("Percentual de Lucro: %.2f%%\n", percentualLucro);

        scanner.close();

        // Enviar dados para o "banco de dados"
        enviarParaBancoDeDados(idComputador, nomeFantasia, totalInvestido, valorVenda, lucroTotal, percentualLucro);
    }

    // Método para gerar nome fantasia
    private static String gerarNomeFantasia(String placaMae, String processador, String placaDeVideo) {
        return "PC-" + placaMae.split(" ")[0] + "-" + processador.split(" ")[0] + "-" + placaDeVideo.split(" ")[0];
    }

    // Método fictício para enviar dados para um banco de dados
    private static void enviarParaBancoDeDados(String id, String nomeFantasia, double totalInvestido, double valorVenda, double lucroTotal, double percentualLucro) {
        System.out.println("\nDados enviados para o banco de dados:");
        System.out.println("ID: " + id);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.printf("Total Investido: R$ %.2f\n", totalInvestido);
        System.out.printf("Valor de Venda: R$ %.2f\n", valorVenda);
        System.out.printf("Lucro Total: R$ %.2f\n", lucroTotal);
        System.out.printf("Percentual de Lucro: %.2f%%\n", percentualLucro);
    }
}
