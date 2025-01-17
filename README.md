Aplicativo de Cálculo de Lucro em Hardware

Este é um aplicativo em Java que permite calcular o lucro e o percentual de lucro obtido a partir da venda de uma configuração de hardware. Ele solicita informações detalhadas sobre os componentes e seus custos, realiza os cálculos necessários e exibe os resultados.

Funcionalidades

Entrada de Dados:

O programa solicita ao usuário os modelos dos componentes do computador, incluindo:

Placa Mãe

Fonte

Processador

Gabinete

HD

Cooler

Placa de Vídeo

SSD

Memória RAM (detalhada por quantidade e modelos)

Custos extras (opcional, com possibilidade de valor nulo).

Cálculo:

O programa realiza os seguintes cálculos:

Total Investido: Soma de todos os valores pagos pelos componentes e custos extras.

Lucro Total: Diferença entre o valor de venda e o total investido.

Percentual de Lucro: Representação percentual do lucro em relação ao total investido (exibido com duas casas decimais).

Saída de Dados:

O programa exibe:

Modelos de todos os componentes fornecidos.

Detalhamento dos modelos de memória RAM adquiridos.

Custos extras (se houver ou "Sem custo adicional").

Total investido.

Valor de venda.

Lucro total.

Percentual de lucro.

Exemplo de Saída

Digite o modelo da placa mãe: Asus Prime B450M
Digite o modelo da fonte: Corsair 550W
...
Quantos pentes de memória RAM foram adquiridos? 2
Digite o modelo da memória RAM 1: Kingston Fury 8GB
Digite o modelo da memória RAM 2: Corsair Vengeance 8GB
...
Digite os custos extras (ou deixe vazio se não houver): Garantia estendida
Digite o valor dos custos extras: 50.00
...

Especificações do modelo vendido:
Placa Mãe: Asus Prime B450M
Fonte: Corsair 550W
...
Memória RAM 1: Kingston Fury 8GB
Memória RAM 2: Corsair Vengeance 8GB
...
Custos Extras: Garantia estendida

Total Investido: R$ 2850.00
Valor de Venda: R$ 3200.00
Lucro Total: R$ 350.00
Percentual de Lucro: 12.28%

Melhorias Futuras

Implementação de tratamento de exceções para entradas inválidas.

Integração com banco de dados para armazenar e gerenciar informações de vendas.

Adição de relatórios detalhados para análise financeira.

Automatização para sugerir preços baseados em margens de lucro pré-definidas.

Inclusão de uma interface gráfica para facilitar o uso do programa.

Tecnologias Utilizadas

Java: Linguagem de programação principal do projeto.

IDE: Qualquer IDE compatível com Java (Eclipse, IntelliJ IDEA, etc.).

Sinta-se à vontade para sugerir novas funcionalidades ou melhorias ao código.