# Create a cluster

In this lab you will create a Kubernetes using the gcloud command.

1. Set up billing account
2. Enable the Kubernetes API
3. Connect from local Terminal :
```
gcloud auth login
gcloud config set project [project-id] 
```

4.Set the GCE compute zone:

```
gcloud config set compute/zone europe-west1-c
```

5. Create a Kubernetes cluster named `$cluster-name`:

```
gcloud container clusters create k8-demo 
```

6. update the kubectl config in the cloud shell

```
gcloud container clusters get-credentials k8-demo
```

6. Shut Down cluster 
```
gcloud container clusters delete k8-demo
```
