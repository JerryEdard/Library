<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Library</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<div class="row">

<h1>Library</h1>
 
<h3>Results</h3>

<p>Searched

for students matching <em>${term}</em>.

Found <strong>${students.size()}</strong> students.

</p>

<ul>

  <g:each var="student" in="${students}">

  <li><g:link controller="student" action="show"

  id="${student.id}">${student.name}</g:link></li>

  </g:each>

  </ul>

<g:link action='advSearch'>Search Again</g:link>

</div>

</body>

</html>