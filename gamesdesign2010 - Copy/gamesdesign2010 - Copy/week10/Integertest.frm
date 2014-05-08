VERSION 5.00
Object = "{F5BE8BC2-7DE6-11D0-91FE-00C04FD701A5}#2.0#0"; "AgentCtl.dll"
Begin VB.Form IntegerExam 
   BackColor       =   &H0080C0FF&
   BorderStyle     =   0  'None
   Caption         =   "Form2"
   ClientHeight    =   7200
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   9600
   LinkTopic       =   "Form2"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   7200
   ScaleWidth      =   9600
   ShowInTaskbar   =   0   'False
   WindowState     =   2  'Maximized
   Begin VB.CommandButton Command3 
      BackColor       =   &H00C0FFFF&
      Caption         =   "End Program"
      Height          =   255
      Left            =   5640
      Style           =   1  'Graphical
      TabIndex        =   27
      Top             =   4320
      Width           =   2535
   End
   Begin VB.CommandButton Command5 
      BackColor       =   &H00C0E0FF&
      Caption         =   "Check Answer"
      Height          =   255
      Left            =   5640
      Style           =   1  'Graphical
      TabIndex        =   25
      Top             =   3840
      Width           =   2535
   End
   Begin VB.CommandButton Command4 
      BackColor       =   &H00C0E0FF&
      Caption         =   "Repeat instructions"
      Height          =   255
      Left            =   5640
      Style           =   1  'Graphical
      TabIndex        =   24
      Top             =   4080
      Width           =   2535
   End
   Begin VB.TextBox Text2 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   6360
      TabIndex        =   0
      Text            =   "        "
      Top             =   1560
      Width           =   1215
   End
   Begin VB.TextBox Text3 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   6360
      TabIndex        =   1
      Text            =   "        "
      Top             =   2040
      Width           =   1215
   End
   Begin VB.TextBox Text4 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   6360
      TabIndex        =   2
      Text            =   "        "
      Top             =   2520
      Width           =   1215
   End
   Begin VB.TextBox Text5 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   6360
      TabIndex        =   3
      Text            =   "        "
      Top             =   3000
      Width           =   1215
   End
   Begin VB.CommandButton Command1 
      BackColor       =   &H00C0E0FF&
      Caption         =   "Operate Instruction"
      Height          =   255
      Left            =   1920
      MaskColor       =   &H0000FF00&
      Style           =   1  'Graphical
      TabIndex        =   12
      Top             =   6120
      UseMaskColor    =   -1  'True
      Visible         =   0   'False
      Width           =   1815
   End
   Begin VB.TextBox Text6 
      ForeColor       =   &H80000007&
      Height          =   495
      Left            =   480
      TabIndex        =   11
      Text            =   "Text6"
      Top             =   1080
      Width           =   3015
   End
   Begin VB.TextBox Text7 
      Height          =   495
      Left            =   480
      TabIndex        =   10
      Text            =   "Text7"
      Top             =   1560
      Width           =   3015
   End
   Begin VB.TextBox Text8 
      Height          =   495
      Left            =   480
      TabIndex        =   9
      Text            =   "Text8"
      Top             =   2040
      Width           =   3015
   End
   Begin VB.TextBox Text9 
      Height          =   495
      Left            =   480
      TabIndex        =   8
      Text            =   "Text9"
      Top             =   2520
      Width           =   3015
   End
   Begin VB.TextBox Text10 
      Height          =   495
      Left            =   480
      TabIndex        =   7
      Text            =   "Text10"
      Top             =   3000
      Width           =   3015
   End
   Begin VB.TextBox Text11 
      Height          =   495
      Left            =   480
      TabIndex        =   6
      Text            =   "Text11"
      Top             =   3480
      Width           =   3015
   End
   Begin VB.TextBox Text12 
      Height          =   495
      Left            =   480
      TabIndex        =   5
      Text            =   "Text12"
      Top             =   3960
      Width           =   3015
   End
   Begin VB.CommandButton Command2 
      BackColor       =   &H00C0E0FF&
      Caption         =   "RESET"
      Height          =   255
      Left            =   1080
      Style           =   1  'Graphical
      TabIndex        =   4
      Top             =   6120
      Visible         =   0   'False
      Width           =   855
   End
   Begin VB.Label Label11 
      BackColor       =   &H0080C0FF&
      Caption         =   "Declarations"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00C00000&
      Height          =   495
      Left            =   6840
      TabIndex        =   26
      Top             =   4680
      Width           =   2175
   End
   Begin VB.Label Label2 
      BackColor       =   &H0080C0FF&
      Caption         =   "               A"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   5040
      TabIndex        =   23
      Top             =   1560
      Width           =   1215
   End
   Begin VB.Label Label3 
      BackColor       =   &H0080C0FF&
      Caption         =   "              B    "
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   5040
      TabIndex        =   22
      Top             =   2040
      Width           =   1215
   End
   Begin VB.Label Label4 
      BackColor       =   &H0080C0FF&
      Caption         =   "               C"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   5040
      TabIndex        =   21
      Top             =   2520
      Width           =   1215
   End
   Begin VB.Label Label5 
      BackColor       =   &H0080C0FF&
      Caption         =   "               D"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   5040
      TabIndex        =   20
      Top             =   3000
      Width           =   1215
   End
   Begin VB.Label Label8 
      BackColor       =   &H0080C0FF&
      Caption         =   "       Value"
      Height          =   255
      Left            =   6360
      TabIndex        =   19
      Top             =   1320
      Width           =   1215
   End
   Begin VB.Label Label9 
      BackColor       =   &H0080C0FF&
      Caption         =   "Memory Address"
      Height          =   255
      Left            =   5160
      TabIndex        =   18
      Top             =   1320
      Width           =   1215
   End
   Begin VB.Label Label7 
      BackColor       =   &H0080C0FF&
      Caption         =   "Program Statements"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   720
      TabIndex        =   17
      Top             =   720
      Width           =   2655
   End
   Begin VB.Label Label10 
      BackColor       =   &H0080C0FF&
      Caption         =   "Simulated  Memory"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   5280
      TabIndex        =   16
      Top             =   840
      Width           =   2535
   End
   Begin VB.Label Label6 
      BackStyle       =   0  'Transparent
      Caption         =   "The Integer Data Type And  Assignment"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FF0000&
      Height          =   495
      Index           =   0
      Left            =   1320
      TabIndex        =   15
      Top             =   0
      Width           =   6615
   End
   Begin AgentObjectsCtl.Agent Agent1 
      Left            =   4080
      Top             =   3000
   End
   Begin VB.Label Label12 
      BackColor       =   &H0080C0FF&
      Caption         =   "int"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00C00000&
      Height          =   375
      Left            =   6720
      TabIndex        =   14
      Top             =   5520
      Width           =   495
   End
   Begin VB.Label Label19 
      BackColor       =   &H0080C0FF&
      Caption         =   "A , B, C, D;"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   7320
      TabIndex        =   13
      Top             =   5520
      Width           =   1815
   End
End
Attribute VB_Name = "IntegerExam"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim I As Integer
Dim Merlin As IAgentCtlCharacterEx
Dim MerlinHeight As Single
Dim MerlinWidth As Single
Dim nwidth As Single
Dim nheight As Single
Dim AnswersRight As Integer
Dim merlinrequest



Private Sub Command3_Click()
End
End Sub

Private Sub Command5_Click()

Merlin.StopAll

Dim mystring As String
If Trim(Text2.Text) = "8" Then
AnswersRight = AnswersRight + 1
End If
If Trim(Text3.Text) = "2" Then
AnswersRight = AnswersRight + 1
End If
If Trim(Text4.Text) = "4" Then
AnswersRight = AnswersRight + 1
End If
If Trim(Text5.Text) = "32" Then
AnswersRight = AnswersRight + 1
End If
Merlin.Play ("Blink")
mystring = "You have answered " & AnswersRight & " " & "Correctly"
 Merlin.Speak mystring
If AnswersRight < 4 Then
'Merlin.Wait MerlinRequest
'Merlin.StopAll
Command1.Visible = True
Command2.Visible = True


I = 4
Command1_Click

Else

Merlin.Play ("Pleased")
 Merlin.Speak ("That is excellent, well done, I think you can move on now.")
End If

End Sub





Private Sub MoveObject(first As Integer, second As Integer)
Dim a As Integer, b As Integer

wide = first * nwidth
length = second * nheight

Merlin.MoveTo wide, length, 250
End Sub
Public Sub setForm()
Dim icontrol As Object

nheight = Screen.Height / IntegerExam.Height
nwidth = Screen.Width / IntegerExam.Width


IntegerExam.Height = Screen.Height
IntegerExam.Width = Screen.Width


IntegerExam.Left = 0
IntegerExam.Top = 0
For Each icontrol In Controls
If icontrol.Name = "Agent1" Or icontrol.Name = "IntegerExam" Then
  'do nothing
 Else
  icontrol.Height = icontrol.Height * nheight
 icontrol.Width = icontrol.Width * nwidth
 icontrol.Left = icontrol.Left * nwidth
 icontrol.Top = icontrol.Top * nheight
icontrol.Font.Size = Int(icontrol.Font.Size * nheight)
 End If

Next

End Sub
Private Sub Command1_Click()
'Merlin.StopAll
'Command4.Visible = False
Command5.Visible = False
I = I + 1
Select Case I
Case 5
Merlin.Play ("Explain")
Merlin.Speak ("Since you did not get them all right I will explain further how the code would execute.")
MoveObject 150, 326
Merlin.Play ("gesturedown")
Merlin.Speak ("The operate instruction button, you see at the bottom left of your screen, when clicked on will operate one instruction.")
Merlin.Speak ("Please click on the operate instruction button and I will begin by explaining the first line of code.")
Merlin.Play ("blink")
Merlin.Speak ("If you wish me to go over the whole thing again click on the reset button.")
  


  Case 6
   Merlin.StopAll
   MoveObject 262, 52
    Merlin.Play ("GestureRight")
    Text6.BackColor = &HFFFF00
    Text2.Text = "        3"
       Merlin.Speak " In the first line of code that is executed the area of memory that has A as its address is assigned the value 3"
     
     MoveObject 516, 90
    Merlin.Play ("GestureRight")
    Merlin.Speak " So A now contains the value of 3"
    Merlin.Play ("Blink")
    Merlin.Speak ("Click on the Operate Instruction button for the second line of code to be explained.")
        Merlin.Play ("Blink")
                
 
   Case 7
   Merlin.StopAll
   MoveObject 262, 82
    Merlin.Play ("GestureRight")
    Merlin.Speak (" B is assigned the value 2.")
    Text7.BackColor = &HFFFF00
    Text3.Text = "        2"
   
    MoveObject 516, 120
    Merlin.Play ("GestureRight")
    Merlin.Speak ("So the area of memory that B identifies is assigned the value 2.")
      Merlin.Play ("Blink")
    Merlin.Speak ("Please click on the Operate Instruction button for the third line of code when you are ready and I will explain.")
    
    Case 8
      Merlin.StopAll
    MoveObject 262, 122
    Merlin.Play ("GestureRight")
    Text8.BackColor = &HFFFF00
    Text4.Text = "        1"
     Merlin.Speak "This time the value held in B is subtracted from the value held in A and the result is assigned to the area of memory addressed by C."
   MoveObject 516, 150
    Merlin.Play ("GestureRight")
    Merlin.Speak ("So C is assigned the value 1.")
      Merlin.Play ("Blink")
    
    Merlin.Speak ("Please click on the again on the operate instruction button for the next line of code .")
    
    Case 9
      Merlin.StopAll
    MoveObject 262, 157
    Merlin.Play ("GestureRight")
    Text9.BackColor = &HFFFF00
    Text5.Text = "        3"
    Merlin.Speak "The values of A and C are Multiplied and the result assigned to D."
       MoveObject 516, 180
    Merlin.Play ("GestureRight")
    Merlin.Speak ("D is therefore assigned the value 3")
      Merlin.Play ("Blink")
    
 Merlin.Speak ("Please click on the Operate Instruction button for the next line of code .")
    Case 10
      Merlin.StopAll
    MoveObject 262, 197
    Merlin.Play ("GestureRight")
    Text10.BackColor = &HFFFF00
    Text2.Text = "        8"
    Merlin.Speak "A is assigned the value 8"
    MoveObject 516, 90
    Merlin.Play ("GestureRight")
    Merlin.Speak ("So the value that was in A is overwritten and there is now 8 in this data store.")
      Merlin.Play ("Blink")
    
    Merlin.Speak ("Please click on the Operate Instruction button for the next line of code .")
    Case 11
      Merlin.StopAll
    MoveObject 262, 230
    Merlin.Play ("GestureRight")
    Text11.BackColor = &HFFFF00
    Text4.Text = "        4"
    Merlin.Speak "C is assigned the value 4"
    MoveObject 516, 150
    Merlin.Play ("GestureRight")
    Merlin.Speak ("You can see this assignment reflected here in memory.")
      Merlin.Play ("Blink")
    Merlin.Speak ("Please click on the Operate Instruction button now and I will explain the last line of code.")
    
    Case 12
      Merlin.StopAll
    MoveObject 262, 260
    Merlin.Play ("GestureRight")
    Text12.BackColor = &HFFFF00
    Text5.Text = "       32"
    Merlin.Speak "The values of A and C are multiplied and the result stored in D."
         MoveObject 516, 180
    Merlin.Play ("GestureRight")
   Merlin.Speak ("So finally 32 is assigned to D.")
     Merlin.Play ("Blink")
   
   Merlin.Speak ("Please click either the end button to exit or the reset button and I shall explain this code again.")
   End Select
End Sub

Private Sub Command2_Click()
Merlin.StopAll
Merlin.Play ("Blink")
Merlin.Speak ("Ok, we will begin again. Please click on operate instruction and I shall start explaining again.")
I = 5
  Text6.BackColor = &H80000005
    Text7.BackColor = &H80000005
      Text8.BackColor = &H80000005
        Text9.BackColor = &H80000005
          Text10.BackColor = &H80000005
            Text11.BackColor = &H80000005
              Text12.BackColor = &H80000005
     Text2.Text = ""
     Text3.Text = ""
     Text4.Text = ""
     Text5.Text = ""
End Sub


Private Sub Command4_Click()
Merlin.StopAll

Merlin_Explain
End Sub

Private Sub Form_Load()
I = 5
AnswersRight = 0
Totalscore = 0
Text6.FontSize = 12
Text7.FontSize = 12
Text8.FontSize = 12
Text9.FontSize = 12
Text10.FontSize = 12
Text11.FontSize = 12
Text12.FontSize = 12
Text6.Text = " A = 3;"
Text7.Text = " B = 2;"
Text8.Text = " C = A - B;"
Text9.Text = " D = A * C;"
Text10.Text = " A = 8;"
Text11.Text = " C = 4;"
Text12.Text = " D = A*C;"
Agent1.Characters.Load "Merlin", "Merlin.acs"
    Set Merlin = Agent1.Characters("Merlin")
    Merlin.LanguageID = &H409
    setForm
  Merlin_Explain
End Sub

Private Sub Merlin_Explain()

   Merlin.Show
         MoveObject 326, 350

    Merlin.Play ("Gestureleft")
Merlin.Speak ("Here you can see the declarations necessary to create these variables in memory.")
 Merlin.Speak ("A,B,C and D are all declared as integers.")

   Merlin.Speak ("This statement creates the data stores, we can insert whole number values into these.")
   MoveObject 326, 200
    Merlin.Play ("Gestureleft")
    Merlin.Speak ("To my left you can see the data stores that these identifiers address.")
    

    Merlin.Play ("Gestureright")
    Merlin.Speak ("To my right here you can see a list of program assignment statements in Java.")
       Merlin.Play ("Blink")
       Merlin.Speak ("Please insert the values that you think the identifiers will take after the code has executed.")
    Merlin.Speak ("You can move between the data stores by using the tab key or clicking inside with. ")

   MoveObject 300, 350
    Merlin.Speak ("I will wait here until you are ready to have your answers checked.")
      Merlin.Speak (" After completion  select the Check Answer button to and I will check your answer.")
      
    
   

End Sub

Private Sub fail()
 'Merlin.Play ("GestureLeft")
    
    
  'Merlin.Play ("GestureDown")
  ' Merlin.Speak ("To execute each instruction simply click on the button below marked Operate Instruction.")
   'Merlin.Speak ("This will operate one statement at a time.")
   'Merlin.Play ("Blink")

 
     'Moveobject 326, 150
    '  Merlin.Play ("GestureDown")
'Merlin.Speak ("When you are ready click the Operate Instruction Button , and I will explain what is happening with each line of code, and the assignment to the variables.")
  
End Sub


