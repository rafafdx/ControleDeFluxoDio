import java.util.Scanner;

        public class Contador {
            public static void main(String[] args) {
                Scanner terminal = new Scanner(System.in);

                System.out.println("Digite o primeiro parâmetro:");
                int parametroUm = terminal.nextInt();

                System.out.println("Digite o segundo parâmetro:");
                int parametroDois = terminal.nextInt();

                try {
                    // Chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);
                } catch (ParametrosInvalidosException exception) {
                    // Exibe a mensagem da exceção
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                } finally {
                    terminal.close();
                }
            }

            static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
                // Valida se parametroUm é maior que parametroDois e lança a exceção
                if (parametroUm > parametroDois) {
                    throw new ParametrosInvalidosException();
                }

                int contagem = parametroDois - parametroUm;
                // Loop para imprimir os números
                for (int i = 1; i <= contagem; i++) {
                    System.out.println("Imprimindo o número " + i);
                }
            }
        }
