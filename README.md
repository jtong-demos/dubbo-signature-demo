```
docker pull zookeeper
docker run --name some-zookeeper -p2181:2181 --restart always -d zookeeper
```
1. run main method in Provider
2. run main method in ConsumerApplication

visit ```http://localhost:8080/hello?name=world```