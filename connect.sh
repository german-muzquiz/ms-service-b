#!/bin/bash

kubectl -n dev port-forward service/service-b 7000:8080 &
kubectl -n qa port-forward service/service-b 7001:8080 &
kubectl -n prod port-forward service/service-b 7002:8080 &
