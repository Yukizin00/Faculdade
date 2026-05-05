import javax.swing.*;

void main() {
    int opcao = -1;
    String menu = "1 - Números de Um à Dez\n2 - Tabuada do Cinco\n3 - Todos os pares de um até valor X\n4 - Soma dos numero de um até 100\n0 - Sair.";

    while(opcao != 0) {
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        if (opcao == 1) {
            String resultado = "";
            for (int i = 1; i <= 10; i++) {
                resultado += i + ", ";
            }
            JOptionPane.showMessageDialog(null, resultado);

        } else if (opcao == 2) {
            String resultado = "";
            int numero = 5;
            for (int i = 1; i <= 10; i++) {
                int valor = numero * i;
                resultado += numero + " x " + i + " = " + valor + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);

        } else if (opcao == 3) {
            String resultado = "";
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            for (int i = 1; i <= limite; i++) {
                if (i % 2 == 0) {
                    resultado += i + ", ";
                }
            }
            JOptionPane.showMessageDialog(null, resultado);

        } else if (opcao == 4) {
            int soma = 0;
            for (int i = 1; i <= 100; i++) {
                soma += i;
            }
            JOptionPane.showMessageDialog(null, "Soma de 1 até 100: " + soma);
        } else {
            JOptionPane.showMessageDialog(null, "Saindo...");
        }
    }
}