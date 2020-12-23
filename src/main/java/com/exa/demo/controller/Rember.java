package com.exa.demo.controller;

public class Rember {

//    springboot项目中无法直接访问templates下的html文件的解决方法
//
//    解决方案是在appliation.properties下添加
//    https://www.cnblogs.com/zmwy/p/11635635.html
//    spring.resources.static-locations=classpath:/templates/


//    2  xml 的映射器代码

//    https://mybatis.org/mybatis-3/zh/sqlmap-xml.html#Result_Maps
//
//    动态添加表行的javascript函数如下：
//
//
//    function addRow(){
////添加一行
//
//        var newTr = testTbl.insertRow();
//
////添加两列
//
//        var newTd0 = newTr.insertCell();
//
//        var newTd1 = newTr.insertCell();
//
////设置列内容和属性
//
//        newTd0.innerHTML = '<input type=checkbox id="box4">';
//
//        newTd2.innerText= '新加行';
//
//    }
//
//    https://blog.csdn.net/xiaochongzi520/article/details/3976108


//    https://docs.spring.io/spring-boot/docs/1.5.10.RELEASE/reference/


//    spring boot的web 开发
//    https://docs.spring.io/spring-boot/docs/1.5.10.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications

//    sprng boot 已经控制好spring  mvc
//Spring Boot provides auto-configuration for Spring MVC that works well with most applications.
//
//    The auto-configuration adds the following features on top of Spring’s defaults:
//
//    Inclusion of ContentNegotiatingViewResolver and BeanNameViewResolver beans.
//    Support for serving static resources, including support for WebJars (see below).
//    Automatic registration of Converter, GenericConverter, Formatter beans.
//            Support for HttpMessageConverters (see below).
//    Automatic registration of MessageCodesResolver (see below).
//    Static index.html support.
//    Custom Favicon support (see below).
//    Automatic use of a ConfigurableWebBindingInitializer bean (see below).
//    If you want to keep Spring Boot MVC features, and you just want to add additional MVC configuration (interceptors, formatters, view controllers etc.) you can add your own @Configuration class of type WebMvcConfigurerAdapter, but without @EnableWebMvc. If you wish to provide custom instances of RequestMappingHandlerMapping, RequestMappingHandlerAdapter or ExceptionHandlerExceptionResolver you can declare a WebMvcRegistrationsAdapter instance providing such components.
//
//    If you want to take complete control of Spring MVC, you can add your own @Configuration annotated with @EnableWebMvc.
//
//27.1.2 HttpMessageConverters
//    Spring MVC uses the HttpMessageConverter interface to convert HTTP requests and responses. Sensible defaults are included out of the box, for example Objects can be automatically converted to JSON (using the Jackson library) or XML (using the Jackson XML extension if available, else using JAXB). Strings are encoded using UTF-8 by default.
//
//    If you need to add or customize converters you can use Spring Boot’s HttpMessageConverters class:
//
//            import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
//import org.springframework.context.annotation.*;
//import org.springframework.http.converter.*;
//
//    @Configuration
//    public class MyConfiguration {
//
//        @Bean
//        public HttpMessageConverters customConverters() {
//            HttpMessageConverter<?> additional = ...
//            HttpMessageConverter<?> another = ...
//            return new HttpMessageConverters(additional, another);
//        }
//
//    }


//    1）、所有 /webjars/** ，都去 classpath:/META-INF/resources/webjars/ 找资源；
//
// ​ webjars：以jar包的方式引入静态资源；
//
// http://www.webjars.org/

//    引入jar包
//    https://blog.csdn.net/shunhack/article/details/94342190

//例子

//    https://www.cnblogs.com/lifan12589/p/11751992.html

//这个有用
//    https://blog.csdn.net/u010992313/article/details/95493815
}
