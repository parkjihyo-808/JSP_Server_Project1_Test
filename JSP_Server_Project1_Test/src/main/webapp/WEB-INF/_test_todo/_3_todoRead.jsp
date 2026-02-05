<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 2. 5.
  Time: 오후 4:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--// 모델클래스 서비스 컨트롤러를 이용한 로직 처리 순서--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>TodoRead 임시화면</h1>
<h3>하나의 정보를 불러오기, dto라는 객체에서 정보를 하나씩 꺼내보기</h3>
<p>TodoDTO 모델 클래스의 멤버를 getter로 가져오는 효과</p>
<div>
    <input type="text" name="tno" value="${dto.tno}" readonly>
</div>
<div>
    <input type="text" name="title" value="${dto.title}" readonly>
</div>
<div>
    <input type="date" name="dueDate" value="${dto.dueDate}">
</div>
<div>
    <input type="checkbox" name="finished" ${dto.finished ? "checked" : ""}readonly>
</div>
<div>
    <%--    주소부분은 오늘 날짜로 변경    --%>
    <a href="/todo/update_0205?tno=${dto.tno}">수정/삭제</a>
    <a href="/todo/list_0205">목록가기</a>
</div>
</body>
</html>
