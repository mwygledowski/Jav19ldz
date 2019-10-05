<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/">My Phone</a>
        </div>
        <ul class="nav navbar-nav pull-right">
            <li><a href="${pageContext.request.contextPath}/koszyk">Koszyk</a></li>
            <c:choose>
                <c:when test="${sessionScope.isAuthenticated}">
                     <li><a href="${pageContext.request.contextPath}/wyloguj">Wyloguj</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="${pageContext.request.contextPath}/login">Zaloguj</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>