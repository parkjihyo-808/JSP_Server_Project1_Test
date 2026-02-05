<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 2. 5.
  Time: 오후 5:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--// 모델클래스 서비스 컨트롤러를 이용한 로직 처리 순서 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>modify 임시화면</h1>
<a href="/todo/list_0205">목록가기</a>
<h3>하나의 정보를 불러오기, dto라는 객체에서 정보를 하나씩 꺼내보기</h3>
<p>odoDTO 모델 클래스의 멤버를 getter로 가져오는 효과</p>
<p>수정 화면임. 수정된 내용을 다시 서버에 전달한 후, 수정 진행</p>
<form id="form1" action="/todo/update_0205" method="post">
    <div>
        <input type="text" name="tno" value="${dto.tno}" readonly>
    </div>
    <div>
        <input type="text" name="title" value="${dto.title}" >
    </div>
    <div>
        <input type="date" name="dueDate" value="${dto.dueDate}">
    </div>
    <div>
        <input type="checkbox" name="finished" ${dto.finished ? "checked" : ""}>
    </div>
    <div>
        <%-- 주소 부분은 오늘 날짜로 변경 --%>
        <button type="submit">수정</button>
    </div>
</form>
<%-- 삭제폼 --%>
<form id="form2" action="/todo/delete_0205" method="post">
    <%-- 삭제 시 삭제할 tno 번호를 같이 전달 해야하므로, 숨겨서 보내기 --%>
    <input type="hidden" name="tno" value="${dto.tno}" readonly>
    <div>
        <button type="submit">삭제</button>
    </div>
</form>

</body>
</html>
