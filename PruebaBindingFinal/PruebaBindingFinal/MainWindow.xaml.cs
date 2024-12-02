using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Drawing.Printing;
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

namespace PruebaBindingFinal
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        //// private ObservableCollection<User> users = new ObservableCollection<User>();
        private ObservableCollection<User> items = new ObservableCollection<User>();
        private User current_usr = null; 


        public MainWindow()
        {
            InitializeComponent();

            items.Add(new User() { Id = 1, Name = "John Doe", Age = 42, Mail = "john@doe-family.com" });
            items.Add(new User() { Id = 2, Name = "Jane Doe", Age = 39, Mail = "jane@doe-family.com" });
            items.Add(new User() { Id = 3, Name = "Sammy Doe", Age = 7, Mail = "sammy.doe@gmail.com" });
            lvUsers.ItemsSource = items;
            lvUsers.SelectionMode = SelectionMode.Single;

            

        }

        private void btnAddUser_Click(object sender, RoutedEventArgs e)
        {
            User usr1=  (new User() { Name = "New user", Age = 20, Mail="noname@nowhere.com" });

            AddUser add_user = new AddUser(items, current_usr);

            add_user.Show();

        }

        private void btnChangeUser_Click(object sender, RoutedEventArgs e)
        {
            if (lvUsers.SelectedItem != null)
            {
                MessageBox.Show("Cambiando " + (lvUsers.SelectedItem as User).ToString());

               User usr = (lvUsers.SelectedItem as User);

                string nombre = newName.Text.Length == 0 ? usr.Name : newName.Text;
                string email = newMail.Text.Length == 0 ? usr.Mail : newMail.Text;
                int edad = newAge.Text.Length == 0 ? usr.Age : Convert.ToInt32(newAge.Text);

                usr.Age = edad;
                usr.Mail = email;
                usr.Name = nombre;
            }
             
        }

        private void btnDeleteUser_Click(object sender, RoutedEventArgs e)
        {
            if (lvUsers.SelectedItem != null)
            {
                items.Remove(lvUsers.SelectedItem as User);
                reset();
            }
             
        }

        private void AccionSelectionChanged(object sender, SelectionChangedEventArgs e)
        {

            if (lvUsers.SelectedItem != null)
            {

                User usr = lvUsers.SelectedItem as User;
                lbActual.Content = lvUsers.SelectedItem.ToString();
                newName.Text = usr.Name;
                newAge.Text = usr.Age + "";
                newMail.Text = usr.Mail;

                current_usr = usr;
            }


         
        }



        private void btnUnselectUser_Click(object sender, RoutedEventArgs e)
        {
            lvUsers.SelectedItem = null;
            current_usr = null;
            reset();
        }

        private void reset()
        {
            newAge.Text = "";
            newMail.Text = "";
            newName.Text = "";
        }
    }

    public class User : INotifyPropertyChanged
    {
        private string name;
        private int age;
        private string mail;
        private int id;

        public int Id
        {
            get { return this.id; }
            set { this.id = value; }
        }

        public string Name
        {
            get { return this.name; }
            set
            {
                if (this.name != value)
                {
                    this.name = value;
                    this.NotifyPropertyChanged("Name");
                }
            }
        }
        public int Age {
            get { return this.age; }
            set
            {
                if (this.age != value)
                {
                    this.age = value;
                    this.NotifyPropertyChanged("Age");
                }
            }
        }

        public string Mail {
            get { return this.mail; }
            set
            {
                if (this.mail != value)
                {
                    this.mail = value;
                    this.NotifyPropertyChanged("Mail");
                }
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public void NotifyPropertyChanged(string propName)
        {
            if (this.PropertyChanged != null)
                this.PropertyChanged(this, new PropertyChangedEventArgs(propName));
        }

        override public string ToString() {
            return (name + ", "+Convert.ToString(age)+": "+mail);
        }
    }

}
