<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Accounts</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<h3 style="color: red;">Show All Accounts</h3>
	<ul>
		<c:forEach var="listValue" items="${accounts}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>
