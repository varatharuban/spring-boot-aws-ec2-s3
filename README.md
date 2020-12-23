# Simple spring boot application running on AWS with EC2 and S3

**Create a simple spring boot application with one or two rest end points.**
- To simplify the jar name, this tag in pom.xml file
```<finalName>spring-boot-aws</finalName>```

**By executing following command build the JAR file.**
```mvn clean install```
- In the target folder you can see the generated jar file

**Login into ec2 instance**
- Make sure the port 8080 is open in the security groups. Becuase this spring boot application running on port 8080
- Execute the following commands.
```
sudo -1
java -version
yum install java-1.8.0-openjdk
alternatives --config java
```
## Create s3 bucket and place the jar file (make it as public)
- Copy the object url

## Do the following in ec2 instance
- wget <paste the s3 object https url>
- ls
- lets run the jar 
```java -jar spring-boot-aws.jar```
- It will start the spring boot application.

## Now you can access the rest end points by using the public DNS.
```http://ec2-13-212-78-206.ap-southeast-1.compute.amazonaws.com:8080/```
```http://ec2-13-212-78-206.ap-southeast-1.compute.amazonaws.com:8080/orders```
