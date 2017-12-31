package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton bAdd;
	JButton bView;
	static ArrayList<String> guests;

	public static void main(String[] args) {
		guests = new ArrayList<String>();
		GuestBook book = new GuestBook();
		book.GUI();
	}

	public void GUI() {
		frame = new JFrame("Guest Book");
		panel = new JPanel();
		bAdd = new JButton("Add Name");
		bView = new JButton("View Names");
		bAdd.addActionListener(this);
		bView.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(bAdd);
		panel.add(bView);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(bAdd)) {
			String add = JOptionPane.showInputDialog("Add Guest");
			guests.add(add);
		}
		if (e.getSource().equals(bView)) {
			String output = "";
			for (String string : guests) {
				output += string + "\n";
			}
			JOptionPane.showMessageDialog(null, output);
		}
	}
}
