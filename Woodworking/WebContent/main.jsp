<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>${param.title}</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>
<body>
	<jsp:include page="/pages/header.jsp"/>

	
	<h1>${param.title}</h1>

	<jsp:include page="/login.jsp"/>
	
	<jsp:include page="/pages/footer.jsp"/>
	
	
</body>
</html>