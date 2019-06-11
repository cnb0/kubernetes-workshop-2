# Challenge: Hello-World with Db

In this challenge you will extend the helloworld app to record visits on your /visit controller.

Each time a REST API is made on the /visit endpoint , you will need to record this value in MySQL database 
and return a message

## "you are visitor number 4 !" 

Perform the following steps:

* create a secret with the following items:
    - username: YWRtaW4=
    - password: cGFzc3dvcmQ=
    - rootPassword: cGFzc3dvcmQ=
    - database: ZGJfZXhhbXBsZQ==

* create a pod that has the image mysql:5.7 and has 4 environment variables from the secret :
 ```
apiVersion: v1
kind: Pod
metadata:
  name: database
  labels:
    app: database
spec:
  containers:
  - name: mysql
    image: mysql:5.7
    ports:
    - name: mysql-port
      containerPort: 3306
    env:
      - name: MYSQL_ROOT_PASSWORD
        valueFrom:
          secretKeyRef:
            name: db-secrets
            key: rootPassword
      - name: MYSQL_USER
        valueFrom:
          secretKeyRef:
            name: db-secrets
            key: username
      - name: MYSQL_PASSWORD
        valueFrom:
          secretKeyRef:
            name: db-secrets
            key: password
      - name: MYSQL_DATABASE
        valueFrom:
          secretKeyRef:
            name: db-secrets
            key: database
```

* expose the pod as a service on port 3306
* In your code ,write a controller that reads the environment variables and initialize a connection to the MySQL instance
* create an image out of your solution , pod it and Expose it as a Service 
* Note that the host name of the MySQL is actually the service name of the database in kubernetes !

