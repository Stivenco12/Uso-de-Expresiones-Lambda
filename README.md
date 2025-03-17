# Uso de Expresiones Lambda en Java

Este proyecto es un ejemplo práctico del uso de **expresiones lambda** en Java, aplicado a la manipulación de objetos de tipo Persona y Estudiante.

## 🚀 Tecnologías Utilizadas
- **Java 8+**: Lenguaje principal.
- **Maven**: Para la gestión de dependencias.

## 📂 Estructura del Proyecto
```
Uso-de-Expresiones-Lambda/
│── pom.xml                                   # Configuración de Maven
│── src/main/java/expreciones_landa/          # Código fuente principal
│   │── Main.java                              # Punto de entrada del programa
│   │── Persona/                               # Clases relacionadas con personas
│   │   │── Persona.java                       # Clase base Persona
│   │   │── Estudiante.java                    # Subclase de Persona
│── target/                                    # Archivos compilados
```

## 📌 Instalación y Uso
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/tu-repo.git
   ```
2. Accede al directorio del proyecto:
   ```bash
   cd Uso-de-Expresiones-Lambda-main
   ```
3. Compila y ejecuta con Maven:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="expreciones_landa.Main"
   ```

## ✨ Explicación del Código
- **Clase `Persona`**: Representa una persona con atributos básicos como nombre y edad.
- **Clase `Estudiante`**: Hereda de `Persona` y añade atributos específicos de un estudiante.
- **Uso de Expresiones Lambda**:
  - Se utilizan para ordenar listas de `Persona` y `Estudiante`.
  - Filtrado de listas basado en condiciones específicas.
  - Implementación de interfaces funcionales para ejecutar lógica en métodos.

## 👨‍💻 Desarrollador
- **Stivenco12**

