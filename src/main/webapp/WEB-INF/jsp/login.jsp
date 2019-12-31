<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<h3>Login Form</h3>  

<form:form modelAttribute="form">
     <form:errors path="" element="div" />
     <div>
         <form:label path="username">Email</form:label>
         <form:input path="username" />
         <form:errors path="username" />
     </div>

     <div>
         <form:label path="password">Password</form:label>
         <form:input path="password" />
         <form:errors path="password" />
     </div>
     

     <div>
         <input type="submit" />
     </div>
</form:form>
</body>
</html>