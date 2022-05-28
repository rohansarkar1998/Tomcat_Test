
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
           <li><a a class="drop" href="Homepage.jsp">Home</a></li>
        </ul>
        </header>
        <br><br>
<f:view>
 <h:form>
<fieldset>
            <h1><legend>Fail:</legend><h1><br>
            <h2>Fail</h2>
        </fieldset>
        </h:form>
        </f:view>
</body>
</html>