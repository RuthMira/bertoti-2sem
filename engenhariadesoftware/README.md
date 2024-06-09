# ATIVIDADE 1

"Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

### Meu comentário
## O que é Engenharia de Software?

**Engenharia de Software** é, de fato, muito mais do que apenas escrever código. Ela abrange todo o ecossistema em que um programa está inserido.É como construir uma casa.
O código-fonte seria como os tijolos e cimento que compõem as paredes.
É necessário definir como os diferentes componentes se encaixam, como as janelas se abrem e como a luz entra.
Antes de começar a construir, precisamos entender o que o cliente deseja. Isso envolve conversas, análise e documentação.
Assim como inspecionamos a casa para garantir que tudo funcione corretamente, os engenheiros de software testam o software para encontrar e corrigir problemas.
Uma casa precisa de manutenção ao longo do tempo. Da mesma forma, os softwares precisam ser atualizados, corrigidos e aprimorados.
Imagine que a casa faz parte de um bairro. Ela precisa se comunicar com outras casas, como sistemas de água, eletricidade e esgoto. Da mesma forma, os softwares precisam se integrar com outros sistemas e serviços.

Portanto, a Engenharia de Software é como construir uma casa inteligente, considerando todos os detalhes, desde a fundação até o telhado. 🏠💡


# ATIVIDADE 2

3 exemplos de trade-offs (em software) e explicá-los conforme comentários que fizemos na sexta.

### Exemplos de Trade-offs em Desenvolvimento de Software

O **trade-off** é um conceito essencial em diversas áreas, incluindo o desenvolvimento de software. Ele reflete a necessidade de fazer escolhas, muitas vezes envolvendo sacrifícios em prol de outros objetivos.

### 1. Desempenho versus Legibilidade do Código em Java:

**Trade-off:** Ao otimizar o desempenho em Java, um desenvolvedor pode escolher usar estruturas de dados altamente eficientes, como arrays, em vez de estruturas mais abstratas, tornando o código menos legível. Por outro lado, priorizar a legibilidade pode envolver o uso de estruturas mais expressivas, como coleções, mesmo que isso possa resultar em um desempenho ligeiramente inferior.

**Exemplo:** Utilizar arrays para armazenar grandes conjuntos de dados em vez de usar coleções mais flexíveis, como ArrayList, em situações em que o desempenho é crítico.

### 2. Manutenibilidade versus Desenvolvimento Rápido em Python:

**Trade-off:** Em Python, onde o desenvolvimento rápido é uma característica proeminente, pode ser tentador escrever código mais conciso, sacrificando alguma clareza. Isso pode resultar em código mais rápido para o desenvolvimento inicial, mas que pode ser mais difícil de manter no longo prazo.

**Exemplo:** Escrever funções complexas ou usar abordagens de programação funcional para reduzir a quantidade de código, mesmo que isso possa dificultar a compreensão para desenvolvedores que mantêm o código posteriormente.

### 3. Flexibilidade versus Segurança em NoSQL (por exemplo, MongoDB):

**Trade-off:** No caso de um banco de dados NoSQL como o MongoDB, a flexibilidade é um ponto forte, permitindo esquemas dinâmicos. No entanto, essa flexibilidade pode aumentar a vulnerabilidade a injeções de dados não desejados se não forem implementadas medidas de segurança adequadas.

**Exemplo:** Permitir que usuários adicionem campos dinamicamente aos documentos MongoDB pode oferecer flexibilidade, mas se não forem tomadas precauções, isso pode resultar em vulnerabilidades de segurança.


# ATIVIDADE 3

### SLIDE 24 - Arquitetura em Camadas: Simplicidade e Escalabilidade

E que Software ela se aplica?
A arquitetura em camadas é amplamente usada em muitos tipos de software devido às suas vantagens em termos de organização, manutenção e escalabilidade. É particularmente comum em aplicações empresariais, sistemas de gestão de conteúdo, e-commerce e aplicações web.

Porque baseado nos Trade-off
- **Simplicidade**: A divisão clara entre diferentes camadas facilita a compreensão e o desenvolvimento do sistema.
- **Manutenção**: As alterações em uma camada geralmente não afetam as outras, tornando o sistema mais fácil de manter e atualizar.
- **Escalabilidade**: Cada camada pode ser escalada de forma independente, permitindo que o sistema suporte um número crescente de usuários ou processos.
- **Reutilização**: Componentes em diferentes camadas podem ser reutilizados em outros sistemas ou aplicações.
- **Isolamento**: A separação de preocupações permite que diferentes equipes trabalhem em camadas específicas sem interferências.

### SLIDE 25 - Arquitetura de Pipeline: Simplicidade e Escalabilidade

E que Software ela se aplica?
A arquitetura de pipeline é usada em sistemas que necessitam de processamento sequencial de dados, onde cada etapa do pipeline realiza uma transformação específica antes de passar os dados para a próxima etapa. É comumente utilizada em processamento de streams, ETL (Extract, Transform, Load), processamento de imagens, compiladores e algumas aplicações de machine learning

Porque baseado nos Trade-off
- **Simplicidade**: Cada estágio do pipeline realiza uma função específica, o que facilita o desenvolvimento e a compreensão do sistema.
- **Modularidade**: As etapas do pipeline podem ser desenvolvidas, testadas e mantidas independentemente.
- **Escalabilidade**: Novas etapas podem ser adicionadas ao pipeline conforme necessário, e cada etapa pode ser escalada separadamente.
- **Reutilização**: Componentes do pipeline podem ser reutilizados em diferentes pipelines ou aplicações.

### SLIDE 26 - Arquitetura Microkernel: Overall Cost e Elasticity

E que Software ela se aplica?
A arquitetura Microkernel, também conhecida como arquitetura de plug-in, é comumente usada em sistemas que precisam de uma base mínima e extensível, com funcionalidades adicionais fornecidas por módulos ou plug-ins. É frequentemente aplicada em sistemas operacionais, servidores de aplicação, sistemas de gerenciamento de conteúdo (CMS) e geradores de sites estáticos.

Porque baseado nos Trade-off
- **Custo Baixo**: A base do microkernel é leve e pode ser desenvolvida com menos recursos, reduzindo o custo inicial.
- **Elasticidade**: Permite adicionar ou remover funcionalidades facilmente através de plug-ins, adaptando-se às necessidades específicas dos usuários.
- **Simplicidade**: A arquitetura central mínima é simples e fácil de entender, permitindo que os desenvolvedores se concentrem nas funcionalidades específicas dos plug-ins.
- **Manutenabilidade**: A modularidade facilita a manutenção e atualização do sistema, pois os plug-ins podem ser modificados independentemente do núcleo.


### SLIDE 27 -Arquitetura Baseada em Serviços: Overall Cost e Elasticity

E que Software ela se aplica?
A arquitetura baseada em serviços (Service-Oriented Architecture, SOA) é amplamente utilizada em sistemas empresariais complexos, aplicações web, plataformas de integração e ambientes de microserviços. Esta arquitetura permite que diferentes serviços de negócios sejam desenvolvidos, implantados e gerenciados de forma independente, promovendo a flexibilidade e a escalabilidade.

Porque baseado nos Trade-off
- **Deployability (Implantação)**: Serviços podem ser desenvolvidos, implantados e escalados de forma independente, facilitando a gestão de lançamentos e atualizações contínuas.
- **Elasticidade**: Permite que os serviços sejam dimensionados horizontalmente para atender à demanda, proporcionando alta elasticidade e resiliência.
- **Modularidade**: Cada serviço pode ser desenvolvido com uma funcionalidade específica, promovendo a modularidade e a reutilização de componentes.
- **Interoperabilidade**: Facilita a integração entre serviços desenvolvidos em diferentes tecnologias e linguagens de programação.

### SLIDE 28 - Arquitetura Serverless: Simplicity e Evolutionary

E que Software ela se aplica?
A arquitetura serverless é utilizada em sistemas que requerem execução eficiente de funções e serviços em resposta a eventos, sem a necessidade de gerenciamento de infraestrutura. É comumente aplicada em aplicações web, processamento de dados em tempo real, automação de workflows e integração de sistemas.

Porque baseado nos Trade-off
- **Simplicidade**: Desenvolvedores podem se concentrar no código e na lógica de negócios sem se preocupar com a administração de servidores.
- **Escalabilidade Automática**: A infraestrutura serverless escala automaticamente para lidar com a demanda, oferecendo elasticidade e eficiência de recursos.
- **Custo Eficiente**: Você paga apenas pelo tempo de execução das funções, reduzindo custos operacionais, especialmente para cargas de trabalho irregulares ou esporádicas.
- **Rapidez de Desenvolvimento**: Facilita a rápida prototipagem e implementação de funcionalidades, acelerando o ciclo de desenvolvimento.

### SLIDE 29 - Arquitetura de Microsserviços: Modularidade e Overall Cost

E que Software ela se aplica?
A arquitetura de microsserviços é usada em sistemas que exigem alta modularidade, escalabilidade e flexibilidade. É particularmente adequada para grandes aplicações empresariais, plataformas de e-commerce, serviços financeiros, e qualquer ambiente que precise de desenvolvimento e implantação contínuos de funcionalidades.

Porque baseado nos Trade-off
- **Modularidade**: Cada serviço é desenvolvido de forma independente, permitindo a construção e manutenção de aplicativos complexos com componentes modulares e reutilizáveis.
- **Escalabilidade**: Permite escalar cada serviço de forma independente, proporcionando uma escalabilidade eficiente e uso otimizado de recursos.
- **Resiliência**: A falha em um serviço não necessariamente afeta outros serviços, aumentando a tolerância a falhas e a disponibilidade.
- **Agilidade**: Facilita o desenvolvimento e implantação contínuos, permitindo que diferentes equipes trabalhem simultaneamente em diferentes serviços.

# ATIVIDADE 4
### Escolha um sistema e: Defina sua arquitetura debatendo tradeoffs com os requisitos não funcionais comentados em aula

**Sistema Escolhido:** Sistema de Comércio Eletrônico (E-commerce).

**Arquitetura:**

* **Arquitetura de Microserviços:**
   - **Vantagens:**
     - **Escalabilidade:** Os microserviços podem ser escalados independentemente, permitindo que partes específicas do sistema lidem com mais carga.
     - **Manutenibilidade:** Cada microserviço é uma entidade separada, facilitando atualizações e correções sem afetar o sistema como um todo.
     - **Desenvolvimento Ágil:** Equipes podem trabalhar de forma independente em microserviços, acelerando o desenvolvimento.

   - **Desvantagens:**
     - **Complexidade da Rede:** A comunicação entre microserviços pode resultar em uma rede complexa, exigindo uma boa gestão e monitoramento.
     - **Consistência Transacional:** Garantir transações consistentes em um ambiente distribuído pode ser desafiador.

* **Banco de Dados NoSQL para Dados Não-Estruturados:**
   - **Vantagens:**
     - **Flexibilidade de Esquema:** Os bancos de dados NoSQL são ideais para lidar com dados não estruturados, com a capacidade de ajustar esquemas conforme necessário.
     - **Desempenho em Leitura e Gravação:** Podem oferecer melhor desempenho em casos de leitura e gravação intensiva, com modelos de dados otimizados para determinados casos de uso.

   - **Desvantagens:**
     - **Consistência Eventual:** Alguns bancos de dados NoSQL podem optar por consistência eventual, o que pode levar a leituras inconsistentes em ambientes altamente concorrentes.
     - **Menos Suporte a Transações Complexas:** Funcionalidades avançadas de transação podem ser limitadas em comparação com bancos de dados relacionais.

* **Escalabilidade Horizontal:**
   - **Vantagens:**
     - **Distribuição de Carga:** Permite a adição fácil de recursos, distribuindo a carga entre vários servidores.
     - **Resiliência:** Em caso de falha, a presença de múltiplos nós permite manter a operação sem grandes interrupções.

   - **Desvantagens:**
     - **Complexidade de Configuração:** Configurar e gerenciar a escalabilidade horizontal pode ser mais complexo do que simplesmente aumentar os recursos de um servidor.
     - **Custo:** Aumentar a infraestrutura horizontalmente pode resultar em custos mais elevados.

**Conclusão:**
A arquitetura escolhida, baseada em microserviços, banco de dados NoSQL para dados não estruturados e escalabilidade horizontal, é adequada para um sistema de comércio eletrônico. Ela oferece flexibilidade, escalabilidade e desempenho. A escolha depende dos requisitos específicos do sistema e das prioridades em termos de escalabilidade, consistência e manutenibilidade. 

# ATIVIDADE 5
### Inicie seu diagrama de classes de uma das partes da arquitetura (escolha uma parte de backend por favor)
As classes serão `ProdutoServico`, `Produto`, e `Inventario`.

![Diagrama de Classes](./img/Diagrama%20de%20classe.jpg)


# ATIVIDADE 6

### Funcionamento do Sistema

O sistema consiste em um sistema de gerenciamento de inventário de produtos, com as seguintes classes principais:

#### 1. Classe `Produto`

A classe `Produto` representa um produto no inventário e possui os seguintes atributos:

- `idProduto`: identificador único do produto.
- `nome`: nome do produto.
- `preco`: preço do produto.
- `quantidade`: quantidade disponível do produto.

Além disso, a classe `Produto` possui métodos para obter e definir os valores dos atributos e um método `detalhesProduto()` para retornar uma representação detalhada do produto.

#### 2. Classe `Inventario`

A classe `Inventario` representa o inventário de produtos e possui os seguintes métodos:

- `adicionarProduto(Produto produto)`: adiciona um produto ao inventário.
- `removerProduto(String idProduto)`: remove um produto do inventário com base no ID do produto.
- `listarProdutos()`: retorna uma lista de todos os produtos no inventário.
- `getProdutoPorId(String idProduto)`: retorna um produto específico com base no ID do produto.

Essas classes trabalham juntas para fornecer funcionalidades de gerenciamento de inventário.

#### 3. Classe `Servicoproduto`

A classe `Servicoproduto` é responsável por gerenciar os produtos do inventário. Ela interage com a classe `Inventario` para manter o controle dos produtos disponíveis. As principais funcionalidades oferecidas por esta classe são:

- **Criação de Produto**: O método `criarProduto` permite a criação de um novo produto com um nome, preço e quantidade específicos. Ele verifica se os parâmetros fornecidos são válidos e, em seguida, gera um ID exclusivo para o produto antes de adicioná-lo à lista de produtos e ao inventário.

- **Atualização de Produto**: O método `atualizarProduto` permite a atualização das informações de um produto existente. Ele encontra o produto na lista pelo ID e atualiza seu nome, preço e quantidade com os novos valores fornecidos.

- **Exclusão de Produto**: O método `deletarProduto` remove um produto da lista de produtos e do inventário com base em seu ID.

- **Obtenção de Lista de Produtos**: O método `getProdutos` retorna uma lista de todos os produtos atualmente gerenciados pela classe.

- **Obtenção de Produto por ID**: O método `getProdutoPorId` permite a recuperação de um produto específico com base em seu ID.

Essa classe desempenha um papel fundamental no controle e na manipulação dos produtos do inventário, garantindo que as operações de criação, atualização e exclusão sejam realizadas de maneira adequada e coordenada com o inventário.



á fazer

# ATIVIDADE 7
### Realizar testes Unitários e Automatizados para as minhas classes. [CRIAR PROJETO J. UNITY]

# ATIVIDADE 8
![Diagrama de Classe de Uso](./img/Diagrama%20de%20Classe%20de%20uso.jpg)





