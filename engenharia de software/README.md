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

**Sistema Escolhido:** Sistema de Gerenciamento de Banco de Dados Relacional (RDBMS).

**Arquitetura:**

* **Modelo de Dados:** Usa tabelas para organizar informações. Fácil de entender, mas pode ser inflexível para certos tipos de dados.

* **Cliente-Servidor:** Divide as tarefas entre um servidor que armazena dados e clientes que interagem com o banco de dados. Pode haver atrasos na comunicação entre eles.

* **Escalabilidade:** Aumenta recursos em um único servidor (vertical) ou distribui dados em vários servidores (horizontal). Escalabilidade vertical tem limites práticos; escalabilidade horizontal pode ser mais desafiadora.

* **Desempenho:** Boa leitura de dados, mas gravação pode ser afetada em ambientes concorrentes devido à necessidade de manter consistência.
complicar a administração.

**Conclusão :**
O RDBMS é ótimo para quem valoriza consistência e segurança. No entanto, é importante considerar a rigidez do modelo, possíveis atrasos na comunicação cliente-servidor e desafios de escalabilidade ao escolher este sistema para garantir a adequação aos requisitos específicos.
 

# ATIVIDADE 5
### Inicie seu diagrama de classes de uma das partes da arquitetura (escolha uma parte de backend por favor)
Representar o backend do RDBMS. Irei definir as classes `Database`, `Table`, e `Column`.

```plaintext
+-------------------------------------+
|              Database               |
+-------------------------------------+
| - name: string                      |
| - tables: List<Table>                |
+-------------------------------------+
| + createTable(tableName: string): void|
| + dropTable(tableName: string): void |
| + executeQuery(query: string): Result|
+-------------------------------------+

+-------------------------------------+
|                Table                |
+-------------------------------------+
| - name: string                       |
| - columns: List<Column>              |
+-------------------------------------+
| + addColumn(columnName: string, dataType: DataType): void|
| + removeColumn(columnName: string): void|
+-------------------------------------+

+-------------------------------------+
|               Column                |
+-------------------------------------+
| - name: string                       |
| - dataType: DataType                 |
| - isPrimaryKey: boolean              |
| - isForeignKey: boolean              |
+-------------------------------------+
| + setPrimaryKey(): void             |
| + setForeignKey(referencedTable: Table, referencedColumn: Column): void|
+-------------------------------------+
```

Neste diagrama simplificado:

- `Database` possui métodos para criar e remover tabelas, além de executar consultas no banco de dados.
- `Table` representa uma tabela no banco de dados e contém métodos para adicionar e remover colunas.
- `Column` representa uma coluna em uma tabela e inclui informações sobre o tipo de dado, se é chave primária ou estrangeira.