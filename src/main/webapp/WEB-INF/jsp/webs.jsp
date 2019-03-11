<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp"%>
<jsp:include page="layout/header.jsp">
	<jsp:param name="title" value="ListWebs" />
	<jsp:param name="page" value="listwebs" />
</jsp:include>

<h1>Paginas Web</h1>

<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Nombre</th>
			<th>Url</th>
			<th>Descripcion</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${webs}" var="webs">
			<tr>
				<td><c:out value="${webs.webNombre}" /></td>
				<td><c:out value="${webs.webUrl}" /></td>
				<td><c:out value="${webs.webDescripcion}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="layout/footer.jsp" />