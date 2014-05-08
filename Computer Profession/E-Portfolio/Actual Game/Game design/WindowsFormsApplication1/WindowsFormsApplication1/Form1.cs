using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{

    public partial class Form1 : Form
    {
        int ship_traj, shell_traj;
        Boolean shelllive;


        public Form1()
        {
            InitializeComponent();
            this.KeyDown += new KeyEventHandler(OnKeyDown);

            
        }

        public void OnKeyDown(object sender, KeyEventArgs e)
        {
            

            if (e.KeyCode.ToString() == "A")
            {
                pictureBox1.Image = Image.FromFile("D:/Games development/Actual Game/galaga ship-left.jpg");
                pictureBox1.Left = pictureBox1.Left - 5;
                pictureBox1.Refresh();
                ship_traj = 1;

            }

            if (e.KeyCode.ToString() == "D")
            {
                pictureBox1.Image = Image.FromFile("D:/Games development/Actual Game/galaga ship-right.jpg");
                pictureBox1.Left = pictureBox1.Left + 5;
                pictureBox1.Refresh();
                ship_traj = 2;

            }

            if (e.KeyCode.ToString() == "S")
            {
                pictureBox1.Image = Image.FromFile("D:/Games development/Actual Game/galaga ship-down.jpg");
                pictureBox1.Top = pictureBox1.Top + 5;
                pictureBox1.Refresh();
                ship_traj = 3;
            }

            if (e.KeyCode.ToString() == "W")
            {
                pictureBox1.Image = Image.FromFile("D:/Games development/Actual Game/galaga-ship.jpg");
                pictureBox1.Top = pictureBox1.Top - 5;
                pictureBox1.Refresh();
                ship_traj = 4;
            }

            if (e.KeyCode.ToString() == "F")
            {
                firing();
            }

            DirectWall();
        }

        private void firing()
        {
            shelllive = true;
            set_trajectory();
        }

        private void set_trajectory()
        {
            if (ship_traj == 1)
            {
                pictureBox2.Left = pictureBox1.Left;
                pictureBox2.Top = pictureBox1.Top + (pictureBox1.Width / 2);
                shell_traj = 1;
            }

            if (ship_traj == 2)
            {
                pictureBox2.Left = pictureBox1.Left + pictureBox1.Width;
                pictureBox2.Top = pictureBox1.Top + (pictureBox1.Height / 2);
                shell_traj = 2;
            }

            if (ship_traj == 3)
            {
                pictureBox2.Left = pictureBox1.Left + (pictureBox1.Width/2);
                pictureBox2.Top = pictureBox1.Top + pictureBox1.Height;
                shell_traj = 3;
            }

            if (ship_traj == 4)
            {
                pictureBox2.Left = pictureBox1.Left + (pictureBox1.Width / 2);
                pictureBox2.Top = pictureBox1.Top;
                shell_traj = 4;
            }
        }


        private void initialisefiring()
        {
            pictureBox2.Left = -100;
            pictureBox2.Top = -100;

            shell_traj = 0;
            shelllive = false;
        }
            public void DirectWall()
            {
                if (pictureBox1.Left <=0)
                    pictureBox1.Left = pictureBox1.Left + 20;
                    pictureBox1.Refresh();
                if (pictureBox1.Left >= (this.Width - pictureBox1.Width))
                    pictureBox1.Left = pictureBox1.Left - 20;
                    pictureBox1.Refresh();

                if (pictureBox1.Top <=0)
                    pictureBox1.Top = pictureBox1.Top + 20;
                    pictureBox1.Refresh();
                if (pictureBox1.Top >= (this.Height - pictureBox1.Height - pictureBox1.Height))
                    pictureBox1.Top = pictureBox1.Top - 20;
                    pictureBox1.Refresh();

                    
            }

        public void MoveShell()
            {
                if (shelllive == true)
                {
                    if (shell_traj == 1)
                    { pictureBox2.Left = pictureBox2.Left - 5; }
                }

                {
                    if (shell_traj == 2)
                    { pictureBox2.Left = pictureBox2.Left + 5; }
                }

                {
                    if (shell_traj == 3)
                    { pictureBox2.Top = pictureBox2.Top + 5; }
                }

                {
                    if (shell_traj == 4)
                    { pictureBox2.Top = pictureBox2.Top - 5; }
                }

                
            }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
        
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            MoveShell();

            pictureBox3.Left = pictureBox3.Left + 1;

            
            
            if ((pictureBox3.Left < 0) || (pictureBox3.Left > this.Width) || (pictureBox3.Top > this.Height) || (pictureBox3.Top < 0))
            {
                shelllive = false;
                timer1.Enabled = false;
                pictureBox3.Left = -100;
                pictureBox3.Top = -100;
            }
               
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
           
        }
            

           

           
        }

}
        

        




    

