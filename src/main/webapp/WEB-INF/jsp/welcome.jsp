<%@page session="false"%>
<html>
<head>
<title>Welcome</title>
</head>
<body bgcolor=Aqua>
   <jsp:include page="menu.jsp" />
   <h3 style="color: red;">Hello MyBank Admin</h3>

 <% out.println("Machine name is: " +  request.getLocalName()); %>
<br />
<br />
 <% out.println("IP Address is: " + request.getLocalAddr()); %>

</body>
</html>
