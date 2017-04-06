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
<div class="column">
<div class="span4">
<div class="second">
<h3> Book Management</h3>
<p>Short description for book</p>
<button type="button" class="btn btn-success">
<g:link controller="book" action ="create">Search Now!</g:link>
</button>
</div>
</div>

<div class="column">
<div class="span4">
<div class="first">
<h3> BookReview Management</h3>
<p>Short description for bookreview </p>
<button type="button" class="btn btn-success">
<g:link controller="BookReview" action ="create">Start Now!</g:link>    
</button>
</div>
</div>

<div class="column">
<div class="span4">
<div class="second">
<h3> Book Search </h3>
<p>This is a full-function Book search </p>
<button type="button" class="btn btn-success">
<g:link controller="book" action ="advSearch">Start Now!</g:link>  
</button>
</div>
</div>
</div>

       
        </section>
    </div>

</body>
</html>
