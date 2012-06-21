<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="../template/localHeader.jsp"%>


<div>
    <form method="post" enctype="multipart/form-data" action="">
        <fieldset>
            <ol>
                <li>
                    <label for="secretFile"><spring:message code="clinicalsummary.upload.secret"/></label>
                    <input type="file" name="template"/>
                </li>
                <li>
                    <input type="submit" value="Generate Summary"/>
                </li>
            </ol>
        </fieldset>
    </form>
</div>

<%@ include file="/WEB-INF/template/footer.jsp"%>