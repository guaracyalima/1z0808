# 1z0-808 - Methods

É a espinha dorsal de um aplicativo, a maneira com que os objetos interagem com
os metodos definem a funcionalidade do software.

### Composição de um metodo

Os metodos são compostos por:

- **Modificador de acesso** `public`, `private`, `package`, vale lembrar que se nenhum modificador de acesso o default `package` é automaticamente adicionado pelo compilador, porem não exposto no codigo

- **tipo de retorno** é obrigatório informar o tipo de retono de cada metodo

- **identificador do metodo** é o nome do metodo

- **lista de parametros** um metodo pode ter de 0 a `n` parametros. Se o metodo não possue uma lista de parametros, implica dizer que ele não necessita de entradas externas para executar sua ação.

- **corpo do metodo** são as ações que este metodo executa

#### Modificadores de acesso

Os modificadores de acesso informam ao compilador ea JVM quais outros objetos podem acessar esse código.
A escala de menos restritivo à mais restritiva:

- `private`
- `package, package-private` - default
- `protected`
- `public`

São inseridos no inicio da declaração do metodo, variavel, constante, etc.

- Pode ainda ser combinados modificadosres de acesso gerais, tais como:
- `final`
- `syncronized`
- `abstract`
- `static`
- `native`
- `strictfp`

#### Tipo de retorno

Um metodo pode retornar uma unica variavel ou nenhuma, podendo ainda ser um objeto ou um primitivo

Todo metodo deve declara um tipo de retonro ou usar a palavra reservada `void` para indiciar que nada será retornado ao chamador apartir desse metodo.

Sempre que for definido um tipo de retorno - ou seja, que o metodo não seja `void` - , a instrução `return` passa a ser obrigatória

Anatomia de um return:
`return varival_ou_literal_com_o_tipo_de_dado_definido`
ex:

<pre>
  <code>

  //retornando um tipo primitivo

  public int getAge(){
    int age = 27;
    return age;
  }

  //retornando um objeto

  public ArrayList getAllEmployers() {
    return new ArrayList();
  }
  </code>
</pre>

#### Identificador do metodo

Tambem conhecido como _nome do metodo_, é o texto usado para referênciar o metodo posteriomente no código

É boa pratica que o nome do metodo descreva o que ele faz, ex:

- `public void calculaDescontoSalario(){}`
- `public String converteStringParaMaiusculo(){}`

#### Lista de parametros

Fica lcalizada logo apos o identificador do metodo, ex: `public void calculaDescontoSalario(BigDecimal salario, double valorDesconto){}`

É incluida entre parenteses e é separada por vigulas

- É possivel incluir ate 255 parametros em um metodo

- Podem ser objetos, tipos enumerados ou primitivios

- O tipo é informado antes da declaração da variavel `public void nome_do_metodo(BigDecimal salario)`

#### Lista de exceptions lançadas

Apos a lista de parametros, podem ser informadas ainda a lista de exceptions que esse metodo pode lançar. A declaração começa com a palavra reservada `throws` seguida do tipo de exeção
Ex:

```
  public int getAge(People p) throws RuntimeException {}
```

Pode ser lançadas 0 ou mais exceptions, informadas sendo separadas por `,`

#### Corpo do metodo

É a parte principal do metodo e contem todo o codigo que compoe sua funcionalidade

- Pode conter uma unica linha ou varias centenas de linhas

- Se o metodo declarar um tipo de return, será obrigatório declara-lo precedido de um literal ou variavel que seja desse tipo

- Quando o retonro é void, a instrução return não é obrigatória.

- Um metodo pode ter apenas a strução return, desacompanhado de varial ou literal tipada.

`METODOS ABSTRATOS NÃO POSSUEM CORPO`

## Criando e chamando metodos

As classes são compostas por variaveis e metodos. Variaveis de instancia compoem o estado do objeto e os metodos sao os responsaveis por todas as ações.

Os metodos ficam contidos em objetos

Um metodo deve ser chamado apartir da instancia do objeto do qual faz parte
Os metodos em java são chamados com auxilio do ponto `.` ex: `new MinhaClasse().meuMetodo()`

- Os nomes de variaveis na lista de parametros não precisam ser os iguais aos nomes que paracem na definição do metodo. Pore os seus tipos devem ser compativeis

- Metodos que não retornam dados (void) não podem ser usados para definir o valor de variaveis, por exemplo:

<pre>
  <code>

  class E1 {

  	public static void main( String[] args){
      // tenta realiza a atribuição a um int com o retonro de um metodo void
  		int i = new E1().metodoSemRetorno();
  	}

  	public void metodoSemRetorno(){};

  }
  </code>
</pre>

Ao executar esta clase será mostrado `error: incompatible types: void cannot be converted to int`

- Já os metodos que retornam algum valor podem ser usados na atribuição a uma variavel, porem o uso deste retorno não é obrigatório

### Sobrecarga de metodos

Quando vários metodos compartilham o mesmo idenfiticador (nome), mas tem listas de parametros diferentes, diz-se que eles foram sobrecarregados.

- Na sobrecarga de metodos a lista de parametros pode ser maior ou menor que a dos outros metodos, ou ainda serem de tipos diferentes
- Metodos sobrecarregados não precisam ter o mesmo tipo de retorno
- É boa pratica que metodos sobrecarregados possuam comportamentos semelhantes

### Passagem de objetos por referência

Uma variavel `será passada por valor se from um primitivo` e `por referência se for um objeto`

#### Passagem de primitivos por valor para metodos

Quando um primitivo é usado como argumento, uma copia do valor é feita e fornecida par ao metodo.

Se o metodo faz alterações no valor da varivel ele será apenas uma copia como demonstrado no codigo abaixo:

```
class E2{

  void addTwo( int value ){
    System.out.println(value);
    value += 2;
    System.out.println(value);
  }

  public static void main(String[] args) {

      int i = 1;

      System.out.println(i);

      new E2().addTwo(i);

      System.out.println(i);
  }
}


```

ao ser compilada retornorá:

```
1
1
3
1

```

#### Passagem de objetos por referência para metodos

Objetos são pasasdos por referência para metodos, ou seja, ao invez de uma copia, uma referência do objeto original é que é passada.

**Qualquer objeto é passado por referência**

Quando passados por referencias, ao serem realizadas alterações no objeto, seu estado é tambem alterado:

```
class E3 {
  int number;
  public E3 (int number){
    this.number = number;
  }

  int getNumber(){
    return this.number;
  }

  void setNumber(int number){
    this.number = number;
  }

  void addTree (E3 value){
    System.out.println("Valor incial" + value.getNumber());

    value.setNumber(value.getNumber() + 3);

    System.out.println("Saida inicial " + value.getNumber());
  }

  public static void main(String[] args) {
    E3 e = new E3(1);
    System.out.println("Primeira chamada " + e.getNumber());
    e.addTree(e);
    System.out.println("Segunda chamada " + e.getNumber());
  }
}


```

que produz a sida:

```

Primeira chamada 1
Valor incial1
Saida inicial 4
Segunda chamada 4


```
