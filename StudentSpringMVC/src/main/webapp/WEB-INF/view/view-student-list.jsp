<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
 <link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
	 <script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/>"></script>
 <script src="<c:url value="/resources/js/view-student-list.js"/>"></script>
</head>
<body>
<div class="container mt-3">
<h1 class="bg-primary p-3 text-white rounded mb-3">Student Details</h1>
<a href="showFormForAdd" class="btn btn-success mb-3">Add Customer</a>
<table class="table table-dark">
    <thead>
      <tr>
        <th>Student Id</th>
        <th>Name</th>
        <th>Department</th>
        <th>Country</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${studentList}" var="student">
      <tr>
      <td>${student.studentId}</td>
        <td>${student.name}</td>
        <td>${student.department}</td>
        <td>${student.country}</td>
        <td><a class="btn btn-success" href="showFormForUpdate?studentId=${student.studentId}">Update</a>
						| <a class="ml-3 btn btn-danger" onclick="confirmDeleteDialog(${student.studentId})">Delete</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>