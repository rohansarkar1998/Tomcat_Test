<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PatientUpdate</title>
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
<body style="background-color: lightskyblue;">
<header>
           <ul> 
           <li><a a class="drop" href="Homepage.jsp">Home</a></li>
           <li><a a class="drop" href="Patientdetails.jsp">Details</a></li>
        </ul>
        </header>
        <br><br>
<f:view>
<h:form>
	<div style="padding: 30px;font-size: 25px; margin-right: 00px; margin-left: 385px; border: 2px solid black;width: 40%;height: 120%; background-color: lightgoldenrodyellow;">
                <h2 style="color: red; text-align: center;">Insert Informations</h2>
                <fieldset>
          <h:outputText value="Phone Number:"></h:outputText>
		<h:inputText id="pno" value="#{patientBean.phonenum}"></h:inputText><br><br>      
		<legend>Update Medical data</legend>
		<h:outputText value="Body Temparature:"></h:outputText>
		<h:inputText id="bt" value="#{patientBean.bodytemp}"></h:inputText><br><br>
		<h:outputText value="Heart Rate:"></h:outputText>
		<h:inputText id="hr" value="#{patientBean.heartRate}"></h:inputText><br><br>
         <h:outputText value="Systolic Blood pressure:"></h:outputText>
         <h:inputText id="sys" value="#{patientBean.systolicPressur }"></h:inputText><br><br>
         <h:outputText  value="Diastolic Blood Pressure:"></h:outputText>
         <h:inputText id="dia" value="#{patientBean.diastolicPressure }"></h:inputText><br><br>
		<h:outputText value="Diabatis"></h:outputText>
		<h:selectOneRadio value="#{patientBean.diabatis}" required="true" requiredMessage=" mandatory">
			<f:selectItem itemValue="YES" itemLabel="YES" />
			<f:selectItem itemValue="NO" itemLabel="NO" />
		</h:selectOneRadio>
	</fieldset>
	<h:commandButton value="Submit" action="#{patientBean.updatepatient}" ></h:commandButton>
	</div>
	</h:form>
	</f:view>
	</body>
	</html>
	