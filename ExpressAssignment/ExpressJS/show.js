const express = require('express');
const app = express();
const path = require('path');

app.use(express.static(path.join(__dirname,'public')));

/*app.get("/",(req,res)=> {
    //res.send('<h1>Welcome to Express JS!<h1>')
   //res.sendFile(path.join(__dirname,'public','index.html'));

});*/
const port = process.env.port || 4200;
app.listen(port, ()=>console.log('server started on port ${port}'));