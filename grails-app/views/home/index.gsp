<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>
    <p>Hello world!</p>

    <g:form action="add">
        <g:textField name="word" placeholder="Add word..." />
        <g:submitButton name="Add"/>
    </g:form>

    <h1>Existing words:</h1>
    <g:each in="${words}" var="word">
        <p>${word.key} - ${word.value}</p>
    </g:each>
</body>
</html>