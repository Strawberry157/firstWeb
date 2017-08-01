<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>LOL Hero Search</title>
</head>
<body>
	<form action="/qqddcsc/html/cms/lol/lolsearch.action" method="post">
		<div class="search_lol_form">
			英雄<input type="text" class="text_s1" name="name" id="name" /><br>
			价格<input type="text" class="text_s2" name="price" id="price" />
		</div>
		<div class="search">
			<input type="submit" value="搜索" class="btn_s" title="搜索" />
		</div>
	</form>
	<c:if test="${!empty respose }">
		<table>
			<tr>
				<th>头像</th>
				<th>价格</th>
				<th>名字</th>
				<th>皮肤</th>
			</tr>
			<c:forEach var="i" begin="1" end="1">
				<tr>
					<td>${hero0.img }</td>
					<td>${hero0.price }</td>
					<td>${hero0.name }</td>
					<td>${hero0.skin }</td>
				</tr>
				</c:forEach>
		</table>
	</c:if>
</body>
</html>
