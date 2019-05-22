# Create a cluster

In this lab you will create a Kubernetes using the gcloud command.

Set the GCE compute zone:

```
gcloud config set compute/zone europe-west1-c
```

Create a Kubernetes cluster named `$yourname_tik`:

```
gcloud container clusters create tshaiman_tik 
```
