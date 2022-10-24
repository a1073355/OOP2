package oop2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
class jFrame extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JPanel contentPane2;
    private JPanel contentPane3;

    int count=0;
    JLabel lab1;
    ImageIcon img1;
    JButton image;
    JButton btn1;
    JButton btn2;
    jFrame(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,500,500); 
        

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());
        lab1 = new JLabel("圖片"+count);
        contentPane.add(lab1,BorderLayout.NORTH);
        
        img1 = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\oop2\\src\\oop2\\dog.jpg");
        image=new JButton(img1);
        contentPane.add(image,BorderLayout.CENTER);

        
        
        btn1 = new JButton("上一張");
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	  count=count-1;
            	  if(count==-2)
            	  {
                   JOptionPane.showMessageDialog(null,"沒有圖了");

            	  }
            	  else if(count==-1)
            	  {
            		  contentPane2 = new JPanel();
            		  setContentPane(contentPane2);
            		  contentPane2.setLayout(new BorderLayout());
            		  lab1 = new JLabel("圖片"+count);
            		  img1 = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\oop2\\src\\oop2\\cat.jpg");
            		  image= new JButton(img1);
            	     
            	      contentPane2.add(lab1,BorderLayout.NORTH);
            	      contentPane2.add(image,BorderLayout.CENTER);
            	      contentPane2.add(btn1,BorderLayout.SOUTH);
            	      contentPane2.add(btn2,BorderLayout.EAST);

            	  }
            	  else if(count==0)
            	  {
            		  contentPane = new JPanel();
            		  setContentPane(contentPane);
            		  contentPane.setLayout(new BorderLayout());
            		  lab1 = new JLabel("圖片"+count);
            		  img1 = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\oop2\\src\\oop2\\dog.jpg");
            		  image= new JButton(img1);
            	     
            	      contentPane.add(lab1,BorderLayout.NORTH);
            	      contentPane.add(image,BorderLayout.CENTER);
            	      contentPane.add(btn1,BorderLayout.SOUTH);
            	      contentPane.add(btn2,BorderLayout.EAST);
            	  }
            		  
            }
        });
        
       
       
        contentPane.add(btn1,BorderLayout.WEST);

        btn2 = new JButton("下一張");

        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	  count=count+1;
            	  if(count==2)
            	  {
                   JOptionPane.showMessageDialog(null,"沒有圖了");

            	  }
            	  else if(count==1)
            	  {
            		  contentPane3 = new JPanel();
            		  setContentPane(contentPane3);
            		  contentPane3.setLayout(new BorderLayout());
            		  lab1 = new JLabel("圖片"+count);
            		  img1 = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\oop2\\src\\oop2\\mouse.jpg");
            		  image= new JButton(img1);
            	     

            	      contentPane3.add(lab1,BorderLayout.NORTH);
            	      contentPane3.add(image,BorderLayout.CENTER);
            	      contentPane3.add(btn1,BorderLayout.SOUTH);
            	      contentPane3.add(btn2,BorderLayout.EAST);

            	  }
            	  else if(count==0)
            	  {
            		  contentPane = new JPanel();
            		  setContentPane(contentPane);
            		  contentPane.setLayout(new BorderLayout());
            		  lab1 = new JLabel("圖片"+count);
            		  img1 = new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\oop2\\src\\oop2\\dog.jpg");
            		  image= new JButton(img1);
            	     
            	      contentPane.add(lab1,BorderLayout.NORTH);
            	      contentPane.add(image,BorderLayout.CENTER);
            	      contentPane.add(btn1,BorderLayout.SOUTH);
            	      contentPane.add(btn2,BorderLayout.EAST);
            	  }
            		  
            }
        });
        contentPane.add(btn2,BorderLayout.EAST);

        setVisible(true);

       

    }
    public void actionPerformed(ActionEvent e){
        JButton nameBtn = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null,nameBtn.getText());
    }
}
public class swingHW {
	public static void main(String[] args) throws Exception{
        jFrame f1 = new jFrame();
    }

}
