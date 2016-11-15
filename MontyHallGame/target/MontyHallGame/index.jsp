<%@ page import="com.elias.montygame.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<title>Do i stand a better change by switching box?</title>
	<%
		Monty monty;
		monty = new Monty();
	%>
	<h2></h2>
	<p>Winrate by not switching box</p>
	<%=monty.firstTest()%>
	<p>Winrate by switching box</p>
	<%=monty.secondTest()%>
</body>
</html>


