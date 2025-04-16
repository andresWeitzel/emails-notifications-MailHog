## Email Notifications MailHog
Este es un proyecto de demostración basado en Spring Boot para el envío de correos electrónicos. Utiliza MailHog como servidor SMTP para pruebas locales y está completamente dockerizado para facilitar su ejecución.

### Tecnologías y Dependencias
 * Spring Boot: Framework principal para la construcción de aplicaciones Java.
* Spring Boot Starter Web: Para crear aplicaciones web RESTful.
* Spring Boot Starter Mail: Para el manejo de correos electrónicos.
* Lombok: Librería para reducir el boilerplate en el código.
* MailHog: Servidor SMTP para pruebas de correos locales.
* Docker: Para crear y gestionar contenedores de la aplicación.

### Funcionalidades
* Registro de usuarios: A través de un controlador REST, los usuarios pueden registrarse y recibir un correo electrónico de bienvenida.
* Envío de correos electrónicos: Usando JavaMailSender para enviar correos electrónicos mediante MailHog en entorno de desarrollo.

### Requisitos
* Java 17 o superior.
* Docker para ejecutar MailHog y la aplicación en contenedores.

### Configuración y Ejecución
* Clonación del repositorio
  ```git
  git clone https://github.com/tuusuario/email-notifications.git
  cd email-notifications
  ```

