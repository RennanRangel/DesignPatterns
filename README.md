# Projeto Exemplos de Design Patterns - GoF (Java)

## Descrição
Este projeto demonstra a implementação de alguns **Design Patterns** do livro **Gang of Four (GoF)** em Java, incluindo:

- **Facade:** Simplifica a interface para múltiplos subsistemas.  
- **Singleton (Eager):** Garante que uma classe tenha apenas uma instância.  
- **Strategy:** Permite alterar o comportamento de um objeto em tempo de execução.

O objetivo é exemplificar como aplicar esses padrões em sistemas reais e melhorar a organização e manutenção do código.

---


### Pacotes e Classes

- **Facade**
  - `Facade.java`: Classe que simplifica a interação com múltiplos subsistemas, como CRM e CEP, permitindo migrar clientes com um único método `migrarCliente`.

- **Singleton**
  - `SingletonEager.java`: Implementação do padrão Singleton com inicialização antecipada (eager). Garante que apenas uma instância da classe seja criada.

- **Strategy**
  - `Comportamento.java`: Interface que define o comportamento do robô.
  - `ComportamentoAgressivamente.java`: Implementação da estratégia agressiva de movimento.
  - `Robo.java`: Classe que utiliza diferentes estratégias de movimento em tempo de execução.

- **Subsistemas**
  - `CrmService.java`: Simula um serviço de CRM para registrar clientes.
  - `CepApi.java`: Simula um serviço para recuperar cidade e estado a partir do CEP.

---

## Como Usar

### Facade
```java
Facade facade = new Facade();
facade.migrarCliente("João", "12345-678", "", "");


