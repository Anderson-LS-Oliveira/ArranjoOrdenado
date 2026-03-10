INSERCAO:
| Tipo de entrada | Tempo médio (ns) |      Desvio padrão     |
| --------------- | ---------------- | ---------------------- |
| Crescente       | 6.9075374E8      | 3293494.468159921      |
| Decrescente     | 6.85612145E8     | 1.4887207178024597E9   |
| Aleatório       | 7.43845246E8     | 2.2.3336010460053504E8 |

EXCLUSAO:
| Tipo de entrada | Tempo médio (ns) |      Desvio padrão     |
| --------------- | ---------------- | ---------------------- |
| Crescente       | 2.27754282E8     | 6798707.864592801      |
| Decrescente     | 6.89827005E8     | 1.3952865421778927E7   |
| Aleatório       | 6.37637495E8     | 3.363635195993879E7    |

UML:
ArranjoOrdenado
---------------------------------
- int[] arranjo
- int tamanho
- int capacidade
---------------------------------
+ ArranjoOrdenado(int capacidade)
+ void inserir(int valor)
+ void excluir(int valor)
+ void percorrer(Consumer<Integer> consumer)
---------------------------------
+ static long inserirCrescente(int n)
+ static long inserirDecrescente(int n)
+ static long inserirAleatorio(int n)
+ static long excluirCrescente(int n)
+ static long excluirDecrescente(int n)
+ static long excluirAleatorio(int n)
+ static double media(long[] valores)
+ static double desvioPadrao(long[] valores, double media)
