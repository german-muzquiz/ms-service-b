#!/bin/bash

VERSION=`cat version`
./mvnw clean package
docker build -t german640/ms-service-b:$VERSION .
docker push german640/ms-service-b:$VERSION

