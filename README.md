# Mini-Aplicaciones Utilitarias en Java — Programación Estructurada

Conjunto de aplicaciones de consola y utilitarios interactivos desarrollados en **Java** bajo el paradigma de **programación estructurada, modularización funcional y control de flujo algorítmico**. Proyecto integrador enfocado en lógica de algoritmos, validaciones estrictas de entradas de usuario y manipulación básica de interfaces gráficas (Swing).

---

## 🛠️ Módulos y Aplicaciones Incluidas

El sistema cuenta con un menú principal interactivo (`Final.java`) que permite alternar y ejecutar de forma modular entre tres herramientas:

* 💱 **Conversor de Divisas (`Conversor.java`):**
  * Conversión de valores monetarios utilizando tasas de cambio predefinidas.
  * Flujo interactivo basado en bucles para realizar múltiples consultas sin reiniciar la aplicación.

* 🔢 **Calculadora Aritmética (`Calculadora.java`):**
  * Ejecución de operaciones matemáticas fundamentales: suma, resta, multiplicación y división.
  * Lógica de **cálculos continuos o encadenados**, que permite reutilizar el resultado actual para operar de forma secuencial en el siguiente ciclo.
  * Prevención y control de errores en tiempo de ejecución, incluyendo la validación ante indeterminaciones matemáticas como la división por cero.

* 🎮 **Juego de Adivinanza Pokémon (`Adivinanza.java`):**
  * Dinámica interactiva de preguntas y respuestas para adivinar un Pokémon basándose en pistas de atributos (como el tipo y el origen).
  * Integración con una ventana gráfica independiente (`JFrame`) utilizando recursos locales de la carpeta `imgs/` (sprites e imágenes de siluetas).
  * Conteo de aciertos y control de rondas en consola.

---

## 🧠 Conceptos y Fundamentos Aplicados

* **Modularización y Reutilización:** División del sistema en clases especializadas con funciones estáticas de responsabilidad única.
* **Capa de Validación Transversal (`Funciones.java`):**
  * Métodos centralizados para la lectura segura por consola (`Scanner`), controlando tipos de datos e impidiendo caídas de ejecución ante entradas inválidas.
* **Control de Flujo:**
  * Estructuras repetitivas (`while`, `do-while`) para mantener la ejecución activa de los menús.
  * Estructuras de selección múltiple (`switch`) para la navegación de opciones.
* **Gestión de Recursos Gráficos:**
  * Uso de clases de `javax.swing` y `java.awt` para la carga dinámica de imágenes asociadas al flujo de texto del juego.

---

## 💻 Requisitos y Ejecución

* **JDK:** Java SE 8 o superior.
* **IDE recomendado:** Eclipse o IntelliJ IDEA.

### Compilación y ejecución por consola:

```bash
# Compilar los archivos fuente dentro de src
javac -d bin src/parcial2/*.java

# Ejecutar el menú orquestador principal
java -cp bin parcial2.Final
```
> 🎓 Contexto académico: Proyecto desarrollado para la materia Introducción a la Programación (2do Parcial) — Carrera de Analista de Sistemas.
