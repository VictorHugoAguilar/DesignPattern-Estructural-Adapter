# DesignPattern - Estructurales - Adapter
Patrón de  Diseño - Estructurales - Adapter

## Contexto y problema
Adapter es un patrón de diseño estructural que permite colaborar a objetos incompatibles.

El patrón Adapter actúa como envoltorio entre dos objetos. Atrapa las llamadas a un objeto y las transforma a un formato y una interfaz reconocible para el segundo objeto.

## Aplicabilidad

Es recomendable utilizar el patrón adaptador cuando:

- se desea usar una clase existente, y su interfaz no sea igual a la necesitada.
- cuando se desea crear una clase reutilizable que coopere con clases no relacionadas. Es decir, que las clases no tienen necesariamente interfaces compatibles.

![UML Abstract Factory](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Adapter/blob/master/img/adapter-diagram.png?raw=true)

## Diagrama de secuencia

![UML Caso de Uso](https://github.com/VictorHugoAguilar/DesignPattern-Estructural-Adapter/blob/master/img/adapter-sequence.png?raw=true)

## Problema

Imagina que estás creando una aplicación de monitoreo del mercado de valores. La aplicación descarga la información de bolsa desde varias fuentes en formato XML para presentarla al usuario con bonitos gráficos y diagramas.

En cierto momento, decides mejorar la aplicación integrando una inteligente biblioteca de análisis de una tercera persona. Pero hay una trampa: la biblioteca de análisis solo funciona con datos en formato JSON.

Podrías cambiar la biblioteca para que funcione con XML. Sin embargo, esto podría descomponer parte del código existente que depende de la biblioteca. Y, lo que es peor, podrías no tener siquiera acceso al código fuente de la biblioteca, lo que hace imposible esta solución.

##  Solución
Puedes crear un adaptador. Se trata de un objeto especial que convierte la interfaz de un objeto, de forma que otro objeto pueda comprenderla.

Un adaptador envuelve uno de los objetos para esconder la complejidad de la conversión que tiene lugar tras bambalinas. El objeto envuelto ni siquiera es consciente de la existencia del adaptador. Por ejemplo, puedes envolver un objeto que opera con metros y kilómetros con un adaptador que convierte todos los datos al sistema anglosajón, es decir, pies y millas.

Los adaptadores no solo convierten datos a varios formatos, sino que también ayudan a objetos con distintas interfaces a colaborar. Funciona así:

El adaptador obtiene una interfaz compatible con uno de los objetos existentes.
Utilizando esta interfaz, el objeto existente puede invocar con seguridad los métodos del adaptador.
Al recibir una llamada, el adaptador pasa la solicitud al segundo objeto, pero en un formato y orden que ese segundo objeto espera.
En ocasiones se puede incluso crear un adaptador de dos direcciones que pueda convertir las llamadas en ambos sentidos.

Regresemos a nuestra aplicación del mercado de valores. Para resolver el dilema de los formatos incompatibles, puedes crear adaptadores de XML a JSON para cada clase de la biblioteca de análisis con la que trabaje tu código directamente. Después ajustas tu código para que se comunique con la biblioteca únicamente a través de estos adaptadores. Cuando un adaptador recibe una llamada, traduce los datos XML entrantes a una estructura JSON y pasa la llamada a los métodos adecuados de un objeto de análisis envuelto.

## Cómo implementarlo
Asegúrate de que tienes al menos dos clases con interfaces incompatibles:

Una útil clase servicio que no puedes cambiar (a menudo de un tercero, heredada o con muchas dependencias existentes).
Una o varias clases cliente que se beneficiarían de contar con una clase de servicio.
Declara la interfaz con el cliente y describe el modo en que las clases cliente se comunican con la clase de servicio.

Crea la clase adaptadora y haz que siga la interfaz con el cliente. Deja todos los métodos vacíos por ahora.

Añade un campo a la clase adaptadora para almacenar una referencia al objeto de servicio. La práctica común es inicializar este campo a través del constructor, pero en ocasiones es adecuado pasarlo al adaptador cuando se invocan sus métodos.

Uno por uno, implementa todos los métodos de la interfaz con el cliente en la clase adaptadora. La clase adaptadora deberá delegar la mayor parte del trabajo real al objeto de servicio, gestionando tan solo la interfaz o la conversión de formato de los datos.

Las clases cliente deberán utilizar la clase adaptadora a través de la interfaz con el cliente. Esto te permitirá cambiar o extender las clases adaptadoras sin afectar al código cliente
