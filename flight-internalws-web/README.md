# 项目使用说明

**代码中src/main/java/com.ctrip.ibu.flight.internalws.web.controller.WelcomeController以及src/main/webapp/WEB-INF/templates/welcome.flt是样例Controller以及样例freemarker模板，可以随时参看**

## 新增Controller
1. 在src/main/java/com.ctrip.ibu.flight.internalws.web/controller或者其子package中实现自己的Controller，为其添加annotation `@Controller`
2. Controller中可以通过`@Autowired`注入需要的其他服务
3. 如果需要一个freemarker模板，可以在src/main/webapp/WEB-INF/templates/下添加


## 本地运行调试
- 通过src/test/java/com.ctrip.ibu.flight.internalws.web/WebStarter.java进行运行或者调试，启动时自动通过embedded Tomcat进行服务发布

## 测试环境或者生产环境发布
- 直接Maven打包即可

## 备注
- Spring配置文件：src/main/resources/application-context.xml，如果需要添加额外的spring配置文件可以通过以下两种方法：
   1. 在src/main/resources/application-context.xml中import，如`<import resource="another-context.xml" />`
   2. 在sr/main/webapp/web.xml的`<context-param>``contextConfigLocation`中增加新的配置文件，通过逗号分隔,如

			<context-param>
			  <param-name>contextConfigLocation</param-name>
			  <param-value>classpath:application-context.xml,classpath:another-context.xml</param-value>
			</context-param>

- 通过sr/main/webapp/web.xml的DispatcherServlet配置可以修改web的base URL，默认为`/*`
- 通过src/test/resources/application.properties中的`server.port`进行本地运行时服务端口修改，测试环境或者生产环境的端口不受此配置控制