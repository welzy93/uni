using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace tankwar
{
    public partial class tankform : Form
    {
        private System.ComponentModel.IContainer components = null;
        public tankform()
        {
            InitializeComponent();
            this.KeyDown += new KeyEventHandler(OnKeyDown);

        }

        public void OnKeyDown(object sender, KeyEventArgs e)
        {
            //button1.Text = "hello";
            if (e.KeyCode.ToString() == "A")
            {
                pictureBox1.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK1.BMP");
                pictureBox1.Left = pictureBox1.Left - 5;
                pictureBox1.Refresh();


            }
            if (e.KeyCode.ToString() == "D")
            {
                pictureBox1.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK2.BMP");
                pictureBox1.Left = pictureBox1.Left + 5;
                pictureBox1.Refresh();

            }

            if (e.KeyCode.ToString() == "W")
            {
                pictureBox1.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK4.BMP");
                pictureBox1.Top = pictureBox1.Top - 5;
                pictureBox1.Refresh();

            }
            if (e.KeyCode.ToString() == "S")
            {
                pictureBox1.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK3.BMP");
                pictureBox1.Top = pictureBox1.Top + 5;
                pictureBox1.Refresh();

            }



            //tank2 insert code

            if (e.KeyCode.ToString() == "Up")
            {
                pictureBox2.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK4.BMP");

            }
            if (e.KeyCode.ToString() == "Down")
            {
                pictureBox2.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK3.BMP");

            }

            if (e.KeyCode.ToString() == "Left")
            {
                pictureBox2.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK1.BMP");

            }
            if (e.KeyCode.ToString() == "Right")
            {
                pictureBox2.Image = Image.FromFile("H:/programmerDevJava/GamesLabs/TANK2.BMP");

            }



        }

      

       
    }
}