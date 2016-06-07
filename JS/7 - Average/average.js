document.write("7 . Average <br><br> " );


var student_data = [
	{name: "David", marks: 80},
	{name: "Vinoth", marks: 88},
	{name: "Ishitha", marks: 95},
	{name: "Thomas", marks: 68}
];

var sum_of_marks = 0;

for(var i=0; i<student_data.length; i++)
	sum_of_marks += student_data[i].marks;

var average_marks = sum_of_marks / student_data.length;

var grade = '';

if(average_marks>=90)
	grade = 'A';
else if(average_marks>=80)
	grade = 'B';
else if(average_marks>=70)
	grade = 'C';
else if(average_marks>=60)
	grade = 'D';
else
	grade = 'F';

document.write("Average marks of all students are: " + average_marks);
document.write ("<br> This results in an average grade of: " + grade);