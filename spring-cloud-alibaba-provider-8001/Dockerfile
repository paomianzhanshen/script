# 基于官方 OpenJDK 8 镜像
FROM openjdk:8-jdk-alpine

# 作者信息
LABEL maintainer="Leo Wang"

# 创建目录
WORKDIR /app

# 复制 jar 包
#COPY target/spring-cloud-alibaba-provider-8001-0.0.1-SNAPSHOT.jar app.jar
COPY target/spring-cloud-alibaba-provider-8001-0.0.1-SNAPSHOT.jar app.jar
# 暴露端口
EXPOSE 8001

# 启动命令
ENTRYPOINT ["java","-jar","app.jar"]

