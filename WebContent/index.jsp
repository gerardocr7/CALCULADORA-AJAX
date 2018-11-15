<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript">
			$(document).ready(
				function(){
					var calculo = function(){
						$.ajax({
							type : "POST",
							url  : "Control",
							data : {
								"num1" : $("#num1").val(),
								"num2":  $("#num2").val()
							},success : function(msg){
								$("#mensagem").html(msg); 
							}, error : function(e){
							$("#mensagem").html("Error:" + e.status);
							} 
						});
					}
					$("#num2").keyup(function() {
						calculo();
						}
					)
				}		
			);
		</script>
	</head>
	<body>
		<h3>Calculadora</h3>
		Numero1
		<br/>
		<input type="text" id="num1"/>
		<br/><br/>
		Numero2
		<br/>
		<input type="text" id="num2"/>
		<br/><br/>
		<div id="mensagem">
		</div>
	</body>
</html>