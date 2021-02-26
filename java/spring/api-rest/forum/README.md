# Modelo de Api Rest

![Api Rest](apirest.gif)

Exemplo simples de uma api rest simulando a criação de tópicos em um fórum.

Endpoints:

Listagem
```
localhost:8080/topicos
```
Listagem Detalhada
```
localhost:8080/topicos/1
```
Criação
```
localhost:8080/topicos

Json
{
	"titulo" : "Titulo Criado",
	"mensagem" : "Mensagem Criada",
	"nomeCurso" : "Superior Criado"
}
```
Atualização
```
localhost:8080/topicos/1

Json
{
	"titulo" : "Titulo Atualizado",
	"mensagem" : "Mensagem Atualizada",
	"nomeCurso" : "Superior Atualizado"
}
```
Remoção
```
localhost:8080/topicos/1
```