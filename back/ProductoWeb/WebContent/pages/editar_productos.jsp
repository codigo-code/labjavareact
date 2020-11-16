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
 
    <p style="color: red;"></p>
    
    <c:if test="">
         <form method="POST" action="">
            <input type="hidden" name="codigo" value="" />
            <table border="0">
               <tr>
                  <td>Codigo</td>
                  <td style="color:blue;"></td>
               </tr>
               <tr>
                  <td>Nombre</td>
                  <td><input type="text" name="" value="" /></td>
               </tr>
               <tr>
                  <td>Precio</td>
                  <td><input type="text" name="" value="" /></td>
               </tr>
               <tr>
                  <td>Cantidad</td>
                  <td><input type="text" name="" value="" /></td>
               </tr>
               <tr>
                  <td colspan = "2">
                      <input type="submit" value="Modificar" />
                      <a href="">Cancelar</a>
                  </td>
               </tr>
            </table>
         </form>
      </c:if>

</body>
</html>