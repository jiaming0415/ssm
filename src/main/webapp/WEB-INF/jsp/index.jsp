<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
</head>
<body>
<h1><t:message code="title"/> </h1>
${book}<br>
<img src="${pageContext.request.contextPath}/images/1.jpg">
<img src="images/2.jpg">
<div>
    <a href="${ctx}/book/toAdd"><t:message code="add.label"/> </a>
    <a href="${ctx}/book/toList"><t:message code="list.label"/></a>
</div>
<div>
    <a href="${ctx}/changeLocalex?locale=zh">中文</a>
    <a href="${ctx}/changeLocalex?locale=en">English</a>
</div>

</body>
</html>
