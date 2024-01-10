# O que é Kafka?

Apache Kafka é um armazenamento de dados distribuído otimizado para ingestão e processamento de dados de streaming em tempo real. Dados de transmissão são dados gerados continuamente por milhares de fontes de dados, que normalmente enviam os registros de dados simultaneamente. Uma plataforma de transmissão precisa lidar com esse fluxo constante de dados e processá-los de forma sequencial e incremental.

O Apache Kafka é uma plataforma de streaming de dados de código aberto que foi desenvolvida pela Apache Software Foundation. Ele é projetado para lidar com o fluxo massivo de dados em tempo real, sendo altamente escalável e durável. O sistema foi inicialmente desenvolvido pelo LinkedIn e, mais tarde, aberto para a comunidade de código aberto.

A arquitetura do Kafka é baseada em um modelo de publish-subscribe, onde os produtores enviam mensagens para tópicos e os consumidores se inscrevem para receber essas mensagens. O Kafka é especialmente adequado para situações em que é necessário processar grandes volumes de dados em tempo real.

O Kafka fornece três funções principais para seus usuários:

 - Publicar e assinar fluxos de registros
 - Armazenar fluxos de registros de forma eficaz na ordem em que os registros foram gerados
 - Processar fluxos de registros em tempo real

O Kafka é usado principalmente para criar pipelines de dados de streaming em tempo real e aplicações que se adaptam aos fluxos de dados. Ele combina mensagens, armazenamento e processamento de fluxo para permitir o armazenamento e a análise de dados históricos e em tempo real. 

<figure>
    <figcaption>Arquitetura Kafka</figcaption>
  <img src=".\src\main\resources\static\img\img3.png" alt="Arquitetura kafka">
</figure>

## Comunicação Síncrona e Assíncrona

A comunicação síncrona e assíncrona referem-se a duas abordagens diferentes na transmissão de dados entre sistemas, processos ou componentes de software. Aqui estão as principais diferenças entre ambas:

**Comunicação Síncrona:**

Na comunicação síncrona, o remetente e o destinatário estão sincronizados no tempo. Isso significa que o remetente envia uma mensagem e espera pela resposta imediata do destinatário antes de continuar sua execução. Durante esse período de espera, o remetente fica bloqueado ou ocioso.

Principais características da comunicação síncrona:

1. **Bloqueio:** O remetente espera pela resposta do destinatário, bloqueando-se durante esse tempo.

2. **Tempo Real:** Geralmente, a comunicação síncrona é usada quando se precisa de uma resposta imediata.

3. **Exemplo:** Uma chamada de função em programação, onde o chamador aguarda a conclusão da função antes de continuar.

**Comunicação Assíncrona:**

Na comunicação assíncrona, o remetente envia uma mensagem sem esperar uma resposta imediata do destinatário. O remetente não bloqueia sua execução, permitindo que continue suas atividades enquanto espera pela resposta. O destinatário pode responder quando estiver pronto.

Principais características da comunicação assíncrona:

1. **Não Bloqueante:** O remetente não espera ativamente pela resposta do destinatário e continua suas operações.

2. **Tempo de Resposta Variável:** A resposta pode não ser imediata, e o remetente precisa estar preparado para lidar com isso.

3. **Exemplo:** Comunicação entre processos em sistemas distribuídos, chamadas de API assíncronas em programação web.

Em resumo, na comunicação síncrona, o remetente aguarda ativamente uma resposta imediata, enquanto na comunicação assíncrona, o remetente não bloqueia sua execução e pode continuar suas atividades, independentemente de quando a resposta será recebida. A escolha entre essas abordagens depende dos requisitos específicos do sistema ou da aplicação em questão.

---

## Introdução ao Kafka - Guia Rápido do Apache Kafka

O [Guia Rápido do Apache Kafka](https://kafka.apache.org/quickstart) é uma referência essencial para aqueles que desejam iniciar sua jornada com o Apache Kafka, um sistema distribuído de mensageria de alta performance. O guia fornece uma visão detalhada e passo a passo sobre como instalar, configurar e começar a utilizar o Kafka de maneira eficaz.

### Explorando o Guia Rápido do Apache Kafka

#### 1. **Instalação e Configuração Inicial**

O guia aborda de maneira clara e concisa o processo de instalação do Kafka em diferentes ambientes. Ele fornece comandos específicos para baixar, descompactar e configurar o Kafka, garantindo que os usuários possam começar a explorar suas funcionalidades rapidamente.

#### 2. **Executando um Cluster Kafka Local**

O guia introduz os conceitos fundamentais do Kafka, incluindo a execução de um cluster Kafka local, configurando tópicos e interagindo com o sistema. Essa seção oferece uma introdução prática ao ambiente Kafka, permitindo que os usuários compreendam a dinâmica do sistema em um contexto de laboratório.

#### 3. **Produção e Consumo de Mensagens**

Ao seguir o guia, os usuários aprendem a produzir e consumir mensagens usando o Kafka. Essa parte é crucial para entender como as mensagens são publicadas e consumidas no Kafka, proporcionando uma compreensão aprofundada do fluxo de dados dentro do sistema.

#### 4. **Considerações Avançadas e Configurações Adicionais**

O guia não se limita ao básico. Ele aborda considerações mais avançadas, como replicação e particionamento, que são elementos críticos para ambientes de produção. Além disso, oferece insights sobre como ajustar configurações para otimizar o desempenho do Kafka conforme as necessidades específicas do usuário.

#### 5. **Recursos e Referências Úteis**

O Guia Rápido do Apache Kafka inclui links para recursos adicionais, documentação oficial e comunidade, permitindo que os usuários ampliem ainda mais seus conhecimentos sobre o Kafka.

Em resumo, o Guia Rápido do Apache Kafka é uma introdução abrangente que capacita desenvolvedores, engenheiros e arquitetos de sistemas a começar a explorar o poder do Kafka rapidamente. Seja para ambientes de desenvolvimento, testes ou produção, este guia fornece uma base sólida para entender e utilizar efetivamente o Apache Kafka em diversos contextos.

---

# Para que é usado o Kafka?
O Kafka é usado para criar pipelines de dados de streaming em tempo real e aplicações de streaming em tempo real. Um pipeline de dados processa e move dados de um sistema para outro de forma confiável, e uma aplicação de streaming é uma aplicação que consome fluxos de dados. Por exemplo, se você quiser criar um pipeline de dados que receba dados de atividades do usuário para monitorar como as pessoas usam seu site em tempo real, o Kafka seria usado para ingerir e armazenar dados de streaming enquanto fornece leituras para os aplicações que alimentam o pipeline de dados. O Kafka também é frequentemente usado como uma solução de agente de mensagens, que é uma plataforma que processa e medeia a comunicação entre duas aplicações.

# Como o Kafka funciona?
O Kafka combina dois modelos de mensagens, filas e publicação-assinatura, para fornecer os principais benefícios de cada um aos consumidores. O enfileiramento permite que o processamento de dados seja distribuído em várias instâncias do consumidor, tornando-o altamente escalável. No entanto, as filas tradicionais não têm vários assinantes. A abordagem de publicação-assinatura é de vários assinantes, mas como cada mensagem vai para cada assinante, ela não pode ser usada para distribuir o trabalho em vários processos. O Kafka usa um modelo de log particionado para unir essas duas soluções. Um log é uma sequência ordenada de registros, e esses registros são divididos em segmentos ou partições que correspondem a diferentes assinantes. Isso significa que pode haver vários assinantes do mesmo tópico e cada um recebe uma partição para permitir maior escalabilidade. Por fim, o modelo de Kafka fornece capacidade de reprodução, o que permite que várias aplicações independentes lendo fluxos de dados funcionem de forma independente em seu próprio ritmo.

<figure>
    <figcaption>Filas</figcaption>
  <img src=".\src\main\resources\static\img\img1.png" alt="Filas">
</figure>

<figure>
  <figcaption>Publicar e assinar</figcaption>
  <img src=".\src\main\resources\static\img\img2.png" alt="Publicar e assinar">
</figure>

# Quais são os benefícios da abordagem de Kafka?

### Escalonável
O modelo de log particionado do Kafka permite que os dados sejam distribuídos em vários servidores, tornando-os escaláveis além do que caberia em um único servidor. 

### Rápido
O Kafka separa os fluxos de dados para que haja uma latência muito baixa, tornando-o extremamente rápido. 

### Resiliente
As partições são distribuídas e replicadas em vários servidores, e os dados são todos gravados em disco. Isso ajuda a proteger contra falhas no servidor, tornando os dados muito tolerantes a falhas e duráveis. 

# Principais conceitos e componentes do Kafka

1. **Produtores (Producers):** São responsáveis por enviar mensagens para os tópicos do Kafka. Os produtores publicam registros em tópicos do kafka.

2. **Tópicos (Topics):** São canais de comunicação aos quais os produtores enviam mensagens e dos quais os consumidores leem mensagens. Os tópicos organizam as mensagens em categorias.

3. **Consumidores (Consumers):** São os aplicativos ou processos que se inscrevem nos tópicos e processam as mensagens. Os consumidores consomem registros de tópicos, ou seja, o API do consumidor são usada para assinar tópicos e processar seus fluxos de registros.

4. **ZooKeeper:** O Kafka depende do Apache ZooKeeper para coordenação e gerenciamento de configurações. O ZooKeeper mantém o estado do cluster Kafka e coordena a eleição de líderes para as partições.

5. **Partições (Partitions):** Os tópicos podem ser divididos em partições para permitir a distribuição de carga e escalabilidade. Cada partição é ordenada e pode ser replicada para garantir a durabilidade e a tolerância a falhas.

6. **Brokers:** São os servidores Kafka que armazenam os dados. Cada broker é responsável por uma parte das partições e pode se tornar líder de uma partição específica.

O Kafka é amplamente utilizado em cenários como análise em tempo real, processamento de eventos, integração de sistemas distribuídos e log de registros. Sua arquitetura distribuída e capacidade de lidar com grandes volumes de dados em tempo real o tornam uma escolha popular para empresas que precisam de uma plataforma robusta para streaming de dados.

<figure>
    <figcaption>Exemplo 1: Estrutura kafka</figcaption>
  <img src=".\src\main\resources\static\img\img4.png" alt="Estrutura kafka">
</figure>

<figure>
    <figcaption>Exemplo 2: Estrutura kafka</figcaption>
    <img src=".\src\main\resources\static\img\img5.jpg" alt="Estrutura kafka" width=90%>
</figure>

### 1. **Apache Kafka Overview:**

O Apache Kafka é uma plataforma distribuída de streaming de eventos, projetada para lidar com grandes volumes de dados em tempo real. Ele fornece uma arquitetura de mensagens pub/sub (publicação/assinatura), onde produtores (producers) enviam mensagens para tópicos e consumidores (consumers) consomem essas mensagens.

### 2. **Kafka Cluster:**

Um Kafka Cluster é um conjunto de servidores Kafka que trabalham em conjunto para fornecer armazenamento e processamento de mensagens. Um cluster geralmente consiste em vários brokers Kafka, que são servidores que armazenam e gerenciam os dados.

- **Brokers Kafka:** Cada broker é um servidor Kafka que faz parte do cluster. Eles armazenam as partições dos tópicos, que são as unidades básicas de distribuição e paralelismo.

- **Partições:** Cada tópico é dividido em partições, que são a unidade de paralelismo e tolerância a falhas. Cada mensagem em um tópico é atribuída a uma partição.

### 3. **Producer Group:**

- **Producer:** Um produtor (producer) é uma entidade que envia mensagens para tópicos no Kafka. Eles podem ser produtores individuais ou um grupo de produtores colaborando para produzir dados.

- **Producer Group:** Em algumas arquiteturas, é comum ter um grupo de produtores (Producer Group) que trabalham juntos para gerar e enviar dados para tópicos específicos. Isso pode ser útil em cenários onde há uma carga de dados significativa e a colaboração entre produtores pode melhorar a eficiência.

### 4. **Consumer Group:**

- **Consumer:** Um consumidor (consumer) é uma entidade que consome mensagens de tópicos. Consumidores podem ser individuais ou fazer parte de um grupo de consumidores.

- **Consumer Group:** Consumidores podem ser organizados em grupos chamados Consumer Groups. Cada grupo consome dados de tópicos e cada partição em um tópico só pode ser consumida por um consumidor em um grupo. Isso permite a escalabilidade e a tolerância a falhas.

### 5. **Funcionamento da Arquitetura:**

1. **Produção de Mensagens:**
   - Os produtores enviam mensagens para tópicos. As mensagens são distribuídas entre as partições de um tópico.

2. **Kafka Cluster:**
   - O Kafka Cluster armazena e gerencia as partições dos tópicos, distribuindo-as entre os brokers.

3. **Consumer Groups:**
   - Consumidores são organizados em grupos (Consumer Groups).
   - Cada partição de um tópico só pode ser consumida por um consumidor dentro de um grupo.

4. **Consumo de Mensagens:**
   - Os consumidores consomem mensagens das partições atribuídas ao grupo.
   - Isso permite que múltiplos consumidores processem mensagens em paralelo.

5. **Escalabilidade:**
   - A adição de mais consumidores em um grupo permite aumentar a capacidade de processamento.
   - A adição de mais brokers permite aumentar a capacidade de armazenamento e processamento do Kafka Cluster.

6. **Tolerância a Falhas:**
   - Se um consumidor ou broker falhar, outros assumirão a carga de trabalho, garantindo a tolerância a falhas.

A arquitetura do Apache Kafka é escalável, tolerante a falhas e permite processamento de dados em tempo real, sendo muito utilizada em cenários de streaming de eventos e big data.

## Zookeeper

O Apache Kafka utiliza o Apache ZooKeeper para gerenciamento de cluster, coordenação e detecção de falhas. O ZooKeeper desempenha um papel crucial na operação e na garantia da consistência em ambientes distribuídos, como o Kafka.

Algumas funções importantes do ZooKeeper no ecossistema Kafka:

### Coordenação e Eleição de Líderes:

- **Coordenação:** O ZooKeeper ajuda na coordenação entre os diferentes nós do Kafka Cluster. Ele mantém informações sobre a configuração, os tópicos, as partições e os líderes de partições.
  
- **Eleição de Líderes:** Quando um broker Kafka falha ou é adicionado ao cluster, o ZooKeeper ajuda a coordenar a eleição de líderes para as partições. Cada partição em um tópico tem um líder que é responsável pela gravação e leitura das mensagens.

### Detecção de Falhas:

- **Monitoramento de Nós:** O ZooKeeper monitora a saúde dos nós do cluster Kafka. Ele detecta quando um nó fica indisponível, falha ou é reiniciado.

- **Reatribuição de Partições:** Se um nó Kafka falhar, o ZooKeeper ajuda a coordenar a reatribuição das partições para outros nós saudáveis. Isso garante a continuidade do serviço e a recuperação de falhas.

### Armazenamento de Metadados:

- **Configuração e Metadados:** O ZooKeeper armazena metadados críticos sobre o Kafka, como configurações do cluster, informações sobre tópicos e partições, e a localização dos líderes de cada partição.

- **Registro Dinâmico:** O Kafka pode registrar dinamicamente tópicos e partições no ZooKeeper à medida que são criados, removidos ou reatribuídos.

### Sincronização e Bloqueio:

- **Sincronização:** O ZooKeeper fornece primitivas de sincronização, como semáforos e bloqueios, que podem ser utilizadas pelos nós do Kafka para coordenar operações em ambientes distribuídos.

- **Bloqueio de Configuração:** O ZooKeeper também é usado para bloquear a configuração global do Kafka, garantindo que apenas um nó por vez possa atualizar ou modificar determinadas configurações.

Em resumo, o ZooKeeper atua como um serviço de coordenação e gerenciamento de configuração para o Apache Kafka, proporcionando estabilidade, coordenação e consistência em ambientes distribuídos. Ele desempenha um papel crítico na operação eficiente e na tolerância a falhas do Kafka Cluster.

# Introdução: Sistema de Mensageria Kafka com Spring Boot

Este documento fornece uma visão geral e uma documentação detalhada de várias classes e configurações essenciais para implementar um sistema de mensageria baseado em Kafka, utilizando a estrutura do Spring Boot. O sistema é projetado para permitir o envio e recebimento eficientes de mensagens, tanto em formato de texto quanto em JSON.

# Docker Compose para Kafka e Zookeeper

Este Docker Compose é destinado a fornecer uma configuração pronta para uso do Apache Kafka e Zookeeper usando as imagens Bitnami.

```yml
version: "3"
services:
  zookeeper:
    container_name: meu_zookeeper
    image: "bitnami/zookeeper:latest"
    networks:
      - kafka-net
    ports:
      - "2181:2181"
    environment:
      - ALLOW_ANONYMOUS_LOGIN=yes
  kafka:
    container_name: meu_kafka
    image: "bitnami/kafka:latest"
    networks:
      - kafka-net
    ports:
      - "9092:9092"
    environment:
      KAFKA_BROKER_ID: "1"
      KAFKA_ZOOKEEPER_CONNECT: "zookeeper:2181"
      KAFKA_ADVERTISED_HOST_NAME: "localhost"
      KAFKA_ADVERTISED_LISTENERS: "PLAINTEXT://localhost:9092"
      ALLOW_PLAINTEXT_LISTENER: "yes"
      KAFKA_AUTO_CREATE_TOPICS_ENABLE: "true"
    depends_on:
      - zookeeper

networks:
  kafka-net:
    driver: bridge
```

## Serviços

### Zookeeper

O serviço Zookeeper é uma aplicação centralizada que fornece um serviço de coordenação para sistemas distribuídos, como o Kafka.

- **container_name:** `meu_zookeeper`
- **image:** `bitnami/zookeeper:latest`
- **networks:** `kafka-net`
- **ports:** `2181:2181`
- **environment:**
  - `ALLOW_ANONYMOUS_LOGIN=yes` (Permite login anônimo para facilitar o desenvolvimento)

### Kafka

O serviço Kafka é uma plataforma de streaming distribuída que fornece funcionalidades de publicação e assinatura em tempo real.

- **container_name:** `meu_kafka`
- **image:** `bitnami/kafka:latest`
- **networks:** `kafka-net`
- **ports:** `9092:9092`
- **environment:**
  - `KAFKA_BROKER_ID: "1"` (Identificador único do broker)
  - `KAFKA_ZOOKEEPER_CONNECT: "zookeeper:2181"` (Endereço do Zookeeper)
  - `KAFKA_ADVERTISED_HOST_NAME: "localhost"` (Hostname para anúncio externo)
  - `KAFKA_ADVERTISED_LISTENERS: "PLAINTEXT://localhost:9092"` (Configuração para anúncio de ouvintes)
  - `ALLOW_PLAINTEXT_LISTENER: "yes"` (Permite ouvintes de texto não criptografado)
  - `KAFKA_AUTO_CREATE_TOPICS_ENABLE: "true"` (Habilita a criação automática de tópicos)
- **depends_on:**
  - `zookeeper` (Aguarda que o serviço Zookeeper esteja disponível antes de iniciar)

## Networks

- **kafka-net:** Rede personalizada para conectar os serviços Kafka e Zookeeper.

# Configuração do Spring Kafka - `application.yml`

Este arquivo de configuração Spring Kafka é destinado a fornecer uma configuração básica para a integração do Spring com o Apache Kafka. Ele abrange as configurações do consumidor e produtor.

```yml
spring:
  kafka:
    consumer:
      bootstrap-servers: localhost:9092
      group-id: myGroup
      auto-offset-reset: earliest
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      # value-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.springframework.kafka.support.serializer.JsonDeserializer
      properties:
        spring.json.trusted.packages: '*'

    producer:
      bootstrap-servers: localhost:9092
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      # value-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.springframework.kafka.support.serializer.JsonSerializer
    
server:
  port: 8081    
```

## Configurações do Consumidor

### bootstrap-servers

- **Descrição:** Endereços dos servidores Kafka para estabelecer a conexão.
- **Valor padrão:** `localhost:9092`

### group-id

- **Descrição:** Identificador de grupo para o consumidor Kafka.
- **Valor padrão:** `myGroup`

### auto-offset-reset

- **Descrição:** Estratégia para lidar com offsets ausentes ou inválidos.
- **Valor padrão:** `earliest` (inicia a partir do início do tópico se não houver um offset inicial)

### key-deserializer

- **Descrição:** Classe para desserializar a chave do Kafka.
- **Valor padrão:** `org.apache.kafka.common.serialization.StringDeserializer`

### value-deserializer

- **Descrição:** Classe para desserializar os valores do Kafka.
- **Valor padrão:** `org.apache.kafka.common.serialization.StringDeserializer`

### properties

- **Descrição:** Propriedades adicionais para configurar o consumidor.
- **Valor padrão:** `spring.json.trusted.packages: '*'` (Habilita todas as classes para desserialização JSON)

## Configurações do Produtor

### bootstrap-servers

- **Descrição:** Endereços dos servidores Kafka para estabelecer a conexão.
- **Valor padrão:** `localhost:9092`

### key-serializer

- **Descrição:** Classe para serializar a chave do Kafka.
- **Valor padrão:** `org.apache.kafka.common.serialization.StringSerializer`

### value-serializer

- **Descrição:** Classe para serializar os valores do Kafka.
- **Valor padrão:** `org.apache.kafka.common.serialization.StringSerializer`

## Configurações do Servidor

### port

- **Descrição:** Porta em que o servidor Spring estará escutando.
- **Valor padrão:** `8081`


# Configuração de Tópico do Kafka - `KafkaTopicConfig`

A classe `KafkaTopicConfig` faz parte da configuração do Apache Kafka usando o Spring Kafka. Essa classe é responsável por definir a criação de um novo tópico no Kafka.

```java
package com.api.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder
            .name("daniel")
            .build();
    }
    
}
```

## Configuração da Classe

### Pacote

- **Pacote:** `com.api.kafkademo.config`

## Métodos

### myTopic

- **Descrição:** Método que cria e configura um novo tópico Kafka.
- **Tipo de Retorno:** `NewTopic`
- **Configurações Adicionais:**
  - **Nome do Tópico:** `daniel`

## Uso

Essa classe é anotada com `@Configuration`, indicando que é uma classe de configuração do Spring. O método `myTopic` é anotado com `@Bean`, indicando que ele deve ser gerenciado pelo contêiner Spring e está configurando a criação de um novo tópico Kafka chamado `daniel`.

O tópico é configurado usando a classe utilitária `TopicBuilder` fornecida pelo Spring Kafka, que permite criar tópicos com várias configurações.

# Produtor Kafka - `KafkaProducer`

A classe `KafkaProducer` é uma parte essencial do sistema que utiliza o Apache Kafka, proporcionando a capacidade de produzir e enviar mensagens para um tópico específico.

```java
package com.api.kafkademo.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        log.info(format("Sending message to Daniel Topic :: %s", msg));
        kafkaTemplate.send("daniel", msg);
    }

}
```

## Configuração da Classe

### Pacotes

- **Pacote:** `com.api.kafkademo.producer`

## Anotações

- **`@Service`:** Indica que esta classe é um componente de serviço gerenciado pelo Spring, facilitando a injeção de dependências.

- **`@RequiredArgsConstructor`:** Gera automaticamente um construtor com base nos campos marcados como `final` ou `@NonNull`. Isso é utilizado para injetar automaticamente a dependência do `KafkaTemplate` durante a inicialização da classe.

- **`@Slf4j`:** Gera automaticamente um logger SLF4J para a classe, permitindo a utilização de métodos de log.

## Campos

- **`private final KafkaTemplate<String, String> kafkaTemplate`:** Representa a instância do `KafkaTemplate` que será utilizada para enviar mensagens para o Kafka.

## Métodos

### sendMessage

- **Descrição:** Método que envia uma mensagem para o tópico "daniel" no Apache Kafka.
- **Parâmetros:**
  - `msg` (Tipo: `String`): A mensagem a ser enviada.
- **Retorno:** `void`

# Consumidor Kafka - `KafkaConsumer`

A classe `KafkaConsumer` desempenha um papel vital no sistema que utiliza o Apache Kafka, permitindo a subscrição e o processamento de mensagens provenientes de um tópico específico.

```java
package com.api.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.api.kafkademo.payload.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "daniel", groupId = "myGroup")
    public void consumerMsg(String msg){
        log.info(String.format("Consuming the message from daniel Topic :: %s", msg));
    }

    @KafkaListener(topics = "daniel", groupId = "myGroup")
    public void consumerJsonMsg(Student student){
        log.info(String.format("Consuming the message from daniel Topic :: %s",student.toString()));
    }
    
}
```

## Configuração da Classe

### Pacotes

- **Pacote:** `com.api.kafkademo.consumer`

## Anotações

- **`@Service`:** Indica que esta classe é um componente de serviço gerenciado pelo Spring, facilitando a injeção de dependências.

- **`@Slf4j`:** Gera automaticamente um logger SLF4J para a classe, permitindo a utilização de métodos de log.

## Métodos

### consumerMsg

- **Descrição:** Método que consome mensagens do tópico "daniel" no Apache Kafka.
- **Parâmetros:**
  - `msg` (Tipo: `String`): A mensagem recebida.
- **Retorno:** `void`

### consumerJsonMsg

- **Descrição:** Método que consome mensagens do tópico "daniel" no Apache Kafka, onde a mensagem é interpretada como um objeto `Student`.
- **Parâmetros:**
  - `student` (Tipo: `Student`): Objeto representando um estudante.
- **Retorno:** `void`

### Observações

- O método `consumerJsonMsg` está comentado com `//@KafkaListener` para evitar a execução, pois depende de um tipo específico de mensagem (`Student`). Caso seja necessário processar mensagens JSON, pode-se descomentar este método e ajustar conforme necessário.

# Classe de Dados: `Student`

A classe `Student` é um objeto de dados que representa informações sobre um estudante.

```java
package com.api.kafkademo.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {

    private int id;
    private String firstname;
    private String lastname;

}
```

## Configuração da Classe

### Pacotes

- **Pacote:** `com.api.kafkademo.payload`

## Anotações Lombok

- **`@Getter`:** Gera automaticamente métodos *getters* para todos os campos da classe.

- **`@Setter`:** Gera automaticamente métodos *setters* para todos os campos da classe.

- **`@ToString`:** Gera automaticamente o método `toString()`, fornecendo uma representação de string da instância da classe.

## Campos

### `id` (Tipo: `int`)

- **Descrição:** Identificador único do estudante.

### `firstname` (Tipo: `String`)

- **Descrição:** Primeiro nome do estudante.

### `lastname` (Tipo: `String`)

- **Descrição:** Sobrenome do estudante.

## Métodos

### `toString`

- **Descrição:** Gera uma representação de string da instância da classe, incluindo todos os campos.

- **Parâmetros:** Nenhum.

- **Retorno:** `String`

### Observações

- A classe `Student` é projetada para ser utilizada como uma estrutura de dados simples para representar informações sobre estudantes.

# Classe de Produtor Kafka para JSON: `KafkaJsonProducer`

A classe `KafkaJsonProducer` é responsável por enviar mensagens JSON para um tópico no Apache Kafka.

```java
package com.api.kafkademo.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.api.kafkademo.payload.Student;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {

    private final KafkaTemplate<String, Student> kafkaTemplate;

    public void sendMessage(Student student) {
        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, "daniel")
                .build();

        kafkaTemplate.send(message);
    }

}
```

## Configuração da Classe

### Pacotes

- **Pacote:** `com.api.kafkademo.producer`

## Anotações Lombok

- **`@RequiredArgsConstructor`:** Gera automaticamente um construtor que aceita todos os campos marcados como `final` ou `@NonNull`.

## Campos

### `kafkaTemplate` (Tipo: `KafkaTemplate<String, Student>`)

- **Descrição:** Instância do `KafkaTemplate` especializado para mensagens contendo objetos da classe `Student`.

## Métodos

### `sendMessage`

- **Descrição:** Envia uma mensagem JSON para o tópico Kafka especificado.

- **Parâmetros:**
  - `student` (Tipo: `Student`) - O objeto `Student` que será enviado como mensagem.

- **Retorno:** Nenhum.

### Observações

- A classe `KafkaJsonProducer` é projetada para ser utilizada na produção de mensagens JSON em um tópico Kafka.

# Controlador REST para Envio de Mensagens: `MessageController`

O controlador `MessageController` é responsável por expor endpoints REST para o envio de mensagens para tópicos Kafka.

```java
package com.api.kafkademo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.kafkademo.payload.Student;
import com.api.kafkademo.producer.KafkaJsonProducer;
import com.api.kafkademo.producer.KafkaProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully");
    }

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Student message) {
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully as JSON");
    }

}
```

## Configuração da Classe

### Pacotes

- **Pacote:** `com.api.kafkademo.rest`

## Anotações Lombok

- **`@RequiredArgsConstructor`:** Gera automaticamente um construtor que aceita todos os campos marcados como `final` ou `@NonNull`.

## Campos

### `kafkaProducer` (Tipo: `KafkaProducer`)

- **Descrição:** Instância do `KafkaProducer` para enviar mensagens de texto para tópicos Kafka.

### `kafkaJsonProducer` (Tipo: `KafkaJsonProducer`)

- **Descrição:** Instância do `KafkaJsonProducer` para enviar mensagens JSON (objeto `Student`) para tópicos Kafka.

## Endpoints

### `POST /api/v1/messages`

- **Descrição:** Endpoint para enviar mensagens de texto para um tópico Kafka.

- **Parâmetros:**
  - `message` (Tipo: `String`, Formato: JSON) - A mensagem de texto a ser enviada.

- **Resposta:**
  - **Status:** 200 OK
  - **Corpo:** "Message queued successfully"

### `POST /api/v1/messages/json`

- **Descrição:** Endpoint para enviar mensagens JSON (objeto `Student`) para um tópico Kafka.

- **Parâmetros:**
  - `message` (Tipo: `Student`, Formato: JSON) - O objeto `Student` a ser enviado como mensagem JSON.

- **Resposta:**
  - **Status:** 200 OK
  - **Corpo:** "Message queued successfully as JSON"

### Observações

- Ambos os endpoints do controlador `MessageController` delegam o envio de mensagens aos respectivos produtores Kafka.

# Autor
## Feito por: `Daniel Penelva de Andrade`







