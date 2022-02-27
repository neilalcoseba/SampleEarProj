<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
    <h:form id="customerForm">
        <h:messages/>
        <h:panelGrid columns="2"
                     columnClasses="rightAlign,leftAlign">
            <h:outputLabel for="firstName" value="First Name:">
            </h:outputLabel>
            <h:inputText id="firstName"
                         label="First Name"
                         value="#{customer.firstName}"
                         required="true">
                <f:validateLength minimum="2" maximum="30">
                </f:validateLength>
            </h:inputText>
            <h:outputLabel for="lastName" value="Last Name:">
            </h:outputLabel>
            <h:inputText id="lastName"
                         label="Last Name"
                         value="#{customer.lastName}"
                         required="true">
                <f:validateLength minimum="2" maximum="30">
                </f:validateLength>
            </h:inputText>
            <h:outputLabel for="email" value="Email:">
            </h:outputLabel>
            <h:inputText id="email"
                         label="Email"
                         value="#{customer.email}">
                <f:validateLength minimum="3" maximum="30">
                </f:validateLength>
            </h:inputText>
            <h:panelGroup></h:panelGroup>
            <h:commandButton action="#{customer.save}" value="Save">
            </h:commandButton>
        </h:panelGrid>
    </h:form>
</f:view>