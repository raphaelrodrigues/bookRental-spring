<%-- 
    Document   : bookList
    Created on : 27/ago/2014, 23:36:48
    Author     : raphael
--%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <jsp:include page="../jsp/partials/header.jsp"/>
    <body>
        <h1><center>BookList!</center></h1>
        <div class="container" id="tourpackages-carousel">

            <div class="row">
                <c:forEach items="${books}" var="book">
                    <div class="col-xs-18 col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <img src="http://placehold.it/500x300" alt="">
                            <div class="caption">
                                <h4><c:out value="${book.name}"/></h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere, soluta, eligendi doloribus sunt minus amet sit debitis repellat. Consectetur, culpa itaque odio similique suscipit</p>
                                <p><a href="<c:url value='book/${book.id}.htm'/>" class="btn btn-info btn-xs" role="button">${book.name}</a> </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div><!-- End row -->

        </div><!-- End container -->


<button id="btn" class="btn btn-infos">CLICK FOR AJAX </button>
<p></p>
</body>

</html>
