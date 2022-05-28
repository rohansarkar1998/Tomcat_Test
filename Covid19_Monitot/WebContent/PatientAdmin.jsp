<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShowPatient</title>
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
<f:view>
<h:form>
<header>
           <ul> 
           <li><a a class="drop" href="Adminhome.jsp">Home</a></li>
            <li><a a class="drop" href="Showdoc.jsp">Doctor</a></li>
             <li><a a class="drop" href="Add.jsp">Add</a></li>
             <li><a a class="drop" href="ShowAdmin.jsp">Admin</a></li>
        </ul>
        </header>
        <br><br>
<h:commandButton value="Show_Table" action="#{patientBean.showpatienttable}" ></h:commandButton>
 <h:dataTable border="0" cellpadding="0" cellspacing="15"  value="#{patientBean.d1}" var="p">
				
				<h:column id="column1">
					<f:facet name="header">
						<h:outputText value="Id"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.id}"></h:outputText>
				</h:column>
				<h:column id="column2">
					<f:facet name="header">
						<h:outputText value="Name"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.name}"></h:outputText>
				</h:column>
				<h:column id="column3">
					<f:facet name="header">
						<h:outputText value="Age"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.age}"></h:outputText>
				</h:column>
				<h:column id="column4">
					<f:facet name="header">
						<h:outputText value="Heart_Rate"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.heartRate}"></h:outputText>
				</h:column>
				<h:column id="column5">
					<f:facet name="header">
						<h:outputText value="Systeolic_Pressure"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.systolicPressur}"></h:outputText>
				</h:column>
				<h:column id="column6">
					<f:facet name="header">
						<h:outputText value="Diastolic_pressure"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.diastolicPressure}"></h:outputText>
				</h:column>
				<h:column id="column7">
					<f:facet name="header">
						<h:outputText value="Heart-Desease"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.heartDeasis}"></h:outputText>
				</h:column>
				<h:column id="column8">
					<f:facet name="header">
						<h:outputText value="HyperTention"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.hypertention}"></h:outputText>
				</h:column>
				<h:column id="column9">
					<f:facet name="header">
						<h:outputText value="Diabatis"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.diabatis}"></h:outputText>
				</h:column>
				<h:column id="column10">
					<f:facet name="header">
						<h:outputText value="Medicin"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.medicin}"></h:outputText>
				</h:column>
				<h:column id="column11">
					<f:facet name="header">
						<h:outputText value="Remarks"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.remark}"></h:outputText>
				</h:column>
				
	
	</h:dataTable>
		
 
</h:form>
</f:view>
</body>
</html>