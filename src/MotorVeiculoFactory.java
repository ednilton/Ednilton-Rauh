public abstract class MotorVeiculoFactory {

    public MotorVeiculo create() {

        MotorVeiculo veiculo = createMotorVeiculo();
    
        veiculo.build();
    
        return veiculo;
    }

    protected abstract MotorVeiculo createMotorVeiculo();
}
