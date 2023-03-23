package Experiments.GoofyAhhCats;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
//commit test
  private static void createAndShowGUI() {

    JFrame jFrame = new JFrame("About weird cats)");
    jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
    jFrame.setSize(300, 500);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Lable with text from task 
    JLabel greetingLabel = new JLabel("Hi, I am Pavlo");
    greetingLabel.setHorizontalAlignment(JLabel.CENTER);
    greetingLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
    jFrame.add(greetingLabel);

  
    JLabel label = new JLabel("That app about cats...");
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
    jFrame.add(label);

    JLabel photo1 = new JLabel(new ImageIcon("src\\Experiments\\GoofyAhhCats\\seekCat.gif"));
    //JLabel photo1 = new JLabel(new ImageIcon("dogsleep.gif"));
    photo1.setHorizontalAlignment(JLabel.CENTER);
    jFrame.add(photo1);

    //Just aks for no reason
    JLabel wishLabel = new JLabel("Wanna see them?");
    wishLabel.setHorizontalAlignment(JLabel.CENTER);
    wishLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
    jFrame.add(wishLabel);
    
    //add button Yes
    JButton buttonYes = new JButton("Yes");
    buttonYes.setHorizontalAlignment(JButton.CENTER);
    buttonYes.setPreferredSize(new Dimension(140, 50));
    buttonYes.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    jFrame.add(buttonYes);

    //add button No
    JButton buttonNo = new JButton("No");
    buttonNo.setHorizontalAlignment(JButton.CENTER);
    buttonNo.setPreferredSize(new Dimension(140, 50));
    buttonNo.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    jFrame.add(buttonNo); 

    //goof cat
    JLabel photo2 = new JLabel(new ImageIcon("src\\Experiments\\GoofyAhhCats\\popCat.gif"));
    photo2.setHorizontalAlignment(JLabel.CENTER);
    photo2.setPreferredSize(new Dimension(320, 350));
    jFrame.add(photo2);
    photo2.setVisible(false);

    //pls, do not the cat
    JLabel photo3 = new JLabel(new ImageIcon("src\\Experiments\\GoofyAhhCats\\ahhh.gif"));
    photo3.setHorizontalAlignment(JLabel.CENTER);
    photo3.setPreferredSize(new Dimension(320, 350));
    jFrame.add(photo3);
    photo3.setVisible(false);

    //button "back"
    JButton buttonBack = new JButton("-> Back <-");
    buttonBack.setHorizontalAlignment(JButton.CENTER);
    buttonBack.setPreferredSize(new Dimension(140, 50));
    buttonBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    jFrame.add(buttonBack); 
    buttonBack.setVisible(false);

    //exit button
    JButton buttonExit = new JButton("Ur free~");
    buttonExit.setHorizontalAlignment(JButton.CENTER);
    buttonExit.setPreferredSize(new Dimension(140, 50));
    buttonExit.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    jFrame.add(buttonExit); 
    buttonExit.setVisible(false);    
    
    //if answer Yes
    buttonYes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("You are awesome (◕ ˬ ◕✿) ");
        
        //set invisible
        greetingLabel.setVisible(false);
        wishLabel.setVisible(false);
        photo1.setVisible(false);
        photo3.setVisible(false);
        buttonYes.setVisible(false);
        buttonNo.setVisible(false);
        //set visible
        photo2.setVisible(true);
        buttonBack.setVisible(true);
        buttonExit.setVisible(true);
      }
    });

    //if answer No
    buttonNo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("You just have no choise");
        
        //set invisible
        greetingLabel.setVisible(false);
        wishLabel.setVisible(false);
        photo1.setVisible(false);
        photo2.setVisible(false);
        buttonYes.setVisible(false);
        buttonNo.setVisible(false);
        //set visible
        photo3.setVisible(true);
        buttonBack.setVisible(true);
      }
    });

    //if answer Back
    buttonBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("You just have no choise");
        
        //set invisible
        photo2.setVisible(false);
        photo3.setVisible(false);
        buttonBack.setVisible(false);
        buttonExit.setVisible(false);
        //set visible
        greetingLabel.setVisible(true);
        wishLabel.setVisible(true);
        photo1.setVisible(true);
        buttonYes.setVisible(true);
        buttonNo.setVisible(true);

        
      }
    });

    //if answer Exit
    buttonExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
       
        jFrame.dispose();
          // Exit light~                    //
          // Enter night~                   //
          // Take my hand!                  //
          // We're off to never-never land  //
      }
    });

    
    jFrame.setVisible(true);
  }

  public static void main(String[] args) {
    createAndShowGUI();
  }
}
