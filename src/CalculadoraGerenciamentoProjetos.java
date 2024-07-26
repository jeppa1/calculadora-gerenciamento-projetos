import java.util.Scanner;

public class CalculadoraGerenciamentoProjetos {
    public static void main(String[] args) throws Exception {
            Scanner terminal = new Scanner(System.in);
            
            try {
                System.out.println("GERENCIAMENTO DE PROJETOS");
                System.out.println("Aluno: Jadson Chagas");
                System.out.println("Professor: Raimundo Nonato");
    
                // Entrada de dados
                System.out.println("Digite o valor do Orçamento no término: ");
                int valorFinalEstimado = terminal.nextInt();
    
                System.out.println("Digite o valor em dias de duração do projeto: ");
                int diasEstimado = terminal.nextInt();
    
                System.out.println("Digite o valor em dias aplicados no projeto: ");
                int diasAplicados = terminal.nextInt();
    
                System.out.println("Digite o Valor Planejado: ");
                int valorPlanejado = terminal.nextInt();
    
                System.out.println("Digite o Valor Agregado: ");
                int valorAgregado = terminal.nextInt();
    
                System.out.println("Digite o Custo Real: ");
                int custoReal = terminal.nextInt();
    
                // Fechamento do Scanner
                terminal.close();
    
                // Cálculos
                int varCusto = valorAgregado - custoReal;
                double calcularIdc = custoReal == 0 ? 0 : (double) valorAgregado / custoReal;
                int varPrazo = valorAgregado - valorPlanejado;
                double calcularIdp = valorPlanejado == 0 ? 0 : (double) valorAgregado / valorPlanejado;
    
                // Análise do Índice de Custo
                if (calcularIdc < 1.0) {
                    System.out.println("O valor agregado é menor do que o custo real gasto, indicando gastos acima do orçamento planejado.");
                } else if (calcularIdc > 1.0) {
                    System.out.println("O valor agregado é maior do que o custo real gasto, indicando economia, estamos abaixo do orçamento planejado.");
                } else {
                    System.out.println("O valor agregado é exatamente igual ao custo real, estamos exatamente em cima do orçamento planejado.");
                }
                System.out.println("Seu IDC é " + String.format("%.3f", calcularIdc));
    
                // Análise do Índice de Prazo
                if (calcularIdp < 1.0) {
                    System.out.println("O valor agregado é menor do que o valor planejado, executamos menos do que o previsto e estamos atrasados em relação ao cronograma.");
                } else if (calcularIdp > 1.0) {
                    System.out.println("O valor agregado é maior do que o valor planejado, executamos mais do que o previsto e estamos adiantados em relação ao cronograma.");
                } else {
                    System.out.println("O valor agregado é exatamente igual ao valor planejado, estamos exatamente em cima do cronograma planejado.");
                }
                System.out.println("Seu IDP é " + String.format("%.3f", calcularIdp));
    
            } catch (Exception e) {
                System.out.println("Ocorreu um erro na entrada dos dados. Por favor, verifique as entradas.");
            }
        }
    }
