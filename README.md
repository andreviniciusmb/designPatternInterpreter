# Interpreter
O objetivo desse repositório é apresentar um exemplo da utilização do padrão de projeto Interpreter para o Seminário final da disciplina de <b>Programação Orientada a Objetos</b>.

O site DevMedia, apresenta <b>padrão de projeto</b> como sendo uma solução recorrente, um mapa, para um problema em determinado contexto, mesmo que em projetos e áreas distintas.
Os padrões de projeto são compostos basicamente por 4 elementos: o nome do projeto, problema a ser resolvido, solução e consequências, ou seja, qual vantagem e/ou desvantagem ao implementar tal padrão.
</p>
Aqui, apresentaremos o Interpreter, esse padrão tem como <b>objetivo</b> traduzir ou representar algum comando ou sintaxe da linguagem natural,
um exemplo seria a tradução de uma expressão numérica para a linguagem matemática e a tradução de um idioma para outro. 

## Composição do Interpreter
<ul>
  <li><b>Nome:</b> Interpreter </li>
  <li><b>Problema:</b> Conjunto de problemas de linguagem que ocorrem repetidamente.</li>
  <li><b>Solução:</b> A partir de uma sentença, representá-la em sua gramática com o auxílio de um interpretador.</li>
  <li><b>Consequências:</b></li>
  <ul>
    <li>Fácil interpretação da gramática</li>
    <li>Baixa frequência de uso</li>
    <li>Facilidade em implementar uma regra gramatical</li>
   </ul>
</ul>

## Projeto Implementado
Nesse projeto será implementado um interpretador de uma expressão numérica com notação posfixa, ou seja, os operadores serão colocados depois dos operandos, 
já no ensino fundamental é apresentado para os alunos a expressão numérica com notação infixa, com a seguinte estrutura: operando, operador e operando.
<ul>
  <li>Exemplo</li>
    Foi implementado a expressão posfixa: 1 2 3 * +, que corresponde a: 1 + 2 * 3, na forma infixa. E como resultado, obteve-se: 7.
    </br>Resolução:
    </br>1 + 2 * 3 =
    </br>1 + 6 =
    </br>7
</ul>
