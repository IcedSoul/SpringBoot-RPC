## RPC相关基础知识

### 概念
Remote Procedure Call 远程过程调用，
即通过一定的协议和方法使得调用远程计算机上的服务，就像调用本地服务一样。

### 分类
- 从通信协议分类：
    - 基于Http协议
    - 基于TCP协议
    - 基于二进制协议
- 从是否跨平台：
    - 单语言RPC
    - 跨平台RPC
- 从调用过程分类：
    - 同步RPC
    - 异步RPC

### RPC模块

- 服务端（Server）：RPC服务提供者，负责将RPC服务导出
- 客户端（Client）：RPC服务的消费者，负责调用RPC服务
- 代理（Proxy）：通过动态代理，提供对远程接口的代理实现
- 执行器（Invoker）：对于客户端来说主要负责服务调用的编码，调用请求发送和等待结果返回。对于服务方来说，负责调用逻辑并且返回结果。
- 协议管理（Protocol）：协议管理组件，负责整个RPC通信协议的编/解码。
- 连接端口（Connector）：负责维持客户端和服务端长连接通道。
- 后台处理（Processor）:负责整个调用服务中的管理调度，包括线程池，分发，异常处理等。
- 连接通道（Channel）：客户端和服务端的数据传输通道。

### Server端问题
- 并发控制
- 版本隔离
- 服务路由
- 服务降级
- 服务监控和报警

 感觉上面所说的服务端的不少问题已经被Kubernetes解决了，具体它们应该怎么结合还是一个需要考虑的问题。
 
 而且在使用RPC时，会遇到网络问题和不一致性问题等等，但是这些问题微服务中就算不使用RPC也有。或者说这本身就是分布式系统本身存在的问题。所以就微服务来说使用RPC应该是非常方便的问题。
 
 如protobuff，dubbo和thift都可以仔细看一下源码
 
 具体的比较可以看以下博客的说明：  
 
 thriftRPC和gRPC的特点比较：https://blog.csdn.net/testcs_dn/article/details/78038842
 
 常见RPC框架性能比较：https://colobu.com/2016/09/05/benchmarks-of-popular-rpc-frameworks/
 
 ### 主要框架
 
 RMI：Java远程方法协议和Java的原生序列化。
 Hessian：使用简单的方法提供了RMI的功能，基于Http协议，使用二进制编码
 protobuf-rpc-pro：Java类库，提供了基于protobuf协议的远程方法调用的框架
 thrift：跨语言服务的软件框架。
 avro：想要建立一个新的，标准性的云计算数据交换和存储的Protocol
 
 ### 参考资料
 
- https://waylau.com/remote-procedure-calls/
- https://www.jianshu.com/p/5b90a4e70783
- https://blog.csdn.net/testcs_dn/article/details/78038842
- https://colobu.com/2016/09/05/benchmarks-of-popular-rpc-frameworks/