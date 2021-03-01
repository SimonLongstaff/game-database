<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title>
	Game List
	</title>
	<link type="text/css" 
			rel="stylesheet "
			href="${pageContext.request.contextPath}/resources/css/style.css">
	
 </head>
 
 <body>


<div id="wrapper">
	<div id = "header">
		<h2> Game List</h2>
	</div>
</div>

<div id="container">
	<div id="content">
	
	
		<input type="button" value="Add Game" onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"
			/>
			
	
	
		<table>
		<tr>
		<th>Game</th>
		<th>Status</th>
		<th>Platform</th>
		<th>Actions</th>
		</tr>
		
		<!--  loop over games -->
		<c:forEach var="tempgame" items="${games}"> 
		
		<c:url var="updateLink" value="/game/showFormForUpdate">
			<c:param name="gameid" value="${tempgame.id}"/>
		</c:url>
		
		<c:url var="deleteLink" value="/game/delete">
			<c:param name="gameid" value="${tempgame.id}"/>
		</c:url>
		
	
		
		<tr>
			<td> ${tempgame.name} </td>
			<td> ${tempgame.status} </td>
			<td> ${tempgame.platform} </td>
			<td><a href="${updateLink}">Update</a>
			|
			<a href="${deleteLink}"
			onclick="if(!(confirm('Are you sure you want delete this game?'))) return false">Delete</a>
			</td>
		
		
		
		
		
		</c:forEach>
		
		
		
		
		</table>




	</div>
</div>



 </body>

</html>

