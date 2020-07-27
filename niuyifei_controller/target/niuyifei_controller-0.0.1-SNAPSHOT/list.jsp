<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<th>序号</th>
			<th>会议编号</th>
			<th>会议名称</th>
			<th>开始日期</th>
			<th>结束日期</th>
			<th>会议类型</th>
			<th>创建时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${page.list }" var="mm">
			<tr>
				<td>${mm.mid }</td>
				<td>${mm.code }</td>
				<td>${mm.name }</td>
				<td>${mm.start_time }</td>
				<td>${mm.end_time }</td>
				<td>${mm.tname }</td>
				<td>${mm.create_time }</td>
				<td>
					<a href="update.jsp">
					<input type="submit" value="编辑">
				</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				<a href="add.jsp">
					<input type="submit" value="新增">
				</a>
				<a href="selMeet?pageNum=${pageNum.firstPage }">首页</a>
				<a href="selMeet?pageNum=${pageNum.prePage }">上一页</a>
				<a href="selMeet?pageNum=${pageNum.nextPage }">下一页</a>
				<a href="selMeet?pageNum=${pageNum.lastPage }">末页</a>
			</td>
		</tr>
	</table>
</body>
</html>