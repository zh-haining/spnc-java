## 关键步骤
### 1、项目工程目录结构
```
spnc-servlet-web
    ├── README.md
    ├── WEB-INF
    │   ├── classes
    │   │   ├── HelloServlet.java
    │   └── web.xml
    ├── hello.html
    └── lib
```

### 2、手动编译代码
```
(1) cd ${project-path}/WEB-INF/classes
(2) javac -d . HelloServlet.java

```

### 3、tomcat服务器虚拟目录设置（按需）
```
<Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">
    <Context path="/spnc-servlet-web" docBase="/Users/zhaohaining/Developer/dev-soft/learn-2023/spnc-java/spnc-servlet-web"/> 
</Host>
```