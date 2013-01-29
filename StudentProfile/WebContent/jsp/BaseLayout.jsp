<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/styles.css" rel="stylesheet" type="text/css">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<style>
  h1, p, body, html {
	margin:0;
	padding:0;}

/*Just visual styles*/
body {
	
	font:12px verdana, sans-serif;
	color:#000;
	background: "background.jpg" no-repeat top left fixed;
	}

/*Our full length header. 
We align the text center so it shows up in the middle. 
If you prefer you could right or left align it.*/	
#headerbg {
	background:#3BB9FF;
	text-align:center;
	padding:20px;
	
	}
	
/*Center Content*/	
#container {
	position:relative;
	margin:0 auto;
	width:800px;
	}

/*Full width footer	
#footer {
	background:#3BB9FF;
	padding:10px;
	text-align:center;
	}*/

/*These are just styles used for the example for the content.*/	
.left {
	float:left;
	width:500px;
	background:#ccff66;
	}
	
.right {
	float:left;
	width:200px;
	clear:right;
	background:#66ff33;
	}
	
.left p, .right p {
	padding:10px;
	width=2000px;
	}

</style>
</head>
<body background="images/bg1.jpg">

<div id="baseLayout"> 
	<div id="header" style=" height: 5%">
		<tiles:insertAttribute name="header"  />
	</div>
	<div id="menu" style=" height: 5%">
		<tiles:insertAttribute name="menu"  />
	</div>
	<div id="body"  style="height: 80%;clear: right">
		<tiles:insertAttribute name="body"  />
	</div>
	<div id="anouncement" style="float: left;  height: 5%">
		<tiles:insertAttribute name="anouncement"  />
	</div>
	<div id="news" style="float: left;  height: 5%">
		<tiles:insertAttribute name="news"  />
	</div>
	<div id="footer" style="clear: both; height: 5%">
		<tiles:insertAttribute name="footer"  />
	</div>
</div>
</body>
</html>