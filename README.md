# 项目说明
这是首次使用maven 搭建项目环境，以前用的都是gradle,很多配置看不懂，折腾好久
因为公司使用maven，所以有必要自己尝试一下

## maven 多项目配置
配置时写下的文档记录： http://note.youdao.com/noteshare?id=fceb534ca67920a2b64c45ee0c5ab46f

父pom
--
    <!--将jar改为 pom-->
    <packaging>pom</packaging>
    <!--添加子模块引用-->
    <modules>
        <module>service</module>
        <module>domain</module>
        <module>dao</module>
        <module>service-api</module>
        <module>controller</module>
    </modules>
    
子pom
--
        <parent>
            <artifactId>parent-system</artifactId>
            <groupId>javastar920905</groupId>
            <version>1.0-SNAPSHOT</version>
        </parent>
        <modelVersion>4.0.0</modelVersion>
    
        <artifactId>service-api</artifactId>
        <packaging>jar</packaging>

## 集成spring boot 
[spring boot mybatis参考文档](http://note.youdao.com/noteshare?id=a4ae45c118dee63658e4a4a1e85bf0a9&sub=5B30651D819F4247991158D475F94D23)
这里有个问题，spring boot 文档基本都是提及简单配置spring-boot-start-parent

这里需要换成 <dependencyManagement>方式
-- 
    <!--spring boot 依赖管理版本，当前版本配置druid 连接时，会报错找不到相关类 -->
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>2.0.3.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

# 集成dubbo 
[dubbo 个人总结](http://note.youdao.com/noteshare?id=a848648305c19df482669a58f76bdd77)
[dubbo spring boot 教程](https://github.com/apache/incubator-dubbo-spring-boot-project/blob/master/README_CN.md)
[dubbo_官方教程_中文](http://dubbo.incubator.apache.org/#!/?lang=zh-cn)
dubbo测试未成功，没有部署zookeeper测试

# 控制台管理安装 
[参考文档](http://dubbo.incubator.apache.org/#!/docs/admin/install/admin-console.md?lang=zh-cn)
