# pa2_api_u1_p6_is

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/pa2_api_u1_p6_is-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Provided Code

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)

## Tarea 3: 7 ejemplos de cada contexto:

### @ApplicationScoped

1. **Contador de "Salud" de Microservicios** – Rastrea fallos de dependencias externas para decidir si abrir un Circuit Breaker global.
2. **Caché de Configuración Dinámica** – Almacena parámetros de un servidor remoto (Spring Cloud Config) evitando peticiones HTTP constantes.
3. **Gestor de WebSockets Activos** – Registro de sesiones de clientes conectados en chat o notificaciones en tiempo real.
4. **Motor de Reglas de Negocio** – Instancia pesada de Drools cargada una vez para procesar datos de toda la app.
5. **Acumulador de Métricas Custom** – Recolecta estadísticas de uso (ej. total de archivos procesados) antes de enviar lotes a Prometheus/Grafana.
6. **Diccionario de Traducciones (I18n)** – Mapa en memoria con literales del sistema en varios idiomas para acceso instantáneo.
7. **Pool de Conexiones a Sistema Legado** – Adaptador único que gestiona acceso limitado a mainframe o BD antigua.

### @Dependent

1. **Generador de Salting para Passwords** – Genera cadena aleatoria única cada vez que se procesa un nuevo usuario.
2. **Validador de Formatos Específicos** – Verifica si un string es JSON o XML válido antes de la lógica de negocio.
3. **Calculadora de Impuestos Transitoria** – Cálculos complejos basados en leyes vigentes durante una transacción financiera.
4. **Logger Personalizado por Clase** – Recupera el nombre de la clase donde fue inyectado para trazas específicas.
5. **Parser de Archivos CSV/Excel** – Se crea para leer un archivo y se destruye inmediatamente después de extraer datos.
6. **Transformador de DTO a Entidad** – Mapea datos de la capa de vista a persistencia en una operación única.
7. **Token de Operación de Corta Duración** – Contiene UUID único para rastrear el flujo de una petición específica.

### @Singleton

1. **Secuenciador de IDs en Memoria** – Garantiza que no se entreguen dos números de ticket iguales en alta concurrencia.
2. **Planificador de Tareas (Scheduler)** – Componente maestro que decide cuándo disparar procesos de limpieza de BD.
3. **Semáforo de Acceso a Hardware** – Asegura que solo un hilo escriba a la vez a impresora térmica o sensor físico.
4. **Gestor de Inventario en Tiempo Real** – Bloquea temporalmente disponibilidad de producto mientras el cliente está en checkout.
5. **Orquestador de Despliegue** – Asegura que al presionar "Actualizar Sistema" múltiples veces, solo se ejecute una vez.
6. **Bóveda de Secretos en Memoria** – Mantiene claves de cifrado temporales (desencriptadas) para evitar acceso constante a HSM.
7. **Controlador de Cuotas de API** – Rate Limiter que cuenta peticiones disponibles por plan de suscripción antes de bloquear.
