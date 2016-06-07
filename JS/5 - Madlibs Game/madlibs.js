document.write("5. Mad-Libs Game! <br><br> " );

var user_word = [];

for(var i=0;i<5;i++){
	user_word[i] = prompt("Please enter word #" + (i+1) + "/5: (Hint: Enter funny objects for the most hilarious content!) ");
}

var color = prompt("Please enter a color (black/blue/red/green/yellow/HEX): ");

function style(text){
	return "<div style='color:" + color + ";display:inline;'><b>" + text + "</b></div>";
}

var paragraph = [

"The class field trip was completely ruined by " + style(user_word[0]) +". When Pharaoh remained unmoved, Moses called down a flood of " + style(user_word[1]) + ". I do not know with which weapons World War II was fought, but World War III will be fought with " + style(user_word[2]) + ". In Michael Jackson's final moments, he thought about " + style(user_word[3]) + ". Studies show that lab rats navigate mazes 50% faster after being exposed to " + style(user_word[4]) + ".", 

"In 1,000 years, when paper money is a distant memory, we'll pay for goods and services with " + style(user_word[0]) + ". What don't you want to find in your tiffin box? " + style(user_word[1]) + ". While, the Smithsonian Museum of " + style(user_word[2]) + ", has just opened an exhibit on " + style(user_word[3]) + ". I remember you when you were eating a " + style(user_word[4]) + " in a mental hospital.",

"What ended my last relationship? " + style(user_word[0]) + ". While, MTV's new reality show features eight washed-up celebrities living with " + style(user_word[1]) + ". I drink to forget " + style(user_word[2]) + ". I'm sorry, Professor, but I couldn't complete my homework because of " + style(user_word[3]) + ". Alternative medicine and Ramdev Baba is now embracing the curative powers of " + style(user_word[4]) + "."

];


function random_paragraph(){
	
	var d = new Date();
	var random = d.getTime();
	
	return paragraph[random%3];

}

document.write( random_paragraph() );