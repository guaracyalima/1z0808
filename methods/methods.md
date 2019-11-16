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

## Modificadores de acesso

Os modificadores de acesso informam ao compilador ea JVM quais outros objetos podem acessar esse código.
A escala de menos restritivo à mais restritiva:

- `private`
- `package, package-private` - default
- `protected`
- `public`

São inseridos no inicio da declaração do metodo, variavel, constante, etc.

## Tipo de retorno

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
