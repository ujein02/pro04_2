<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>COMPANY</title>
    <!-- 헤드 부분 인클루드 -->
    <jsp:include page="../include/head.jsp"></jsp:include>
</head>
<body>
	<header id="header">
		<!-- 헤더 부분 인클루드 -->
	 	<jsp:include page="../include/hd.jsp"></jsp:include>
    </header>
	
	<div class="content" id="content">
	    <div class="row column text-center">
	      
		      <div class="page-info">
			<h1 class="page-tit">CJ BIO 소개</h1>
			<p class="page-desc">세계 최고의 기술력과 경쟁력을 바탕으로 바이오의 지속가능한 미래를 선도합니다.</p>
			</div>
	
		


<!-- s: contents -->
<div id="contents" class="contents">

	<!-- s: Production Bases -->
	<div class="cjbio-pb">
		<div class="bind">
			<div class="txt-bind">
				<div class="txt-bind-sub">
					<h2 class="h2">세계 최고의 그린 BIO 기업</h2>
					<p>1964년 MSG 생산을 시작한 이래로 당사는 발효 기술을 축적하면서 가파르게 성장해왔습니다.</p>
					<p>
						당사는 사료용 아미노산과 식품, 조미료 및 높은 식물성 단백질 재료를 생산하고 판매하기 위해<br />
						미생물 자원을 이용한 균주 개량과 발효 기술을 효과적으로 활용하고 있습니다.
					</p>
					<dl class="para-pb">
						<dt>CJ BIO 글로벌 생산기지</dt>
						<dd>6개국(중국, 브라질, 인도네시아, 말레이시아, 미국, 베트남) 11개 공장</dd>
					</dl>
				</div>
			</div>
			<!-- //txt-bind -->
			
		</div>
		<!-- //bind -->
	</div>
	<!-- e: Production Bases -->

	<!-- s: Mission & Vision -->
	<div class="inner-mission">
		
		<div class="mv-circle">
			
		</div>
		<!-- //mv-circle -->
	</div>
	<!-- e: Mission & Vision -->


</div>
<!-- e: contents -->
	      </div>
	    </div>

    <footer id="footer" class="footer-nav row expanded collapse">
    	<!-- 푸터 부분 인클루드 -->
    	<jsp:include page="../include/ft.jsp"></jsp:include>
    </footer>
</body>
</html>