<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CreatProfile</title>
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
        </ul>
        </header>
        <br><br>
<f:view>
<h:form>
	<div style="padding: 30px;font-size: 25px; margin-right: 00px; margin-left: 385px; border: 2px solid black;width: 40%;height: 120%; background-color: lightgoldenrodyellow;">
                <h2 style="color: red; text-align: center;">Insert Informations</h2>
	<fieldset>
		<legend>Account Details</legend>
		<h:outputText value="Phone Number::" ></h:outputText>
		<h:inputText id="pnum" value="#{patientBean.phonenum }"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
         <h:outputText value="Password:"></h:outputText>
         <h:inputText id="pass" value="#{patientBean.password}"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
	</fieldset>
	<br>
	<fieldset>
		<legend>Personal data</legend>
		<h:outputText value="Name:"></h:outputText>
		<h:inputText id="name" value="#{patientBean.name}"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
         <h:outputText value="Age:"></h:outputText>
         <h:inputText id="age" value="#{patientBean.age }"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
         <h:outputText  value="City:"></h:outputText>
         <h:inputText id="city" value="#{patientBean.city }"  required="true" requiredMessage=" mandatory"></h:inputText>
	</fieldset>
	<br>
	<fieldset>
		<legend>Medical data</legend>
		<h:outputText value="Body Temparature:"></h:outputText>
		<h:inputText id="bt" value="#{patientBean.bodytemp}"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
		<h:outputText value="Heart Rate:"></h:outputText>
		<h:inputText id="hr" value="#{patientBean.heartRate}" required="true" requiredMessage=" mandatory"></h:inputText><br><br>
         <h:outputText value="Systolic Blood pressure:"></h:outputText>
         <h:inputText id="sys" value="#{patientBean.systolicPressur }"  required="true" requiredMessage=" mandatory"></h:inputText><br><br>
         <h:outputText  value="Diastolic Blood Pressure:"></h:outputText>
         <h:inputText id="dia" value="#{patientBean.diastolicPressure }"></h:inputText><br><br>
         <h:outputText value="Heart Deasis"></h:outputText>
		<h:selectOneRadio value="#{patientBean.heartDeasis}" required="true" requiredMessage=" mandatory">
			<f:selectItem itemValue="YES" itemLabel="YES" />
			<f:selectItem itemValue="NO" itemLabel="NO" />
		</h:selectOneRadio>
		<br>
		<h:outputText value="Hypertention"></h:outputText>
		<h:selectOneRadio value="#{patientBean.hypertention}"  required="true" requiredMessage=" mandatory">
			<f:selectItem itemValue="YES" itemLabel="YES" />
			<f:selectItem itemValue="NO" itemLabel="NO" />
		</h:selectOneRadio>
		<br>
		<h:outputText value="Diabatis"></h:outputText>
		<h:selectOneRadio value="#{patientBean.diabatis}" required="true" requiredMessage=" mandatory">
			<f:selectItem itemValue="YES" itemLabel="YES" />
			<f:selectItem itemValue="NO" itemLabel="NO" />
		</h:selectOneRadio>
	</fieldset>
	<br>
	<h:commandButton value="Submit" action="#{patientBean.creatprofile}" ></h:commandButton>


</h:form>


</f:view>
</body>
</html>