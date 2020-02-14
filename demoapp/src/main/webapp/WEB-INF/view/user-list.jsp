<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
</head>
<body>
	
	<p>${message}</p>
	<br/><br/>
	
	<table border="1">
		<thead>
			<tr>
				<th scope="row">First Name</th>
				<th scope="row">Last Name</th>
				<th scope="row">Email</th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach items="${users}" var="user">
          <tr>
              <td>${user.firstName}</td>
              
              <td>${user.lastName}</td>
              
              <td><a href="user-detail?email=${user.email}">${user.email}</a></td>
          </tr>
          </c:forEach>
          </tbody>
      </table>
	
</body>
</html>