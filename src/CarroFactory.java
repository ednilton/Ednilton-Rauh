public class CarroFactory extends MotorVeiculoFactory {
    @Override
    protected MotorVeiculo createMotorVeiculo() {
        return new Carro();
    }
}
