/* importar as configurações do servidor */
var app = require('./config/server');

/* parametrizar porta de escuta */
app.listen(80, function(){
    console.log('Servidor online');
})