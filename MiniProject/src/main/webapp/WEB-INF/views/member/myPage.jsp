<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LJSS MYPGAGE</title>
<link rel ="stylesheet" type="text/css" href="${ pageContext.servletContext.contextPath }/resources/css/mypage.css"/>

    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
    <style>
        body{
            font-family: 'Montserrat', sans-serif;
            margin: 0;
            padding: 0;
        } 
    </style>
</head>
<body>

 	<div id="container">
        <!-- 헤더 -->
        <div id="header">
            <!-- 햄버거 메뉴 -->
            <div class="cate_btn">
                <input type="checkbox" id="hamburger"/>
                <label for="hamburger">
                  <span></span>
                  <span></span>
                  <span></span>
                </label>
            </div>
            <div class="cate_box">
                <p>Category</p>
                <ul class="cate_box2">
                    <li><a href="#">Outer</a></li>
                    <li><a href="#">Top</a></li>
                    <li><a href="#">Bottom</a></li>
                    <li><a href="#">Shoes</a></li>
                    <li><a href="#">Acc</a></li>
                </ul>
                <!-- 계정이 관리자일 경우에만 보이게 -->
                <ul class="adm_menu">
                    <li><a href="">회원관리</a></li>
                    <li><a href="">상품관리</a></li>
                    <li><a href="">결제관리</a></li>
                    <li><a href="">이벤트관리</a></li>
                </ul>
            </div>

            <!-- 검색창 -->
            <input type="text" class="search_box" id="search">
            <button type="button"><img src="${ pageContext.servletContext.contextPath }/resources/img/main/search_icon.png"/></button>


            <!-- 오른쪽위 메뉴 -->
            <div class="gnb">
                <ul>
                    <li><a href="">Login</a></li>
                    <li><a href="">Cart</a></li>
                    <li><a href="">Notice</a></li>
                    <li><a href="">Event</a></li>
                    <li><a href="">Contact</a></li>
                </ul>
            </div>
        </div>
   
   
    <script src="${ pageContext.servletContext.contextPath }/resources/js/jquery-3.7.1.min.js"></script>
    <script src="${ pageContext.servletContext.contextPath }/resources/js/jquery-ui.min.js"></script>
    <script>
        $(document).ready(function(){
            $('.cate_btn').click(function(){
                $('.cate_box').toggle('slide', {
                direction: 'left'
                }, 400);
            });
        });//end
    </script>
    <div class="signbox"></div>

        <div class="wrap">
            
            <div class="my_lnb">
                <div class="shopping">
                    <div class="mypage">마이페이지</div>
                    <div class="shoppinginfo">쇼핑정보</div>
                    <div class="wishlist">위시리스트</div>
                    <div class="lastorder">주문 내역조회</div>
                </div>    
                <div class="line1"></div> 
                <div class="member">
                    <div class="memberinfo">회원 정보</div>
                    <div class="modify">내정보 변경</div>
                    <div class="memberout">회원 탈퇴</div>
                    
                </div>
                <div class="line2"></div> 
                <div class="logout">로그아웃</div>
            </div>
           <div class="detail">
            <div class="title">최근주문</div>
            <div class="detail1" >최근에 주문기록이 없습니다.</div>
            
        </div>
            
       
</div>
	
</body>
</html>