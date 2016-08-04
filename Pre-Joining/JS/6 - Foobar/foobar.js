document.write("6. Foobar <br><br> " );


for(var i=1; i<101; i++){

	if(i%3==0 && i%5==0)
		document.write(i + " - foobar");
	else if(i%3==0)
		document.write(i + " - foo");
	else if(i%5==0)
		document.write(i + " - bar");
	else
		document.write(i);
	document.write("<br>");

}