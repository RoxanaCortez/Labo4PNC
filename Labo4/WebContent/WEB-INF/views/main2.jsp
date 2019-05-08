<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="producto">
			
		<label>Datos del producto. </label><br><br>
		
		<label>Nombre: </label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br><br>
		
		<label>Marca: </label>
		<form:input type="text" name="marca" path="marca"/>
		<form:errors path="marca" cssStyle="color:#E81505;"></form:errors><br><br>
		
		<label>Descripción: </label>
		<form:input type="text" name="descripcion" path="descripcion"/>
		<form:errors path="descripcion" cssStyle="color:#E81505;"></form:errors><br><br>	
		
		<label>Categoria: </label>
		<form:input type="text" name="categoria" path="categoria"/>
		<form:errors path="descripcion" cssStyle="color:#E81505;"></form:errors><br><br>
		
		<label>Precio: </label>
		<form:input type="decimal" name="precio" path="precio"/>
		<form:errors path="precio" cssStyle="color:#E81505;"></form:errors><br><br>
		
		<label>Fecha de vencimiento: </label>
		<form:input type="date" name="fecha" path="fechaVencimiento"/>
		<form:errors path="fechaVencimiento" cssStyle="color:#E81505;"></form:errors><br><br>
		
		<input type="submit" value="Agregar producto">
	</form:form>
</body>
</html>