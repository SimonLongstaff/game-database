<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title>
	Game List
	</title>
 </head>
 
 <body>


<div id="wrapper">
	<div id = "header">
		<h2> Game List</h2>
	</div>
</div>

<div id="container">
	<div id="content">
		<table>
		<tr>
		<th>Game</th>
		<th>Status</th>
		<th>Platform</th>
		</tr>
		
		<!--  loop over games -->
		<c:forEach var="tempgame" items="${games}"> 
		
		<tr>
			<td> ${tempgame.name} </td>
			<td> ${tempgame.status} </td>
			<td> ${tempgame.platform} </td>
		
		
		
		
		</c:forEach>
		
		
		
		
		</table>




	</div>
</div>



 </body>

</html>

