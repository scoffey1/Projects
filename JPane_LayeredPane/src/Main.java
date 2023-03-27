import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		// JLayeredPane = Swing container that provides a third dimension
		//                for positioning 
        //                ex. depth, z-index
		
		JLabel Label1 = new JLabel();
		Label1.setOpaque(true);
		Label1.setBackground(Color.RED);
		Label1.setBounds(50,50,200,200);
		
		JLabel Label2 = new JLabel();
		Label2.setOpaque(true);
		Label2.setBackground(Color.GREEN);
		Label2.setBounds(100,100,200,200);
		
		JLabel Label3 = new JLabel();
		Label3.setOpaque(true);
		Label3.setBackground(Color.BLUE);
		Label3.setBounds(150,150,200,200);
		
		JLayeredPane LayeredPane = new JLayeredPane();
		LayeredPane.setBounds(0,0,500,500);
		
		LayeredPane.add(Label1, Integer.valueOf(0));
		LayeredPane.add(Label2, Integer.valueOf(2));;
		LayeredPane.add(Label3, Integer.valueOf(1));;
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(LayeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
