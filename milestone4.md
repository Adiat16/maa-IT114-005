<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Mohammed Adiat (maa)</td></tr>
<tr><td> <em>Generated: </em> 12/14/2023 2:41:34 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone4/grade/maa" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T17.09.55image.png.webp?alt=media&token=e4571d4a-23f2-4ec7-a8a9-2ca5684df578"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays a &quot;Export Chat History&quot; button. Once selected, the chat history<br>is then exported to a .txt file with a path that is displayed<br>in the second split terminal.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T17.13.59image.png.webp?alt=media&token=add7edbc-8a29-4f3b-ad1c-889e6a119f6d"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays a &quot;Export Chat History&quot; button. Once selected, the chat history<br>is then exported to a .txt file with a path that is displayed<br>in the terminal. We are able to see that the chat history is<br>indeed exported to a .txt file with html tags, and there is a<br>button that is displayed for the user to select in order for the<br>chat history to be exported.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <div><b>ChatPanel.java:</b><br>A new method named <b>exportChatHistory </b>has been added to handle the export of<br>chat history. This method uses a <b>JFileChooser</b> to prompt the user to choose<br>a location and filename for saving the chat history. The method iterates through<br>the existing chat messages, appends them to a <b>StringBuilder</b>, and writes the content<br>to a text file. The exported file is saved with a timestamp in<br>the user's home directory. Additionally, a new button labeled "Export Chat History" has<br>been added to the UI, and clicking this button triggers the export functionality.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T18.07.56image.png.webp?alt=media&token=b38c7eb2-5bdd-4d80-b221-90a212d10f1b"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot illustrates the server-side persistence of the client&#39;s mute list. The mute<br>list is stored in a plaintext file, capturing usernames as separate lines, ensuring<br>its persistence across server sessions.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T18.07.16image.png.webp?alt=media&token=b8f3e678-1041-47ca-8e15-447f88ce0843"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the saveMuteListToFile &amp; loadMuteListFromFile methods. The saveMuteListToFile is responsible for<br>saving the mute list to a file. It iterates through the mute list<br>and writes each username to a file. The loadMuteListFromFile method is responsible for<br>loading the mute list from a file. It reads each line from the<br>file and adds it to the mute list.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <div>I implemented the saving logic by creating a method, <b>saveMuteListToFile</b>, which uses a<br><b>BufferedWriter </b>to write each muted username from the <b>muteList </b>to a file named<br>after the client's name with the "_mute_list.txt" suffix. For loading, the <b>loadMuteListFromFile </b>method<br>utilizes a <b>BufferedReader </b>to read the usernames from the file associated with the<br>client's name and populates the <b>muteList </b>accordingly. Both methods are called during the<br>initialization of a <b>ServerThread </b>instance to ensure persistence and retrieval of the mute<br>list across server sessions.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T18.40.55image.png.webp?alt=media&token=e60f179d-20f0-4326-aa2f-e7f507f8883c"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays two users: test2 &amp; test4. In this screenshot, we see<br>test2 muting and unmuting test4 by utilizing /mute &amp; /unmute. As a result,<br>test2 sees a message in his/her room lobby stating that test4, which is<br>the user that he/she has attempted to mute and unmute, has been muted<br>and unmuted. We also see test4 receiving multiple messages in his/her room lobby<br>stating that he/she has been muted by test2.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T18.59.47image.png.webp?alt=media&token=9905a690-b371-40fd-9c84-c0f52ef1d2bd"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the code snippet relevant to the unmute message that the<br>unmuted user receives. This line of code is written inside of processUnmuteCommand.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T19.00.05image.png.webp?alt=media&token=4ff06c3f-aae4-45c6-a616-c51c18ea476f"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the code snippet relevant to the mute message that the<br>muted user receives. This line of code is written inside of processMuteCommand.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <div>I modified the <b>processMuteCommand </b>and <b>processUnmuteCommand </b>methods in the <b>Room.java</b> file to send<br>messages to both the sender and the target user when muting or unmuting<br>actions occur. The messages inform the users about being muted or unmuted and<br>include the name of the user who performed the action. This ensures clear<br>communication within the chat room regarding mute and unmute events.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T19.16.53image.png.webp?alt=media&token=2a1dff70-2eec-4fc8-b466-8557d2db2b2f"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays a list of muted and unmuted users appearing grayed out,<br>providing a clear indication of muted status for the specific client.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmaa%2F2023-12-14T19.26.12image.png.webp?alt=media&token=56527f8b-a0cc-419e-9f41-8d886dfac817"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot displays the highlighted user feature of the last person to send<br>a message, with different users showcased and muted users appropriately excluded.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <div>To implement the feature of updating the user list based on the status<br>of each user and highlighting the last person to send a message, several<br>modifications were made across multiple files. In <b>Room.java</b>, new <b>PayloadTypes </b>were introduced to<br>relay user status information, and the <b>sendConnectionStatus </b>method was extended to include user<br>status updates. Additionally, the <b>sendResetUserList </b>method was adapted to convey muted user information<br>specific to each client.<br></div><div><br></div><div>In <b>ServerThread.java</b>, methods for sending user-specific payloads, such as <b>sendConnectionStatus</b>,<br>were enhanced to accommodate the new <b>PayloadTypes</b>. The handling of muted users, including<br>loading and saving the mute list to a file, was integrated into the<br>existing methods.</div><div><br></div><div>For the client-side implementation, adjustments were made in <b>Client.java</b>, <b>ClientUI.java</b>, <b>ChatPanel.java</b>, and<br><b>UserListPanel.java</b>. The <b>processPayload </b>method in <b>Client.java</b> was expanded to handle the new <b>PayloadTypes<br></b>and update the user list accordingly. In the UI components, the <b>UserListPanel </b>now<br>displays muted users differently, such as in gray, and the last person to<br>send a message is highlighted in the chat window.</div><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone4/grade/maa" target="_blank">Grading</a></td></tr></table>