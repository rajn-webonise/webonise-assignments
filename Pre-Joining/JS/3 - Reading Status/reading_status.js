document.write("3. Reading Status <br><br>");

var library = [ 
    {
        author: 'Bill Gates',
        title: 'The Road Ahead',
        readingStatus: true
    },
    {
        author: 'Steve Jobs',
        title: 'Walter Isaacson',
        readingStatus: true
    },
    {
        author: 'Suzanne Collins',
        title:  'Mockingjay: The Final Book of The Hunger Games', 
        readingStatus: false
    }
]; 

library.map(function(book){

    var display_data = "";

    display_data += "<br>Book Author: <b>" + book.author + "</b>";
    display_data += "<br>Book Name: <b>" + book.title + "</b>";
    display_data += "<br>Reading Status: <b>" + book.readingStatus + "</b>";    

    document.write("<br>" + display_data + "<br>");

});