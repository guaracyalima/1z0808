# 1z0-808 - Methods

É a espinha dorsal de um aplicativo, a maneira com que os objetos interagem com
os métodos definem a funcionalidade do software.

### Composição de um método

Os métodos são compostos por:

- **Modificador de acesso** `public`, `private`, `package`, vale lembrar que se nenhum modificador de acesso o default `package` é automaticamente adicionado pelo compilador, porém não exposto no código

- **tipo de retorno** é obrigatório informar o tipo de retorno de cada método

- **identificador do método** é o nome do método

- **lista de parâmetros** um método pode ter de 0 a `n` parâmetros. Se o método não possui uma lista de parâmetros, implica dizer que ele não necessita de entradas externas para executar sua ação.

- **corpo do método** são as ações que este método executa

#### Modificadores de acesso

Os modificadores de acesso informam ao compilador ea JVM quais outros objetos podem acessar esse código.
A escala de menos restritivo à mais restritiva:

- `private`
- `package, package-private` - default
- `protected`
- `public`

São inseridos no início da declaração do método, variável, constante, etc.

- Pode ainda ser combinados modificadores de acesso gerais, tais como:
- `final`
- `syncronized`
- `abstract`
- `static`
- `native`
- `strictfp`

#### Tipo de retorno

Um método pode retornar uma única variável ou nenhuma, podendo ainda ser um objeto ou um primitivo

Todo método deve declarar um tipo de retorno ou usar a palavra reservada `void` para indiciar que nada será retornado ao chamador a partir desse método.

Sempre que for definido um tipo de retorno - ou seja, que o método não seja `void` - , a instrução `return` passa a ser obrigatória

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

#### Identificador do método

Também conhecido como _nome do método_, é o texto usado para referenciar o método posteriormente no código

É boa prática que o nome do método descreva o que ele faz, ex:

- `public void calculaDescontoSalario(){}`
- `public String converteStringParaMaiusculo(){}`

#### Lista de parâmetros

Fica localizada logo após o identificador do método, ex: `public void calculaDescontoSalario(BigDecimal salario, double valorDesconto){}`

É incluída entre parênteses e é separada por vírgulas

- É possível incluir até 255 parâmetros em um método

- Podem ser objetos, tipos enumerados ou primitivos

- O tipo é informado antes da declaração da variável
  `public void nome_do_metodo(BigDecimal salario)`

#### Lista de exceptions lançadas

Após a lista de parâmetros, podem ser informadas ainda a lista de exceptions que esse método pode lançar. A declaração começa com a palavra reservada `throws` seguida do tipo de exceção
Ex:

```
  public int getAge(People p) throws RuntimeException {}
```

Pode ser lançadas 0 ou mais exceptions, informadas sendo separadas por `,`

#### Corpo do método

É a parte principal do método e contém todo o código que compõe sua funcionalidade

- Pode conter uma única linha ou várias centenas de linhas

- Se o método declarar um tipo de `return`, será obrigatório declarar-lo precedido de um literal ou variável que seja desse tipo

- Quando o retorno é void, a instrução return não é obrigatória.

- Um método pode ter apenas a instrução return, desacompanhado de variável ou literal tipada.

`MÉTODOS ABSTRATOS NÃO POSSUEM CORPO`

## Criando e chamando métodos

As classes são compostas por variáveis e métodos. Variáveis de instância compõem o estado do objeto e os métodos são os responsáveis por todas as ações.

Os métodos ficam contidos em objetos

Um método deve ser chamado a partir da instância do objeto do qual faz parte
Os métodos em java são chamados com auxílio do ponto `.` ex: `new MinhaClasse().meuMetodo()`

- Os nomes de variáveis na lista de parâmetros não precisam ser os iguais aos nomes que aparecem na definição do método. Porém os seus tipos devem ser compatíveis

- Métodos que não retornam dados (void) não podem ser usados para definir o valor de variáveis, por exemplo:

<pre>
  <code>

  class E1 {

  	public static void main( String[] args){
      // tenta realiza a atribuição a um int com o retorno de um método void
  		int i = new E1().metodoSemRetorno();
  	}

  	public void metodoSemRetorno(){};

  }
  </code>
</pre>

Ao executar esta clase será mostrado `error: incompatible types: void cannot be converted to int`

- Já os métodos que retornam algum valor podem ser usados na atribuição a uma variável, porém o uso deste retorno não é obrigatório

### Sobrecarga de métodos

Quando vários métodos compartilham o mesmo identificador (nome), mas tem listas de parâmetros diferentes, diz-se que eles foram sobrecarregados.

- Na sobrecarga de métodos a lista de parâmetros pode ser maior ou menor que a dos outros métodos, ou ainda serem de tipos diferentes
- Métodos sobrecarregados não precisam ter o mesmo tipo de retorno
- É boa prática que métodos sobrecarregados possuam comportamentos semelhantes

### Passagem de objetos por referência

Uma variável `será passada por valor se for um primitivo` e `por referência se for um objeto`

#### Passagem de primitivos por valor para métodos

Quando um primitivo é usado como argumento, uma cópia do valor é feita e fornecida para o método.

Se o método faz alterações no valor da variável ele será apenas uma cópia como demonstrado no código abaixo:

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

ao ser compilada retornará:

```
1
1
3
1

```

#### Passagem de objetos por referência para métodos

Objetos são passados por referência para métodos, ou seja, ao invés de uma cópia, uma referência do objeto original é que é passada.

**Qualquer objeto é passado por referência**

Quando passados por referências, ao serem realizadas alterações no objeto, seu estado é também alterado:

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
Valor inicial 1
Saída inicial 4
Segunda chamada 4


```
