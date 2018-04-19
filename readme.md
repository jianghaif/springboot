##快速创建一个springboot项目

>创建

**idea**

1. File --> Project --> 选择Spring Initializr
2. ![](https://i.imgur.com/1pJ9vm0.png)
3. 一直next这就是结果 ![](https://i.imgur.com/bUosT2x.png)


>项目结构解析



- src/main/java 是用来处理业务代码的地方 Chapter1Applicatio是程序入口 启动文件
- src/main/resources 是存放和配置资源的地方application.properties是配置文件
- src/test/是测试代码 Chapter1ApplicationTests是测试人口
- Chapter1Application和Chapter1ApplicationTests类都可以直接运行来启动当前创建的项目

>引入模块

创建的项目会有两个默认的模块

- spring-boot-starter：核心模块，包括自动配置支持、日志和YAML
- spring-boot-starter-test：测试模块，包括JUnit、Hamcrest、Mockito

![](https://i.imgur.com/GODBgLw.png)

**引入Web模块**

	直接在dependencies中加入就可以
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

注意：springboot2.0 可能会出现pom报错，这是因为jar没有被识别
打开maven project刷新一下即可

>编写HelloWorld

1. 在Chapter1Applicatio同级创建first包
2. first包下创建HelloController类


		@RestController //返回json可直接显示在页面
		public class HelloController {
		
		    @RequestMapping(value="/hello")//请求路径
		    public String HelloWorld(){
		
		        return "Hello World";//返回值
		    }
		}
3.在浏览器访问 http://localhost:8080/hello

