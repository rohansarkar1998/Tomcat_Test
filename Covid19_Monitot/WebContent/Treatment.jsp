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
           <li><a a class="drop" href="DocHome.jsp">Home</a></li>
            <li><a a class="drop" href="ShowPatient.jsp">Patient</a></li>
        </ul>
        </header>
<f:view>
<h:form>
	<div style="padding: 30px;font-size: 25px; margin-right: 00px; margin-left: 230px; border: 2px solid black;width: 40%;height: 100%">
	<fieldset>
		<legend>Patient Details</legend>
		<h:outputText value="Patient Id::" ></h:outputText>
		<h:inputText id="pid" value="#{patientBean.id }"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
         <h:outputText value="Medicines:"></h:outputText>
         <h:inputText id="med" value="#{patientBean.medicin}"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
         <h:outputText value="Remarks:"></h:outputText>
         <h:inputText id="rem" value="#{patientBean.remark}"  required="true" requiredMessage=" mandatory"></h:inputText>
         <h:commandButton value="Submit" action="#{patientBean.treatment}" ></h:commandButton>
	</fieldset>
	</div>
	</h:form>
	</f:view>
</body>
</html>