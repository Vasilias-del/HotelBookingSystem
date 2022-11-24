<%-- 
    Document   : logout
    Created on : Dec 13, 2018, 4:46:22 PM
    Author     : FIQMANAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
    session.invalidate();
    response.sendRedirect("index.jsp"); 

%>