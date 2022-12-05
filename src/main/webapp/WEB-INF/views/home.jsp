<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Home</title>
	<!-- 헤드 부분 인클루드 -->
    <jsp:include page="include/head.jsp"></jsp:include>
    <style>
    .lead, .subheader { white-space:nowrap; overflow:hidden; text-overflow:ellipsis; }
    </style>
</head>
<body>
<header id="header">
	<!-- 헤더 부분 인클루드 -->
	<jsp:include page="include/hd.jsp"></jsp:include>
</header>
	<hr>
<article class="grid-container">
      <div class="grid-x grid-margin-x">
    
        <div class="medium-7 large-6 cell">
          <h1>BEYOND BIO RENEW THE EARTH!</h1>
          <p class="subheader">자연에서 영감을 얻고 자연에게 받은 혜택을 되돌려 줄 수 있는 기술.<br>지속가능한 삶과 건강한 지구. CJ BIO의 철학입니다.</p>
          
         
        </div>
    
        <div class="show-for-large large-3 cell">
          <img src="${path2 }/data/img12.jpg" alt="picture of space">
          <p class="subheader" style="font-weigh:800px;"><br>Genuine Flavor Made from Nature</p>
        </div>
    
        <div class="medium-5 large-3 cell">
          <div class="callout secondary">
			<c:if test="${!empty msg }">
			<script>
			alert("로그인 성공");
			document.loginForm.userid.focus();
			</script>
			</c:if>
			<c:if test="${empty sid }">
            <form action="${path2 }/member/loginCheck.do" method="post" name="loginForm">
              <div class="grid-x">
                <div class="small-12 cell">
                  <label>Login ID
                    <input type="text" name="id" id="id" size="100" class="single100" placeholder="아이디 입력" required>
                    <!--  pattern="^[a-z0-9]+$"  -->
                  </label>
                </div>
                <div class="small-12 cell">
                  <label>Login PW
                    <input type="password" name="pw" id="pw"  class="single100" placeholder="비밀번호 입력" required>
                    <!--  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"  -->
                  </label>
                  <button type="submit" class="button">LOGIN</button>
                  <a href="${path2 }/member/agree.do" class="button" style="float:right;">회원가입</a>
                </div>
              </div>
            </form>
			<script>
			function loginFaiure() {
				alert("로그인 성공");
			}
			</script>
			</c:if>
			<c:if test="${not empty sid }">
             <div class="grid-x" style="height:218px">
                <div class="small-12 cell">
                  <label><strong>${sid }</strong>님 반갑습니다</label>
                </div>
                <div class="small-12 cell">
                  <label>&nbsp;&nbsp;</label>
                </div>
                <div class="small-12 cell">
                  <label>
                  	<c:set var="now" value="<%=new java.util.Date() %>" />
                  	<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일" type="date"/>
                  </label>
                </div>
                <div class="small-12 cell">
                  <label><fmt:formatDate value="${now }" pattern="a h:mm" type="date"/></label>
                </div>
                <div class="small-12 cell">
                  <label><span style="display:none">${serverTime }</span></label>
                </div>
                <div class="small-12 cell">
                  <label>&nbsp;</label>
                </div>
              </div>
			</c:if>
          </div>
        </div>
    
      </div>
    
    <div class="">
      <hr>
    </div>
    
    <div class="">
      <h3 class="lead">NEWS</h3>
    </div>
    
    <div class="grid-x grid-margin-x small-up-1 medium-up-2 large-up-3">
      <div class="cell">
        <div class="callout">
          <p></p>
          <p class="pic"><img src="${path2 }/data/img15.png" alt="이미지"></p>
          <p class="lead">BIOPEDIA</p>
          <p class="subheader">Top 10 Trends for 2023</p>
        </div>
      </div>
      <div class="cell">
        <div class="callout">
          <p></p>
          <p class="pic"><img src="${path2 }/data/img16.png" alt="이미지"></p>
          <p class="lead">SNS</p>
          <p class="subheader">CJ BIO Nrich : Introducing our Nrichs for you (TasteNrich®, FlavorNrich) full ver.</p>
        </div>
      </div>
      <div class="cell">
        <div class="callout">
          <p></p>
          <p class="pic"><img src="${path2 }/data/img17.jpg" alt="이미지"></p>
          <p class="lead">FlavorNrich</p>
          <p class="subheader">CJ제일제당, 세계 최초 천연 시스테인 개발. </p>
        </div>
      </div>
      
      </div>

    
</article>
<footer id="footer" class="footer-nav row expanded collapse">
	<!-- 푸터 부분 인클루드 -->
	<jsp:include page="include/ft.jsp"></jsp:include>
</footer>    
</body>
</html>
