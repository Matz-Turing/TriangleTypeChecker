public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(3, 4, 5);
        System.out.println(t1.valida()); // Saída: Triângulo escaleno

        Triangulo t2 = new Triangulo(2, 2, 2);
        System.out.println(t2.valida()); // Saída: Triângulo equilátero

        Triangulo t3 = new Triangulo(2, 2, 3);
        System.out.println(t3.valida()); // Saída: Triângulo isósceles

        Triangulo t4 = new Triangulo(1, 2, 3);
        System.out.println(t4.valida()); // Saída: Os valores não formam um triângulo
    }
}
