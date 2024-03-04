

public class carro {
    

    String cor;
    String marca;
    String modelo;
    double velMax;
    double velAtual;
    int Potencia;
    String tipo;

    

    void ligar()
    {
        System.out.println("Carro liga!! Vrum Vrum.");
    }

    void acelerar()
    {
        System.out.println("O carro acelera de " + velAtual + "KM/H para " + velMax + "KM/H!!!");
    }

    void mostraInfo()
    {
        System.out.println(cor);
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(velMax);
        System.out.println(velAtual);
    }

    


}
