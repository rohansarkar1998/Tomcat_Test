<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

           <h:commandButton value="Show_Stat" action="#{patientBean.sta}" ></h:commandButton>
           <fieldset>
           <legend>Static::</legend>
           <h2><h:outputText value="#{patientBean.ans}"></h:outputText></h2>
          </fieldset>
          </h:form>
          </f:view>
</body>
</html>