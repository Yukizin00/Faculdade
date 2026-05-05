import javax.swing.*;

void main() {
    int opcao = -1;
    String menu = "1 - Números de Um à Dez\n2 - Tabuada do Cinco\n3 - Todos os pares de um até valor X\n4 - Soma dos numero de um até 100\n0 - Sair.";

    while(opcao != 0) {
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcao) {
            case 1:
                String resultado1 = "";
                for (int i = 1; i <= 10; i++) {
                    resultado1 += i + ", ";
                }
                JOptionPane.showMessageDialog(null, resultado1);
                break;

            case 2:
                String resultado2 = "";
                int numero = 5;
                for (int i = 1; i <= 10; i++) {
                    int valor = numero * i;
                    resultado2 += numero + " x " + i + " = " + valor + "\n";
                }
                JOptionPane.showMessageDialog(null, resultado2);
                break;

            case 3:
                String resultado3 = "";
                int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
                for (int i = 1; i <= limite; i++) {
                    if (i % 2 == 0) {
                        resultado3 += i + ", ";
                    }
                }
                JOptionPane.showMessageDialog(null, resultado3);
                break;

            case 4:
                int soma = 0;
                for (int i = 1; i <= 100; i++) {
                    soma += i;
                }
                JOptionPane.showMessageDialog(null, "Soma de 1 até 100: " + soma);
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}