# socketServer-mybatis-frame
使用quickServer、spring、mybatis搭建socket通信框架。

# 核心清单
	1.quickserver	高并发socket server。
	2.gson			json-java bean的转换工具。
	3.mybatis		ORM映射。
	4.druid			数据库连接池。
	5.Generate		mybatis代码生成器。

# 项目结构
	——ROOT
	|——pom.xml 				maven项目的依赖库与maven插件
	|——generatorConfig.xml 	Generate插件配置项
	|——lib&tool				Generate与项目依赖jar的资源
	|——src/main/resources	项目资源文件
	|——src/main/java		项目代码
		|——utils			项目工具类，ServerStart.java为可执行jar的入口，启动时加载resources下的配置文件。
		|——socket			socket server与消息处理器
		|——apiSvc			业务入口
		|——dao				mybatis的ORM映射代码
