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

    public void showMap(){
        ImageIcon image3 = new ImageIcon(Dialogues.class.getResource("Images/maapa.png"));
        JLabel label3 = new JLabel();
        label3.setIcon(image3);
        label3.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame3 = new JFrame();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(1600, 800);
        frame3.setVisible(true);
        frame3.add(label3);
        System.out.println("[digite qualquer coisa para voltar]");
        ph = scan.nextLine();
        frame3.dispose();
        clearTerminal();

    }

    public void dialogoFinal(Maxwell max){
        if(max.getAmountCoins() >= 10){ //aqui Maxwell é condecorado Rei
            System.out.println("Maxwell Chega em Nargumun e...");
            System.out.println("Rapidamente a Joia é recolhida");
            System.out.println("Para ser estabilizada pelos magos do Reino");
            System.out.println("Maxwell juntou tanto dinheiro que o Rei");
            System.out.println("Se ajoelha, proclamando:");
            System.out.println("--Rei MAXWELL!!");
            System.out.println("O Reino entra em Alegria");
            System.out.println("E Maxell, Maxwell vive bem pelo resto da vida como novo Rei.");
            System.out.println("FIM");
            System.out.println("[Final Bom 1]");
        }else if(max.getAmountCoins() < 10 && max.getAmountCoins() >= 4){ //Aqui ele é consecorado lorde
            System.out.println("Maxwell Chega em Nargumun e...");
            System.out.println("Rapidamente a Joia é recolhida");
            System.out.println("Para ser estabilizada pelos magos do Reino");
            System.out.println("Maxwell juntou tanto dinheiro que os Nobres");
            System.out.println("Se ajoelham, proclamando:");
            System.out.println("--É UM DOS NOSSOS");
            System.out.println("O Reino entra em Alegria");
            System.out.println("E Maxell, Maxwell vive bem pelo resto da vida como Nobre.");
            System.out.println("FIM");
            System.out.println("[Final Bom 2]");
        }else{ //Aqui ele vira servo (muito ruim)
            System.out.println("Maxwell Chega em Nargumun e...");
            System.out.println("Rapidamente a Joia é recolhida");
            System.out.println("Para ser estabilizada pelos magos do Reino");
            System.out.println("Maxwell juntou tão pouco dinheiro que o Rei");
            System.out.println("olha com desgosto, proclamando:");
            System.out.println("-- Entreguem uma Roupa a esse Plebeu!");
            System.out.println("O Reino entra em Alegria");
            System.out.println("E Maxell, Maxwell vive pelo resto da vida como um servo da Coroa.");
            System.out.println("Não é legal, mas ao menos o Reino Floresce!");
            System.out.println("FIM");
            System.out.println("[Final Ruim 1]");
        }

    }

    // public static void main(String[] args) {
    //     Dialogues dia = new Dialogues();
    //     dia.inicio();
    // }
}
