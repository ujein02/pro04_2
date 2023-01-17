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
	<title>PRODUCT</title>
    <!-- 헤드 부분 인클루드 -->
    <jsp:include page="../include/head.jsp"></jsp:include>

</head>
<style>
.inner1{background-image:url("${path1}/data/bg.jpg"); height:590px; width:1190px; background-size:120% auto; background-repeat:no-repeat; background-position:center center; position:relative; color:#fff;}
.page-info1{-webkit-text-size-adjust: 100%;    --swiper-theme-color: #007aff;    --swiper-navigation-size: 44px;    line-height: 1.5;    font-size: 14px;    
		font-family: "Noto Sans", sans-serif;    font-weight: 300;    box-sizing: inherit;    position: absolute;    color: #fff;    top: 200px;}
.h2{padding-bottom: 65px;    font-size: 32px;    font-weight: 500;    line-height: 1.4;    text-align: center;}
.desc{line-height: 2;    font-size: 17px; text-align: center; color: #444;}    
.tastenrich-solutions {display:block; width:100%; height:600px; background-color:#f7e9d5;  color:#444; padding-top:80px;}
.inner{padding-bottom:10px;}
.tastenrich-video{display:block; width:100%; height:800px; background-color:#00a569;  color:#fff; padding-top:30px; padding-bottom:20px;}
.video-box{width:100%; height:580px;}

</style>
<body>
	<header id="header">
		<!-- 헤더 부분 인클루드 -->
	 	<jsp:include page="../include/hd.jsp"></jsp:include>
    </header>
  <div class="page-head brand tastenrich">
<!-- 각 서브페이지마다 비주얼영역 배경색이 다르기 때문에 클래스명으로 구분 -->
<div class="inner1">
	<div class="page-info1">
		<h1 class="page-tit1"><span class="hd-area">Taste N rich</span></h1>
		<p class="page-desc1">REVEAL AUTHENTIC TASTE</p>
	</div>

	</div>
</div>
<!-- e: page-head -->

<!-- s: contents -->
<div id="contents" class="contents">

	<!-- s: section -->
	<div class="inner center">
		<h2 class="h2">TasteNrich<sup class="sup">®</sup>, Reveal authentic Taste</h2>
		<p class="desc up-on-scroll">
			오늘날, 식품 산업은 자연의 신선함과 건강한 맛을 추구하는 'Naturalness' 시대에 들어섰습니다.<br />
			소비자들은 식품 원재료의 구성 및 원산지 그리고 가공 방법 등에 관심을 기울이고, 더 나아가 개인의 가치관을 담아 소비하고 있습니다.<br />
			이제 'Naturalness'는 먹거리의 안전함/신뢰감/투명성 및 지속 가능성이 점점 더 중요해지는 식품 산업에서의 핵심 트렌드입니다.<br />
			또한, 이러한 니즈와 동시에 소비자들은 여전히 맛과 향, 그리고 식감에 대한 최고의 경험을 원하고 있습니다.
		</p>
	</div>
	<!-- e: section -->

	<!-- s: section -->
	<div class="tastenrich-solutions">
		<div class="inner">
			<h2 class="h2">TasteNrich<sup class="sup">®</sup> , <span class="txt-em">Natural solution</span> for your newest business!</h2>
			<p class="desc up-on-scroll">
				TasteNrich<sup class="sup">®</sup> 는 대부분의 요리에 완벽한 'Clean label' 솔루션을 제공합니다. <br />
				음식의 맛을 깊고 풍부하게 해줄 뿐만 아니라 첨가물이 들어있지 않은 천연 컨셉의 'Clean label'까지, <br />
				TasteNrich<sup class="sup">®</sup> 는 원료에 대한 믿음을 올려주는 'Natural Solution'으로써 고객과 소비자의 니즈를 충족시켜줍니다.
			</p>
			<img alt="이미지" src="${path1}/data/sol.jpg">
			
		</div>
	</div>
	<!-- e: section -->

	<!-- S: video -->
	<div class="tastenrich-video">
		<div class="inner2">
			<h2 class="h2">VIDEO</h2>
			<div class="video-box">
				<iframe width="100%" height="100%" src="https://www.youtube.com/embed/73ci2fO3TfM?wmode=opaque&amp;rel=0" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen=""></iframe>
			</div>
		</div>
	</div>
	<!-- E: video -->
	
    <footer id="footer" class="footer-nav row expanded collapse">
    	<!-- 푸터 부분 인클루드 -->
    	<jsp:include page="../include/ft.jsp"></jsp:include>
    </footer>
</div>
</body>
</html>