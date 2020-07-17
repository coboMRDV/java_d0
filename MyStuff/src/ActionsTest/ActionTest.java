package ActionsTest;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;

public class ActionTest {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {
	JPanel topPanel, bottomPanel;
	JMenuBar menuBar;
	JMenu menuFont, menuStyle, menuSize;
	JScrollPane scrollPane;
	JTextPane text;
	JMenuItem bold, italic;
	JMenuItem corbel, cambria, inkFree;
	JMenuItem size14, size16, size20, size24;
	

	public Frame() {
		createPanel();
		createMenuBar();
		createTextPane();
	}

	public void createPanel() {
		setSize(600, 400);
		setLocationRelativeTo(null);
		add(new Panel());
		setLayout(new BorderLayout(3, 3));

		topPanel = new JPanel();
		add(topPanel, BorderLayout.NORTH);
		bottomPanel = new JPanel();

	}

	public void createMenuBar() {
		/* ================= Layouts ================ */
		topPanel.setLayout(new BorderLayout());
		bottomPanel.setLayout(new BorderLayout());

		/* ================= Creación barra de menús ================ */
		menuBar = new JMenuBar();
		/* ================= menu list ================ */
		menuFont = new JMenu("Font");
		menuStyle = new JMenu("Style");
		menuSize = new JMenu("Size");
		/* ================= Menu items ================ */
		/* ================= fuente ================ */
		corbel = new JMenuItem(new EditorActionListenerHandler("Corbel", "font"));
		cambria = new JMenuItem(new EditorActionListenerHandler("Cambria", "font"));
		inkFree = new JMenuItem(new EditorActionListenerHandler("Ink Free","font"));
		/* ================= estilo ================ */
		bold = new JMenuItem(new EditorActionListenerHandler("Bold", "style"));
		italic = new JMenuItem(new EditorActionListenerHandler("Italic", "style"));
		/* ================= size ================ */
		JMenuItem size14 = new JMenuItem(new EditorActionListenerHandler("14", "size"));
		JMenuItem size16 = new JMenuItem(new EditorActionListenerHandler("16", "size"));
		JMenuItem size20 = new JMenuItem(new EditorActionListenerHandler("20", "size"));
		JMenuItem size24 = new JMenuItem(new EditorActionListenerHandler("24", "size"));
		/* ================= ============================== ================ */

		menuFont.add(corbel);
		menuFont.add(cambria);
		menuFont.add(inkFree);

		menuStyle.add(bold);
		menuStyle.add(italic);

		menuSize.add(size14);
		menuSize.add(size16);
		menuSize.add(size20);
		menuSize.add(size24);

		/* ================= ================================ ================ */
		menuBar.add(menuFont);
		menuBar.add(menuStyle);
		menuBar.add(menuSize);
		
		/* ================= ================================ ================ */
		
		topPanel.add(menuBar, BorderLayout.WEST);
	}
	
	/**
	 * Crea el panel de texto
	 */
	public void createTextPane() {
		text = new JTextPane();
		text.setFont(new Font("Arial", Font.PLAIN, 18));
		text.setText(
				"'I must not fear. Fear is the mind-killer. Fear is the little-death that brings total obliteration. I will face my fear. I will permit it to pass over me and through me. And when it has gone past I will turn the inner eye to see its path. Where the fear has gone there will be nothing. Only I will remain.'\r\n" + 
				"― Frank Herbert, Dune"
				);
		scrollPane = new JScrollPane(text);

		bottomPanel.add(scrollPane);
		add(bottomPanel, BorderLayout.CENTER);
	}



	/**
	 * Acciones para el menú
	 * 
	 * @author Cobo
	 *
	 */
	class EditorActionListenerHandler extends AbstractAction {
		
		public EditorActionListenerHandler(String actionName, String menuName) {
			putValue(AbstractAction.NAME, actionName);
}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

			
		}
		
	}
}


