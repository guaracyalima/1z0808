# Arrays

### Conceitos

Formalmente, são estruturas de dados para o armazenamento e a recuperação de dados, sendo assim uma das estruturas de dados mais básicas.

Os arrays fora embutidos na linguagem java para o tratamento de dados que sejam do mesmo tipo, permitindo assim que o desenvolvedor use apenas uma unica variavel, com um ou mais indicies para acessar vários dados independentes.

Arrays podem ser usados para armanezar tanto tipos primitivos quanto objetos.

Os arrays são classificados em dois tipos: unidimensionais e multidimensionais

Um array unidimensional usa um unico indicie do array para realizar acesso aos dados.

Todos os arrays são baseados em zero (0)

### Anatomia de um arrau unidimensional

um array unidimensional é declarado com o uso de de colchetes [] apos o tipo ou com colchetes apos o nome da variavel

`class E1 {}`

Quando um array está sendo declarado, não há inserção de numeros entre os colchetes.

Um array é declarado da mesma forma tanto para objetos quanto para primitivos.

### Inicialização de arrays unidimensionais

Uma vez declarado, o array deve ser inicializado. Os arrays podem ser inicializados de maneira semelhante a como os objetos, ou seja, o operador `new` é usado seguido pelo tipo, com colchetes contendo a extensao ou o tamanho di array.

A Inicialização de um array pode ocorrer na linha da declaração ou em sua propria linha.

`class E2 {}`

Arrays de primitivos podem usar o operador `new`

---

Quando um array é inicializado com um tamanho já definidio (String[3] args), ele não poderá ser alterado sem que sofra uma nova Inicialização.

Se o array declarado contiver tipos primitivos, cada primitivo será configurado com zeros:

`class E3 {}`

É possivel ainda, passar tdas os valores de um array logo na declaração do mesmo. Para tanto, basta inserir os valores a serem armazenados entre chaves `{}`, que deveram vir logo apos a declaração na mesma linha. Os valores entre chaves devem ser separados por virgulas `,`:

`class E4{}`

Quando um array é inicializado com chaves, é obrigatóriamente feito dentro da mesma instrução da declaração. Ao contrário do que ocorre com o operador new, um array não pode ser inicializado em chaves em uma linha de codigo diferente:

`class E5{}`
Que ao ser COMPILADO gera o erro:

`error: illegal start of expression`
