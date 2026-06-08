package sk.train.ma_verwaltung_abstract_gui;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Starter {

	public static void main(String[] args) {

		MitarbeiterVerwaltung mv = new MitarbeiterVerwaltung();

		JFrame f = new JFrame();
        JTable mytable = new JTable(mv);
		JScrollPane p = new JScrollPane(mytable);
		//p.add(mytable);

		f.getContentPane().add(p);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		//f.pack();
		f.setVisible(true);

		

	}

}
