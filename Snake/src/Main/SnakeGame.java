package Main;

import javax.swing.JFrame;

public class SnakeGame {

	public static void main(String[] args) {
		JFrame window = new JFrame();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Snake");

		GamePanel gamePanel = new GamePanel();

		window.add(gamePanel);

		window.pack();
		gamePanel.startGame();

		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

}
