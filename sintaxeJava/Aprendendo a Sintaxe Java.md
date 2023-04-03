# Nessa etapa, estamos aprendendo a sintaxe JAVA. 

### Seus tópicos são:
- Anatomia das Classes
- Tipos e Variáveis
- Operadores



### Resumo dos tópicos:
##### - Anatomia das Classes

Todas as classes serguiram um padrão, onde a primeira letra sempre será maiúscula, e outras palabras associadas também terão sua letra iniciada em maiúscula.

//Exemplo 

Minha Classe > **MinhaClasse**

Também, elas devem seguir uma estrutura padrão, que seguirá iniciando com tipo, nome bem definido e a atribuição.

Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)

//Exemplo

int idade = 13;

double altura = 1.23;

Dog spike; (aqui não há uma atribuição)

Certo, e quando forem métodos? 
Há, esses danadinhos tem que ser no verbo inifitivo para dizer claramente a que vieram.

//Exemplo

Médoto de somar 2 números > somarNumeros (int n1, int n2)

#### Tipos e Variáveis

Ao todo existem 8 tipos primitivos:
- int, byte, short, long, double, float, boolean e char.

O que diferencia cada um deles é quantidade de bytes que cada um pode armanezar na memória.

Em alguns casos, onde você declara um valor int e depois quer a resposta em byte, acontece erro de compilação.
Isso ocorre porque a resposta tem um "case" menor que a pergunta, e o Java é chatinho.

//Exemplo

int a = 100
byte b = a + 1 

O código acima ira dar erro, pelos motivos mencionados.
Mas você pode forçar, colocando (byte) ao lado. 

//Exemplo

int a = 100
byte b = (byte) a + 1 //Aqui o Javinha será obrigado a responder em byte.

Em alguns casos também é necessário fixar valores, como constantes.
Então usamos a seguinte notação 

final tipo MAISCULO = VALOR;

//Exemplo
final float NUMERO_PI = 3.14F;  // o F é necessário, pois demonstra que o número é um float.

#### Operadores


--  Relacionais
    
    Atribuição " = "
    É igual a " == "
    Diferente " != "
    Maior " > "
    Menor " < "
    Maior/Menor ou igual " >= "  " <= "

-- Aritiméticos
    
    Adição " + " (* Serve para concatenar textos também)
    Subtração " - "
    Multiplicação " * "
    Divisão " / "

-- Unários

    (+) Operador unário de valor positivo (facultativo, todo e qualquer número sem operador já é um numero positivo, por exemplo.
    (-) Operador unário de valor negativo. Altera o valor do numeral para negativo.
    (++) Operador de incremento. Incrementa mais um ao valor.
    (--) Operador de decremento. Retira um ao valor.
    (!) Operador de negação, usado em operadores booleanos.

-- S
 

- 
- 

