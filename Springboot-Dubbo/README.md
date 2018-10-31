## 环境
- Spring Boot 2.0.6
- dubbo-spring-boot-starter 0.2.0

## 代码下载
- https://github.com/IcedSoul/SpringBoot-RPC/tree/master/Springboot-Dubbo

## 简单介绍
Dubbo RPC是一款高性能的JavaRPC框架。
### 特性
- 面向接口代理的高性能RPC调用。
- 智能负载均衡。
- 服务自动注册和发现。
- 高度可扩展能力。
- 运行期流量调度。
- 可视化服务治理和运维。

### 个人感觉
在使用SpringBoot分别使用Dubbo RPC、gRPC和thriftRPC实现RPC调用的基本Demo之后，个人感觉DubboRPC是这三者之中实现起来最为简单的，具体优点总结如下：
1. 不需要像gRPC或者thriftRPC一样定义中间文件，也不需要太多的配置，在SpringBoot中甚至只需要注解就能够直接屏蔽所有底层细节，方便地实现远程调用。
2. 可以方便地使用zookeeper之类的服务注册工具来实现服务注册和发现。
3. 文档比较齐全。

至于特性中的其它几点因为Demo过于简单我还没有感觉，如果以后有机会实际操作的话尝试体验一下。

但是使用Dubbo RPC也有一个很明显的问题：**只支持Java，不支持其它语言**，但是常见的微服务系统基本不会局限只使用Java语言，当同时使用Python，Golang或者NodeJS时，就不能使用Dubbo RPC了，这点是硬伤。但是当大多数服务使用语言都是用Java时，DubboRPC是一个不错的选择。

此外，在使用三种RPC框架的过程中，我发现三个RPC框架的Client和Server都需要依赖一个公共的接口，目前我觉得这是一个很大的问题，如果因为使用RPC导致服务之间增加了这么严重的依赖关系，那么使用微服务的意义何在？现在我不太清楚有没有方法可以解决这种依赖关系，既然广泛应用在微服务系统那么应该是有的，以后可以深入了解一下。

## Demo运行

```
# 1. 使用如下指令，将代码下载到本地(需安装Git客户端)
git clone https://github.com/IcedSoul/SpringBoot-RPC.git

# 补充：这里使用到了zookeeper需要自己下载安装好并且启动，配置地址默认（Server&Client默认地址是localhost的2181端口）。如果没有安装Zookeeper启动时会报错。

# 2. 进入项目目录并且执行Maven编译打包指令（需安装Maven）
cd SpringBoot-RPC/Springboot-Dubbo
mvn clean package -DskipTests

# 3. 使用Docker启动并且运行此项目（需安装docker和docker-compose工具）
docker-compose build
docker-compose up -d

# 4.在浏览器访问Swagger-UI页面测试效果。
http://localhost:19692/swagger-ui.html
```

## 相关资料
- Dubbo Github：https://github.com/apache/incubator-dubbo
- Dubbo 官网主页：http://dubbo.incubator.apache.org/zh-cn/
- Spring Boot Dubbo Demo：https://github.com/apache/incubator-dubbo-spring-boot-project
- Spring Boot Dubbo 博客：https://blog.csdn.net/mynameissls/article/details/82669224hao