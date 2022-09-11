<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>考勤信息</title>
</head>
<body>
 <table border="1"border="1" cellspacing="0">
    <tr>
        <th>用户名</th>
       <th>月</th>
      <th>日</th>
       <th>开始時間</th>
        <th>退勤時間</th>
        <th>休憩時間</th>
         <th>実働時間</th>
    </tr>
    
			<tr>
				<td>${username}</td>
				<td>${nianyue}</td>
				<td>${ri}</td>
				<td>${starttime}</td>
				<td>${endtime}</td>
				<td>${resttime}</td>
				<td>${alltime}</td>			
			</tr>    
    
    
</table>

		
</body>
</html>