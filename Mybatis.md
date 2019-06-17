##Mybatis
* 加载使用
    * 加载配置文件:InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
    * 创建SqlSessionFactory:SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
    * 获取sqlSession对象:SqlSession session = sessionFactory.openSession();
* parameterType:输入参数的类型;resultType:输出结果的类型
* 映射文件
    * \#{}:预处理的占位符
    * ${value}:拼接sql字符串
    * <sql id="">:定义可重用的sql代码段;<include refid=">:引用sql代码段
    * resultMap:建立与数据库字段映射关系
* mapper代理实现dao
* 动态sql
    * <if><where><foreach>标签
    * open:遍历开始,close:遍历结束,separator:拼接格式,collection:集合
    