# Iniciando um Projeto

Segue o passo a passo para uma estrutura básica.

1. Criar um diretório para o seu projeto.
1. Iniciar um projeto através do comando **npm init -y *(-y modelo padrão de criação)***.
1. Instalar o express (Framework para desenvolvimento de aplicações WEB): **mpm install --save express**
1. Instalar ejs (Engine de Views): **npm install --save ejs**
1. Instalar o consign (Autoload): **npm install --save consign**
1. Instalar Body-Parser (Middleware que popula body que contém os elementos de formulário transitados entre requisições): **npm install --save body-parser**
1. Instalar express-validator (Módulo que valida as informações digitadas em formulários): **npm install --save express-validator**

Adicionais: Para não precisar parar e iniciar o servidor em cada atualização, deve-se instalar o **npm install -g nodemon** . E Para desinstalar algum pacote se utiliza o comando **npm uninstall *pacote***

Por fim, a estrutura de diretórios criadas segue o modelo demonstrado no projeto.