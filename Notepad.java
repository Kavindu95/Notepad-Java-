import javax.swing.*;
import java.awt.*;

class Notepad extends JFrame{

	TextArea textArea;

	JMenuBar mainMenuBar;

	JMenu fileMenu;
	JMenu editMenu;
	JMenu viewMenu;

	JMenuItem item1;
	JMenuItem item2;
	JMenuItem item3;
	JMenuItem item4;
	JMenuItem item5;
	JMenuItem item6;
	JMenuItem item7;

	Notepad(){
		setSize(600, 500);
		setTitle("untitled");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		textArea =new TextArea();
		textArea.setFont(new Font("", 1, 16));
		JScrollPane scrollPane = new JScrollPane(textArea);
		add("Center", scrollPane);

		mainMenuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");

		item1 = new JMenuItem("Menu Item 1");
		item2 = new JMenuItem("Menu Item 2");

		fileMenu.add(item1);
		fileMenu.add(item2);

		mainMenuBar.add(fileMenu);

		viewMenu = new JMenu("View");

		item3 = new JMenuItem("Menu Item 3");
		item4 = new JMenuItem("Menu Item 4");

		viewMenu.add(item3);
		viewMenu.add(item4);

		mainMenuBar.add(viewMenu);

		setJMenuBar(mainMenuBar);
		setVisible(true);

	}

}


class Assgn{
	public static void main(String[] args) {
		new Notepad();
	}
}
