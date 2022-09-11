// JQUERY
$(document).ready(function() {
	$("#id_btn_clear").click(function() {
		$("#id_username").val("");
		$("#id_password").val("");
	});

});

function fnclear() {
	document.getElementsByName("username")[0].value="";
	document.getElementById('id_password').value="";
}
//
