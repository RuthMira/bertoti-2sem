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

### SLIDE 24
E que Software ela se aplica?
Trello\
Porque baseado nos Trade-off
O Trello é uma ferramenta popular para gestão de tarefas e projetos. Ele utiliza um sistema de quadros, listas e cartões para organizar informações.
Simplicidade: Sua interface intuitiva permite que você crie e gerencie tarefas de forma rápida e fácil.
Baixo Custo: O Trello oferece um plano gratuito com recursos básicos, tornando-o acessível para pequenas equipes e projetos individuais.

### SLIDE 25
E que Software ela se aplica?
SQLite\
Porque baseado nos Trade-off
Custo Baixo: O SQLite é um banco de dados embutido que não requer configuração de servidor e é gratuito.
Simplicidade Boa: O SQLite é simples de usar e não exige configurações complexas.
Ruim em Escala e Tolerância a Falhas: No entanto, o SQLite não é adequado para sistemas altamente concorrentes ou que precisam de alta escalabilidade e tolerância a falhas.

### SLIDE 26
E que Software ela se aplica?
Jekyll\
Porque baseado nos Trade-off
Custo Baixo: O Jekyll é um gerador de sites estáticos de código aberto e gratuito.
Simplicidade Boa: Ele permite criar sites estáticos com facilidade, sem a necessidade de um servidor de banco de dados.
Ruim em Escala e Tolerância a Falhas: No entanto, o Jekyll não é adequado para sites dinâmicos ou com grande volume de tráfego.

### SLIDE 27
E que Software ela se aplica?
Spring Boot\
Porque baseado nos Trade-off
Deployability (Implantação): O Spring Boot é um framework Java que simplifica a implantação de aplicativos. Ele incorpora um servidor embutido (como o Tomcat) e oferece opções de empacotamento (como JAR ou WAR) para facilitar a implantação.
Modularidade: O Spring Boot permite criar aplicativos modulares usando módulos Spring. Você pode escolher os módulos específicos necessários para o seu projeto.
Custo: O Spring Boot é de código aberto e gratuito.
Testabilidade: O Spring Boot oferece suporte a testes unitários e integração, permitindo que você escreva testes robustos para suas funcionalidades.

### SLIDE 28
E que Software ela se aplica?
Hadoop (HDFS e MapReduce)\
Porque baseado nos Trade-off
Complexidade: O ecossistema Hadoop, incluindo o HDFS (Hadoop Distributed File System) e o MapReduce, é poderoso, mas também complexo. Ele é usado para processamento distribuído de grandes volumes de dados.
Testabilidade: Testar aplicativos MapReduce pode ser complicado, pois envolve a divisão de tarefas em etapas de mapeamento e redução.

### SLIDE 29
E que Software ela se aplica?
Kubernetes\
Porque baseado nos Trade-off
Custo: Implementar e manter o Kubernetes pode envolver custos significativos, especialmente em termos de recursos humanos qualificados. No entanto, os benefícios de escalabilidade e tolerância a falhas podem justificar esses custos.
Complexidade: Kubernetes é uma plataforma robusta e poderosa, mas isso também significa que é complexo. A curva de aprendizado pode ser íngreme, mas existem muitos recursos e comunidades ativas para suporte.
Escalabilidade: Kubernetes é conhecido por sua capacidade de escalar aplicativos de maneira eficiente. Ele automatiza a implantação, a escala e a gestão de aplicativos em contêineres, facilitando o dimensionamento horizontal.
Modularização: Kubernetes oferece uma abordagem modular, permitindo que você construa e implante aplicativos de maneira modular usando contêineres. Isso facilita a implementação de microserviços e a criação de arquiteturas altamente modularizadas.
Tolerância a falhas: Kubernetes é projetado para ser altamente tolerante a falhas. Ele pode automaticamente substituir contêineres ou nós com falhas, distribuir o tráfego de maneira equitativa e garantir alta disponibilidade.



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


# ATIVIDADE 7
### Realizar testes Unitários e Automatizados para as minhas classes.

No `Teste` foram criados testes automatizados para todas as classes



