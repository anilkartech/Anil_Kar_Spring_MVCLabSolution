function confirmDeleteDialog(studentId) {
	if (confirm("Are you sure you want to delete?")) {
		window.location.replace("deleteStudent/" + studentId);
	}
}