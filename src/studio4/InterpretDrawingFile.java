package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean fill = in.nextBoolean();
		
		
				
				
		if (shape.equals("rectangle")) {
			double param1 = in.nextDouble();
			double param2 = in.nextDouble();
			double param3 = in.nextDouble();
			double param4 = in.nextDouble();
			StdDraw.setPenColor(r, g, b);
			
			if (fill == true) {
			StdDraw.filledRectangle(param1, param2, param2, param4);
			}
			else {
				StdDraw.rectangle(param1, param2, param2, param4);
			}
		}
		else if (shape.equals("triangle")) {
			double param1 = in.nextDouble();
			double param2 = in.nextDouble();
			double param3 = in.nextDouble();
			double param4 = in.nextDouble();
			double param5 = in.nextDouble();
			double param6 = in.nextDouble();
			
		}
		else if (shape.equals("eclipse")) {
			double param1 = in.nextDouble();
			double param2 = in.nextDouble();
			double param3 = in.nextDouble();
			double param4 = in.nextDouble();
			
		}
		
		
	}
}
