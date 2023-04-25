# Visibilidade

Um modificador de acesso tem como finalidade determinar
até que ponto uma classe, atributo e método pode ser usado. 
A utilização de modificadores de acesso é fundamental para o 
uso efetivo da orientação a objetos. Algumas boas práticas e 
conceitos só são atingidos com o uso correto deles.

### Tipos:
- private: só dentro da classe.
~~~ JAVA
private 

private int i;
private void do();
~~~
- protect: visível dentro da classe, mesmo pacote e subclasse.
~~~ JAVA 
protected 

protected int i;
protected void do();
~~~
- public: todos podem ver.
~~~ JAVA
public 

public int i;
public void do();
~~~


Qual usar?
Todas tem seus respectivos usos, ou seja, uma finalidade.
A grande vantagem da O.O. é justamente o encapsulamento, ou seja, 
manter dados privados, protegidos ou publicos.