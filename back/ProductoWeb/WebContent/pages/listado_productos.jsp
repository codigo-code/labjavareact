<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h3>Lista de Productos</h3>
 
    <p style="color: red;">${errorMensaje}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Codigo</th>
          <th>Nombre</th>
          <th>Precio</th>
          <th>Cantidad</th>
          <th>Editar</th>
          <th>Eliminar</th>
       </tr>
       <c:forEach items="${listaProductos}" var="producto" >
          <tr>
             <td>${producto.codigo}</td>
             <td>${producto.nombre}</td>
             <td>${producto.precio}</td>
             <td>${producto.cantidad}</td>
             <td>
                <a href="editarProducto?codigo=${producto.codigo}">Editar</a>
             </td>
             <td>
                <a href="">Eliminar</a>
             </td>
          </tr>
       </c:forEach>
    </table>
    
    <a href="crearProducto">Crear Producto</a>

</body>
</html>