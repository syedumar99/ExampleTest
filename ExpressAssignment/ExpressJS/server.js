const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors())
app.use('/employees',require('./router/index'));


const PORT = process.env.PORT || 4343;

app.listen(PORT,()=>console.log('server started...'));