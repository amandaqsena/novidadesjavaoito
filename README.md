# Novidades do java 8

## Métodos default
Interfaces agora podem possuir métodos default.
- Exemplos
    - sort, que recebe um comparable
    - replaceAll
    - forEach, que recebe um consumer

Você pode conferir outros métodos default adicionados na [interface list do java 8](https://docs.oracle.com/javase/8/docs/api/java/util/List.html). 

## Lambdas

Podemos implementar interfaces funcionais ao invés de declarar classes anônimas de forma sucinta. Essas interfaces possuem apenas um método abstrato, e, por esse motivo, não precisamos nomeá-lo ao usar lambdas. Dessa forma, podemos apenas declarar argumentos e o bloco a ser executado.

Interfaces funcionais também podem ter outros métodos, desde que sejam default ou static.

## Method References

Podemos também escrever lambdas curtos como method references. Nesse tipo de sintaxe, escrevemos o tipo + "::" + o nome do método.

Exemplo:

palavras.forEach(System.out::println);

## Streams

Method references servem para blocos bem pequenos. A partir do java 8, todas as collections possuem um método chamado stream. Existe também a interface Stream. Essa interface possui vários métodos como filter, sort, forEach,etc. Tudo que é feito em uma Stream, não impacta a lista que gerou a Stream. Os streams podem ser trabalhados em paralelo e funcionam de forma lazy, o que pode ser vantajoso.

Quando estivermos trabalhando com tipos primitivos, podemos usar streams primitivos para evitar o autoboxing, por exemplo o IntStream.

Chamamos de design pattern essa forma de trabalhar que os streams usam, de retornar objetos do mesmo tipo ao chamar um método desse objeto.

[Documentação da api de Stream](http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

## Optional

É uma classe nova do java 8 que permite que trabalhemos com null. Evita o uso de "if(o == null)".

Alguns métodos interessantes: map, collect, findFirst e findAny.

[Documentação da api de Optional](http://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)

## Datas

A api de datas é mais uma novidade do java 8. Com essa novidade, você não precisa lidar com as dificuldades de trabalhar com as classes Date e Calendar. As datas do LocalDate são imutáveis. Para obter diferenças entre duas datas, podemos usar o Period. As datas podem ser formatadas com DateTimeFormatter. Podemos também trabalhar com modelos mais específicos da nova api, como YearMonth. Existem diversas outras classes como essa para trabalhar de forma específica.

Para trabalhar com horas, minutos e segundos, podemos usar a classe LocalDateTime. E, se quisermos apenas o tempo, podemos usar LocalTime.

## Novidades de outras versões do java

- Java 9
    - Factory method para coleções: Collection.of
    - Fluxo reativo
    - Java modular: podemos declarar módulos que requerem algo
- Java 10
    - Releases baseadas em tempos
    - Inferência de variável: vale para escopo de métodos, é local, permitindo o uso da palavra reservada var
    - Interface para garbage collector
- Java 11
    - execução do java com um único comando, sem o javac
    - HttpClient: nova api com suporte para http2 e tem métodos contrutores
- Java 12
    - novo garbage collector
- Java 13
    - mudanças na Socket api
    - text blocks, facilitando escrita de strings com quebra de linha sem o uso de \n, usando aspas triplas
- Java 14
    - helpful NullPointerException
    - Switch Expressions mais sucinta