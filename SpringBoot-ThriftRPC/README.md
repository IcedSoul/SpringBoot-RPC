## 环境
- Spring Boot 2.0.6
- dubbo-spring-boot-starter 0.2.0

## 代码
- https://github.com/IcedSoul/SpringBoot-RPC/tree/master/SpringBoot-ThriftRPC

## 简单介绍
thiriftRPC同样是一个RPC框架。
### 特性
- 面向接口代理的高性能RPC调用。
- 支持多种语言。
- 提供多种工作模式


### 个人感觉
thrift RPC我直接使用官方文档然后查阅一些博客来实现的。

thriftrpc和grpc一样，都需要定义中间接口文件，语法也基本类似。这里虽然找了Maven自动编译thrift文件的插件，但是还需要去官网专门下载对应的工具并且在插件中设置好路径，具体可以见运行说明。

thrift生成的接口代码比较多(虽然文件只有一个)。

具体实现时，thriftRPC为了实现一个函数的远程调用需要添加不少的代码。不过可以看出很多地方都是可以封装的，如果专门花时间封装一下，针对SpringBoot
做一个类似于SpringBoot dubbo的插件，那么实现起来应该也可以简化。

和grpc一样，thriftrpc支持多种语言，不过比grpc支持的语言更多一些。

不是很推荐使用。

## Demo运行

```
# 1. 使用如下指令，将代码下载到本地(需安装Git客户端)
git clone https://github.com/IcedSoul/SpringBoot-RPC.git

# 2. 去thrift官网下载thrift编译工具，进入项目目录，修改pom文件的plugin中thrift工具的路径。
cd SpringBoot-RPC/SpringBoot-ThriftRPC
# 下载thrift工具
vi pom.xml
#修改路径

# 3. 执行Maven编译打包指令（需安装Maven）
mvn clean package -DskipTests

# 3. 使用Docker启动并且运行此项目（需安装docker和docker-compose工具）
docker-compose build
docker-compose up -d

# 4.在浏览器访问Swagger-UI页面测试效果。
http://localhost:19696/swagger-ui.html
```

## 相关资料
ThriftRPC Github：https://github.com/apache/thrift
- ThriftRPC 官网主页：https://thrift.apache.org
- 博客：https://www.jianshu.com/p/15dbc8665648
https://juejin.im/post/5afa19bf51882542653995b7