<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}
.form label{
display:list-item;
text-align: left;
color:white;
margin-top: 10px;

}
.form input{
 color:black;   
}
.submit{
    margin-top: 10px;
    background-color: green;
    
}


</style>
</head>
<body>
	<form action="Attach" method="post" id="matchForm" class="form">
		<div>
			<label>Tournament Name</label> <input type="text"
				placeholder="Enter The Tournament Name" name="name" id="name"
				maxlength="20">
				
				

		</div>
		
		<br>
		
		<div>
			<label>Housting Country</label> <input type="text"
				placeholder="Enter the country" name="country" id="country">

		</div>
		
		<br>
		
		<div>
			<label>Match Date</label> <input type="date"
				placeholder="Enter the date" name="match" id="match">
		</div>
		
		<br>
		
		<div>
		
			<label>Team 1</label> <input type="text"
				placeholder="Enter team member" name="team1" id="team1">
		</div>
		
		<br>
		
		<div>
			<label>Team 2</label> <input type="text"
				placeholder="Enter team member" name="team2" id="team2">
		</div>
		
		<br>
		
		<div>
			<label>Team 1 Captian</label> <input type="text"
				placeholder="Captian 1 Name" name="captian1" id="captian1">
		</div>
		
		<br>
		
		<div>
			<label>Team 2 Captian</label> <input type="text"
				placeholder="Captian 2 Name" name="captian2" id="captian2">
		</div>
		
		<br>
		
		
		<div>
			<label>Umpire Name</label> <input type="text"
				placeholder="Umprire Name" name="umpire" id="umpire">
		</div>
		
		<br>
		
		<div>
			<label>Stadium Name</label> <input type="text"
				placeholder="Stadium Name" name="stadium" id="stadium">
		</div>
		
		<br>
		
		<div>
			<label>Third Umpire Name</label> <input type="text"
				placeholder="Third Umpire Name" name="third" id="third">
		</div>
		
		<br>
		
		<div>
			<label>Stadium Capacity</label> <input type="text"
				placeholder="Stadiun Capacity" name="capacity" id="capacity">
		</div>
		<input type="submit" placeholder="submit" value="Submit" id="submit" class="submit" disabled
			>

	</form>
	<script>
	
	
	
	
    const matchForm = document.getElementById("matchForm");
    const submit = document.getElementById("submit");
    matchForm.addEventListener("input", function() {
        const name = document.getElementById("name").value;
        const country = document.getElementById("country").value;
        const team1 = document.getElementById("team1").value;
        const team2 = document.getElementById("team2").value;
        const captian1 = document.getElementById("captian1").value; // Corrected variable name
        const captian2 = document.getElementById("captian2").value; // Corrected variable name
        const umpire = document.getElementById("umpire").value;
        const stadium = document.getElementById("stadium").value;
        const third = document.getElementById("third").value;
        const capacity = parseInt(document.getElementById("capacity").value);

        const isname = name.length > 3 && name.length < 20;
        const iscountry = country.length > 3 && country.length < 20;
        const isteam1 = team1.length > 3 && team1.length < 20;
        const isteam2 = team2.length > 3 && team2.length < 20;
        const iscaptain1 = captian1.length > 3 && captian1.length < 20;
        const iscaptain2 = captian2.length > 3 && captian2.length < 20;
        const isumpire = umpire.length > 3 && umpire.length < 20;
        const isstadium = stadium.length > 3 && stadium.length < 20;
        const isthird = third.length > 3 && third.length < 20;
        const iscapacity = !isNaN(capacity) && capacity > 0 && capacity < 1000000;

        if (isname && iscountry && isteam1 && isteam2
            && iscaptain1 && iscaptain2 && isumpire
            && isstadium && isthird && iscapacity) {
            submit.removeAttribute("disabled");
        } else {
            submit.setAttribute("disabled", "disabled");
        }
        
     
        
    });
</script>

</body>
</html>