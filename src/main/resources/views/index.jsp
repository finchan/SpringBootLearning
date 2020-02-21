<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Title Here</title>
    </head>
    <body>
        <pre>
            为什么页面不放在Maven标准的src/main/webapp/WEB-INF下呢？<br>
            Spring Boot的页面习惯的放置方式就是放置在/src/main/resources下的<br>
            resources的资源部署时会被放置在WEB-INF/classes对应目录里
        </pre>
    </body>
 </html>