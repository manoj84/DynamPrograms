var matchingBracket = function(data){
    var stack = new Array();
   for(var i=0; i<data.length; i++){
       var p = data.charAt(i);
       if (p == '{'){
           stack.push(p);
       }
       
       else if(p == '}'){
          if( stack.length == 0)  console.log("Not Matching Brackets");
           break;
           stack.pop();
       }
   }
   
   stack.length > 0 ? console.log("Not Matching brackets"): console.log("Brackets Matched");
}

var data = "{{{  }}} }{}{}";

matchingBracket(data);

