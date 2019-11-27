<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<body>
    <div>
        <div>
            <h1>Spring Boot JSP Example</h1>
            <h2>Hello ${message}</h2>
             
            Click on this <strong><a href="next">link</a></strong> to visit another page.
        </div>
    </div>
    
    <form:form action="/gc/reveal" method="get" modelAttribute="request">
    	<table>
    		<tr>
    			<td>ClaimCode</td>
    			<td><form:input path="claimcode" /></td>
    		</tr>
    		
    		<tr>
    			<td>asin</td>
    			<td><form:input path="asin" /></td>
    		</tr>
    		
    		<tr>
    			<td><input type="Submit" value="Add" /></td>
    		</tr>
    	</table>
    	
    </form:form>
</body>
</html>