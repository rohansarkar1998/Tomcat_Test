<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adminhome</title>
<style>

        ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: blue;
}

li {
  float: right;
	}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 30px;
  text-decoration: none;
  font-size: 20px;
}

li a:hover {
  background-color: #111111;
}


 </style>
</head>
<body>
<header>
         <ul> 
           <li><a a class="drop" href="PatientAdmin.jsp">Patients</a></li>
            <li><a a class="drop" href="Showdoc.jsp">Doctor</a></li>
            <li><a a class="drop" href="Homepage.jsp">Home</a></li>
             <li><a a class="drop" href="Add.jsp">Add</a></li>
             <li><a a class="drop" href="ShowAdmin.jsp">Admin</a></li>
        </ul>
        </header>
        <br>
        <img src="resources/Image/covid-share.jpg" width="1350" height="450">
        <br><br>
        <div style="display: inline;">
        <img src="resources/Image/india.png" width="650" height="400">
        <img src="resources/Image/worldmap.png" width="650" height="400" style="float: right;">
        </div>
        <br><br>
        <div style="border: 2px solid black; ">
  <fieldset style="border: black;">

    <legend>  Important Links</legend>
    
    <pre style="color: crimson; font-size: 20px;">   World health Organization                         ICMR Delhi                   India Goverment Covid 19 Update</pre>
    
    <pre>      <button><a href="https://www.who.int/"> Click hear</a></button>                                                          <button><a href="https://www.icmr.gov.in/">Click hear</a></button>                                        <button><a href="https://www.mygov.in/covid-19/">Click hear</a></button>  </pre>
  </fieldset>
  </div>
  <br>
  <footer>
    <div style="padding: 20px; background-color: royalblue;">
        
        <pre style="text-align: center;font-size: 20px; color: white;">@ Rohan Sarkar</pre>
    </div>

</footer>
</body>
</html>