# Arduino API

Projeto desenvolvido para simular a leitura de sensores de temperatura, umidade e luminosidade, utilizando Spring Boot para a estrutura do sistema.

## 📌 Tecnologias

- Java 17
- Spring Boot
- Spring Scheduler
- Spring Events

## 🚀 Como executar

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/cndgui/arduino-api.git
cd arduino-api
```

### 2️⃣ Configurar o ambiente
Certifique-se de ter o Java 17 instalado e configurado corretamente.

### 3️⃣ Executar o projeto
Para rodar o projeto, basta executar a classe principal ArduinoApiApplication:
```bash
./gradlew bootRun
```
Isso iniciará o servidor e você poderá acessar a API de sensores.

### 🛠️ Dependências e Build
Este projeto usa o Gradle com Kotlin para gerenciamento de dependências. Para construir o projeto, utilize:
```bash
./gradlew build
```

### 📂 Estrutura do projeto
```java
src/main/java/com/guilhermerodrigues/arduino_api
│── component/
│   ├── SensorScheduler.java  # Agendamento da leitura dos sensores
│── controller/
│   ├── SensorController.java # API REST para expor os dados dos sensores
│── entity/
│   ├── Sensor.java  # Representação dos sensores
│── event/
│   ├── AlertEvent.java  # Evento de notificação de alertas
│── listener/
│   ├── AlertListener.java  # Escutador de eventos de alerta
│── repository/
│   ├── SensorRepository.java  # Simulação de persistência de dados
│── service/
│   ├── AlertService.java  # Serviço para lidar com alertas
│   ├── SensorService.java  # Serviço para simular leitura dos sensores
│── ArduinoApiApplication.java  # Classe principal do projeto
```