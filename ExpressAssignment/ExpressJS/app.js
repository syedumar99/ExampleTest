const express = require('express');
const app = express();

const members = [
    {
        id:1,
        name: 'Umar',
        email: 'syedumar1299@gmail.com',
        status: 'active'
    },
    {
        id:2,
        name: 'Thouheed',
        email: 'thouheed@gmail.com',
        status: 'Inactive'
    },
    {
        id:3,
        name: 'Shyam',
        email: 'shyam@gmail.com',
        status: 'Inactive'
    },
];

//get all members
app.get('/api/members',(req,res)=>{
    res.json(members);
});

const PORT = process.env.PORT || 3012;
app.listen(PORT, ()=> console.log('server started...'));