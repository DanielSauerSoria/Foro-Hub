# ForoHub

ForoHub es una aplicación para gestionar un foro mediante una API REST desarrollada con Spring Boot. Permite a los usuarios crear, leer, actualizar y eliminar temas y usuarios, facilitando la interacción y colaboración en línea.

## Características

- Gestión de temas:
  - Creación de nuevos temas con título, mensaje, autor, curso, etc.
  - Lectura de todos los temas o de uno específico por ID.
  - Actualización de temas existentes.
  - Eliminación de temas por ID.

- Gestión de usuarios:
  - Creación de nuevos usuarios con nombre de usuario y correo electrónico.
  - Lectura de todos los usuarios o de uno específico por ID.
  - Actualización de información de usuarios.
  - Eliminación de usuarios por ID.

## Tecnologías Utilizadas

- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (o PostgreSQL, dependiendo de la configuración)

## Configuración

1. **Clonar el repositorio:**
git clone https://github.com/DanielSauerSoria/Foro-Hub/tree/main/foro-hub

2. **Configurar la base de datos:**
- Configurar la base de datos en `application.properties` con las credenciales adecuadas.

3. **Ejecutar la aplicación:**
- Ejecutar la aplicación usando el IDE de preferencia o Maven/Gradle desde la línea de comandos.

4. **Probar la API:**
- Utilizar herramientas como Postman para probar los diferentes endpoints de la API.
