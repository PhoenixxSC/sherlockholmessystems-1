<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="MODEL.Config" %>
<center>
	<div>
		<%@ include file="VIEWCONTROLLER/signin.jsp" %>
	</div>
	<div id=<%=Config.signupId %>><!-- Das kommt erst sp�ter -->
		<%@ include file="VIEWCONTROLLER/signup.jsp" %>
	</div>
</center>			
		