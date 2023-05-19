import java.util.Scanner;

public class Veiculo extends Motorr {
    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        peso = 0;
        velocMax = 0;
        preco = 0.0f;
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public void insertData() {
        super.insertData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Peso (em quilos): ");
        peso = scanner.nextInt();
        System.out.print("Velocidade Máxima (em Km/h): ");
        velocMax = scanner.nextInt();
        System.out.print("Preço (em R$): ");
        preco = scanner.nextFloat();
    }

    public void print() {
        super.print();
        System.out.println("Peso (em quilos): " + peso);
        System.out.println("Velocidade Máxima (em Km/h): " + velocMax);
        System.out.println("Preço (em R$): " + preco);
    }
}