package main.java.AnnotationCase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解
 * 概述
 * Java注解（Annotation）又称为Java标注，是JDK5引入的一种注释机制
 * Java语言中的类、构造器、方法、成员变量、参数等都可以被注解进行标注
 * 作用
 * 对Java中类、方法、成员变量做标记，然后进行特殊处理，至于到底做何种处理由业务需求来决定
 * 例如：Junit框架中，标记了注解@Test的方法就可以被当成测试方法执行，二没有标记的就不能当成测试方法执行
 * 自定义注解
 * 格式
 * public @interface 注解名称{
 * public 属性类型 属性名() default 默认值；
 * }
 * 特殊属性
 * Value属性，如果只有一个value属性的情况下，使用value属性的时候可以省略value名称不写
 * 但是如果有多个属性，且多个属性没有默认值，那么value的名称是不能省略的
 * 元注解
 * 概述
 * 用于注解的注解
 * 常见注解
 * @target：约束自定义注解只能在那些地方使用
 * 参数
 * ElementType.枚举
 * TYPE：类、接口
 * FIELD：成员变量
 * METHOD：成员方法
 * PARAMETER：方法参数
 * CONSTRUCTOR：构造器
 * LOCAL_VARIABLE：局部变量
 * @Retention：申明注解的生命周期
 * 参数
 * RetentionPolicy.枚举
 * SOURCE：注解只作用在源码阶段，生成的字节码文件中不存在
 * CLASS：注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值
 * RUNTIME：注解作用在源码阶段，字节码文件阶段，运行阶段（开发常用）
 * 注解解析
 * 概述
 * 注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容
 * 与注解解析相关的接口
 * Annotation：注解的顶级接口，注解都是Annotation类型的对象
 * AnnotatedElement：改接口定义了与注解解析相关的方法
 * 方法
 * getDeclaredAnnotations()：获得当前对象上使用的注解，返回注解数组
 * getDeclaredAnnotation()：根据注解类型获得对应注解对象
 * isAnnotationPresent()：判断当前对象是否使用了指定的注解，如果使用了则返回true，否则返回false
 * 所有的类成分Class,Method,Field,constructor,都实现了AnnotatedElement接口他们都拥有解析注解的能力
 * 注解解析技巧
 * 注解在那个成分上，我们就先拿那个成分对象
 * 比如注解作用成员方法，则要获取该成员方法对应的Method对象，再来拿上面的注解
 * 比如注解作用在类上，则要该类的Class对象，再来拿上面的注解
 * 比如注解作用在成员变量上，则要活的该成员变量对象的Field对象，再来那上面的注解
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyBook {
    String value();
    String author();
    double price();

}
