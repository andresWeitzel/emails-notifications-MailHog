<div align="center">
  <img src="../img/mailhog.jpeg" >
</div>

<div align="right">
  <img width="24" height="24" src="../icons/backend/java/png/java.png" />
  <img width="20" height="20" src="../icons/devops/png/maven.png" />
  <img width="22" height="22" src="../icons/devops/png/postman.png" />
  <img width="22" height="22" src="../icons/devops/png/git.png" />
  <img width="20" height="20" src="../icons/backend/java/png/junit.png" />
  <img width="20" height="20" src="../icons/devops/png/swagger.png" />
  <img width="20" height="20" src="../icons/backend/java/png/spring-boot.png" />
  <img width="20" height="20" src="../icons/devops/png/docker.png" />
</div>

<br>

<br>

<div align="right">
  <a href="./README.es.md" target="_blank">
    <img src="../img/arg-flag.jpg" width="65" height="40" />
  </a>
  <a href="https://github.com/andresWeitzel/emails-notifications-MailHog" target="_blank">
    <img src="../img/eeuu-flag.jpg" width="65" height="40" />
  </a>
</div>

<br>

<div align="center">

# Notificaciones por correo electrónico MailHog ![(status-completed)](../icons/badges/status-completed.svg)

</div>

Este es un proyecto de demostración basado en Spring Boot para el envío de correos electrónicos. Utiliza MailHog como servidor SMTP para pruebas locales y está completamente Dockerizado para una fácil ejecución.

*   [Video de pruebas funcionales](https://www.youtube.com/watch?v=QMlpFdOQHfI) <a href="https://www.youtube.com/watch?v=QMlpFdOQHfI" target="_blank"> <img src="../icons/social-networks/yt.png" width="25" /></a>

<br>

## Índice 📜

<details>
  <summary> Ver detalles </summary>

<div align="right">

`Última actualización: 20/02/26`

</div>

### Sección 1) Descripción, Configuración y Tecnologías

*   [1.0) Descripción.](#10-descripción-)
*   [1.1) Ejecución del Proyecto.](#11-ejecución-del-proyecto-)
*   [1.2) Estructura del Proyecto.](#12-estructura-del-proyecto-)
*   [1.3) Tecnologías.](#13-tecnologías-)

### Sección 2) Flujo de Procesamiento y Pruebas

*   [2.0) Flujo de Procesamiento.](#20-flujo-de-procesamiento-)
*   [2.1) Validaciones Implementadas.](#21-validaciones-implementadas-)
*   [2.2) Pruebas.](#22-pruebas-)

### Sección 3) Pruebas de Funcionalidad y Referencias

*   [3.0) Prueba de Funcionalidad.](#30-prueba-de-funcionalidad-)
*   [3.1) Reportes.](#31-reportes-)
*   [3.2) Contribuir.](#32-contribuir-)
*   [3.3) Licencia.](#33-licencia-)

<br>

</details>

<br>

## Sección 1) Descripción, Configuración y Tecnologías

### 1.0) Descripción [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

  <br>

Este es un proyecto de demostración basado en Spring Boot para el envío de correos electrónicos. Utiliza MailHog como servidor SMTP para pruebas locales y está completamente Dockerizado para una fácil ejecución. El proyecto implementa un sistema simple de notificaciones por correo electrónico que cubre las siguientes características:

* **Registro de usuarios**: Mediante un controlador REST, los usuarios pueden registrarse y recibir un correo electrónico de bienvenida.

* **Envío de correos electrónicos**: Uso de JavaMailSender para enviar correos electrónicos a través de MailHog en el entorno de desarrollo.

**Requisitos:**

* Java 17 o superior.

* Docker para ejecutar MailHog y la aplicación en contenedores.

<br>

</details>

### 1.1) Ejecución del Proyecto [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

<br>

* Si alguno de los siguientes pasos no funciona, vea este [video](https://www.youtube.com/watch?v=QMlpFdOQHfI)

* Creamos un entorno de trabajo a través de algún IDE, podemos o no crear una carpeta raíz para el proyecto, nos posicionamos sobre ella

```git
cd 'nombreRaizProyecto'
```

* Una vez creado el entorno de trabajo, clonamos el proyecto

```git
git clone https://github.com/andresWeitzel/emails-notifications-MailHog
```

* Nos posicionamos sobre el proyecto

```git
cd 'emails-notifications-MailHog'
```

* Antes de crear la imagen de Docker, debe generar el archivo JAR del proyecto. Ejecute el siguiente comando desde el directorio raíz del proyecto:

```git
./mvnw clean package
# o
mvn clean package # (si tiene Maven instalado globalmente)
```

* Esto creará un archivo .jar dentro del directorio `target/`, con un nombre similar a:

```git
target/email-notifications-0.0.1-SNAPSHOT.jar
```

* Docker utilizará este archivo para compilar la imagen de la aplicación.

* Antes de compilar y ejecutar los contenedores, asegúrese de tener Docker ejecutándose (para Windows, use [Docker Desktop](https://www.docker.com/products/docker-desktop))

* Una vez instalado, asegúrese de que Docker esté ejecutándose

```git
docker --version
```

* Una vez que Docker esté ejecutándose, puede compilar e implementar los contenedores

```git
docker-compose up --build
```

* Si hay algún problema al compilar nuestro entorno de servicio con Docker y alguna imagen está en uso y no puede eliminarla directamente, puede forzar su eliminación con el siguiente comando:

```git
docker rmi -f $(docker images -q)
```

* Luego, para realizar una limpieza general de todo lo no utilizado (contenedores detenidos, imágenes sin etiquetar, redes sin usar, etc.), puede usar el siguiente comando:

```git
docker system prune -a --volumes
```

* Reconstruimos nuestros contenedores

```git
docker-compose up --build
```

* `Importante` : Es posible que haya otros pasos previos que no se hayan incluido por sincronización entre documentos en relación al desarrollo. Por favor, abra un hilo de conversación dentro de la sección 'Issues' del proyecto.

<br>

</details>

### 1.2) Estructura del Proyecto [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

<br>

```
emails-notifications-MailHog/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── controller/UserController.java
│   │   │   ├── model/User.java
│   │   │   └── service/EmailService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/img/
│   │           ├── arg-flag.jpg
│   │           ├── eeuu-flag.jpg
│   │           └── mailhog.jpeg
│   │       └── static/translation/README.es.md
│   └── test/java/com/example/demo/EmailNotificationsApplicationTests.java
├── docker-compose.yml
├── Dockerfile
├── pom.xml
└── README.md
```

<br>

</details>

### 1.3) Tecnologías [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

  <br>

| **Tecnologías** | **Versión** | **Propósito** |
| ------------- | ------------- | ------------- |
| [Java](https://docs.oracle.com/en/java/) | 17+ | Lenguaje de programación principal |
| [Spring Boot](https://spring.io/projects/spring-boot) | 3.x | Framework principal para construir aplicaciones Java |
| [Spring Boot Starter Web](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) | 3.x | Para crear aplicaciones web RESTful |
| [Spring Boot Starter Mail](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) | 3.x | Para gestionar correos electrónicos |
| [Lombok](https://projectlombok.org/) | 1.18+ | Biblioteca para reducir código repetitivo |
| [MailHog](https://github.com/mailhog/MailHog) | 1.0 | Servidor SMTP para pruebas locales de correo electrónico |
| [Docker](https://www.docker.com/) | 20+ | Para crear y gestionar contenedores de aplicaciones |
| [Maven](https://maven.apache.org/) | 3.9+ | Automatización de compilación y gestión de dependencias |
| [JUnit](https://junit.org/junit5/) | 5.x | Framework de pruebas |
| [Postman](https://www.postman.com/downloads/) | 10+ | Cliente Http para pruebas de API |
| [Git](https://git-scm.com/downloads) | 2.x | Control de versiones |
| Otros | - | Otros |

<br>

</details>

<br>

## Sección 2) Flujo de Procesamiento y Pruebas

### 2.0) Flujo de Procesamiento [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

  <br>

1. **Registro de usuario**: Recibe una solicitud POST con datos del usuario (nombre, email).

2. **Envío de correo**: Envía un correo electrónico de bienvenida al usuario registrado usando MailHog como SMTP.

3. **Verificación de correo**: El correo electrónico se puede ver en la interfaz web de MailHog.

<br>

</details>

### 2.1) Validaciones Implementadas [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

  <br>

* El correo electrónico debe estar presente y tener un formato válido (manejado por JavaMailSender, pero puedes extender la validación en el modelo User o el controlador).

* El nombre debe estar presente.

<br>

</details>

### 2.2) Pruebas [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

<br>

### 2.2.0) Verificar que la aplicación esté funcionando

* **Verificar contenedores Docker:**

```bash
docker ps
```

Deberías ver dos contenedores ejecutándose:
- `springboot-app` en el puerto 8080
- `mailhog` en el puerto 8025

* **Verificar logs de la aplicación:**

```bash
docker logs springboot-app
```

### 2.2.1) Acceder a MailHog

* La interfaz web de MailHog estará disponible en `http://localhost:8025`

* Aquí podrás ver todos los correos electrónicos enviados por la aplicación

* La interfaz muestra: remitente, destinatario, asunto y contenido del correo

### 2.2.2) Casos de prueba de la API

#### Caso 1: Registro de usuario exitoso

**Endpoint:** `POST http://localhost:8080/api/users`

**Headers:** `Content-Type: application/json`

**Body:**

```json
{
    "name": "Juan Pérez",
    "email": "juan.perez@example.com"
}
```

**Respuesta esperada:**

```json
{
    "status": 200,
    "message": "User registered and email sent."
}
```

#### Caso 2: Registro con datos mínimos

**Body:**

```json
{
    "name": "Ana",
    "email": "ana@test.com"
}
```

#### Caso 3: Registro con caracteres especiales

**Body:**

```json
{
    "name": "María José",
    "email": "maria.jose@empresa.com"
}
```

### 2.2.3) Verificación de correos en MailHog

Después de cada registro exitoso, verifica en `http://localhost:8025`:

* **Remitente:** `spring-boot@localhost`

* **Destinatario:** El correo proporcionado en la petición

* **Asunto:** `Welcome [nombre]`

* **Contenido:** `Hello [nombre], welcome to our platform!`

### 2.2.4) Casos de prueba con herramientas

#### Usando cURL

```bash
# Registro básico
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{"name": "Carlos López", "email": "carlos@example.com"}'
```

#### Usando Postman

1. Crear nueva colección "Email Notifications"

2. Crear request POST a `http://localhost:8080/api/users`

3. En Headers agregar: `Content-Type: application/json`

4. En Body (raw JSON) agregar:

```json
{
    "name": "Usuario Test",
    "email": "test@example.com"
}
```

### 2.2.5) Limpieza y reinicio

#### Limpiar correos en MailHog

* Acceder a `http://localhost:8025`

* Hacer clic en "Delete All" para limpiar todos los correos

#### Reiniciar servicios

```bash
# Detener servicios
docker-compose down

# Reiniciar servicios
docker-compose up --build

# Reiniciar solo la aplicación
docker-compose restart app
```

### 2.2.6) Solución de problemas

#### Problema: No se reciben correos

* Verificar que MailHog esté ejecutándose: `docker ps`

* Verificar logs de MailHog: `docker logs mailhog`

* Verificar configuración SMTP en `application.properties`

#### Problema: Error de conexión a la API

* Verificar que la aplicación esté ejecutándose: `docker ps`

* Verificar logs de la aplicación: `docker logs springboot-app`

* Verificar que el puerto 8080 esté disponible

#### Problema: Error de Docker

```bash
# Limpiar Docker completamente
docker system prune -a --volumes
docker-compose up --build
```

* `Importante` : Ahora la aplicación está Dockerizada. Podemos detener o ejecutar la app directamente con Docker.

<br>

</details>

<br>

## Sección 3) Pruebas de Funcionalidad y Referencias

### 3.0) Prueba de Funcionalidad [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

<br>

#### [Ver video](https://www.youtube.com/watch?v=QMlpFdOQHfI)

  <a href="https://www.youtube.com/watch?v=QMlpFdOQHfI">
    <img src="../img/mailhog_yt.png" />
  </a>

<br>

</details>

### 3.1) Reportes [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

  <br>

* **Interfaz web de MailHog:** Todos los correos enviados se pueden ver en [http://localhost:8025](http://localhost:8025)

* **Logs de la aplicación:**
  * Ver logs con `docker logs springboot-app`
  * Ver logs de MailHog con `docker logs mailhog`

* **Solución de problemas:** Ver la sección de Solución de problemas en [Pruebas](#22-pruebas-).

<br>

</details>

### 3.2) Contribuir [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

  <br>

1. Hacer fork del proyecto

2. Crear tu rama de características (`git checkout -b feature/AmazingFeature`)

3. Hacer commit de tus cambios (`git commit -m 'Add some AmazingFeature'`)

4. Hacer push a la rama (`git push origin feature/AmazingFeature`)

5. Abrir un Pull Request

<br>

</details>

### 3.3) Licencia [🔝](#índice-)

<details>
  <summary>Ver detalles</summary>

  <br>

Este proyecto está bajo la Licencia MIT - ver el archivo LICENSE para más detalles.

<br>

<<<<<<< HEAD
</details>
=======
Este proyecto implementa un sistema simple de notificaciones por correo electrónico usando Spring Boot y MailHog para pruebas SMTP locales. Está completamente Dockerizado para facilitar el desarrollo y las pruebas locales.

</details> 
>>>>>>> 00baf39d426389b5cfcfe19c2a7efbb03a68b3c1
