<%--
  Created by IntelliJ IDEA.
  User: dlenart
  Date: 14.04.2021
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form class="donation" method="post" modelAttribute="donation">
    <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
            <form:input path="quantity" type="number" class="form-control form-control-user" id="exampleQuantity"
                        placeholder="Liczba worków"/>
        </div>

        <td><form:select path="institution">
            <form:options items="${institutions}"/>
        </form:select>
        </td>

        <div class="col-sm-6 mb-3 mb-sm-0">
            <form:input path="street" type="text" class="form-control form-control-user" id="exampleStreet"
                        placeholder="Ulica"/>
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
            <form:input path="city" type="text" class="form-control form-control-user" id="exampleCity"
                        placeholder="Miasto"/>
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
            <form:input path="zipCode" type="text" class="form-control form-control-user" id="exapleZipCode"
                        placeholder="Kod pocztowy"/>
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
            <form:input path="pickUpDate" type="date" class="form-control form-control-user" id="exaplePickUpDate"
                        placeholder="Data odbioru (w formacie yyyy-MM-dd)"/>
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
            <form:input path="pickUpTime" type="time" class="form-control form-control-user" id="exaplePickUpTime"
                        placeholder="Data odbioru (w formacie mm-HH)"/>
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
            <form:input path="pickUpComment" type="text" class="form-control form-control-user"
                        id="examplePickUpComment"
                        placeholder="Komentarz do odbioru"/>
        </div>
    </div>
    <input type="submit" value="Dodaj paczkę" href="donationAdd" class="btn btn-primary btn-user btn-block">

</form:form>
</body>
</html>
