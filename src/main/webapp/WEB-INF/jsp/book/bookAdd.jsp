<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%></head>
<body>
<h1>书本新增</h1>
<f:form action="${ctx}/book/addBook" method="post" modelAttribute="book">
    <label>书本名称：</label><f:input path="bookname"/><br/>
    <label>书本价格：</label><f:input path="price"/><br/>
    <label>书本名称：</label>
    <f:select path="booktype">
        <f:option value="">---请选择---</f:option>
        <f:options items="${btype}" itemLabel="name" itemValue="id"/>
    </f:select>
    <br/>
    <input type="submit" value="提交"/>
</f:form>
</body>
</html>
