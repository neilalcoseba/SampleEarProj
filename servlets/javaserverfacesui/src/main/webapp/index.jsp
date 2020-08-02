<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
		<head>
			<title>Hello World JSF Example</title>
		</head>
		<body>
			<h:form id="form">
				<h:inputText value="#{user.firstName}" />
				<h:commandButton id="submit-button" value="Submit" action="#{user.save}"/>  
			</h:form>
			
			<h:outputText value="#{user.output}" />
		</body>
	</html>
</f:view>