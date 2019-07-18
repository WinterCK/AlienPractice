# AlienPractice
SpringCloud各组件整合项目实战

### 项目下载运行
#### 下载注册中心
使用命令 `git clone -b registry git@github.com:WinterCK/AlienPractice.git` 导入项目后，使用maven打包 `maven clean install` 将jar包运行即可

第一个注册中心:
##### java -jar alien-registry-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1

第二个注册中心:
##### java -jar alien-registry-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

### 搭建具体过程请看博客
[最简单的SpringCloud实战系列 一 搭建高可用的注册中心Eureka](http://blogcjk.sharewe.club/2019/07/07/SpringCloudIntegrationProjectStudy-One/)

[最简单的SpringCloud实战系列 一 搭建高可用的注册中心Eureka（IntelliJ IDEA版）](http://blogcjk.sharewe.club/2019/07/15/SpringCloudIntegrationProjectStudy-One-Idea/)

