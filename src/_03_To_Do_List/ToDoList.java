package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	JButton addTask;
	JButton removeTask;
	JButton viewTasks;
	JButton saveList;
	JButton loadList;
	
	ArrayList<String> tasks;
	
	public ToDoList(){
	//setup program
	tasks = new ArrayList<String>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	
	addTask = new JButton();
	viewTasks = new JButton();
	removeTask = new JButton();
	saveList = new JButton();
	loadList = new JButton();
	
	panel.add(addTask);
	panel.add(viewTasks);
	panel.add(removeTask);
	panel.add(saveList);
	panel.add(loadList);
	
	addTask.addActionListener(this);
	removeTask.addActionListener(this);
	viewTasks.addActionListener(this);
	saveList.addActionListener(this);
	loadList.addActionListener(this);
	
	addTask.setText("Add Task");
	removeTask.setText("Remove Task");
	viewTasks.setText("View Tasks");
	saveList.setText("Save List");
	loadList.setText("Load List");
	
	frame.setTitle("To Do List");
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(addTask)) {
			AddTask();
		}
		if(e.getSource().equals(removeTask)) {
			RemoveTask();
		}
		if(e.getSource().equals(viewTasks)) {
			ViewTasks();
		}
		if(e.getSource().equals(saveList)) {
			SaveList();
		}
		if(e.getSource().equals(loadList)) {
			LoadList();
		}
	}

	private void LoadList() {
		// TODO Auto-generated method stub
		
	}

	private void SaveList() {
		// TODO Auto-generated method stub
		
	}

	private String ViewTasks() {
		// TODO Auto-generated method stub
		String output = "";
		if(tasks.size() > 0) {
		for(int i = 0; i < tasks.size(); i++) {
			int j = i + 1;
			output += j + ". " + tasks.get(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, output);
		}
		else {
			JOptionPane.showMessageDialog(null, "No tasks added");
		}
		return output;
	}

	private void RemoveTask() {
		// TODO Auto-generated method stub
		try {
		int input = Integer.parseInt(JOptionPane.showInputDialog("What number task would you like to delete?"));
		if(tasks.size() > 1) {
		tasks.remove(input + 1);
		}
		else if(tasks.size() == 0) {
			JOptionPane.showMessageDialog(null, "You don't have any tasks to remove");
		}
		else {
			tasks.clear();
		}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Please enter a number that is WITHIN THE RANGE OF YOUR TASKS!");
		}
	}

	private void AddTask() {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Enter your task here:");
		tasks.add(input);
	}
}
