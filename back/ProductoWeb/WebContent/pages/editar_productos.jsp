<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Producto</title>
</head>
<body>

	<h3>Editar Producto</h3>
 
    <p style="color: red;">${errorMensaje}</p>
    
    <c:if test="${not empty producto}">
         <form method="POST" action="editarProducto">
            <input type="hidden" name="codigo" value="${producto.codigo}" />
            <table border="0">
               <tr>
                  <td>Codigo</td>
                  <td style="color:blue;">${producto.codigo}</td>
               </tr>
               <tr>
                  <td>Nombre</td>
                  <td><input type="text" name="nombre" value="${producto.nombre}" /></td>
               </tr>
               <tr>
                  <td>Precio</td>
                  <td><input type="text" name="precio" value="${producto.precio}" /></td>
               </tr>
               <tr>
                  <td>Cantidad</td>
                  <td><input type="text" name="cantidad" value="${producto.cantidad}" /></td>
               </tr>
               <tr>
                  <td colspan = "2">
                      <input type="submit" value="Modificar" />
                      <a href="listarProductos">Cancelar</a>
                  </td>
               </tr>
            </table>
         </form>
      </c:if>

</body>
</html>