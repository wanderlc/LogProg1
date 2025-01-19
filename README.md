# Calculadora de Salário Líquido

## Descrição
Este projeto consiste em um sistema de cálculo de salário líquido que processa o salário bruto de 5 funcionários, aplicando os descontos de INSS e Imposto de Renda conforme as tabelas vigentes. O programa foi desenvolvido em Java e segue uma arquitetura modular para melhor organização e manutenibilidade do código.

## Funcionalidades
- Entrada de 5 salários brutos com validação de dados
- Cálculo automático de descontos do INSS
- Cálculo automático de descontos do Imposto de Renda
- Exibição detalhada dos valores para cada funcionário

## Tabelas de Desconto

### Tabela INSS
| Faixa Salarial | Alíquota |
|----------------|----------|
| Até R$ 1.212,00 | 7,5% |
| De R$ 1.212,01 até R$ 2.427,35 | 9% |
| De R$ 2.427,36 até R$ 3.641,03 | 12% |
| De R$ 3.641,04 até R$ 7.087,22 | 14% |

### Tabela Imposto de Renda
| Faixa Salarial | Alíquota |
|----------------|----------|
| Até R$ 1.903,98 | Isento |
| De R$ 1.903,99 até R$ 2.826,65 | 7,5% |
| De R$ 2.826,66 até R$ 3.751,05 | 15% |
| De R$ 3.751,06 até R$ 4.664,68 | 22,5% |
| Acima de R$ 4.664,68 | 27,5% |

## Estrutura do Projeto
O projeto está organizado em três arquivos principais:

1. **Calcula.java**
   - Classe principal do programa
   - Gerencia entrada e saída de dados
   - Coordena os cálculos de INSS e IR

2. **CalculaInss.java**
   - Responsável pelo cálculo do desconto do INSS
   - Implementa as faixas e alíquotas da tabela INSS

3. **CalculaIr.java**
   - Responsável pelo cálculo do Imposto de Renda
   - Implementa as faixas e alíquotas da tabela IR

## Como Usar

### Pré-requisitos
- JDK 8 ou superior instalado
- Compilador Java configurado no ambiente

### Compilação
```bash
javac Calcula.java CalculaInss.java CalculaIr.java
```

### Execução
```bash
java Calcula
```

### Formato de Entrada
O programa aceita valores nos seguintes formatos:
- 5000
- 5000,00

## Exemplo de Uso
```
Digite o valor bruto do 1: 3000,00
Digite o valor bruto do 2: 5000
Digite o valor bruto do 3: 2500,50
...

Valor Bruto: R$ 3.000,00
Desconto INSS: R$ 360,00
Desconto Imposto de Renda: R$ 225,00
Valor Líquido: R$ 2.415,00
...
```

## Melhorias para Updates
- Validação de entrada de dados
- Tratamento de valores negativos
- Verificação de formato numérico
- Mensagens de erro intuitivas
- Calculo de dependentes
- Calculo de deduções de saude
- Calculo de deduções esculares

