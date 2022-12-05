<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path3" value="${pageContext.request.contextPath }" />
<!-- 푸터 내용 기술 -->
<article class="ft_wrap">
	<div class="footer-nav-left">
	 <p class="menu-text" id="logo2"><img src="${path3 }/data/logo1.png" alt="이미지"></p>
	  
	</div>
	<div class="footer-nav-center">
		<p> 개인정보처리방침 <br> CJ제일제당(주) | 주소: CJ제일제당 센터 서울시 중구 동호로 330 | 연락처: 02-6740-1114 <br> 
		©2019 CJ CHEILJEDANG CORP. ALL RIGHTS RESERVED</p><br>

	</div>
	<div class="footer-nav-right">
	  <ul class="footer-nav-menu-icons">
	    <li class="footer-nav-item">
	      <a href="get-involved/support.html"><img class="footer-social-icon" src="${path3 }/resources/icon/email-icon.svg" alt=""></a>
	    </li>
	    <li class="footer-nav-item">
	      <a href="https://www.facebook.com/foundation/"><img class="footer-social-icon" src="${path3 }/resources/icon/facebook-icon.svg" alt=""></a>
	    </li>
	    <li class="footer-nav-item">
	      <a href="https://twitter.com/FoundationCSS"><img class="footer-social-icon" src="${path3 }/resources/icon/twitter-icon.svg" alt=""></a>
	    </li>
	    <li class="footer-nav-item">
	      <a href="https://www.youtube.com/channel/UCS7eqSwmBYuslPEKeJBq-kg"><img class="footer-social-icon" src="${path3 }/resources/icon/youtube-icon.svg" alt=""></a>
	    </li>
	  </ul>
	</div>
</article>