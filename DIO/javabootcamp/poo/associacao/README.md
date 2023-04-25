# Conceito de Associação.

Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos
e representar de forma completa o conceito ao qual se destinam.
Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos.

### Tipos:
### Estrutural:
- Composição: "Com parte todo"

Ex: Pessoa e Endereço. Endereço existe porque Pessoa é parte inerente.
Se a Pessoa deixa de existir, o Endereço deixa de existir... "Com parte todo". Há dependência de um pelo outro.

~~~ JAVA
class Pessoa { 
    Endereco endereco;
}  
~~~
- Agregação: "Sem parte todo"
Ex: Disciplina e Aluno. Um não tem dependencia de existência pelo outro.
São independetes.

~~~ JAVA
class Disciplina {
Aluno aluno;
}
~~~

Qual diferença entre Agregação e Composição?
Conceitualmente são diferentes, mas no código, pelo menos em JAVA, são iguais.

### Comportamental:
- Dependencia: "Depende de"
A entidade Compra tem um método de finalizar que acrescenta um Cupom.
Logo, a classe Compra tem um método que depende de usar o Cupom.

~~~ Java
class Compra {
...
finalizar (Cupom cupom, ...){
...
    }
}
~~~

Herança ou Associação? 
Uma coisa é outra? Herança.
Se uma coisa não é outra, então Associação.
