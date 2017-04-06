package com.czhanhao

class LibaraySystemTagLib {
   //static defaultEncodeAs = [taglib:'html']
   static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggle ={

out<<"<div style='margin: 15px 0 40px;'>"

if(request.getSession(false)&&session.user){

out<<"<span style = 'float:left; margin-left:15px'>"

out<<"welcome ${session.user.name}."

out<<"</span><span style='float:right;margin-right:15px'>"

out<<"<a href='${createLink(controller:'student', action:'logout')}'>"

out<<"Logout as student</a></span>"

}
else{

out<<"<span style = 'float:right;margin-right:10px'>"

out<<"<a href='${createLink(controller:'student', action:'login')}'>"

out<<"Login as student</a></span>"

}

out<<"</div><br/>"

}

def loginToggle2 ={

out<<"<div style='margin: 15px 0 40px;'>"

if(request.getSession(false)&&session.user){

out<<"<span style = 'float:left; margin-left:15px'>"

out<<"welcome ${session.user.name}."

out<<"</span><span style='float:right;margin-right:15px'>"

out<<"<a href='${createLink(controller:'librarian', action:'logout')}'>"

out<<"Logout as librarian</a></span>"

}
else{

out<<"<span style = 'float:right;margin-right:10px'>"

out<<"<a href='${createLink(controller:'librarian', action:'login')}'>"

out<<"Login as librarian</a></span>"

}

out<<"</div><br/>"

}

}
