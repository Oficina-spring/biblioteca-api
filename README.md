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

## Classe de configuração 

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
