import javax.swing.*;
import java.awt.*;

public class PierwszaRamka {
    public static void main(String[] args) {
        // inicjalizacja okna i nadanie tytułu
        JFrame ramka = new JFrame("Tytuł okna");
        // definiujemy, w jaki sposób działa przycisk zamykania okna
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ustalamy wielkość okna (szerokość, wysokość)
        ramka.setSize(400,300);
        // zamiast tego mogę spakować okna, dopasować wielkość okna do jego zawartości
//        ramka.pack(); // responsywne dopasowanie okna
        // dopiero po wydaniu polecenia setVisible(true); okno staje się widoczne
        ramka.setVisible(true);
        // można zmienić tytuł okna
        ramka.setTitle("Moja pierwsza aplikacja desktopowa");
        // można zmienić położenie okna względem górnego lewego rogu ekranu
//        ramka.setLocation(500,500);
        // albo ustawić okno na środku ekranu
        ramka.setLocationRelativeTo(null); // wyświetla na środku ekranu
        // można zablokować zmianę wielkości okna
        ramka.setResizable(false); // blokowanie zmiany rozmiaru okna
        // można ustawić kolor tła z predefiniowanych stałych
        ramka.getContentPane().setBackground(Color.CYAN); // ustawienie koloru tła
        // albo zdefiniować włąsny kolor tła
        ramka.getContentPane().setBackground(new Color(250,80,80)); // definicja koloru tła
    }
}