  import  java.lang.Math;
  import java.awt.*;
  import java.awt.event.*;
class Calc2 implements ActionListener{
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
		f.addWindowListener(new WindowActionListener());
		
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
				b[j][k].addActionListener(this);	
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
	
		public void actionPerformed(ActionEvent e){
		if(e.getSource()==b[0][0]){System.out.println("Action Performed of %");
			varS=tf.getText();
			i3=Integer.parseInt(varS);
			double d=(double)i3/100;
			varS=String.valueOf(d);
			tf1.setText(varS);
		}
		else if(e.getSource()==b[1][0]){System.out.println("Action Performed of CE");	
				varS="";
			tf.setText(varS);
		}
		else if(e.getSource()==b[2][0]){System.out.println("Calc Key pressed: 7");	
			varS=tf.getText();
			varS=varS.concat("7");
			tf.setText(varS);
		}
		else if(e.getSource()==b[3][0]){System.out.println("Calc Key pressed: 4");
			varS=tf.getText();
			varS=varS.concat("4");
			tf.setText(varS);
		}
		else if(e.getSource()==b[4][0]){System.out.println("Calc Key pressed: 1");
			varS=tf.getText();
			varS=varS.concat("1");
			tf.setText(varS);
		}
		else if(e.getSource()==b[5][0]){System.out.println("Action Performed of +/-");	
			tf.setText("+/-");
		}
		else if(e.getSource()==b[0][1]){System.out.println("Action Performed of SQ.RT");
			varS=tf.getText();
			i3=Integer.parseInt(varS);
			varS="";
			s3=String.valueOf(Math.sqrt(i3));
			tf1.setText(s3);

		}
		else if(e.getSource()==b[1][1]){System.out.println("Action Performed of C");
				varS="";
				tf.setText(varS); i3=0;
				s3="";
				tf1.setText(s3);		
		}
		else if(e.getSource()==b[2][1]){ System.out.println("Calc Key pressed: 8");
			varS=tf.getText();
			varS=varS.concat("8");
			tf.setText(varS);
		}
		else if(e.getSource()==b[3][1]){System.out.println("Calc Key pressed: 5");
			varS=tf.getText();
			varS=varS.concat("5");
			tf.setText(varS);
		}
		else if(e.getSource()==b[4][1]){System.out.println("Calc Key pressed: 2");
			varS=tf.getText();
			varS=varS.concat("2");
			tf.setText(varS);
		}
		else if(e.getSource()==b[5][1]){System.out.println("Calc Key pressed: 0");	
			varS=tf.getText();
			varS=varS.concat("0");
			tf.setText(varS);
		}
		else if(e.getSource()==b[0][2]){System.out.println("Action Performed of x^2");
			varS=tf.getText();
			i3=Integer.parseInt(varS);
			//i3=Math.pow(i3,2);
			i3=i3*i3;
			s3=String.valueOf(i3);
			tf1.setText(s3);

		}
		else if(e.getSource()==b[1][2]){System.out.println("Action Performed of <X]");	
		varS=tf.getText();
		int a=varS.length();
		//	varS=varS.copyValueOf(varS,0,a);
		varS=varS.substring(0,a-1);
		System.out.println("last digit removed");
			tf.setText(varS);
		}
		else if(e.getSource()==b[2][2]){System.out.println("Calc Key pressed: 9");	
			varS=tf.getText();
			varS=varS.concat("9");
			tf.setText(varS);
		}
		else if(e.getSource()==b[3][2]){System.out.println("Calc Key pressed: 6");	
			varS=tf.getText();
			varS=varS.concat("6");
			tf.setText(varS);
		}
		else if(e.getSource()==b[4][2]){System.out.println("Calc Key pressed: 3");	
			varS=tf.getText();
			varS=varS.concat("3");
			tf.setText(varS);
		}
		else if(e.getSource()==b[5][2]){System.out.println("Calc Key pressed: .");	
			tf.setText(". is disabled,");
		}
		else if(e.getSource()==b[0][3]){System.out.println("Action Performed of 1/x");
		//	tf.setText("1/x");
			varS=tf.getText();
			i1=Integer.parseInt(varS);
			double d=1.0/i1;
			s3=String.valueOf(d);
			tf1.setText(s3);
	
		}
		else if(e.getSource()==b[1][3]){System.out.println("Action Performed of /");	
			tf.setText("/");
		}
		else if(e.getSource()==b[2][3]){System.out.println("Action Performed of X");	
			i1=Integer.parseInt(varS);
			varS="";
			i2=i2*i1;
			s3=String.valueOf(i2);
		//	i2=0;
			tf1.setText(s3);
		}
		else if(e.getSource()==b[3][3]){System.out.println("Action Performed of -");
			varS=tf.getText();
			i1=Integer.parseInt(varS);
			varS="";
			tf.setText(varS);
			i3=(i3-i1);
			
			s3=String.valueOf(i3);
			tf1.setText(s3);

		}
		else if(e.getSource()==b[4][3]){System.out.println("Action Performed of +");	
			varS=tf.getText();
			i1=Integer.parseInt(varS);
			varS="";
			tf.setText(varS);
			i3=i3+i1;
			s3=String.valueOf(i3);
			tf1.setText(s3);
		}
		else if(e.getSource()==b[5][3]){System.out.println("Action Performed of =");	
			s1=tf.getText(); 
			s3=String.valueOf(i3);
			tf1.setText(s1);
		}
		
		else{
		//	for (int i=0;i<26 ;i++ ) {
				tf.setText("Else Part");
		//	}
		}
	}
	

 	public static void main(String[] args) {
		new Calc2("Calculator");
	}
}



class WindowActionListener extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out.println("Window Closed");
		System.exit(0);
	}
}