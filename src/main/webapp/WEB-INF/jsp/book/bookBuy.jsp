<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
</head>
<body>
书本《${book.bookname}》<br>
售价：￥${book.price}
<a  href="${ctx}/book/doBuy?bookname=${book.bookname}&price=${book.price}&id=${book.id}">去支付</a>
</body>
</html>
