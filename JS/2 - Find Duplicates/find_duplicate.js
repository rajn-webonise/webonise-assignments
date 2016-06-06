document.write("2. Find Duplicates <br><br>");


var list = [1, 4, 32, 'a', 'x', 4, 243, 43453, "Hi", 92, 2, 2, 32, "Hello", 121, 32, 5, 'a', "Coldplay", "Hi", 23.32, 49];


document.write("Initial Array: ");

for(var i=0;i<list.length;i++){
    document.write( list[i] + " | ");
}

var hash = [];

for(var i=0;i<list.length;i++){
    var s = list[i];
    if(hash[s]==undefined){
        hash[s] = {origin: i, duplicates: []};
    }
    else{
        hash[s].duplicates.push(i);
    }
}

for(var i=0;i<list.length;i++){

    var hashStore = hash[list[i]];
    
    if(hashStore.duplicates.length>0){
        
        var display = "<br><br>Duplicates of '" + list[i] + "', first found at index[" + hashStore.origin +"], are at positions: ";
        
        for(var j=0;j<hashStore.duplicates.length;j++){
            display += '['+hashStore.duplicates[j] + "] ";
        }
        document.write(display);
        
        //document.write(display + " and length is " + hashStore.duplicates.length);
    }

}


document.write("<br><br>(All positions are 0-indexed.)");