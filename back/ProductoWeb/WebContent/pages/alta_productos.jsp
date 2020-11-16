<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Producto</title>
</head>
<body>
	<h3>Crear Producto</h3>
	
	<p style="color: red;">${errorMensaje}</p>
	
	<form method="POST" action="crearProducto">
         <table border="0">
            <tr>
               <td>Codigo</td>
               <td><input type="text" name="codigo" value="${producto.codigo}" /></td>
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
               <td colspan="2">                   
                   <input type="submit" value="Agregar" />
                   <a href="listarProductos">Cancelar</a>
               </td>
            </tr>
         </table>
   	</form>
   	
</body>
</html>