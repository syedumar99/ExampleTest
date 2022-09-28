const mysql = require('mysql');

const pool = mysql.createPool({
    connectionLimit:10,
    password:'root@123',
    user:'root',
    database:'employee_details',
    host:'localhost',
    port:'3306',
});

let prodb ={};

prodb.all=()=>{
    return new Promise((resolve,reject)=>{      
      pool.query('SELECT * FROM EMPLOYEE',(err,result)=>{
          if(err){
            return reject(err);
          }
          return resolve(result);
      })
    });
}

module.exports = prodb;