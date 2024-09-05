import java.util.Scanner;

public class Triangulo {
    private double x; // Comprimento do primeiro lado
    private double y; // Comprimento do segundo lado
    private double z; // Comprimento do terceiro lado

    // Construtor da classe Triangulo
    public Triangulo(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Método que valida e classifica o triângulo
    public String valida() {
        // Verifica se os valores formam um triângulo
        if (x <= 0 || y <= 0 || z <= 0 || x + y <= z || x + z <= y || y + z <= x) {
            return "Os valores não formam um triângulo. Certifique-se de que a soma de quaisquer dois lados seja maior que o terceiro lado.";
        }

        // Verifica se é um triângulo equilátero
        if (x == y && y == z) {
            return "Triângulo equilátero";
        }

        // Verifica se é um triângulo isósceles
        if (x == y || y == z || x == z) {
            return "Triângulo isósceles";
        }

        // Se não for equilátero nem isósceles, é escaleno
        return "Triângulo escaleno";
    }

    // Sugestão de valores para criar um triângulo de cada tipo
    public static void sugerirValores(String tipo) {
        switch (tipo.toLowerCase()) {
            case "equilátero":
                System.out.println("Para um triângulo equilátero, todos os lados devem ter o mesmo comprimento.");
                System.out.println("Sugestão: 5, 5, 5");
                break;
            case "isósceles":
                System.out.println("Para um triângulo isósceles, dois lados devem ter o mesmo comprimento.");
                System.out.println("Sugestão: 5, 5, 3");
                break;
            case "escaleno":
                System.out.println("Para um triângulo escaleno, todos os lados devem ter comprimentos diferentes.");
                System.out.println("Sugestão: 4, 5, 6");
                break;
            default:
                System.out.println("Tipo de triângulo desconhecido. Escolha entre 'equilátero', 'isósceles' ou 'escaleno'.");
        }
    }

    // Método principal para interação com o usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o tipo de triângulo que deseja criar ('equilátero', 'isósceles' ou 'escaleno') ou 'sair' para encerrar:");
            String tipoTriangulo = scanner.nextLine();
            if (tipoTriangulo.equalsIgnoreCase("sair")) break;

            sugerirValores(tipoTriangulo);

            System.out.println("Agora, insira os comprimentos dos lados do triângulo:");

            // Leitura do lado x
            System.out.print("Digite o comprimento do primeiro lado (x): ");
            String inputX = scanner.nextLine();
            if (inputX.equalsIgnoreCase("sair")) break;

            // Leitura do lado y
            System.out.print("Digite o comprimento do segundo lado (y): ");
            String inputY = scanner.nextLine();
            if (inputY.equalsIgnoreCase("sair")) break;

            // Leitura do lado z
            System.out.print("Digite o comprimento do terceiro lado (z): ");
            String inputZ = scanner.nextLine();
            if (inputZ.equalsIgnoreCase("sair")) break;

            try {
                double x = Double.parseDouble(inputX);
                double y = Double.parseDouble(inputY);
                double z = Double.parseDouble(inputZ);

                Triangulo triangulo = new Triangulo(x, y, z);
                System.out.println(triangulo.valida());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira valores numéricos válidos para os comprimentos dos lados.");
            }
        }

        scanner.close();
    }
}