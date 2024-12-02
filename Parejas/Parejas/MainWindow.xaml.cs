using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Parejas
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    /// 

    public partial class MainWindow : Window
    {
        Button valor1;
        Button valor2;


        int intentos = 0;



        List<string> number = new List<string>()
    {
            "1","2","3","4","5","6","7","8",
            "1","2","3","4","5","6","7","8"

    };

        Random random = new Random();
        public MainWindow()
        {
            InitializeComponent();
            AssignIconsToSquares ();

        }
        private void AssignIconsToSquares()
        {

            foreach (Button control in gridPadre.Children)
            {
                Button iconButton = control as Button;
                if (iconButton != null)
                {
                    int randomNumber = random.Next(number.Count);
                    iconButton.Tag = (number[randomNumber]);

                    number.RemoveAt(randomNumber);
                }
            }
        }

        private void Click(object sender, RoutedEventArgs e)
        {
            comprobacion(sender);
        }

        public void comprobacion(object sender)
        {
            if (valor1 == null)
            {

                Button btn = sender as Button;
                valor1 = btn;
  
                valor1.Content = valor1.Tag;
                valor1.IsEnabled = false;
            }
            else if (valor1 != null && valor2 == null)
            {
                Button btn = sender as Button;
                valor2 = btn;
                valor2.Content = valor2.Tag;
            }

            if (valor1 != null && valor2 != null)
            {
                if (valor1.Tag.ToString().Equals(valor2.Tag.ToString()))
                {
                    MessageBox.Show("Acierto");


                    valor2.IsEnabled = false;
                    valor1.IsEnabled = false;
                    


                }
                else
                {
                    MessageBox.Show("Fallo");
                    valor1.IsEnabled = true;
                    valor1.Content = "Click!";
                    valor2.Content = "Click!";
                }
    
                valor1 = null;
                valor2 = null;
                intentos += 1;

                lbl_intentos.Content = "Numero De intentos: " + intentos;
            }
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            reset();
        }
 
    public void reset()
        {
           List<string> number_copy = new List<string>(){
            "1","2","3","4","5","6","7","8",
            "1","2","3","4","5","6","7","8"
    };

            valor1 = null;
            valor2 = null;

            foreach (Button control in gridPadre.Children)
            {
             

                Button iconButton = control as Button;
                
                if (iconButton != null)
                {
                    int randomNumber = random.Next(number_copy.Count);
                    iconButton.Tag = (number_copy[randomNumber]);

                    iconButton.IsEnabled = true;
                    number_copy.RemoveAt(randomNumber);
                    iconButton.Content = "Click!";
                }
                intentos = 0;
                lbl_intentos.Content = "Numero De intentos: " + intentos;
            }
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            reset();
        }
    }
}
