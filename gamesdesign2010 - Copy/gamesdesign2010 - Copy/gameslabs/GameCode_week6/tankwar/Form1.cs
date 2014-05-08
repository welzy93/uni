using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Runtime.InteropServices;


namespace tankwar
{
    public partial class tankform : Form
    {

         int p1Shelltraj = 0;
         Boolean p1shelllive = false;
        int P1Tank_traj = 1;

       [DllImport("winmm.dll")]
        private static extern bool PlaySound(string lpszName, int hModule, int dwFlags);
        string soundfileName = "H:/programmerDevJava/GamesLabs/kaboom.wav";

        string path = "H:/programmerDevJava/GamesLabs/";
        private System.ComponentModel.IContainer components = null;
        public tankform()
        {
            InitializeComponent();
            this.KeyDown += new KeyEventHandler(OnKeyDown);

        }


        private void tankform_Load(object sender, EventArgs e)
        {
            InitialiseP1Firing();
        }



        public void OnKeyDown(object sender, KeyEventArgs e)
        {
            //code for tank 1
            if (e.KeyCode.ToString() == "A")
            {
                pictureBox1.Image = Image.FromFile(path + "TANK1.BMP");
                pictureBox1.Left = pictureBox1.Left - 5;
                pictureBox1.Refresh();
                P1Tank_traj = 1;


            }
            if (e.KeyCode.ToString() == "D")
            {
                pictureBox1.Image = Image.FromFile(path + "TANK2.BMP");
                pictureBox1.Left = pictureBox1.Left + 5;
                pictureBox1.Refresh();
                P1Tank_traj = 2;
            }

            if (e.KeyCode.ToString() == "W")
            {
                pictureBox1.Image = Image.FromFile(path + "TANK4.BMP");
                pictureBox1.Top = pictureBox1.Top - 5;
                pictureBox1.Refresh();
                P1Tank_traj = 3;

            }
            if (e.KeyCode.ToString() == "S")
            {
                pictureBox1.Image = Image.FromFile(path + "TANK3.BMP");
                pictureBox1.Top = pictureBox1.Top + 5;
                pictureBox1.Refresh();
                P1Tank_traj = 4;

            }

            //tank1 firing

            if (e.KeyCode.ToString() == "Q")
            {

                P1Firing();
            }



            //tank2 insert code

            if (e.KeyCode.ToString() == "Up")
            {
                pictureBox2.Image = Image.FromFile(path + "TANK4.BMP");
                pictureBox2.Top = pictureBox2.Top - 5;
                pictureBox2.Refresh();

            }
            if (e.KeyCode.ToString() == "Down")
            {
                pictureBox2.Image = Image.FromFile(path + "TANK3.BMP");
                pictureBox2.Top = pictureBox2.Top + 5;
                pictureBox2.Refresh();

            }

            if (e.KeyCode.ToString() == "Left")
            {
                pictureBox2.Image = Image.FromFile(path + "TANK1.BMP");
                pictureBox2.Left = pictureBox2.Left - 5;
                pictureBox2.Refresh();

            }
            if (e.KeyCode.ToString() == "Right")
            {
                pictureBox2.Image = Image.FromFile(path + "TANK2.BMP");
                pictureBox2.Left = pictureBox2.Left + 5;
                pictureBox2.Refresh();

            }

            DetectWall();

        }




        public void DetectWall()
        {

            if (pictureBox1.Left <= 0)
                pictureBox1.Left = pictureBox1.Left + 20;
            pictureBox1.Refresh();
            if (pictureBox1.Left >= (this.Width - pictureBox1.Width))
                pictureBox1.Left = pictureBox1.Left - 50;
            pictureBox1.Refresh();

            if (pictureBox1.Top <= 0)
                pictureBox1.Top = pictureBox1.Top + 20;
            pictureBox1.Refresh();

            if (pictureBox1.Top >= this.Height - pictureBox1.Height)
                pictureBox1.Top = pictureBox1.Top - 50;
            pictureBox1.Refresh();
        }



        private void InitialiseP1Firing()
        {

            pictureBox3.Left= -100;
            pictureBox3.Top= -100;

            p1Shelltraj = 0;
            p1shelllive = false;
        }

        private void P1Firing()
        {
            timer1.Enabled = true;
            PlaySound(soundfileName, 0, 1);
            p1shelllive = true;
            SET_TRAJECTORY();
            

          
        }


        private void SET_TRAJECTORY()
        {
           
            if (P1Tank_traj == 1)
            {

                pictureBox3.Left = pictureBox1.Left;
                pictureBox3.Top= pictureBox1.Top + (pictureBox1.Height / 2);
                p1Shelltraj = 1;

            }

            if (P1Tank_traj == 2)
            {
                pictureBox3.Left=pictureBox1.Left + pictureBox1.Width;
                pictureBox3.Top=pictureBox1.Top + (pictureBox1.Height / 2);
                p1Shelltraj = 2;
            }

            if (P1Tank_traj == 3)
            {
                pictureBox3.Left = pictureBox1.Left + (pictureBox1.Width / 2);
                pictureBox3.Top = pictureBox1.Top;
                p1Shelltraj = 3;
            }

            if (P1Tank_traj == 4)
            {
                pictureBox3.Left = pictureBox1.Left + (pictureBox1.Width / 2);
                pictureBox3.Top = pictureBox1.Top + pictureBox1.Height;
                
                p1Shelltraj = 4;

            }
        }


        private void timer1_Tick(object sender, EventArgs e)
        {
            MoveShell();
        }

        private void MoveShell()
	{
		if (p1shelllive == true)
		{
			if (p1Shelltraj == 1)
            {
                pictureBox3.Left = pictureBox3.Left - 5;
            }

            if (p1Shelltraj == 2)
            {
                pictureBox3.Left = pictureBox3.Left + 5;
            }

            if (p1Shelltraj == 3)
            {
                pictureBox3.Top = pictureBox3.Top - 5;
            }

            if (p1Shelltraj == 4)
            {
                pictureBox3.Top = pictureBox3.Top + 5;
            }


            if ((pictureBox3.Left < 0) || (pictureBox3.Left > this.Width) || (pictureBox3.Top > this.Height) || (pictureBox3.Top < 0))
            {
                p1shelllive = false;
                timer1.Enabled = false;
                pictureBox3.Left = -100;
                pictureBox3.Top = -100;
            }

            pictureBox3.Refresh();
		}
        }

       

       
    }
}