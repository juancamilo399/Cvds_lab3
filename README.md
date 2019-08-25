# Cvds_lab3

**Juan Camilo Angel Hernandez**

**Juan Camilo Rojas Ortiz**

AeroDescuentos
Se está desarrollando para una aerolínea su módulo de liquidación de tiquetes aéreos. Para el mismo, se tiene una función que aplica descuentos a la tarifa base del vuelo dependiendo del tiempo de antelación de la reserve y la edad del pasajero. Los descuentos SON ACUMULABLES.
Normativa 005, sobre los descuentos:
• 15% de descuento sacando el billete con antelación superior a 20 días.
• 5% a los pasajeros con edad inferior a 18 años y 8% a los pasajeros con edad superior a 65 años.
La siguiente es la especificación de la función que se usará en el módulo del cálculo de los descuentos:

/**
calcular la tarifa de cada billete según el trayecto, la antelación en la que se obtiene el billete y la edad del pasajero, de acuerdo con la normativa 005.

@param tarifaBase valor base del vuelo

@param diasAntelacion dias de antelación del vuelo

@param edad - edad del pasajero

@throws ExcepcionParametrosInvalidos [**la tarifa no puede ser negativa, los días de antelación no pueden ser negativos y la edad no puede ser negativa**]
**/

public long calculoTarifa(long tarifaBase, int diasAntelacion, int edad)

**1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.**

  Debería arrojarla cuando la tarifa sea negativa o igual a 0, cuando los días de antelación sean negativos y cuando la edad sea  negativa o 0.
  
**2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una buena división del conjunto de datos de entrada de la función anterior: Número Clase de equivalencia (en lenguaje natural o matemático). Resultado correcto / incorrecto.**

| Numero  | Clase de equivalencia   | Resultado | 
| ---  | ---  | --- | 
| 1   | Parametros incorrectos | incorrecto |
| 2  | Parametros correctos y descuento del 15% | correcto |
| 3 | Pametros correctos y descuento del 5% | correcto |
| 4 | Parametros correctos y descuento del 8%| correcto |
| 5 | Parametros correctos y descuento del 20% | corecto |
| 6 | Parametros correctos y descuento del 23%|   correcto |

**3.para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de entrada y resultados esperados.**

| Numero  | Parametros   | Resultado | 
| ---  | ---  | --- | 
|1 | -1, 10, 30 | parametros incorrectos|
|2 |1000, 21, 30 | precio del tiquete: 850|
|3 |1000, 15, 5 | precio del tiquete: 950|
|4 |1000, 15, 66 | precio del tiquete: 920|
|5 |1000, 21, 5 | precio del tiquete: 800|
|6 |1000, 21, 66 | precio del tiquete: 770|

**4. A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o de frontera de las mismas.**

| Numero  | Parametros   | Limites | 
| ---  | ---  | --- | 
|1 |Parametros incorrectos|  (-1,0,1)|
|2 |Parametros correctos y descuento del 15% | (20,21,22)|
|3 |Pametros correctos y descuento del 5% | (16,17,18)|
|4 |Parametros correctos y descuento del 8% | (64,65,66)|
|5 |Parametros correctos y descuento del 20% | 20,21,22) & (16,17,18) |
|6 |Parametros correctos y descuento del 23%  | (20,21,22) & (64,65,66)  |


**5. Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.**

| Numero  | Parametros   | casos de prueba correctos | 
| ---  | ---  | --- | 
|1 |Parametros incorrectos| (5,5,5) | 
|2 |Parametros correctos y descuento del 15% | (1000,21,30) (1000,22,30) |
|3 |Pametros correctos y descuento del 5% | (1000,17, 17) (1000,17,16)|
|4 |Parametros correctos y descuento del 8% | (1000,17,66) (1000,17,68)|
|5 |Parametros correctos y descuento del 20% | (1000,21,17)  (1000,22,16) |
|6 |Parametros correctos y descuento del 23%  | (1000,21,66)  (1000,22,67) |
|6 |Ningun descuento |(1000,20,18) (1000,19,19)| 

| Numero  | Parametros   | casos de prueba incorrectos | 
| ---  | ---  | --- | 
|1 |Parametros incorrectos| (-1,0,0) | 
|2 |Parametros correctos y descuento del 15% | (1000,20,30)  |
|3 |Pametros correctos y descuento del 5% | (1000,21, 18) |
|4 |Parametros correctos y descuento del 8% | (1000,21,65)|
|5 |Parametros correctos y descuento del 20% | (1000,20,18) |
|6 |Parametros correctos y descuento del 23%  | (1000,20,65)  |
