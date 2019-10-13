  import  java.lang.Math;
  import java.awt.*;
  import java.awt.event.*;
class Calc2{
	Frame f;
	Button b[][]=new Button[6][4];
	Button b1;
	TextField tf,tf1;
	String varS="",s1,s2,s3;
	int i1=0,i2=1,i3=0;
	Calc2(String s){
	f=new Frame(s);	
		tf=new TextField();
		tf.setBounds(50,40,300,40);
		tf1=new TextField();
		tf1.setBounds(50,80,300,40);
		f.add(tf);
		f.add(tf1);
	
		String[][] but={{"%","sq.root","x^2","1/x"},
						{"CE","C","<X]","/"},
						{"7","8","9","X"},
						{"4","5","6","-"},
						{"1","2","3","+"},
						{"#","0",".","="},
					   };

		int wb=75,hb=50;
		
			for (int j=0;j<6;j++) {
				for (int k=0;k<4;k++ ) {					
				b[j][k]=new Button(but[j][k]);				
				b[j][k].setBounds(50+75*k,140+50*j,wb,hb);
				f.add(b[j][k]);
			//	b[j][k].addActionListener(this);	// Will add actionListener to work for button 				
				}
			}	
	//	Toolkit t=f.getToolkit();
	//	Dimension screenSize=t.getScreenSize();
	//	int width=screenSize.width*8/10;
	//	int height=screenSize.height*8/10; 
		f.setBounds(100,100,400,500);
		f.setLayout(null);																																	
		f.setVisible(true);
	}
 	public static void main(String[] args) {
		new Calc2("Calculator");
	}
}