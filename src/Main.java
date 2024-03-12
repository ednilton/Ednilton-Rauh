/**

   */

public class Main {
    public static void main(String[] args) {
        MotorVeiculoFactory motocicletaFactory = new MotocicletaFactory();
        MotorVeiculoFactory carroFactory = new CarroFactory();

        MotorVeiculo motocicletaVeiculo = motocicletaFactory.create();
        MotorVeiculo carro = carroFactory.create();
    }
}