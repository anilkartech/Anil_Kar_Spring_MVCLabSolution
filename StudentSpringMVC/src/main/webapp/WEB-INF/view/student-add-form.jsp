<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
<script src="<c:url value="/resources/js/bootstrap.bundle.min.js"/>"></script>
</head>
<body>
<div class="container mt-3">
<form action="save" method="post">
  <div class="mb-3 mt-3">
    <label for="name" class="form-label">Name:</label>
    <input type="text" class="form-control" id="name" placeholder="Enter Student Name" name="name">
  </div>
  <div class="mb-3">
    <label for="dept" class="form-label">Department:</label>
    <input type="text" class="form-control" id="dept" placeholder="Enter department" name="department">
  </div>
  <div class="mb-3">
    <label for="ctry" class="form-label">Country:</label>
    <input type="text" class="form-control" id="ctry" placeholder="Enter country" name="country">
  </div>
  <button type="submit" class="btn btn-primary">Save</button>
</form>
</div>
</body>
</html>