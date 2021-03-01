<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Add Game</title>
	<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css">
			
		<link type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/add-pagestyle.css">
	
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Game Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save Game</h3>
		
		<form:form action="saveGame" modelAttribute="game" method="POST">

		<form:hidden path="id"/>
		<table>
			<tbody>
				<tr>
					<td><label>Title</label>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><label>Status</label>
					<td><form:input path="status"/></td>
				</tr>
				<tr>
					<td><label>Platform</label>
					<td><form:input path="platform"/></td>
				</tr>
				<tr>
					<td><label></label>
					<td><input type="submit" value="Save" class="save"/></td>
				</tr>	
			
			
			</tbody>
		
		</table>
		
		</form:form>
		
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/game/list"> Back to List </a> 
		</p>
	
	
	</div>


</body>

</html>