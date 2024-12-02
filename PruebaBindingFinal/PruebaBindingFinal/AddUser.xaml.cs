using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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
using System.Windows.Shapes;

namespace PruebaBindingFinal
{
    /// <summary>
    /// Lógica de interacción para AddUser.xaml
    /// </summary>
    public partial class AddUser : Window
    {
        private ObservableCollection<User> items;
        private User usr;

        public AddUser(ObservableCollection<User> items, User usr)
        {
            InitializeComponent();
            this.items = items;
            this.usr = usr;
            cargarUser();

        }

        public void cargarUser()
        {
            if (usr != null)
            {
                newName.Text = usr.Name;
                newAge.Text = usr.Age+"";
                newMail.Text = usr.Mail;
                btnCrear.Content = "EDITAR";

            }
            else
            {
                btnCrear.Content = "CREAR";
            }       
        }

        private void btnCrearClick(object sender, RoutedEventArgs e)
        {
            if (usr!=null)
            {
                editar();
            }
            else
            {
                crear();
            }
            this.Close();

        }

        private void editar()
        {
            usr.Age = Int32.Parse(newAge.Text);
            usr.Name = newName.Text;
            usr.Mail = newMail.Text;
        }
        private void crear()
        {
            User new_usr = new User();

            new_usr.Id = items.Count + 1;
            new_usr.Name = newName.Text;
            new_usr.Age = Int32.Parse(newAge.Text);
            new_usr.Mail = newMail.Text;

            items.Add(new_usr);
        }
    }
}
