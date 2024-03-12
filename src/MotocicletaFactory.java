// Implementação específica da fábrica para motocicletas
public class MotocicletaFactory extends MotorVeiculoFactory {

    @Override
    protected MotorVeiculo createMotorVeiculo() {
        return new Motocicleta();
    }
}

