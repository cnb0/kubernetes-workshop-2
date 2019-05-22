const express = require('express')
const app = express()
const port = process.env.PORT || 8080

app.get('/greeting', (req, res) => res.send('Hello World!'))
app.get('/greeting/:userId', (req, res) => {
    const user = req.param('userId')
    res.send('Hello ' + user  + ' !');
});

app.listen(port, () => console.log(`Example app listening on port ${port}!`))