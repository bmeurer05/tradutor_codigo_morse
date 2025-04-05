package com.bmeurer05.morseTranslator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class UI extends JFrame {

	private static final long serialVersionUID = 1L;

	private final int WIDTH = 500;
	
	private final int HEIGHT = 550;
	
	private final int TEXT_PANE_WIDTH = 370;
	
	private final int TEXT_PANE_HEIGHT = 160;
	
	private final int BUTTON_WIDTH = 150;
	
	private final int BUTTON_HEIGHT = 40;
	
	private final int FONT_SIZE = 15;

	private MorseTranslator morseTranslator;
	
	private JTextPane morseToTextTextField;
	
	private JTextPane textToMorseTextField;
	
	private JButton translateTextButton;
	
	public UI() {
		createWindow();
	}
	
	private void createWindow() {
	
		morseToTextTextField = new JTextPane();
		morseToTextTextField.setBounds(55, 300, TEXT_PANE_WIDTH, TEXT_PANE_HEIGHT);
		morseToTextTextField.setFont(new Font("Arial", 1, FONT_SIZE));
		
		textToMorseTextField = new JTextPane();
		textToMorseTextField.setBounds(55, 80, TEXT_PANE_WIDTH, TEXT_PANE_HEIGHT);
		textToMorseTextField.setFont(new Font("Arial", 1, FONT_SIZE));
		
		
		JLabel title = new JLabel("Morse Translator");
		title.setFont(new Font("Arial", 1, 30));
		title.setBounds(120, 10, 245, 38);
		
		

		translateTextButton = new JButton("Translate Text");
		translateTextButton.setBounds(165, 250, BUTTON_WIDTH, BUTTON_HEIGHT);
		translateTextButton.setBackground(Color.white);
		translateTextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				morseTranslator = new MorseTranslator();
				morseToTextTextField.setText(morseTranslator.translateTextToMorse(textToMorseTextField.getText()));
			}
		});
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Morse Translator");
		setIconImage(getImage("res/networkGlobeIcon.png"));
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.add(morseToTextTextField);
		this.add(textToMorseTextField);
		this.add(translateTextButton);
		this.add(title);
	}
	
	
	
	private BufferedImage getImage(String path) {
		try {
			BufferedImage image = ImageIO.read(new File(path));
			return image;
		} catch (IOException e) {
			System.out.print("Error: Couldn't get icon image | " + e);
		}
		return null;
	}
}
