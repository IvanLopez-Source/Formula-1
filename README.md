# Proyecto Spring Boot

## Descripción

Este proyecto es una aplicación desarrollada con **Spring Boot**, que implementa un API RESTful. Utiliza las principales características de **Spring Boot** para facilitar el desarrollo de aplicaciones basadas en Java, con configuraciones mínimas y un ciclo de vida simplificado.

## Tecnologías utilizadas

- **Spring Boot**: Framework principal para la creación de aplicaciones Java.
- **Spring Data JPA**: Para el acceso y la gestión de datos en bases de datos relacionales.
- **Spring Web**: Para la creación de controladores REST y manejo de peticiones HTTP.
- **H2 Database**: Base de datos en memoria.
- **Lombok**: Para la generación automática de getters, setters, constructores, etc.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.


## Instalación

1. **Clonar el repositorio**:
   Si no tienes el proyecto aún, clónalo con Git:

   ```bash
   git clone https://github.com/IvanLopez-Source/Formula-1.git


## 🧑 **Gestor de Pilotos**

### **Requisitos Funcionales:**

1. **Registro de Pilotos:**
    - Permitir registrar pilotos con la siguiente información:
        - Nombre completo (nombre y apellidos).
        - Edad.
        - Identificación única del piloto.
2. **Búsqueda de Pilotos:**
    - Buscar tutores por su nombre o número de identificación único.
3. **Listado de Pilotos:**
    - Listar todos los Pilotos registrados en el sistema.
    - Mostrar información básica como nombre y edad.
4. **Actualización de Pilotos:**
    - Permitir modificar los datos de un tutor registrado.
5. **Eliminación de Pilotos:**
    - Permitir eliminar un piloto del sistema si ya no tiene pacientes asociados.



## Requisitos 
1. CRUD Completo (35 puntos)
   - Implementa las operaciones básicas de un CRUD (Create, Read, Update, Delete) para al menos una entidad de tu temática.
   - Cada operación correctamente implementada suma puntos.

2. Pruebas (30 puntos)
   - Implementa pruebas unitarias con JUnit y mocks con Mockito.
   - Implementa pruebas de integración para al menos un endpoint con herramientas como RestAssured.
   
3. Uso de DTOs y Mappers (15 puntos)
   - Implementa DTOs (Data Transfer Objects) para separar la lógica de las entidades de la lógica de entrada/salida de datos.
   - Usa un mapeador como MapStruct o una conversión manual para transformar entre entidades y DTOs.

4. Manejo de Excepciones (15 puntos)
   - Implementa un controlador global de excepciones utilizando @RestControllerAdvice.
   - Personaliza las respuestas para errores comunes como 404 Not Found, 400 Bad Request, y 500 Internal Server Error.

5. Número de Tablas y Relaciones (hasta 15 puntos)
   - Diseña varias tablas relacionadas (mínimo 1 y máximo 3 tablas, 5 puntos por tabla).
   - Implementa relaciones entre tablas (1:1, 1:N, N:M). Documenta las relaciones en el README.

6. Uso de Enumerados (5 puntos)
   -Implementa al menos un campo enumerado en una entidad. Ejemplo: Tipo de personaje (HUMANO, ALIEN) o Estado (ACTIVE, INACTIVE).
   
7. Uso de Fechas (5 puntos)
   - Incluye fechas en las entidades, como fechas de creación o actualización. Usa @Temporal o LocalDateTime.

8. Upload de Imágenes (25 puntos)
   - Agrega funcionalidad para subir imágenes a la API. Ejemplo: imágenes de personajes o hobbies.
   - Las imágenes pueden almacenarse en un directorio local o un servicio.

9. Integrar Docker (20 puntos)
   - Docker para producción
   - Docker Compose para los servicios en desarrollo, test, etc..

10. Perfiles de Test, Producción y Desarrollo (10 puntos)
   - Configura los perfiles necesarios y/o variables de entorno (dev, test, prod) con propiedades específicas (por ejemplo, bases de datos diferentes).

11. Paginación y Filtros (20 puntos)
   - Implementa paginación y filtros en al menos un endpoint GET.
   - Usa alguna técnica para filtrar los resultados por algún campo.
   - Usa Spring Data Pageable para devolver resultados paginados.

12. Pipeline de CI/CD (20 puntos)
   -

13. Documentación de la API (10 puntos)
   - Documenta la API utilizando herramientas como Swagger o Springdoc OpenAPI.
   - Cada endpoint debe estar claramente descrito con ejemplos de entrada y salida.

14. Documentación del README (Obligado)
   - Crea un README profesional con:
   -- Descripción del proyecto.
   -- Pasos para ejecutar la aplicación y pasar los tests.
   -- Modelos E/R de la base de datos.
   -- Explicación de los perfiles.
   -- Listado de endpoints y ejemplos de uso.

15. Commits Semánticos (10 puntos)
   - Sigue buenas prácticas con mensajes de commit claros, como: "feat: add create character endpoint"

16. Gestión de Tareas con Kanban (10 puntos)
   - Organiza tus tareas en un tablero Kanban (Trello, GitHub Projects, etc.).
   - Incluye historias de usuario y subtareas. Asegúrate de mantener el tablero actualizado.

17. Seguridad (20 puntos)
   - Implementa Spring Security con autenticación básica o JWT.
   - Define roles (USER, ADMIN) y protege algunos endpoints según el rol.



