<%--
  Created by IntelliJ IDEA.
  User: dlenart
  Date: 09.04.2021
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form class="institution" method="post" modelAttribute="institution">
    <div class="form-group row">
    <div class="col-sm-6 mb-3 mb-sm-0">
    <form:input path="name" type="text" class="form-control form-control-user" id="exampleName"
                placeholder="Nazwa"/>
    </div>
    <div class="col-sm-6">
    <form:input path="description" type="text" class="form-control form-control-user" id="exapleDescription"
                placeholder="Opis"/>
    </div>
    </div>
    <input type="submit" value="Dodaj firmę" href="institutionAdd" class="btn btn-primary btn-user btn-block">

</form:form>
</body>
</html>
