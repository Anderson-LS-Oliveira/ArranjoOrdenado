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

EXCLUSAO:
| Tipo de entrada | Tempo médio (ns) |      Desvio padrão     |
| --------------- | ---------------- | ---------------------- |
| Crescente       | 2.27754282E8     | 6798707.864592801      |
| Decrescente     | 6.89827005E8     | 1.3952865421778927E7   |
| Aleatório       | 6.37637495E8     | 3.363635195993879E7    |

|Inserção		        |Ordenação crescente		            |Ordenação decrescente                 |
|-----------------------|---------------------------------------|--------------------------------------|
|Inserção crescente	    | 6.8710119E8 +/- 6328952.141697708		| 6.8669425E8 +/- 3759762.7586990115   |
|Inserção decrescente	| 6.88226163E8 +/- 6175877.18684002		| 6.88747911E8 +/- 7150500.738604185   |
|Inserção aleatória	    | 6.7190112E8 +/- 1.0707053697763538E8	| 6.69745854E8 +/- 9.292268372522983E7 |


|Exclusão		        |Ordenação crescente		            |Ordenação decrescente                 |
|-----------------------|---------------------------------------|--------------------------------------|
|Exclusão crescente	    | 2.27982902E8 +/- 2899169.85928662		| 2.27967458E8 +/- 3152405.689253209   |
|Exclusão decrescente	| 2.26859805E8 +/- 7318122.493718932		| 2.27253684E8 +/- 7679953.372498039   |
|Exclusão aleatória	    | 4.97130004E8 +/- 1.4416577140055956E7	| 4.98072896E8 +/- 1.5238577511086263E7 |

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
