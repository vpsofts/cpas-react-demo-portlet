<%-- ==========================================================================================
 *   IBA CZ Confidential
 *   Copyright IBA CZ 2014 ALL RIGHTS RESERVED
 *   The source code for this program is not published or otherwise divested of its trade secrets.
 * =============================================================================================
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="../init.jspf" %>

<c:set var="portletContainer" value="${ns}agent-map-container" />
<div id="${portletContainer}">
    <noscript>
        <h1>Nejede JS</h1>
    </noscript>
</div>

<portlet:resourceURL var="getHelloResourceUrl" id="<%= eu.ibacz.cpas.clientadmin.web.portlet.demo.Constants.RESOURCE_GET_HELLO%>" />

<script id="cpas-react-demo-portlet-${ns}" data-gli-portlet="" type='application/json'>{
    "portlet": "demo",
    "namespace": "${ns}",
    "containerId": "${portletContainer}",
    "hello": "${demoPto.hello}",
    "resourceUrl": "${getHelloResourceUrl}",
    "debug": true
}
</script>




