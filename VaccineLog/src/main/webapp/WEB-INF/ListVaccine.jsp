<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vaccine List</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>
	
	<h1>Vaccine List</h1>
	
	<a href='NewVaccine' class="link-info">New Vaccine</a>
	|
	<a href='NewDoses' class="link-info">New Doses</a>
	<br>
	<br>
	
	<table class='table-bordered'>
		<tr>
			<th>Vaccine</th>
			<th>Doses Required	</th>
			<th>Days Between Doses	</th>
			<th>Total Doses Received</th>
			<th>Total Doses Left</th>
			<th></th>
		</tr>
		
		<c:forEach items="${shots}" var="entry">
			<tr>
				<td class="text-uppercase" >${entry.name}</td>
				<td>${entry.dosesRequired}</td>
				<td>${entry.daysBetween}</td>
				<td>${entry.dosesRecieved}</td>
				<td>${entry.dosesLeft}</td>
				<td><a href="EditVaccine?id=${entry.id}" class='link-info'>Edit</a></td>
			</tr>
		</c:forEach>
		
	</table>
	
	
	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" 
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" 
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" 
    integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" 
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" 
    integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" 
    crossorigin="anonymous"></script>
</body>
</html>