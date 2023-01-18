<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Vaccine</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<form method='post'>
		<input type='hidden' name='id' value='id'>
		<table class='table-bordered'>
	
			<tr>
			<th>Name</th>
			<th class="form-group">
					<c:forEach items="${shots}" var="entry">
						<c:if test="${ids == entry.id}">
							<input type="text" class="form-control" name="name" value ="${entry.name}">
							
						</c:if>
					</c:forEach>
			</th>
			</tr>
	
			<tr>
			<th> ${entry1.dosesRequired} Doses Required</th>
			<td>
				<select name="doses" class="form-select">
					<c:forEach items="${shots}" var="entry">
						<c:if test="${ids == entry.id}">
						
							<c:if test="${entry.dosesRequired == 1}">
						        <option selected>${entry.dosesRequired}</option>
						        <option >2</option>
						    </c:if>
						        
							<c:if test="${entry.dosesRequired == 2}">
								<option>1</option>
								<option selected>2</option>
							</c:if>
						        
						</c:if>
			
					</c:forEach>
				 </select>
			</td>
			</tr>
	
			<tr>
			<th>Days Between Doses</th>
			<td class="form-group">
			
				<c:forEach items="${shots}" var="entry">
						<c:if test="${ids == entry.id}">
							<input type="text" class="form-control" name="between" value ="${entry.daysBetween}">
							
						</c:if>
				</c:forEach>		
			
			
			</td>
			</tr>
	
			<tr><td><button class="btn btn-success" >Save</button></td>
			
				<td>
				
				</td>
			</tr>
	
	
		</table>
	</form>



		  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		  integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		  crossorigin="anonymous"></script>
		  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		  integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		  crossorigin="anonymous"></script>
		  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"
		  integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em"
		  crossorigin="anonymous"></script>
</body>
</html>