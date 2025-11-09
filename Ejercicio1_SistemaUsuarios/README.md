# 🧩 Sistema de Gestión de Usuarios en Java

Este proyecto implementa un sistema básico de **gestión de usuarios** en Java, utilizando los principios de **Programación Orientada a Objetos (POO)**.  
El sistema maneja tres tipos de usuarios: **Estudiantes**, **Profesores** y **Administradores**, todos ellos derivados de una clase base llamada `Usuario`.

---

## 📘 Descripción General

El objetivo del proyecto es demostrar el uso de **herencia**, **polimorfismo**, y **encapsulamiento** en Java mediante un sistema educativo simple.  
Cada tipo de usuario posee comportamientos y atributos específicos, pero comparten una estructura común definida por la clase padre `Usuario`.

---

## 📂 Estructura del Proyecto

| Archivo | Descripción |
|----------|--------------|
| **Usuario.java** | Clase base abstracta que define los atributos y métodos comunes para todos los usuarios (nombre, correo, contraseña). |
| **Estudiante.java** | Subclase que representa a un estudiante. Contiene información adicional como matrícula o calificaciones. |
| **Profesor.java** | Subclase que representa a un profesor. Maneja información sobre cursos o materias impartidas. |
| **Administrador.java** | Subclase que representa a un administrador del sistema, con capacidad de crear o eliminar usuarios. |
| **Main.java** | Clase principal con el método `main()` que crea instancias de las clases anteriores y demuestra su funcionamiento. |

---

## 🧠 Conceptos Clave Implementados

- **Herencia:**  
  Las clases `Estudiante`, `Profesor` y `Administrador` heredan de `Usuario`.
  
- **Polimorfismo:**  
  Cada clase redefine el método `mostrarInformacion()` para adaptarse a su tipo de usuario.

- **Encapsulamiento:**  
  Los atributos están protegidos mediante modificadores de acceso y métodos *getters* y *setters*.

- **Abstracción:**  
  La clase `Usuario` puede ser abstracta, definiendo una plantilla para los diferentes tipos de usuarios.

---

## ⚙️ Cómo Ejecutar el Proyecto

### 1️⃣ Compilar el código

Abre una terminal en el directorio del proyecto y ejecuta:

```bash
javac *.java
