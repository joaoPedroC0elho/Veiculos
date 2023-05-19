import java.util.Scanner;

public class Motorr {
    private int numCilindro;
    private int potencia;

    public Motorr() {
        numCilindro = 0;
        potencia = 0;
    }

    public Motorr(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de Cilindros: ");
        numCilindro = scanner.nextInt();
        System.out.print("Potência: ");
        potencia = scanner.nextInt();
    }

    public void print() {
        System.out.println("Número de Cilindros: " + numCilindro);
        System.out.println("Potência: " + potencia);
    }
}