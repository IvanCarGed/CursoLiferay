<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="WEB-INF/jsp/layout/taglib.jsp" %>
<jsp:include page="WEB-INF/jsp/layout/header.jsp">
	<jsp:param name="title" value="NewWeb" />
	<jsp:param name="page" value="newweb" />
</jsp:include>


<h1>Programa de ejemplo para almacenar webs</h1>


<form action="send-web.html" class="form-signin" method="post">
	<div class="alert alert-info">Aplicación en modo prueba.</div>
	<div class="errorMessage alert alert-danger" style="display: none"></div>
	<c:if test="${param.sent eq true}">
		<div class="alert alert-success">Correcto web-enviada.</div>
	</c:if>
	<c:if test="${param.error == true}">
		<div class="alert alert-danger">Error! no se ha almacenado la web</div>
	</c:if>
	<input type="text" name="nombre" class="form-control" placeholder="Nombre"><br />
	<input type="text" name="url" class="form-control" placeholder="Url"><br />
	<textarea rows="5" name="descripcion" class="form-control" placeholder="Descripcion"></textarea><br />
	<input type="submit" value="Enviar" class="btn btn-lg btn-primary">
</form>

<jsp:include page="WEB-INF/jsp/layout/footer.jsp" />