var nPalindromes = function(string, k){
	    var n = 0;
        var array = string.split('');
        var length = array.length;
        for(var i=0; i<length; i++){
        	if(array[i] != array[length-i-1]){
        		n++;
        	}
        }        
        //Finally check the count
        return (n == k) ?  true:  false;
}


//Testing
console.log(nPalindromes('fire', 4));
console.log(nPalindromes('alula', 0));

