<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="nextPage" value="${paging.currPage + 1}" scope="page" />
<c:set var="prePage" value="${paging.currPage - 1}" scope="page" />
<div id="pageDiv">
	<c:choose>
		<c:when test="${prePage >= paging.firstPage}">
			<button class="btn" onclick="location.href='./list?page=${prePage}'">&lt;</button> 
		</c:when>
		<c:otherwise>
			<button class="btn disabled" disabled>&lt;</button> 
		</c:otherwise>
	</c:choose>		
	<c:forEach items="${paging.pageList}" var="pageNum">
		<c:choose>
			<c:when test="${pageNum == paging.currPage}">
				<button id="currBtn" class="btn" onclick="location.href='./list?page=${prePage}'">${pageNum}</button> 
			</c:when>
			<c:otherwise>
				<button class="btn" onclick="location.href='./list?page=${pageNum}'">${pageNum}</button>
			</c:otherwise>
		</c:choose>		
	</c:forEach>
	<c:choose>
		<c:when test="${nextPage <= paging.lastPage}">
			<button class="btn" onclick="location.href='./list?page=${nextPage}'">&gt;</button>
		</c:when>
		<c:otherwise>
			<button class="btn disabled" disabled>&gt;</button> 
		</c:otherwise>
	</c:choose>
</div>