# DesignPattern - Creational - AbstractFactory
Patrón de  Diseño - Creacional - Abstract Factory

## Contexto y problema
Contexto: Debemos crear diferentes objetos, todos pertenecientes a la misma familia. Por ejemplo: las bibliotecas para crear interfaces gráficas suelen utilizar este patrón y cada familia sería un sistema operativo distinto. Así pues, el usuario declara un Botón, pero de forma más interna lo que está creando es un BotónWindows o un BotónLinux, por ejemplo.

El problema que intenta solucionar este patrón es el de crear diferentes familias de objetos.

El patrón Abstract Factory está aconsejado cuando se prevé la inclusión de nuevas familias de productos, pero puede resultar contraproducente cuando se añaden nuevos productos o cambian los existentes, puesto que afectaría a todas las familias creadas.

El patrón de diseño Abstract Factory busca agrupar un conjunto de clases que tiene un funcionamiento en común llamadas familias, las cuales son creadas mediante un Factory, este patrón es especialmente útil cuando requerimos tener ciertas familias de clases para resolver un problema, sin embargo, puede que se requieran crear implementaciones paralelas de estas clases para resolver el mismo problema pero con una implementación distinta.

![UML Abstract Factory](https://github.com/VictorHugoAguilar/DesignPattern-Creational-AbstractFactory/blob/master/img/abstract-factory-diagram.png?raw=true)

## Diagrama de secuencia

![UML Caso de Uso](https://github.com/VictorHugoAguilar/DesignPattern-Creational-AbstractFactory/blob/master/img/abstract-factory-sequence.png?raw=true)

