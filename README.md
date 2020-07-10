Spring Boot 学习示例
=========================

![Spring Boot 2.3.1](https://img.shields.io/badge/Spring%20Boot-2.3.1-brightgreen.svg)
![JDK 1.8](https://img.shields.io/badge/JDK-1.8-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-3.6.3-yellowgreen.svg)
![Mysql 8.0.19](https://img.shields.io/badge/Mysql-8.0.19-blue.svg)

spring boot示例，从头开始一步步学习spring boot

[Spring Boot 官网](https://spring.io/projects/spring-boot) &nbsp;| &nbsp; [Spring Cloud 官网](https://spring.io/projects/spring-cloud) 


 [Spring Boot 中文索引](http://springboot.fun/) &nbsp;| &nbsp;[纯洁的微笑-Spring Boot系列文章](http://www.ityouknow.com/spring-boot.html) &nbsp;| &nbsp; [林祥纤-从零开始学Spring Boot](https://412887952-qq-com.iteye.com/category/356333?page=10) 

---

# Spring Boot 学习历程

- [X] [简单开发`Hello Spring Booot`](#menu1)
- [ ] [返回`json`数据](#menu2)
- [ ] [热部署](#menu3)
- [ ] [全局配置](#menu4)
- [ ] [`redis` 使用](#menu5)
- [ ] [`Thymeleaf` 使用](#menu6)
- [ ] [`Spring Boot Jpa` 使用](#menu7)
- [ ] [`mybatis` 使用](#menu8)
- [ ] [`mybatis` 多数据源](#menu9)
- [ ] [`mybatis plus` 使用](#menu10)
- [ ] [`RabbitMQ` 使用](#menu11)
- [ ] [定时任务](#menu12)
- [ ] [邮件服务](#menu13)
- [ ] [`MongoDB` 使用](#menu14)
- [ ] [打包、测试、部署](#menu15)
- [ ] [`FastDFS` 集成](#menu16)
- [ ] [`maven` 多模块配置](#menu17)

---

##  <span id="menu1">1.简单开发`Hello Spring Booot` </span>

- 部署简单的`spring boot web`项目，配置`RestController`及`RequestMapping`

- 启动 `Learn1HellospringbootApplication`，调用本地端口即可访问(http://localhost:8080/)

---

##  <span id="menu2">2.返回`json`数据 </span>

在以前使用 Spring 开发项目，需要提供 json 接口时需要做以下配置

> 1.添加 fastjson 等相关 jar 包 <br>
> 2.配置 Spring Controller 扫描 <br>
> 3.对接的方法添加 @ResponseBody <br>

Spring Boot 只需要类添加 `@RestController` 即可，默认类中的方法都会以 json 的格式返回
```java
@RestController
public class HelloController {
    @RequestMapping("/getUser")
    public User getUser() {
    	User user=new User();
    	user.setUserName("小明");
    	user.setPassWord("xxxx");
        return user;
    }
}
```
如果需要使用页面开发只要使用`@Controller`注解即可，下面会结合模板来说明

---

##  <span id="menu3">3.热部署 </span>

---

##  <span id="menu4">4.全局配置 </span>

全局配置包含：`application.properties`/`application.yml`配置、过滤器`filter`、全局捕获异常`exception`、日志`log`配置等

---

##  <span id="menu5">5.`redis` 使用 </span>

---

##  <span id="menu6">6.`Thymeleaf` 使用 </span>

---

##  <span id="menu7">7.`Spring Boot Jpa` 使用 </span>

---

##  <span id="menu8">8.`mybatis` 使用 </span>

---

##  <span id="menu9">9.`mybatis` 多数据源 </span>

---

##  <span id="menu10">10.`mybatis plus` 使用 </span>

---

##  <span id="menu11">11.`RabbitMQ` 使用 </span>

---

##  <span id="menu12">12.定时任务 </span>

---

##  <span id="menu13">13.邮件服务 </span>

---

##  <span id="menu14">14.`MongoDB` 使用 </span>

---

##  <span id="menu15">15.打包、测试、部署 </span>

---

##  <span id="menu16">16.`FastDFSs` 使用 </span>

---

##  <span id="menu17">17.`maven` 多模块配置 </span>
