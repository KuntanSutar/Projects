import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.applet.*;

public class StudentRegistrationForm extends Applet implements ActionListener
{
	Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17,
	lbl18, lbl19, lbl20, lbl21, lbl22, lbl23, lbl24, lbl25;
	TextField tf2, tf4, tf5, tf8, tf9, tf10, tf18a, tf18b, tf20a, tf20b, tf22a, tf22b, tf24a, tf24b;
	String name, day, month, year, dateOfBirth, email, mobile, gender, address, city, pincode, state,
	courseAppliedFor, sscPercentage, sscYear, sscDetails, hscPercentage, hscYear, hscDetails,
	bePercentage, beYear, beDetails, mePercentage, meYear, meDetails, totalLanguagesKnown = "";
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
	Choice ch3a, ch3b, ch3c, ch11;
	String[] languagesKnown;
	Font fnt1, fnt2, fnt3, fnt4;
	CheckboxGroup cbg1;
	Color clr1, clr2;
	TextArea ta7;
	Button btn1;
	
	public void init()
	{
		fnt1 = new Font("Serif", Font.BOLD, 60);
		clr1 = new Color(204, 229, 255);
		lbl1 = new Label("Student Registration Form");
		lbl1.setBounds(350, 20, 690, 70);
		lbl1.setFont(fnt1);
		setBackground(clr1);
		add(lbl1);
		    
		fnt2 = new Font("Serif", Font.BOLD, 20);
		lbl2 = new Label("Name");
		lbl2.setBounds(30, 130, 60, 25);
		lbl2.setFont(fnt2);
		add(lbl2);
		
		tf2 = new TextField(20);  
	    tf2.setBounds(220, 130, 300, 25);
	    tf2.setFont(fnt2);
	    add(tf2);
	    
	    lbl3 = new Label("Date of Birth");
		lbl3.setBounds(30, 170, 120, 25);
		lbl3.setFont(fnt2);
		add(lbl3);
		
		fnt3 = new Font("Serif", Font.BOLD, 15);
		ch3a = new Choice();  
		ch3a.setBounds(220, 170, 70, 20);  
		ch3a.add("Day");
		ch3a.add("1");  
		ch3a.add("2");  
		ch3a.add("3");  
		ch3a.add("4");  
		ch3a.add("5"); 
		ch3a.add("6");  
		ch3a.add("7");  
		ch3a.add("8");  
		ch3a.add("9");  
		ch3a.add("10");
		ch3a.add("11");  
		ch3a.add("12");  
		ch3a.add("13");  
		ch3a.add("14");  
		ch3a.add("15");  
		ch3a.add("16");  
		ch3a.add("17");
		ch3a.add("18");  
		ch3a.add("19");  
		ch3a.add("20");  
		ch3a.add("21");  
		ch3a.add("22");
		ch3a.add("23");  
		ch3a.add("24");
		ch3a.add("25");  
		ch3a.add("26");  
		ch3a.add("27");  
		ch3a.add("28");  
		ch3a.add("29");
		ch3a.add("30");  
		ch3a.add("31");
		ch3a.setFont(fnt3);
		add(ch3a);
		
		ch3b = new Choice();  
		ch3b.setBounds(320, 170, 90, 15);
		ch3b.add("Month");
		ch3b.add("1");  
		ch3b.add("2");  
		ch3b.add("3");  
		ch3b.add("4");  
		ch3b.add("5");
		ch3b.add("6");  
		ch3b.add("7");  
		ch3b.add("8");  
		ch3b.add("9");  
		ch3b.add("10");
		ch3b.add("11");  
		ch3b.add("12");
		ch3b.setFont(fnt3);
		add(ch3b);
        
		ch3c = new Choice();  
		ch3c.setBounds(440, 170, 80, 15);
		ch3c.add("Year");
		ch3c.add("1993");  
		ch3c.add("1994");
		ch3c.add("1995");  
		ch3c.add("1996");  
		ch3c.add("1997");  
		ch3c.add("1998");  
		ch3c.add("1999");
		ch3c.add("2000");  
		ch3c.setFont(fnt3);
		add(ch3c);
		
		lbl4 = new Label("Email ID");
		lbl4.setBounds(30, 210, 85, 25);
		lbl4.setFont(fnt2);
		add(lbl4); 
		
		tf4 = new TextField(220);  
	    tf4.setBounds(220, 210, 300, 25);
	    tf4.setFont(fnt2);
	    add(tf4);
	    
	    lbl5 = new Label("Mobile Number");
		lbl5.setBounds(30, 250, 140, 25);
		lbl5.setFont(fnt2);
		add(lbl5); 
	    
		tf5 = new TextField(220);  
		tf5.setBounds(220, 250, 300, 25);
		tf5.setFont(fnt2);
	    add(tf5);
	    
	    lbl6 = new Label("Gender"); 
	    lbl6.setBounds(30, 290, 80, 25);
	    lbl6.setFont(fnt2);
		add(lbl6);
		
		cbg1 = new CheckboxGroup();  
        cb1 = new Checkbox("Male", cbg1, false);    
        cb1.setBounds(220, 290, 65, 25); 
        cb1.setFont(fnt2);  
        add(cb1); 
        cb2 = new Checkbox("Female", cbg1, false);    
        cb2.setBounds(320, 290, 80, 25);    
        cb2.setFont(fnt2);  
        add(cb2);    
	    
        lbl7 = new Label("Address");  
        lbl7.setBounds(30, 330, 80, 25);
	    lbl7.setFont(fnt2);
		add(lbl7);
		
		ta7 = new TextArea("Enter Your Address", 5, 5, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta7.setBounds(220, 330, 300, 150); 
		ta7.setFont(fnt2);
		add(ta7);
		
		lbl8 = new Label("City");  
		lbl8.setBounds(30, 500, 50, 25);
		lbl8.setFont(fnt2);
		add(lbl8);
		
		tf8 = new TextField(120);  
		tf8.setBounds(220, 500, 150, 25);
		tf8.setFont(fnt2);
	    add(tf8);
		
	    lbl9 = new Label("Pin Code");  
	    lbl9.setBounds(30, 540, 80, 25);
	    lbl9.setFont(fnt2);
		add(lbl9);
		
		tf9 = new TextField(120);  
		tf9.setBounds(220, 540, 150, 25);
		tf9.setFont(fnt2);
	    add(tf9);
	    
	    lbl10 = new Label("State");  
	    lbl10.setBounds(30, 580, 60, 25);
	    lbl10.setFont(fnt2);
		add(lbl10);
		
		tf10 = new TextField(120);  
		tf10.setFont(fnt2);
		tf10.setBounds(220, 580, 150, 25);
	    add(tf10);
	    
	    lbl11 = new Label("Applied For");  
	    lbl11.setBounds(30, 620, 105, 25);
	    lbl11.setFont(fnt2);
		add(lbl11);
	    
		ch11 = new Choice();  
		ch11.setBounds(220, 615, 100, 25);  
		ch11.add("Courses");
		ch11.add("Java");  
		ch11.add("Python");  
		ch11.add(".NET");  
		ch11.add("Testing");  
		ch11.setFont(fnt3);
		add(ch11);
		
		lbl12 = new Label("Qualification");
	    lbl12.setBounds(550, 130, 115, 25);
	    lbl12.setFont(fnt2);
		add(lbl12);
		
		lbl13 = new Label("Sr. No.");
		lbl13.setBounds(560, 190, 60, 25);
		lbl13.setFont(fnt2);
		add(lbl13);
		
		lbl14 = new Label("Examination");
		lbl14.setBounds(685, 190, 110, 25);
		lbl14.setFont(fnt2);
		add(lbl14);
		
		lbl15 = new Label("Percentage");
		lbl15.setBounds(910, 190, 100, 25);
		lbl15.setFont(fnt2);
		add(lbl15);
		
		lbl16 = new Label("Year of Passing");
		lbl16.setBounds(1117, 190, 135, 25);
		lbl16.setFont(fnt2);
		add(lbl16);
		
		lbl17 = new Label("1");
		lbl17.setBounds(582, 252, 15, 25);
		lbl17.setFont(fnt2);
		add(lbl17);
		
		lbl18 = new Label("S.S.C");
		lbl18.setBounds(710, 252, 50, 25);
		lbl18.setFont(fnt2);
		add(lbl18);
		
		tf18a = new TextField(220);  
		tf18a.setBounds(930, 252, 50, 25);
		tf18a.setFont(fnt2);
	    add(tf18a);
	    
	    tf18b = new TextField(220);  
	    tf18b.setBounds(1150, 252, 70, 25);
	    tf18b.setFont(fnt2);
	    add(tf18b);
	    
	    lbl19 = new Label("2");
	    lbl19.setBounds(582, 322, 15, 25);
	    lbl19.setFont(fnt2);
		add(lbl19);
		
		lbl20 = new Label("H.S.C");
		lbl20.setBounds(710, 322, 55, 25);
		lbl20.setFont(fnt2);
		add(lbl20);
		
		tf20a = new TextField(220);  
		tf20a.setBounds(930, 322, 50, 25);
		tf20a.setFont(fnt2);
	    add(tf20a);
	    
	    tf20b = new TextField(220);  
	    tf20b.setBounds(1150, 322, 70, 25);
	    tf20b.setFont(fnt2);
	    add(tf20b);
	    
	    lbl21 = new Label("3");
	    lbl21.setBounds(582, 392, 15, 25);
	    lbl21.setFont(fnt2);
		add(lbl21);
		
		lbl22 = new Label("B.E");
		lbl22.setBounds(720, 392, 35, 25);
		lbl22.setFont(fnt2);
		add(lbl22);
		
		tf22a = new TextField(220);  
		tf22a.setBounds(930, 392, 50, 25);
		tf22a.setFont(fnt2);
	    add(tf22a);
	    
	    tf22b = new TextField(220);  
	    tf22b.setBounds(1150, 392, 70, 25);
	    tf22b.setFont(fnt2);
	    add(tf22b);
		
	    lbl23 = new Label("4");
	    lbl23.setBounds(582, 462, 15, 25);
	    lbl23.setFont(fnt2);
		add(lbl23);
		
		lbl24 = new Label("M.E");
		lbl24.setBounds(720, 462, 40, 25);
		lbl24.setFont(fnt2);
		add(lbl24);
		
	    tf24a = new TextField(220);  
		tf24a.setBounds(930, 462, 50, 25);
		tf24a.setFont(fnt2);
	    add(tf24a);
	    
	    tf24b = new TextField(220);  
	    tf24b.setBounds(1150, 462, 70, 25);
	    tf24b.setFont(fnt2);
	    add(tf24b);
	    
		lbl25 = new Label("Language Known");  
		lbl25.setBounds(550, 540, 150, 25);
		lbl25.setFont(fnt2);
		add(lbl25);
	
		cb3 = new Checkbox("C");  
		cb3.setBounds(720, 540, 30, 25); 
		cb3.setFont(fnt2);
	    add(cb3);
	    
	    cb4 = new Checkbox("C++");  
	    cb4.setBounds(770, 540, 55, 25);
	    cb4.setFont(fnt2);
	    add(cb4);
	    
	    cb5 = new Checkbox("C#");  
	    cb5.setBounds(845, 540, 45, 25);
	    cb5.setFont(fnt2);
	    add(cb5);
	    
	    cb6 = new Checkbox("Java");  
	    cb6.setBounds(910, 540, 60, 25);  
	    cb6.setFont(fnt2);
	    add(cb6);
		 
	    cb7 = new Checkbox("HTML");  
	    cb7.setBounds(990, 540, 80, 25);  
	    cb7.setFont(fnt2);
	    add(cb7);
	    
	    cb8 = new Checkbox("CSS");  
	    cb8.setBounds(1090, 540, 60, 25);  
	    cb8.setFont(fnt2);
	    add(cb8);
	    
	    cb9 = new Checkbox("JavaScript");  
	    cb9.setBounds(1170, 540, 110, 25);  
	    cb9.setFont(fnt2);
	    add(cb9);

		fnt4 = new Font("Serif", Font.BOLD, 25);
		btn1 = new Button("Submit");  
		btn1.setBounds(1215, 620, 85, 30);
		clr2 = new Color(255, 153, 153);
		btn1.setBackground(clr2);
		btn1.addActionListener(this);
		btn1.setFont(fnt4);
	    add(btn1);  
	    
		setSize(1345, 680);
	    setLayout(null);  
	    setVisible(true); 
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);  
		g.drawRect(15, 110, 1310, 560); 
		g.drawRect(550, 170, 750, 340);
		
		g.drawLine(550, 230, 1300, 230);
		g.drawLine(630, 170, 630, 510);
		g.drawLine(850, 170, 850, 510);
		g.drawLine(1070, 170, 1070, 510);
		
		g.drawLine(550, 300, 1300, 300);
		g.drawLine(550, 370, 1300, 370);
		g.drawLine(550, 440, 1300, 440);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		name = tf2.getText();
		System.out.println(name);
		
		day = ch3a.getSelectedItem();
		//System.out.println(day);
		
		month = ch3b.getSelectedItem();
		//System.out.println(month);
		
		year = ch3c.getSelectedItem();
		//System.out.println(year);
		
		dateOfBirth = day+"/"+month+"/"+year;
		System.out.println(dateOfBirth);
		
		email = tf4.getText();
		System.out.println(email);
		
		mobile = tf5.getText();
		System.out.println(mobile);
		
		Checkbox cb10 = cbg1.getSelectedCheckbox();
		gender = cb10.getLabel();
		System.out.println(gender);
		
		address = ta7.getText();
		System.out.println(address);
		
		city = tf8.getText();
		System.out.println(city);
		
		pincode = tf9.getText();
		System.out.println(pincode);
		
		state = tf10.getText();
		System.out.println(state);
		
		courseAppliedFor = ch11.getSelectedItem();
		System.out.println(courseAppliedFor);
		
		sscPercentage = tf18a.getText();
		System.out.println(sscPercentage);
		
		sscYear = tf18b.getText();
		System.out.println(sscYear);
		
		sscDetails = sscPercentage+","+sscYear;
		System.out.println(sscDetails);
		
		hscPercentage = tf20a.getText();
		System.out.println(hscPercentage);
		
		hscYear = tf20b.getText();
		System.out.println(hscYear);
		
		hscDetails = hscPercentage+","+hscYear;
		System.out.println(hscDetails);
		
		bePercentage = tf22a.getText();
		System.out.println(bePercentage);
		
		beYear = tf22b.getText();
		System.out.println(beYear);
		
		beDetails = bePercentage+","+beYear;
		System.out.println(beDetails);
		
		mePercentage = tf24a.getText();
		System.out.println(mePercentage);
		
		meYear = tf24b.getText();
		System.out.println(meYear);
		
		meDetails = mePercentage+","+meYear;
		System.out.println(meDetails);
		
		System.out.println("Languages Known:");
		
		languagesKnown = new String[7];
		
		boolean stateOfLanguagesKnown = cb3.getState();
		if(stateOfLanguagesKnown==true)
		{
			languagesKnown[0] = cb3.getLabel();
		}
		
		stateOfLanguagesKnown = cb4.getState();
		if(stateOfLanguagesKnown==true)
		{
			languagesKnown[1] = cb4.getLabel();
		}
		
		stateOfLanguagesKnown = cb5.getState();
		if(stateOfLanguagesKnown==true)
		{
			languagesKnown[2] = cb5.getLabel();
		}
		
		stateOfLanguagesKnown = cb6.getState();
		if(stateOfLanguagesKnown==true)
		{
			languagesKnown[3] = cb6.getLabel();
		}
		
		stateOfLanguagesKnown = cb7.getState();
		if(stateOfLanguagesKnown==true)
		{
			languagesKnown[4] = cb7.getLabel();
		}
		
		stateOfLanguagesKnown = cb8.getState();
		if(stateOfLanguagesKnown==true)
		{
			languagesKnown[5] = cb8.getLabel();
		}
		
		stateOfLanguagesKnown = cb9.getState();
		if(stateOfLanguagesKnown==true)
		{
			languagesKnown[6] = cb9.getLabel();
		}
		
		for(String language : languagesKnown)
		{
			totalLanguagesKnown = totalLanguagesKnown +language+" ";
		}
		
		System.out.println(totalLanguagesKnown);
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root");		
			PreparedStatement prst1 = con.prepareStatement("insert into primarydetails values(?,?,?,?,?)");
			prst1.setString(1, name);
			prst1.setString(2, dateOfBirth);
			prst1.setString(3, email);
			prst1.setString(4, mobile);
			prst1.setString(5, gender);
			prst1.execute();
			
			PreparedStatement prst2 = con.prepareStatement("insert into locations values(?,?,?,?)");
			prst2.setString(1, address);
			prst2.setString(2, city);
			prst2.setString(3, pincode);
			prst2.setString(4, state);
			prst2.execute();
			
			PreparedStatement prst3 = con.prepareStatement("insert into education values(?,?,?,?)");
			prst3.setString(1, sscDetails);
			prst3.setString(2, hscDetails);
			prst3.setString(3, beDetails);
			prst3.setString(4, meDetails);
			prst3.execute();
			
			PreparedStatement prst4 = con.prepareStatement("insert into technical values(?,?)");
			prst4.setString(1, totalLanguagesKnown);
			prst4.setString(2, courseAppliedFor);
			prst4.execute();
		}
		catch(Exception ex)
		{
			
		}
	}
}
