<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Mohammed Adiat (maa)</td></tr>
<tr><td> <em>Generated: </em> 12/13/2023 1:33:06 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone3/grade/maa" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-12T20.26.41image.png.webp?alt=media&token=70c44855-09e0-4153-846c-c0745e124b66"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the screen relevant to Host and Port. For this specific<br>screenshot, we see the following:<br><br>- Host: 127.0.0.1<br>- Port: 3000<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-12T20.30.21image.png.webp?alt=media&token=f64cedd3-7a6d-45d3-8e17-a415d19a21f5"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the screen relevant to Username. For this specific screenshot, we<br>see the following:<br><br>Username: MoeAdiat16 (For the sake of example, I entered the username<br>&quot;MoeAdiat16&quot; to display that I have the access and capability to enter a<br>username.)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <div><div><div><b>User initiates connection from GUI:</b></div><div><b>-</b> The <b>ConnectionPanel&nbsp;</b>GUI allows the user to input a<br>host, port, and username.</div><div><b>-</b> Upon clicking the "Next" button, the input is validated.</div><div><b>-</b><br>If valid, the <b>Client </b>singleton is notified to proceed to the next step.</div><div><br></div><div><b>Client<br>initiates connection to the server:</b></div><div><b>-</b>&nbsp;The <b>Client </b>class establishes a connection to the server<br>using the provided host and port.</div><div><b>-&nbsp;</b>Sends a <b>CONNECT </b>payload to the server with<br>the client's username.</div><div><br></div><div><b>ServerThread handles client connection:</b></div><div><b>-</b>&nbsp;On the server side, the <b>ServerThread </b>handles new<br>client connections.</div><div><b>-</b>&nbsp;Processes the <b>CONNECT </b>payload, sets the client name, and adds the client<br>to a list of connected clients.</div><div><br></div><div><b>Server updates connected clients:</b></div><div><b>-</b>&nbsp;The server sends a <b>SYNC_CLIENT</b><br>payload to all connected clients, informing them about the new client.</div><div><b>-</b>&nbsp;Each client, including<br>the newly connected one, updates its local user list.</div><div><br></div><div><b>User joins a room:</b></div><div><b>-</b>&nbsp;The user<br>can either join an existing room or create a new one through the<br>GUI.</div><div><b>-</b>&nbsp;The client sends a <b>JOIN_ROOM</b> or <b>CREATE_ROOM</b> payload to the server.</div><div><br></div><div><b>Server handles room<br>actions:</b></div><div><b>-</b>&nbsp;The server's <b>Room </b>class processes the user's request to join or create a<br>room.</div><div><b>-</b>&nbsp;If successful, the user is added to the room, and the room broadcasts<br>the updated user list to all clients.</div><div><br></div><div><b>User is fully connected and in a<br>room:</b></div><div><b>-</b>&nbsp;At this point, the user is fully connected, and the application is in<br>a room context.</div><div><b>-</b>&nbsp;The user can now send and receive messages within the room.</div></div></div><div><br></div><div><div>Server<br>is the first stop on a connection and generates a <b>ServerThread </b>to hold<br>the socket connection. After that, the <b>ServerThread </b>waits and receives the client name.<br>The <b>ServerThread</b> is also automatically added to lobby once it is all set.</div></div><div><br></div><div>Below,<br>I discuss a bit about the&nbsp;<b>ConnectionPanel.java</b> file, which handles the UI for connecting<br>to the server, validating user inputs, and facilitating the transition to the next<br>card in the application flow.</div><div><div><b>Username Input:</b></div><div>I added UI components for entering the username,<br>including a label, a text field, and an error label for validation. There<br>were already UI components for the user to enter the host and port.</div></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-12T22.09.39image.png.webp?alt=media&token=f768f6aa-51f1-4271-863a-bc512be858df"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays a list of users in a room, the chat message<br>area with chat history, and the create message area and its send button.<br><br>Here,<br>we can see the list of users in a room on the right<br>side of the screenshot. The names of the two users are TamimaAktar16 &amp;<br>MoeAdiat16. We can also see the chat message area where we are able<br>to view any messages that a user or system sends. In this case,<br>we see messages that display the name of the user followed by a<br>phrase that states that specific user has joined the room lobby, as well<br>as a couple messages sent by the users in the room. We also<br>can see the create message area on the bottom of the screenshot, as<br>well as a Send button on the bottom right of the screenshot.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-12T22.23.15image.png.webp?alt=media&token=4a77a143-98a3-4d90-b93b-0740d26ce492"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the relevant snippet of code that lets the enter key<br>send the message. In the context of this application, this enables sending a<br>message by pressing the Enter key while the focus is on the text<br>field.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T04.25.59image.png.webp?alt=media&token=aa6c9b56-344b-4fa5-9454-865473f2de87"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the output of /flip, /roll 100, &amp; /roll 2d10 in<br>text styles that differ from plain text (bold).<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T03.00.05image.png.webp?alt=media&token=9de53e68-abd6-498b-bed0-49e26c362b4c"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the code relevant to /flip &amp; /roll generation.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T03.12.01image.png.webp?alt=media&token=ef782f47-87aa-4112-9d9e-f234bfad62ad"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the text format logic clearly labeled each step with comments.<br>(part 1)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T03.13.33image.png.webp?alt=media&token=18c2f65a-600e-4e45-a443-060993131f60"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the text format logic clearly labeled each step with comments.<br>(part 2)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <div><b>Commands:</b></div><div><b>Roll Command:</b> This command supports two formats, <b>/roll #</b> and <b>/roll #d#</b>, simulating<br>the roll of a die or multiple dice. The logic involves parsing the<br>command, generating random numbers based on the specified format, and sending the result<br>to the requesting client.</div><div><b>Flip Command:</b> The <b>/flip </b>command simulates a coin flip, randomly<br>yielding either "Heads" or "Tails" and sending the result to the client.</div><div><b>Text Formatting:</b><br>The text formatting involves processing bold, italics, underline, and color in the message.<br>Regular expressions are used to identify formatting patterns, and the identified substrings are<br>replaced with corresponding HTML tags for formatting.</div><div><br></div><div><b>Logic for Roll, Flip, and Formatting:</b></div><div><b>Roll Command<br>Logic:</b> The logic checks if the command follows the specified formats, generates random<br>numbers accordingly, and formats the result message for display.</div><div><b>Flip Command Logic:</b> A random<br>value determines the coin flip result, and the outcome is sent to the<br>client.</div><div><b>Text Formatting Logic:</b> Regular expressions are used to find specific patterns for bold,<br>italics, underline, and color formatting. The matched portions are replaced with corresponding HTML<br>tags to achieve the desired formatting.</div><div><br></div><div><b>Client-&gt;Server-&gt;Client Flow:</b></div><div><b>-</b>&nbsp;Clients send commands such as roll, flip,<br>or formatted messages to the server.</div><div><b>-</b>&nbsp;The server processes these commands or messages, performs<br>the necessary logic (e.g., generating random numbers or applying formatting), and then broadcasts<br>the results to all clients in the room.</div><div><b>-</b>&nbsp;The clients receive the broadcasted results<br>and update their displays accordingly.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T04.26.46image.png.webp?alt=media&token=a29d6d9f-d950-4b26-b007-d9a2189a301b"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays messages (lines 2-4) that show bold, italics, underline, and color<br>working. It also displays a combination of effects working together, as well as<br>the input string in the chat send area/chat box that displays the messages.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <div>In the given <b>Room.java</b> code, the text formatting logic is implemented to handle<br>various formatting commands such as bold, italics, underline, and color. These formatting commands<br>are identified in the user's input message using regular expressions, and corresponding HTML<br>tags are generated to represent the formatted text.</div><div><br></div><div>The <b>processBold</b>, <b>processItalics</b>, <b>processUnderline</b>, and <b>processColor<br></b>methods use regular expressions to detect patterns such as <b>*bold*</b>, <b>-italics-</b>, <b>_underline_,</b> and<br><b>[r red r]</b>, respectively. They then replace these patterns with HTML tags (<b>&lt;b&gt;</b>,<b><br>&lt;i&gt;</b>, <b>&lt;u&gt;</b>, <b>&lt;font color=...&gt;</b>).</div><div><br></div><div>The <b>formatMessage </b>method sequentially applies these formatting methods to the<br>input message, ensuring that the text is appropriately formatted for display.</div><div><br></div><div>To render the<br>formatted text on the UI side, the <b>processTextFormatting </b>method is called, which takes<br>the sender and the original message as parameters. This method formats the message<br>using the <b>formatMessage </b>method and then broadcasts the formatted message to all clients<br>in the room.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T04.57.18image.png.webp?alt=media&token=149f40dc-3dfd-41b4-af74-7f6f70901279"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays 3 users: test4, test16, &amp; test12. test16 whispers a &quot;hi!&quot;<br>message to test12, and we can see that test4 is unable to view<br>this whispered message. In response to test16&#39;s whisper, test12 whispers back to test16<br>with a &quot;hey test16!&quot; message. In summary, the command is triggered by the<br>user&#39;s name (@username), and the people who send and receive these whisper messages<br>are the only ones who can view them - in this example, I<br>display this with the utilization of 3 users in a room lobby (test4,<br>test6, test12).<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T05.04.52image.png.webp?alt=media&token=e4f1f47e-7ee8-4124-b7f4-f2fe2aa5bfe9"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the code relevant to the functionality of the whisper command.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <div>In the provided code, the whisper feature is implemented by checking if a<br>message starts with the "@" symbol. If it does, the message is treated<br>as a whisper command. The command is then split into two parts: the<br>target username and the actual whisper message. The target username is extracted by<br>removing the "@" symbol, and the message is sent using the <b>sendWhisperMessage </b>method.<br></div><div><br></div><div>The<br><b>sendWhisperMessage </b>method first attempts to find the target user's <b>ServerThread </b>by calling the<br><b>findClientByUsername </b>method. If the target user is found, the sender and target both<br>receive a formatted whisper message, indicating the source and destination of the message.<br>If the target user is not found, an error message is sent to<br>the sender, informing them that the specified user was not found.</div><div><br></div><div>This implementation ensures<br>that only the sender and the intended whisper target receive the message, maintaining<br>privacy for the whisper functionality. The <b>findClientByUsername </b>method iterates through the list of<br>clients in the room to locate the target user based on the provided<br>username, and the <b>sendWhisperMessage </b>method facilitates the communication between the sender and the<br>sender's target by sending appropriately formatted messages.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T06.10.46image.png.webp?alt=media&token=12d0fef0-84e9-433a-a0d1-84c8535eb936"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays 3 users (example1, example2, example3). We see each user mute<br>and unmute a user followed by the following message: &quot;Server: User &#39;name&#39; has<br>been unmuted.&quot;<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T06.14.32image.png.webp?alt=media&token=d8b1b68c-e83a-42fe-b285-e169f3310fbc"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the relevant code/methods within the ServerThread.java file.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-13T06.16.14image.png.webp?alt=media&token=5f849b4f-0ded-4754-be5a-23677d422dc2"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the relevant code/methods within the Room.java file.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <div>The mute/unmute functionality is implemented in both the <b>Room.java</b> and <b>ServerThread.java</b> classes. In<br>the <b>Room.java</b> class, the relevant code processes mute and unmute commands received through<br>messages. When a message is received, it checks if it starts with the<br>"/mute" or "/unmute" command, and if so, it extracts the target username and<br>calls the appropriate methods in the <b>ServerThread.java</b> class to handle muting or unmuting.<br></div><div><br></div><div>In<br>the ServerThread.java class, the <b>isMuted</b>, <b>mute</b>, and <b>unmute </b>methods manage the mute list.<br>The <b>isMuted </b>method checks whether a given username is in the mute list.<br>The <b>mute </b>method adds a username to the mute list, and the <b>unmute<br></b>method removes a username from the mute list.</div><div><br></div><div>The actual implementation of preventing muted<br>users from sending messages is in the <b>Room.java</b> class. The <b>sendMessage </b>method is<br>modified to check if the sender is muted before broadcasting a message. If<br>the sender is muted, the message is not broadcasted to them, ensuring that<br>muted users cannot send messages to the room. Additionally, this modification ensures that<br>the muted sender still receives their own message, allowing them to see what<br>they sent even if others cannot.</div><div><br></div><div>This collaboration between the two classes results in<br>a comprehensive mute/unmute feature where commands are processed, and the mute list is<br>managed in the <b>ServerThread.java</b> class, while the actual handling of message broadcasting to<br>muted users is implemented in the <b>Room.java</b> class.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Adiat16/maa-IT114-005/pull/12">https://github.com/Adiat16/maa-IT114-005/pull/12</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone3/grade/maa" target="_blank">Grading</a></td></tr></table>