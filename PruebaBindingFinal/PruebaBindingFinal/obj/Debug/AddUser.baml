   M S B A M L   `   `   `  ����M  IPruebaBindingFinal, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null7 clr-namespace:PruebaBindingFinalPruebaBindingFinal  5   	        PruebaBindingFinal.AddUser   5   	   W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35^ ZWindowsFormsIntegration, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   2local clr-namespace:PruebaBindingFinal     5   	     � Title$  AddUser��5   	   $	��450��6   $	��800��6&    � 	Resources 5       �� 
TargetType   NewParametros �� Property �� Value��%  &	        '�� D    '��     �� 5   
   " ��6   .�5      ��  �@��TextWrapping$
 Wrap=�6-   �� 5       � �� �#F7F7F76+   �� 5       � ��$ 40��6'   �� 5       � �� �#393E466+   �� 5       � ��$ Center=�62   �� 5       � ��$ Center=�64   �� 5       � ��$	 500��6&   5      �� 5   
   " ��6   .�5      ��  � �� �#F7F7F76+   �� 5       � ��$
 Left=�64   �� 5       � ��$ Center=�62   �� 5       � ��$ 20(�6)   5      �� 5    
   " ��6   .�5"      ��  � �� �#F7F7F76+   �� 5#       � �� �#393E466+   �� 5$       � ��$
 Bold"�6+   �� 5%       � ��$ 30(�6)   �� 5&       � ��$ 100 10q�6'   5'      5,      .��51      � $	��Top=�6   ���#393E46$	��440��68   $��	0,0,2,-21q�6E    � RowDefinitions 52   
   �� 53      $
��110* �6   �� 54      $
��110* �6   �� 55      $
��110* �6   �� 56      $	��71* �6   �� 57      $	��40* �6    � ColumnDefinitions 59   
   �� 5:      .+�5<   
   �� -   5         ��Name$ newName��5<   9   #��[  6   $��0��6K   �� 5=   
   -   5        $ newAge��5=   9   #��[  6   $��1��6J   �� 5>   
   -   5        $ newMail��5>   9   #��[  6   $��2��6J   �� 5@   
   $��User: ��6   $��0��6!   �� 5A   
   $��Age: ��6   $��1��6    �� 5B   
   $��Email: ��6   $��2��6"   �� 5D   
   -   5         ��Name$ btnCrear��5D      $��Crear��6#   $��3��63   6@   5E      5G      