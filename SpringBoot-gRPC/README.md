## 环境
- Spring Boot 2.0.6
- grpc-server-spring-boot-starter net.devh 2.0.1.RELEASE

## 代码下载
- https://github.com/IcedSoul/SpringBoot-RPC/tree/master/SpringBoot-gRPC

## 简单介绍
gRPC 一开始由 google 开发，是一款语言中立、平台中立、开源的远程过程调用(RPC)框架。
### 特性
- 接口定义简单（使用proto buffers）（Simple service definition）
- 跨语言，跨平台（Works across languages and platforms）
- 启动快速，可扩展性强（Start quickly and scale）
- 双向通信并且集成认证（Bi-directional streaming and integrated auth）

### 个人感觉
虽然纠结了许久时直接使用gRPC的jar包还是使用别人集成的springboot starter，毕竟这个集成包不像spring boot dubbo一样是由官方维护的，我找到了三个不同人所维护的版本，能不能正常使用很值得担忧。但是在尝试了不使用别人集成包的方法之后发现太难了，需要自己实现的部分太多，而这里只是搭一个简单的Demo，没有必要深入。所以最终还是选择了使用其中一个版本的spring boot starter集成包。如果真正地想要在项目中使用，建议还是花时间去使用官方提供的包自己实现。  
简单使用以后，我总结了一些搭建过程中gRPC的一些特点：
1. 需要定义接口文件（protobuf），但是使用的语法非常简单，看一下大概就能上手，然后根据接口文件来自动生成对应的接口类，供服务端和客户端调用。
2. 实现起来略微复杂，需要手动实现的部分比较多。

因为有了接口文件自动生成接口类，那么跨语言应该是可以的，但是跨语言怎么解决接口依赖的问题我还不是太清楚，后面有机会一定要研究一下。

在微服务使用多种语言的情况下，使用gRPC是一个不错的选择。

## Demo运行

```
# 1. 使用如下指令，将代码下载到本地，如果已经clone过可直接进行第二步(需安装Git客户端)
git clone https://github.com/IcedSoul/SpringBoot-RPC.git

# 2. 进入项目目录并且执行Maven编译打包指令（需安装Maven）
cd SpringBoot-RPC/Springboot-Dubbo
mvn clean package -DskipTests

# 3. 使用Docker启动并且运行此项目（需安装docker和docker-compose工具）
docker-compose build
docker-compose up -d

# 4.在浏览器访问Swagger-UI页面测试效果。
http://localhost:19694/swagger-ui.html
```

## 相关资料
- gRPC-java Github：https://github.com/grpc/grpc-java
- gRPC 官网主页：https://grpc.io/
- Spring Boot gRPC：https://github.com/yidongnan/grpc-spring-boot-starter