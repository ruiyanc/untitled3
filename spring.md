##Spring
* 轻量级的控制反转(IoC)和面向切面(AOP)的容器框架
* spring配置文件放在src下
* 加载Spring容器：
    * ClassPathXmlApplicationContext("..xml"):类路径加载
        * getBean():获取bean,参数为xml中bean的id
    * FileSystemXmlApplicationContext("..xml"):文件系统路径获得配置文件
* bean
    * class:创建bean的bean类，name/id:唯一的bean标识符
    * parent:继承bean
    * 作用域scope：
        * singleton:单例,默认,获取的bean是同一个对象
        * prototype:多例,每次获取bean时会创建一个对象
    * 生命周期：
        * init-method():实例化bean时立即调用
        * destroy-method():容器移除bean后调用
* 依赖注入
    * constructor-arg:构造参数的注入
        * ref:传递bean引用
        * type:类型,index:索引
    * 内部注入:嵌套bean
    * 注入集合:
        * list,set,map,props
* 自动装配
    * autowire="byName",byType,constructor:属性与配置文件中定义为相同名称的 beans 进行匹配和连接
* 基于注解的配置
    * @Autowired[Setter方法,属性,构造函数]:自动连接
        * required=false:关闭依赖
    * @Qualifier:绑定装配bean
    * @PostConstruct:作为初始化回调函数的一个替代
    * @PreDestroy:作为销毁回调函数的一个替代
    * @Resource:以bean的形式注入name属性
 * onApplicationEvent():监听上下文事件
 
##AOP
* 面向切面编程:通过预编译和运行期动态代理实现程序功能的统一维护的技术
* `采取横向抽取机制`
* 实现原理:
    * 底层采用`代理`机制实现
    * 接口+实现类:采用jdk的动态代理proxy,cglib字节码增强
* AOP术语:
    * target目标类:需要被代理的类
    * JoinPoint连接点:可能被拦截的方法
    * PointCut切入点:已经被增强的连接点
    * advice通知/增强
    * Aspect切面:pointcut和advice的结合
    * Weaving织入:把增强advice应用到目标对象target来创建代理对象proxy的过程
* AOP通知:spring-aop包
    * <aop:config>:切入点配置
    * proxy-target-class="true":使用cglib实现代理
    * expression:切入点
    * 用于事务配置和日志记录
 * AspectJ通知类型:spring-aspect包

##SpringMVC
* 