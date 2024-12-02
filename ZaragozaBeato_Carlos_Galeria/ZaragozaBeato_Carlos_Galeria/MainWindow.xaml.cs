

using Microsoft.Win32;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Media.Imaging;

namespace ZaragozaBeato_Carlos_Galeria
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private DirectoryInfo _directory;
        List<Photo> listaFotos = new List<Photo>();
        List<string> listaUri = new List<string>();
        List<string> listaNombres = new List<string>();
        Photo pt;


        public MainWindow()
        {
            InitializeComponent();

            GetNames();
            GetInfo();
            lista.ItemsSource = listaFotos;
        }


        private void GetNames()
        {
            listaNombres.Add("Ferrari");
            listaNombres.Add("Red Bull");
            listaNombres.Add("Mercedes");
            listaNombres.Add("Renault");
            listaNombres.Add("McLaren");
        }
        public void GetImages(string ruta)
        {
            _directory = new DirectoryInfo(ruta);

            foreach (var f in _directory.GetFiles("*.jpg"))
            {
                listaUri.Add(f.FullName);
            }
        }

        public void GetInfo()
        {
            GetImages("images");
            for (int i =0; i < listaUri.Count; i++)
            {
                listaFotos.Add(new Photo()
                {
                    id = i,
                    imagePath = listaUri[i],
                    name = listaNombres[i]
                }); ;
            }
        }


        private void explore_Click(object sender, RoutedEventArgs e)
        {
            OpenFileDialog op = new OpenFileDialog();
            op.Title = "Select a picture";
            op.Filter = "JPEG Files (*.jpeg)|*.jpeg|PNG Files (*.png)|*.png|JPG Files (*.jpg)|*.jpg|GIF Files (*.gif)|*.gif";
            if (op.ShowDialog() == true)
            {
                Img.Source = new BitmapImage(new Uri(op.FileName));
            }
            pt = null;
            nombreImage.Content = "";
        }


        private void lista_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            int index = lista.SelectedIndex;

          pt= listaFotos.Where(val => val.id == index).ToList()[0];

            nombreImage.Content = pt.name;
            Img.Source = new BitmapImage(new Uri(pt.imagePath, UriKind.Absolute));
            
        }
    }
}
