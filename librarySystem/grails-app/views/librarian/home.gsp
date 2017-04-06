<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Library</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <asset:stylesheet src="home.css"/>
</head>
<body>
   

    <div id="content" role="main">

<div class="row">
<div class="span12">
<h2>Hello~ Welcome to the library</h2>
</div>
</div>

<div class="row">
<div class="span12">
<div class="first">
<h3> Student Search </h3>
<p> This is a full-functional Student search </p>
<button type="button" class="btn btn-success">
<g:link controller="student" action ="advSearch">Search Now!</g:link>  
</button>
</div>
</div>

<div class="column">
<div class="span3">
<div class="first">
<h3> Courses Management</h3>
<p>Short description for course</p>
<button type="button" class="btn btn-success">
<g:link controller="course" action ="create">Start Now!</g:link>
</button>
</div>
</div>
</div>

<div class="column">
<div class="span3">
<div class="second">
<h3> Student Management</h3>
<p>Short description for student</p>
<button type="button" class="btn btn-success">
<g:link controller="student" action ="create">Start Now!</g:link>
</button>
</div>
</div>
</div>

<div class="column">
<div class="span3">
<div class="first">
<h3> Book Management</h3>
<p>Short description for book</p>
<button type="button" class="btn btn-success">
<g:link controller="book" action ="create">Start Now!</g:link>
</button>
</div>
</div>
</div>

<div class="column">
<div class="span3">
<div class="second">
<h3> Librarian Management</h3>
<p> Short description for librarian</p>
<button type="button" class="btn btn-success">
<g:link controller="librarian" action ="create">Start Now!</g:link>    
</button>
</div>
</div>
</div>
</div>




            
        </section>
    </div>

</body>
</html>
