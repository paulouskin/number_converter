<h3>Roman Numerals conversion</h3>

<h4>Values</h4>
<table>
<th>Symbol</th><th>Value</th>
<tr><td>I</td><td>1</td></tr>
<tr><td>V</td><td>5</td></tr>
<tr><td>X</td><td>10</td></tr>
<tr><td>L</td><td>50</td></tr>
<tr><td>C</td><td>100</td></tr>
<tr><td>D</td><td>500</td></tr>
<tr><td>M</td><td>1000</td></tr>
</table>


<h4>Additive and Subtractive Principles</h4>

Generally, Roman numerals are written in descending order from left to right, and are added sequentially, 
for example MMVI (2006) is interpreted as 1000 + 1000 + 5 + 1.
</br> Certain combinations employ a subtractive principle, which specifies that where a symbol of smaller value 
precedes a symbol of larger value, the smaller value is subtracted from the larger value, and the result is 
added to the total. For example, in MCMXLIV (1944), the symbols C, X and I each precede a symbol of 
higher value, and the result is interpreted as 1000 plus (1000 minus 100) plus (50 minus 10) plus (5 
minus 1).

<h4>To run:</h4>

mvn clean install

mvn exec:java -Dexec.mainClass=converter.commandline.CommandLineConverter -Dexec.args=<i>"your_roman_numeral"</i>
