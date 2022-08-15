## Biblioteca API
> *Criação de uma API básica para despertar curiosidade sobre o ecossistema Spring*

![spring](https://github.com/martaago/assets/blob/main/spring.png)

## Iniciando um projeto Spring Boot

Vamos utilizar o Spring Initializr para definir as configurações iniciais:

https://start.spring.io/

### Dependências iniciais
- Web
- Data JPA
- test (padrão)

### IDE
- IntelliJ IDEA

## Dependências Maven

```xml

	<dependencies>

		<dependency> <!-- COMUNICAÇÃO COM O BANCO -->
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency> <!-- PROJETO WEB -->
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
					<!-- SWAGGER -->
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>3.0.0</version>
		</dependency>
					<!-- SWAGGER -->
		<dependency>
		<groupId>io.springfox</groupId>
		<artifactId>springfox-boot-starter</artifactId>
		<version>3.0.0</version>
		</dependency>

		<dependency> <!-- BANCO H2 -->
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>

		<dependency> <!-- DEPENDENCIA PADRÃO DE TESTE -->
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

	</dependencies>

```


- [Como começar](#getting-started)
    - [Requerimentos](#requirements)
- [Stack](#built-with)
- [Diagrama de Classes](#diagrama-de-classes)
- [Contribuidores](#current-contributors)

## Como começar

As instruções a seguir vão te guiar para poder rodar o projeto.

### Requerimentos

Para construir e rodar a aplicação, você irá precisar:

- [Java JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [PostgreSQL 11.5](https://www.enterpr
