package app;
import java.util.Scanner;
//import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dialogues {
    Scanner scan = new Scanner(System.in);
    String ph;//placeholder
    public void inicio(){
        clearTerminal();
        //inicio musica 1
        ImageIcon image1 = new ImageIcon(Dialogues.class.getResource("Images/castelloo.png"));
        JLabel labell = new JLabel();
        labell.setIcon(image1);
        labell.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(300, 300);
        frame1.setVisible(true);
        frame1.add(labell);
        
        //System.out.println(" ");
        System.out.println("\n\nExistia um Reino Chamado Racadon");
        System.out.println("Que Foi Dividido em 17 partes, que viraram");
        System.out.println("Reinos e Impérios");
        System.out.println("Tudo estava bem e os reinos prosperavam");
        System.out.println("todos estavam bem");
        System.out.println("[digite qualquer coisa para continuar]");
        ph = scan.nextLine();
        //fim da musica 1
        frame1.dispose();
        clearTerminal();

        //parte 2
        ImageIcon image2 = new ImageIcon(Dialogues.class.getResource("Images/shadowmago.png"));
        JLabel label = new JLabel();
        label.setIcon(image2);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(300, 300);
        frame2.setVisible(true);
        frame2.add(label);

        System.out.println("Porém, um malvado mago jogou uma praga contra a Joia do Poder");
        System.out.println("Ela que possuia poder para proteger o mundo de monstros");
        System.out.println("Agora nosso mundo está prestes a cair em guerras sem fim");
        System.out.println("[digite qualquer coisa para continuar]");
        ph = scan.nextLine();

        frame2.dispose();
        clearTerminal();

        //parte 3
        ImageIcon image3 = new ImageIcon(Dialogues.class.getResource("Images/maxwell.png"));
        JLabel label3 = new JLabel();
        label3.setIcon(image3);
        label3.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame3 = new JFrame();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 300);
        frame3.setVisible(true);
        frame3.add(label3);

        System.out.println("Então temos você, Maxwell! Você que foi escolhido em sorteio");
        System.out.println("(Nada Manipulado)");
        System.out.println("Você que irá levar esta jóia Até Nargumun");
        System.out.println("Lá eles possuem magia avançada para estabilizar a Joia!");
        System.out.println("Boa Sorte!");
        System.out.println("[digite qualquer coisa para continuar]");
        ph = scan.nextLine();

        frame3.dispose();
        clearTerminal();


    }
    
    public void clearTerminal(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void rodar(){
        Dialogues dia = new Dialogues();
        dia.inicio();
    }

    // public static void main(String[] args) {
    //     Dialogues dia = new Dialogues();
    //     dia.inicio();
    // }
}
