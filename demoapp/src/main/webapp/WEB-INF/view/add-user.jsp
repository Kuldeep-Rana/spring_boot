<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add user</title>
</head>
<body>
	<form:form modelAttribute="user" action="save" method="post">
      <table>
          <tr>
              <td>First Name:</td>
              <td><form:input path="firstName" /></td>
          </tr>
          <tr>
              <td>Last Name:</td>
              <td><form:input path="lastName" /></td>
          </tr>
          <tr>
              <td>Email:</td>
              <td><form:input path="email" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td> 
          </tr>
          
      </table>
  </form:form>
</body>
</html>