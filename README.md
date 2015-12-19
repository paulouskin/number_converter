<h3>Roman Numerals conversion</h3>

<h4>Values</h4>

Symbol Value 

I 1

V 5 

X 10 

L 50 

C 100 

D 500 

M 1000 



<h4>Additive and Subtractive Principles</h4>

Generally, Roman numerals are written in descending order from left to right, and are added sequentially, 
for example MMVI (2006) is interpreted as 1000 + 1000 + 5 + 1.
Certain combinations employ a subtractive principle, which specifies that where a symbol of smaller value 
precedes a symbol of larger value, the smaller value is subtracted from the larger value, and the result is 
added to the total. For example, in MCMXLIV (1944), the symbols C, X and I each precede a symbol of 
higher value, and the result is interpreted as 1000 plus (1000 minus 100) plus (50 minus 10) plus (5 
minus 1).

<h4>To run:</h4>

mvn clean install

mvn exec:java -Dexec.mainClass=converter.commandline.CommandLineConverter -Dexec.args=<i>"your_roman_numeral"</i>
