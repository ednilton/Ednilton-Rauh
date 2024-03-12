## Design Pattern - Factory

Criamos a interface MotorVeiculo com o método build().
Implementamos as classes Motocicleta e Carro que representam tipos específicos de veículos.
Definimos a classe abstrata MotorVeiculoFactory com o método createMotorVeiculo().
Criamos as fábricas específicas MotocicletaFactory e CarroFactory que retornam instâncias de motocicletas e carros, respectivamente.
Assim, o Factory Method nos permite criar diferentes tipos de veículos sem acoplar o código diretamente às classes concretas. 🚗🏍️ 

## Folder Structure
The workspace contains two folders by default, where:
- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies


