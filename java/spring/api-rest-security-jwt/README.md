# Modelo de Api Rest com autenticação via JWT, monitoramento por Actuator e documentação com Swagger.

Os endpoints utilizados nesse modelo estão descritos no exemplo [Api Rest](https://github.com/devAlbuquerque/C0DES/tree/master/java/spring/api-rest/forum)

Para se autenticar se utiliza o endpoint abaixo:

Autenticar
```
localhost:8080/auth

Json
{
	"email" : "aluno@email.com",
	"senha" : "123456"
}
```
Para monitorar os dados através do Actuator, rodando no [servidor](https://github.com/devAlbuquerque/C0DES/tree/master/java/spring/api-rest-security-jwt/admin)
```
localhost:8081
```
Para conferir a documentação com Swagger 
```
localhost:8080/swagger-ui.html
```