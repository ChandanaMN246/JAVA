<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<table border="1" style="border-collapse:collapse">
				<h1>Displaying Employee Details</h1>
				<tr style="background-color: blue; border-spacing:0">
					<th> Emp ID</th> 
					<th> Emp Name</th>
					<th> Emp Design</th>
					<th> Emp GC</th>
					<th> Emp Sal</th>
					<th> Emp Add</th>
				</tr>
				<xsl:for-each select="employee/emp"> 
				<tr>
					<td> <xsl:value-of select="eid"/></td>
					<td> <xsl:value-of select="ename"/></td>
					<td> <xsl:value-of select="edesign"/></td>
					<td> <xsl:value-of select="egc"/></td>
					<td> <xsl:value-of select="esal"/></td> 
					<td> <xsl:value-of select="eaddr"/></td>
				</tr>
				
				</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
