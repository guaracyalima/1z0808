# Considerações a respeito do metodo main

## ERRO

Os itens abaixo apresentam erro em tempo de execução, ou seja, COMPILAM, porem NÃO EXECUTA

- O metodo main deve sempre conter a palavra `static`

```
public class E5 {
public void main(String[] args){
}
}

```

- Deve ter sempre o tipo de retorno `void`

```
public class E5 {
static long main(String[] args){
        //non compilant
}
}

```

- Deve ser sempre public:

```
public class E5 {
static void main(String[] args){
        //n compila
}
}

```

### Erro de compilação:

- Mudar a posição do retorno `public void static main(String args[ ])` gera um erro em tempo de compilação

## Alterações que funcionam

- O metodo main pode ser `final`
