<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Spring MVC and JDBC Example</title>
<style>
    table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
    }    th, td {
             border: 1px solid #ddd;
             padding: 8px;
             text-align: left;
         }

    th {
        background-color: #ddd;
    }
</style>

<p>${msg}</p>
<p>
    <a href="<%=request.getContextPath()%>/">Home
        </a>
</p>
<c:choose>
    <c:when test="${users.size() > 0}">
        <h3>List of Users</h3>
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:when>
    <c:otherwise>
        No User found in the DB!
    </c:otherwise>
</c:choose>
