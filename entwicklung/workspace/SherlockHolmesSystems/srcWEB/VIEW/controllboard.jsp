<%@ page import="MODEL.Config" %>

<!-- 
@Ehsan, Engin, Stella
Hier wird sp�ter die blockdisplace()-Methode eingef�hrt. Ein Datei f�r alle --> MVC-Pattern
 -->

<div id="<%=Config.mainId%>">
	<table>
		<tr><td colspan="2">
			<div id="<%=Config.headerId%>">
				<%@ include file="VIEWCONTROLLER/header.jsp" %>
			</div>
		</td></tr>
		<tr>
			<td><div id="<%=Config.mainwestId%>">
				<%@ include file="VIEWCONTROLLER/mainwest.jsp" %>
			</div></td>
			<td>
				<div id="<%=Config.mainnordId%>">
					<%@ include file="VIEWCONTROLLER/mainnord.jsp" %>
				</div>
				<br><hr>
				<div id="<%=Config.mainsouthId%>">
					<%@ include file="VIEWCONTROLLER/mainsouth.jsp" %>
				</div>
			</td>
		</tr>
		<tr><td colspan="2">
			<div id="<%=Config.progressId%>">
				<%@ include file="VIEWCONTROLLER/progress.jsp" %>
			</div>
		</td></tr>
	</table>
</div>