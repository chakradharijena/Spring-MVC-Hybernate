<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<!--#8c8486  -->
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #8c8486;
}

* {
	box-sizing: border-box;
}

h2 {
	text-align: center;
	color: white;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}

/* Full-width input fields */
input[type="text"], input[type="date"], input[type="time"], input[type="number"]
	{
	width: 100%;
	padding: 10px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type="text"]:focus, input[type="date"]:focus, input[type="time"]:focus,
	input[type="number"]:focus {
	background-color: #ddd;
	outline: none;
}

button[type="submit"] {
	background-color: rgb(3, 187, 3);
	border: none;
	color: white;
	padding: 12px 24px;
	margin: 4px 2px;
	cursor: pointer;
}

button[type="reset"] {
	background-color: red;
	border: none;
	color: white;
	padding: 12px 24px;
	margin: 4px 2px;
	cursor: pointer;
}

select {
	width: 100%;
	padding: 10px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

label {
	font-weight: bold;
}

.col {
	float: left;
	width: 50%;
	padding: 10px;
}

.row::after {
	content: "";
	display: table;
	clear: both;
}

.required::after {
	content: " *";
	color: red;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<b>Campus Registration</b>
	</h2>
	<form:form action="campRegistration" method="POST"
		modelAttribute="campusRegistrationdto">
		<div class="row">
			<div class="col">
				<label class="required">Organisation Type</label><br /> <input
					type="text" id="orgnType" name="orgnType" required /><br />
			</div>
			<div class="col">
				<label class="required">Organisation Name</label><br /> <input
					type="text" id="orgnName" name="orgnName" required /><br />
			</div>
		</div>

		<div class="row">
			<div class="col">
				<label class="required">Organiser Name</label><br /> <input
					type="text" id="organiserName" name="organiserName" required /><br />
			</div>
			<div class="col">
				<label class="required">Organiser Phone No.</label><br /> <input
					type="text" id="organiserNum" name="organiserNum" required /><br />
			</div>
		</div>

		<label class="required">Organiser Email</label>
		<br />
		<input type="text" id="orgId" name="orgId" />
		<br />

		<div class="row">
			<div class="col">
				<label>Camp Name</label><br /> <input type="text" id="campName"
					name="campName" /><br />
			</div>
			<div class="col">
				<label class="required">Camp Address</label><br /> <input
					type="text" id="campAdd" name="campAdd" required /><br />
			</div>
		</div>

		<div class="row">
			<div class="col">
				<label class="required">State</label><br /> 
				<select name="state" id="state" required>
					<option value="odisha">Odisha</option>
				</select><br />
			</div>

			<div class="col">
				<label class="required">District</label><br /> 
				<select name="dist" id="dist" required>
					<option value="select">Select District</option>
					<option value="Anugul">Anugul</option>
					<option value="Balangir">Balangir</option>
					<option value="Baleswar">Baleswar</option>
					<option value="Bargarh">Bargarh</option>
					<option value="Baudh">Baudh</option>
					<option value="Bhadrak">Bhadrak</option>
					<option value="Cuttak">Cuttak</option>
					<option value="Debagarh">Debagarh</option>
					<option value="Dhenkanal">Dhenkanal</option>
					<option value="Gajapati">Gajapati</option>
					<option value="Ganjam">Ganjam</option>
					<option value="Jagatsinghapur">Jagatsinghapur</option>
					<option value="Jajpur">Jajpur</option>
					<option value="Jharsuguda">Jharsuguda</option>
					<option value="Kalahandi">Kalahandi</option>
					<option value="Kandhamal">Kandhamal</option>
					<option value="Kendrapara">Kendrapara</option>
					<option value="Kendujhar">Kendujhar</option>
					<option value="Khorda">Khorda</option>
					<option value="Koraput">Koraput</option>
					<option value="Malkangiri">Malkangiri</option>
					<option value="Mayurbhanjh">Mayurbhanjh</option>
					<option value="Nabarangapur">Nabarangapur</option>
					<option value="Nayagarh">Nayagarh</option>
					<option value="Nuapada">Nuapada</option>
					<option value="Rayagada">Rayagada</option>
					<option value="Sambalpur">Sambalpur</option>
					<option value="Subarnapur">Subarnapur</option>
					<option value="Sundargarh">Sundargarh</option>
				</select><br />
			</div>
		</div>

		<label class="required">City Name</label>
		<br />
		<input type="text" id="city" name="city" required />
		<br />

		<label>Blood Bank</label>
		<br />
		<select name="bbank" id="bbank">
			<option value="select">Blood Bank</option>
		</select>
		<br />

		<label class="required">Camp Date</label>
		<br />
		<input type="date" id="campDate" name="campDate" required />
		<br />

		<div class="row">
			<div class="col">
				<label class="required">Start Time</label><br /> <input type="text"
					id="starttime" name="starttime" required /><br />
			</div>
			<div class="col">
				<label class="required">End Time</label><br /> <input type="text"
					id="endtime" name="endtime" required /><br />
			</div>
		</div>

		<div class="row">
			<div class="col">
				<label class="required">Estimated Participants</label><br /> <input
					type="number" id="estPart" name="estPart" required /><br />
			</div>
			<div class="col">
				<label>Remarks</label><br /> <input type="text" id="remark"
					name="remark" /><br />
			</div>
		</div>

		<button type="submit" value="Submit">Submit</button>
		<button type="reset" value="Cancel">Cancel</button>
	</form:form>




</body>
</html>