<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Mohammed Adiat (maa)</td></tr>
<tr><td> <em>Generated: </em> 11/18/2023 8:51:54 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/maa" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-11-18T23.24.01image.png.webp?alt=media&token=1a0b376e-77af-4c1e-8fae-88eccc28cef2"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the first half of code in Payload.java with comments that<br>demonstrate the general use and purpose for each property within the file, as<br>well as multiple comments that contain my UCID &amp; Date.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-11-18T23.24.24image.png.webp?alt=media&token=f0286fe6-6c6e-4e76-a580-5443c52658c4"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the second half of code in Payload.java with comments that<br>demonstrate the general use and purpose for each property within the file, as<br>well as multiple comments that contain my UCID &amp; Date.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-11-19T00.07.14image.png.webp?alt=media&token=f7c647f0-546e-4471-b001-ef6bbf313f6b"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the code for the /roll &amp; /flip commands in Room.java,<br>as well as multiple comments that contain my UCID &amp; Date.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <div>The <b>processCommands</b> method checks if the received message starts with "/roll" or "/flip".<br>If it's "/roll", the method delegates to <b>processRollCommand</b>; otherwise, it calls <b>processFlipCommand</b>.<br></div><div><br></div><div>In <b>processRollCommand</b>,<br>the method extracts the portion of the message after "/roll" and trims any<br>leading or trailing whitespace. It then uses regular expressions (format1Pattern and format2Pattern) to<br>check if the command is in Format 1 (/roll #) or Format 2<br>(/roll #d#). The Matcher instances (format1Matcher and format2Matcher) are used to match the<br>patterns against the <b>rollCommand</b> string.</div><div><br></div><div>If the message matches Format 2, it calculates the<br>result of rolling a specified number of dice with a specified number of<br>sides. It constructs a string with the individual rolls and their total, sending<br>the result as a message. If it matches Format 1, it calculates the<br>result of rolling a single die with the specified upper bound and sends<br>the result. If neither format is matched, it sends an error message indicating<br>the correct usage.</div><div><br></div><div>The <b>processFlipCommand</b> method simulates a coin flip by generating a random<br>number between 0 and 1. If the result is less than 0.5, it<br>sets the result to "Heads"; otherwise, it sets it to "Tails". The outcome<br>is then sent as a message using the <b>sendMessage</b> method.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-11-19T00.43.56image.png.webp?alt=media&token=e47d5ea9-f7a0-4e3a-9935-29a85f96d20f"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays majority of the relevant code for this deliverable in Room.java<br>with multiple comments that contain my UCID &amp; Date. It primarily displays how<br>bold, italics, underline, &amp; color are processed.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-11-19T00.45.03image.png.webp?alt=media&token=3bff697d-e123-4521-987c-2fb03b6c80f4"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the rest of the relevant code for this deliverable in<br>Room.java with multiple comments that contain my UCID &amp; Date. It primarily displays<br>how the processTextFormatting &amp; sendMessage methods are processed.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-11-19T01.39.54image.png.webp?alt=media&token=c3ebeaf5-372a-45d6-a588-ac4412e5b716"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays majority of the relevant code for this deliverable in Room.java<br>with multiple comments that contain my UCID &amp; Date. It primarily displays how<br>bold, italics, underline, &amp; color are processed with print statements.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-11-19T01.40.32image.png.webp?alt=media&token=efa173f0-40d1-46ed-ac7b-0fc2c2a1e76f"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the rest of the relevant code for this deliverable in<br>Room.java with multiple comments that contain my UCID &amp; Date. It primarily displays<br>how the processTextFormatting &amp; sendMessage methods are processed with print statements.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <div><b>Bold:</b></div><div>The <b>processBold</b> method uses the regular expression <b>BOLD_REGEX</b> to find bold text patterns<br>in the input message. It captures the content within the asterisks, creates a<br>bold HTML tag(&lt;b&gt;), and replaces the matched text with the HTML bold tags.</div><div><br><b>Italics:</b></div><div>The<br><b>processItalics</b> method utilizes the regular expression <b>ITALICS_REGEX</b> to identify italicized text patterns in<br>the input message. It captures the content within the hyphens, constructs an italic<br>HTML tag (&lt;i&gt;), and substitutes the matched text with the HTML italic tags.</div><div><br><b>Underline:</b></div><div>The<br><b>processUnderline</b> method employs the regular expression <b>UNDERLINE_REGEX</b> to detect underlined text patterns in<br>the input message. It captures the content within the underscores, generates an underline<br>HTML tag (&lt;u&gt;), and replaces the matched text with the HTML underline tags.</div><div><br><b>Color:</b></div><div>The<br><b>processColor</b> method uses the regular expression <b>COLOR_REGEX</b> to find color-formatted text patterns in<br>the input message. It captures the color name and text content, constructs a<br>font color HTML tag (&lt;font color=...&gt;), and substitutes the matched text with the<br>HTML font color tags. The color handling assumes a format like [color_name text].</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707795-a9c94a71-7871-4572-bfae-ad636f8f8474.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td>Not provided</td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/maa" target="_blank">Grading</a></td></tr></table>