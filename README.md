# Pedido Spring GoF

Projeto em Spring Boot que demonstra o uso prático de vários **Padrões de Projeto do GoF**, ideal para processos seletivos e entrevistas técnicas!

## 🎯 Objetivo

Simular um sistema de pedidos com suporte a:
- Variações de pagamento (`Strategy`)
- Criação flexível de métodos de pagamento (`Factory Method`)
- Serviço de log único (`Singleton`)
- Adições ao pedido como desconto e frete (`Decorator`)
- Estrutura modular com Spring Boot e REST API

## 🛠️ Tecnologias

- Java 17
- Spring Boot 3
- Maven

## 📁 Estrutura de Pacotes

```
com.gabriel.pedidos
├── controller        # REST API
├── modelo           # Entidades e decorators
├── pagamento        # Estratégias e fábrica de pagamento
├── service          # Regras de negócio
└── util             # Logger Singleton
```

## 🚀 Como executar

```bash
# Clone o projeto
git clone https://github.com/seu-usuario/pedido-spring-gof.git
cd pedido-spring-gof

# Compile e rode
./mvnw spring-boot:run
```

## 🔄 Exemplo de uso

```http
POST http://localhost:8080/pedidos?descricao=Camisa&preco=100.0&tipoPagamento=cartao
```

## 🧠 Padrões utilizados

| Padrão        | Onde é usado                                      |
|---------------|---------------------------------------------------|
| Strategy      | Tipos de pagamento                                |
| Factory Method| Criação de instâncias de pagamento                |
| Singleton     | Logger da aplicação                               |
| Decorator     | Adição de desconto e frete ao pedido              |

## 🧑‍💻 Autor

Gabriel de Albuquerque Mello Martins Carvalho# produtos
# produtos-desafio
# produtos-desafio
