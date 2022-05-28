<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShowAdmin</title>
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
            <li><a a class="drop" href="Add.jsp">Add</a></li>
           <li><a a class="drop" href="Adminhome.jsp">Home</a></li>
            <li><a a class="drop" href="PatientAdmin.jsp">Patient</a></li>
            <li><a a class="drop" href="Showdoc.jsp">Doctor</a></li>
        </ul>
        </header>
        <br><br>
<f:view>
<h:form>
<h:commandButton value="Show_Table" action="#{patientBean.showad}" ></h:commandButton>
 <h:dataTable border="0" cellpadding="0" cellspacing="15"  value="#{patientBean.ad}" var="p">
				
				<h:column id="column1">
					<f:facet name="header">
						<h:outputText value="Userid"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.userid}"></h:outputText>
				</h:column>
				<h:column id="column2">
					<f:facet name="header">
						<h:outputText value="Name"></h:outputText>
					</f:facet>
						<h:outputText value="#{p.name}"></h:outputText>
				</h:column>
				
	</h:dataTable>
		
 
</h:form>
</f:view>
</body>
</html>