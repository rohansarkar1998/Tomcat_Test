<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Hello, world!</title>
    <style>
     
      li
      {
          display: inline;
      }
      .hhh
      {
          
          color: red;
      }
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
color: black;
text-align: center;
padding: 30px;
text-decoration: none;
font-size: 20px;
}
#menu ul{
  list-style: none;
}
#menu li{
  display: inline;
}


fieldset {
  background-color: #eeeeee;
}

legend {
  background-color:cornflowerblue;
  color: white;
  padding: 5px 10px;
}

input {
  margin: 15px;
  
}
li a:hover {
background-color: thistle;
}  


  </style>
  </head>
  <body>
    <header>
    <ul id="nav"> 
  			<li><a a class="drop" href="CreatProfile.jsp">Sign Up</a></li>
            <li><a a class="drop" href="Login.jsp">Sign in</a></li>
            <li><a a class="drop" href="ChangePass.jsp">Change Password</a></li>
            <li><a a class="drop" href="Stat.jsp">Stat</a></li>
	</ul>
</header>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    
    <div id="slideshow" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active">
          <img src="resources/Image/socialdistance.jpg" width="1350" height="500">  
          <div class="carousel-caption">
              <h1 style="color:crimson; font-size: xx-large; font-family:Arial, Helvetica, sans-serif">Make Social Distances</h1>
          </div> 
      </div>
       <div class="carousel-item">
        <img src="resources/Image/wear_mask.jpg" width="1350" height="500"> 
        <div class="carousel-caption">
          <h1 style="color:white; font-size: xx-large; font-family:Elephant">          Always wear mask</h1>
        </div> 
      </div>  
      <div class="carousel-item">
        <img src="resources/Image/coronawarear.jpg" width="1350" height="500"> 
      </div> 
      <div class="carousel-item">
        <img src="resources/Image/sanatizer.jpg" width="1350" height="500"> 
        <div class="carousel-caption">
          <h1 style="color:yellow; font-size: xx-large; font-family:Arial, Helvetica, sans-serif">Sanatize Your hands</h1>
      </div> 
      </div>  
      <div class="carousel-item">
        <img src="resources/Image/home.jpg" width="1350" height="500"> 
      </div>  
  
  </div>
  <a href="#slideshow" class="carousel-control-prev" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon"></span>
      <span class="sr-only">Previous</span>
  </a>
  <a href="#slideshow" class="carousel-control-next" role="button" data-slide="next">
    <span class="carousel-control-next-icon"></span>
    <span class="sr-only">Next</span>
</a>
  </div>
  <br>
  <br>
  
  <div style="border: 2px solid black; ">
  <fieldset style="border: black;">

    <legend>  Important Links</legend>
    
    <pre style="color: crimson; font-size: 20px;">   World health Organization                         ICMR Delhi                   India Goverment Covid 19 Update</pre>
    
    <pre>      <button><a href="https://www.who.int/"> Click hear</a></button>                                                       <button><a href="https://www.icmr.gov.in/">Click hear</a></button>                                        <button><a href="https://www.mygov.in/covid-19/">Click hear</a></button>  </pre>
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