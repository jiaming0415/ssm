<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
</head>
<body>
<h1>书本列表</h1>
<form action="${ctx}/book/queryBookPager" method="post">
    <label>书本名称:</label><input type="text" name="bookname">
    <input type="submit" value="查询">
</form>
<table width="100%" border="1" cellpadding="0" cellspacing="0">
    <thead>
        <th>书本编号</th>
        <th>书本名称</th>
        <th>书本价格</th>
        <th>书本类型</th>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookname}</td>
                <td>${book.price}</td>
                <td>${book.booktype}</td>
                <td href="">上传图片<a href="${ctx}/book/toBuy?bookname=${book.bookname}&price=${book.price}&id=${book.id}">够买</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
${pageBean}
</body>
</html>
