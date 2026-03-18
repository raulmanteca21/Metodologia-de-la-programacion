## Ejercicios de Programación Orientada a Objetos en Java

Integrantes del grupo: Raúl Manteca - Izan Sánchez - Alonso Tomás

Este repositorio contiene la resolución de un conjunto de cuatro bloques prácticos centrados en el dominio del paradigma de la Programación Orientada a Objetos (POO) utilizando Java. 

El objetivo principal del proyecto es aplicar principios de diseño de software limpio y escalable, progresando desde la definición básica de clases hasta arquitecturas polimórficas.

## Contenido de las Prácticas

  1. Fundamentos de Clases y Objetos: Implementación de clases básicas aplicando un encapsulamiento estricto mediante modificadores de visibilidad. Se abordan constructores sobrecargados, métodos getters/setters, y el uso de la anotación `@Override` para el método `toString()` genérico.
  2. Relaciones de Composición y Agregación: Diseño de sistemas donde los objetos interactúan entre sí. Se modela cómo una clase puede estar compuesta por otras (por ejemplo, un `Book` que contiene un array de `Author`, o un polígono compuesto por objetos `MyPoint`).
  3. Herencia y Reutilización de Código: Uso de la palabra reservada `extends` para crear jerarquías de clases (superclases y subclases). El enfoque recae en heredar estado y comportamiento para evitar la duplicación de código, evaluando casos prácticos como `Circle` derivando en `Cylinder`.
  4. Polimorfismo, Clases Abstractas e Interfaces: Definición de contratos públicos mediante interfaces (`implements`) y jerarquías abstractas (`abstract`). Se demuestra cómo tratar distintos objetos de forma transparente mediante el polimorfismo (upcasting y downcasting) en estructuras como `GeometricObject` o `Movable`.

Para garantizar la fiabilidad del software, todas las clases desarrolladas cuentan con pruebas unitarias implementadas con el framework JUnit 5. Se ha configurado el entorno de testing en el IDE para asegurar una cobertura del 100% del código de producción.

