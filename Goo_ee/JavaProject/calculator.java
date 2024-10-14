import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 public class calculator implements ActionListener{
JFrame frame;
JTextField textfield;
JButton numberbuttons[]=new JButton[10];
JButton functionbuttons[] =new JButton[8];
JButton addbutton,subbutton,mulbutton,divbutton;
JButton decbutton,equbutton,delbutton,clrbutton;
JPanel panel;
Font myFont=new Font("Ink Free",Font.BOLD,30);
double num1=0,num2=0,result=0;
char operator;
calculator(){
    frame =new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,550);
    frame.setLayout(null);
    textfield=new JTextField();
    textfield.setBounds(50,25,300,50);
    textfield.setFont(myFont);
    textfield.setEditable(false);// which means that we can not write the letter from the keyboard.
    addbutton =new JButton("+");
    subbutton =new JButton("-");
    mulbutton =new JButton("*");
    divbutton =new JButton("/");
    decbutton =new JButton(".");
    equbutton =new JButton("=");
    delbutton =new JButton("Delete");
    clrbutton =new JButton("Clear");
    functionbuttons[0]=addbutton;
    functionbuttons[1]=subbutton;
    functionbuttons[2]=mulbutton;
    functionbuttons[3]=divbutton;
    functionbuttons[4]=decbutton;
    functionbuttons[5]=equbutton;
    functionbuttons[6]=delbutton;
    functionbuttons[7]=clrbutton;

    for(int i=0;i<8;i++){
        functionbuttons[i].addActionListener(this);
        functionbuttons[i].setFont(myFont);
        functionbuttons[i].setFocusable(false);
    }
    for(int i=0;i<10;i++){
        numberbuttons[i]=new JButton(String.valueOf(i));
        numberbuttons[i].addActionListener(this);
        numberbuttons[i].setFont(myFont);
        numberbuttons[i].setFocusable(false);
    }
    delbutton.setBounds(50,430,145,50);
    clrbutton.setBounds(205,430,145,50);
    panel =new JPanel();
    panel.setBounds(50,100,300,300);
    panel.setLayout(new GridLayout (4,4,10,10));

    panel.add(numberbuttons[1]);
    panel.add(numberbuttons[2]);
    panel.add(numberbuttons[3]);
    panel.add(addbutton);
    panel.add(numberbuttons[4]);
    panel.add(numberbuttons[5]);
    panel.add(numberbuttons[6]);
    panel.add(subbutton);
    panel.add(numberbuttons[7]);
    panel.add(numberbuttons[8]);
    panel.add(numberbuttons[9]);
    panel.add(mulbutton);
    panel.add(decbutton);
    panel.add(numberbuttons[0]);
    panel.add(equbutton);
    panel.add(divbutton);
    frame.add(panel);
    frame.add(delbutton);
    frame.add(clrbutton);
    frame.add(textfield);
    frame.setVisible(true);
}
    public static void main(String[] args) {
        calculator cal=new calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           for(int i=0;i<10;i++){
            if(e.getSource()==numberbuttons[i]){
                 textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
           }
           if(e.getSource()==decbutton){
            textfield.setText(textfield.getText().concat("."));
    }
if(e.getSource()==clrbutton){
    textfield.setText(null);
         }
         if(e.getSource()==delbutton){ 
           String str= textfield.getText();
           textfield.setText("");
           for(int i=0;i<str.length()-1;i++){
                  textfield.setText(textfield.getText()+str.charAt(i));
           }
                 }
                 if(e.getSource()==mulbutton){
                    num1=Double.parseDouble(textfield.getText());
                    operator='*';
                    textfield.setText("");
            }
             if(e.getSource()==divbutton){
                num1=Double.parseDouble(textfield.getText());
                operator='/';
                textfield.setText("");
            
            }
            if(e.getSource()==addbutton){
                num1=Double.parseDouble(textfield.getText());
                operator='+';
                textfield.setText("");
            }
            if(e.getSource()==subbutton){
                num1=Double.parseDouble(textfield.getText());
                operator='-';
                textfield.setText("");
            }if(e.getSource()==equbutton){
                num2=Double.parseDouble(textfield.getText());
            switch(operator){
                case'+':
                  result= num1+num2;
                  break;
                  case'-':
                  result= num1-num2;
                  break;
                  case'*':
                  result= num1*num2;
                  break;
                  case'/':
                  result= num1/num2;
                  break;
               
            }
            textfield.setText(String.valueOf(result));
            num1=result;
           
     }}
}
