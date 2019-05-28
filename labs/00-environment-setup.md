# Prepare you environment

Welcome to the Kubernetes workshop for Developers.

you can choose two paths to work in this workshop :
* Standalone Kubernets cluster on your local machine -> 1 node 
* Using Google cloud platform - by using a free account under you gmail account, activate a free trial which will give you 300$ for 1 year (you will need a credit card for that) , and use you free acount in the workshop. (Recommended)

* I will use GCP in my demos and exercies.

* In all cases , Docker for linux/mac/windows must be present and some familiarity
with docker is recommended.
we will not cover docker basics in the workshop.

## Installing Kubernets on your local machine - MacOs

* if you have Mac your life are simply and easy. simply download the latest 
docker-for-mac client and enable Kubernetes in the settings page and you are done.
There is no need to isntall minikube anymore, docker-for-mac has it all.

## Installing Kubernets on your local machine - Linux
* if you have linux  follow these guidelines to install kubernets :
    1. You must have VM driver on your machine , I recommend KVM2 :
    
    ```
    curl -LO https://storage.googleapis.com/minikube/releases/latest/docker-machine-driver-kvm2 
    
    sudo install docker-machine-driver-kvm2 /usr/local/bin/ && rm docker-machine-driver-kvm2
    ```
    
    2. Minikube installation :

    ```
    curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64 \
    
    sudo install minikube-linux-amd64 /usr/local/bin/minikube && rm minikube-linux-amd64
    ```

     3. Verify the Minikube installation and start

     ```
     minikube version
     minikube start --vm-driver kvm2
    ```

    4. full tutorial : 
    https://kubernetes.io/blog/2019/03/28/running-kubernetes-locally-on-linux-with-minikube-now-with-kubernetes-1.14-support/

## Installing kubeclt CLI tool on your local machine - Mac + Linux
    https://kubernetes.io/docs/tasks/tools/install-kubectl

## Google Cloud installation  (for those who has an account):
    1. https://cloud.google.com/sdk/install
    2. you will still need docker, and kubectl CLI on your local machine.


## Testing that all is ready

```
kubectl version
```

output :

Client Version: version.Info{Major:"1", Minor:"13", GitVersion:"v1.13.4 ....", 

Server Version: version.Info{Major:"1", Minor:"10", GitVersion:"v1.10.11 .....", 


```
kubectl get nodes
```


output :

NAME                 STATUS   ROLES    AGE   VERSION

docker-for-desktop   Ready    master   80d   v1.10.11

