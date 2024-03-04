import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        carro Carro = new carro();

        System.out.println("Cor do Carro: ");
        Carro.cor = entrada.next();
        System.out.println("Marca do Carro: ");
        Carro.marca = entrada.next();
        System.out.println("Modelo do Carro: ");
        Carro.modelo = entrada.next();
        System.out.println("Velocidade Atual do Carro: ");
        Carro.velAtual = entrada.nextInt();
        System.out.println("Velocidade Maxima do Carro: ");
        Carro.velMax = entrada.nextInt();
        System.out.println("Potencia do Motor: ");
        Carro.Potencia = entrada.nextInt();
        System.out.println("Tipo do Motor: ");
        Carro.tipo = entrada.next();

        Carro.ligar();

        Carro.acelerar();

        Carro.mostraInfo();



    }
}
