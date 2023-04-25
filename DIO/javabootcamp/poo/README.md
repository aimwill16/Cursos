# (P)rogramação (O)rientada a (O)bjetos.

## Conceito de Classe
Classe é a unidade miníma de implementação
que abstrai um conjunto de objetos com características similares.

Uma classe define o comportamento de seus objetos através de métodos
e os estados possíveis destes objetos através de atributos.

Em termos, classe serve de molde do conceito do mundo real. 

Exemplos de clase: Carro, Viagem, Computador. São itens do mundo real concretos,
que possuem limites, caracteristicas próprias.

Dicas para identificar classes:
- Substantivos. 
- Nomes significativos.
- Contexto deve ser considerado.


## Conceito de Atributo
Atributo é o elemento da classe responsável por definir estrutura de dados.
O conjunto destes será responsável por representar suas características e fará parte
dos objetos criados a partir da classe.
Ex: Classe carro tem atributo de cor.

São, de certa forma, as caracteristicas da classe/objeto acima mencionado.
 
Atributo x Variável.
Atributo é a caracteristica de algo, no caso a COR, que precisa ter um tipo String.
Variável é algo sujeito a mudanças, no caso o atributo COR tem variável AZUL,
que poderia ser AMARELO, VERDE... Viu? Variável, varia.

Dicas para identificar atributos.

- substantivos e adjetivos.
- Nomes significativos.
- Contexto deve ser considerado.
- Abstração.
- Tipos adequados (String, int, float, double...).

## Conceito de Método
Método são consideradas as ações que podem ser executadas
dentro das classes. Ex: class Carro, método ligar.

Em Java, o método tem a criação baseada em:

- Visibilidade
- Retorno
- Nome 
- Parâmetros

Dicas para identificar métodos.

- Verbos.
- Nomes significativos.
- Contexto deve ser considerado.

Em java:
~~~
class Carro{
    void frear(){
    ...
    }
}
~~~
Métodos especiais:
 
- Construtor: constroi objetos a partir das nossas classes.
~~~
class Carro{
Carro(){
}
~~~
Obrigatoriamente será o mesmo nome da classe.

- Destrutor: finaliza objetos. Ex.: precisou ser construida
 um objeto para utilização de alguma porta do computador, logo 
é uma boa prática que depois da utilização, essa porta seja fechada pelo programa.

~~~Java
class Carro{
    void finalize(){
    ... 
}
} 
~~~

- Sobrecarga: muda a assinatura de acordo com a necessidade.
Assinatura: nome + parâmetros

~~~Java:
m1()
m1(int i)
m1 (float f)
m1 (String s, long l)
m1 (long l, String s)
~~~

Pra quê? Simplifica o código e o torna mais legível, além de poder
ser útil para com apenas um método lidar com vários casos, como o código acima.

## Conceito de Objeto
É a representação do conceito de entidade do mundo real, que possui
significado bem definido em software. Para esse objeto/entidade deve ser definida incialmente uma classe
a partir da qual posteriormente serão instanciados objetos distintos.

Qual diferença de classe e objeto?
Classe seria algo mais estático, que serve de molde para criação de objetos. 
Objetos já executa ações e fazem elas acontecerem.\

~~~Java
Carro carro = new Carro();
// o tipo Carro cria um objeto chamado carro que recebe um novo "new" objeto Carro sem parâmetros.
~~~

### Mensagem

É o processo de ativação de um método de um objeto. 
Isto ocorre quando uma requisiçào (chamada) a esse método é realizada.
Assim, dispara a execução de seu comportamento descrito por sua classe.
Pode ser também **direcionada à classe**, caso a requisição seja um método estático.

~~~Java
Carro carro - new Carro();
carro.<método>;
//chamo o método que quero a partir do objeto.

Carro.<método>;
//se for para a classe, chamo diretamente o método para a classe.
~~~


## Ainda a estudar:

- Insância x Estático: atributos e métodos..
- Estado de um objeto.
- Identidade de um objeto.
- Representação númerica de um objeto.
- Representação padrão de um objeto.
- Tipos de classes: abstrata e concreta.
- métodos abstratos.
- caracteristicas das associacoes
- palavras coringas: super, base, e super()
- relacao entre classes e interface: extends e implements.
