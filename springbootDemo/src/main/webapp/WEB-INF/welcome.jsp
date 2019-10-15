<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">


<div class="container">
	<br>
	<hr>
	<style>
.divider-text {
	position: relative;
	text-align: center;
	margin-top: 15px;
	margin-bottom: 15px;
}

.divider-text span {
	padding: 7px;
	font-size: 12px;
	position: relative;
	z-index: 2;
}

.divider-text:after {
	content: "";
	position: absolute;
	width: 100%;
	border-bottom: 1px solid #ddd;
	top: 55%;
	left: 0;
	z-index: 1;
}

.btn-facebook {
	background-color: #405D9D;
	color: #fff;
}

.btn-twitter {
	background-color: #42AEEC;
	color: #fff;
}
</style>




	<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
			<h4 class="card-title mt-3 text-center">Create Account</h4>
			<p class="text-center">Get started with your free account</p>


			<form id="registerForm" action="studentRegistration" method="post">
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-user"></i>
						</span>
					</div>
					<input name="name" class="form-control" placeholder="Full name"
						type="text" id="name">
				</div>
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-envelope"></i>
						</span>
					</div>
					<input name="email" class="form-control" placeholder="Email address"
						type="email" id="email">
				</div>
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-phone"></i>
						</span>
					</div>
					<input name="number" class="form-control" placeholder="Phone number"
						type="text" id="number">
				</div>
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-building"></i>
						</span>
					</div>
					<select class="form-control" name="qualification" id="qualification">
						<option selected="">Qualification</option>
						<option>Designer</option>
						<option>Manager</option>
						<option>Accaunting</option>
					</select>
				</div>
				<!-- form-group end.// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input class="form-control" placeholder="Collage Name" name="collagename" id="collagename"
						type="text">
				</div>
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input class="form-control" placeholder="Passing year"
						type="text" name="passingyear" id="passingyear">
				</div>
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input class="form-control" placeholder="Current Location"
						type="text" name="Location" id="Location">
				</div>
				
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input class="form-control" placeholder="course"
						type="text" name="course" id="course">
				</div>
				<!-- form-group// -->
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input class="form-control" placeholder="Gender"
						type="text" name="gender" id="gender">
				</div>
				
				<div class="form-group input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"> <i class="fa fa-lock"></i>
						</span>
					</div>
					<input class="form-control" placeholder="Skills"
						type="text" name="skill" id="skill">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block" id="">
						Create Account</button>
				</div>
				<!-- form-group// -->
				
			</form>
			
			<script type="text/javascript">
			
			$(document).ready(function() {
				
				$("#btnstudent").on("click",function(){
					
					alert();
					event.preventDefault(e);
					saveStudentDetails();
				});
			
				
				function saveStudentDetails() {
					
				alert();
					var reqData = {
							fullName : $("#name").val(),
							email : $("#email").val(),
							mobileNumber : $("#number").val(),
							currentLocation : $("#Location").val(),
							highstQualification : $("#qualification").val(),
							course : $("#course").val(),
							collage : $("#collagename").val(),
							passingYear : $("#passingyear").val(),
							skills : $("#skill").val(),
							gender : $("#gender").val(),
						
						
					}
					
					$.ajax({
						type : "POST",
						url : "http://localhost:8080/studentRegistration",
						cache : false,
						dataType : "json",
						data : JSON.stringify(reqData),
						contentType : 'application/json',
						success : function(response) {
							$("#employeeCode").val(response.empCode);
							//$("#employeeCode").html('<b>'+response.empCode);
							$("#statusmsg").html('<b>'+"Employee added successfully");
							alert(response.empCode);
							
							/* $('#empForm').trigger("reset"); */
							$("#btnEmp").prop('disabled', true);
							$('#empAddrsForm').show();
							/* $('#myDiv').slideUp();
							$('#empForm').fadeOut(); */
						},
						error : function(xhr, status, error) {
							alert(xhr);
						}

					});
				})
			</script>
		</article>
	</div>
	<!-- card.// -->

</div>
<!--container end.//-->

<br>
<br>
