## Biblioteca API
> *Criação de uma API básica para despertar curiosidade sobre o ecossistema Spring*

![diagrama](https://raw.githubusercontent.com/Oficina-spring/biblioteca-api/develop_v2/src/main/java/com/minicurso/biblioteca/doc/diagrama.png)

## Iniciando um projeto Spring Boot

Vamos utilizar o Spring Initializr para definir as configurações iniciais:

https://start.spring.io/

### Dependências iniciais
- Web
- Data JPA
- H2 DataBase

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
## Arquivo de configuração: application.properties

```
#H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Datasource
spring.datasource.url=jdbc:h2:mem:biblioteca
spring.datasource.username=admin
spring.datasource.password=admin
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
```
## Classe de configuração: Swagger

```java
package com.minicurso.biblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
```

    http://localhost:8080/swagger-ui/index.html
    localhost:8080/h2-console
