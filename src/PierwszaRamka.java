import javax.swing.*;
import java.awt.*;

public class PierwszaRamka {
    public static void main(String[] args) {
        JFrame ramka = new JFrame("Tytuł okna");
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(400,300);
//        ramka.pack(); // responsywne dopasowanie okna
        ramka.setVisible(true);
        ramka.setTitle("Moja pierwsza aplikacja desktopowa");
//        ramka.setLocation(500,500);
        ramka.setLocationRelativeTo(null); // wyświetla na środku ekranu
        ramka.setResizable(false); // blokowanie zmiany rozmiaru okna
        ramka.getContentPane().setBackground(Color.CYAN); // ustawienie koloru tła
        ramka.getContentPane().setBackground(new Color(250,80,80)); // definicja koloru tła
    }
}