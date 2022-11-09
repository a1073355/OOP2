import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class calculator26_9 extends JFrame implements ActionListener{
    private JPanel panel=new JPanel(new GridLayout(4,4,5,5));
    private JTextArea area=new JTextArea(1,8);
    private JButton[] buttons=new JButton[16];
    private String[] btName={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
    private String text="";
    String operator="",value="";
    double result=0,num1=0,num2=0;

    public calculator26_9(){
        super("Calculator");
        setLayout(new BorderLayout());
        panel.setSize(250,250);
        area.setText(text);
        add(area,BorderLayout.NORTH);
        for(int i=0;i<16;i++){
            buttons[i]=new JButton(btName[i]);
            buttons[i].addActionListener(this);
            //buttons[i].setActionCommand(btName[i]);
            panel.add(buttons[i]);
        }
        add(panel,BorderLayout.CENTER);
    }
    public static void main(String args[]){
        calculator26_9 jf=new calculator26_9();
        jf.setSize(250,250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String input=e.getActionCommand();
        if(input.matches("[0-9]")){
            value=value+input;
            num1=Integer.valueOf(value);
            text=operator+value;
        }
        else if(input.equals("+")||input.equals("-")||input.equals("*")||input.equals("/")){
            text=input;
            calculate();
            operator=input;
        }
        else if(input.equals("=")){
            calculate();
            text=""+result;
            operator="";
            num1=result;
        }
        System.out.println(num1+" "+operator+" "+num2+"="+result);
        area.setText(text);
    }
    void calculate(){
            if(operator.equals("+")){
                result=result+num1;
            }
            if(operator.equals("-")){
                result=num2-num1;
            }
            if(operator.equals("*")){
                result=num2*num1;
            }
            if(operator.equals("/")){
                result=num2/num1;
            }
            if(operator.equals("")){
                result=num1;
            }
            num2=result;
            value="";
    }
}