#!/bin/bash

# Tomcat
url="http://localhost:8080/"
status_code=200
echo "Running Tomcat Validation\n"
while true; do
    ret=$(curl -I -s -X GET "$url" -o /dev/null -m 5  -w "%{http_code}")
    echo "Tomcat status code: $ret\n"
    ((ret==status_code)) && break;
    sleep 2
done;
echo "Tomcat Validation Done!"
