//����� ��������������� �������


//���� �������������� �������, ��� ���������� ����������� ��� ���������� ������� ������ 
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//��� ����� � ������� Frame, ������������ ��������� KeyListener, ActionListener
public class T9_Mob extends Frame implements KeyListener, ActionListener {

//����������:
	//����������� ���������������� ���� ����� ���������������� ������
	private static final long serialVersionUID = 1L;
	//������
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bcall;
	//����� ��������	
	private Label label;
	//��� ����� � ������
	private String is="", os=""; //input and output strings
	
	//����������� ������
	public T9_Mob (String s) {
		
		//����� ������������ Frame ������ Frame, ��������� ������� ����� ������
		//���������� �������� ���������� �� ��������� - BorderLayout
		super(s);
		
		//��������� ����� ���� ������ (������)
		setBackground(Color.black);
		//��������� �������� ������
		setSize(160,250);
		//��������� ��������� ������ (�������)
		setVisible(true);
		//�������� ����� ��� ������ � ������� ��������
		label = new Label();
		//��������� �������� ������ ��������
		label.setBounds(10,40,140,30); //North, South, East, West
		//��������� ����� ������ ��������
		label.setBackground(Color.white);
		//���������� �� ������ ������ ��������
		add(label);
		
		//�������� ������, ��������� �� �����, ��������, ���������� �� �� �����, ���������� ���������� ��� ���
		b1 = new Button();
		b1.setBackground(Color.white);
		b1.setBounds(10,80,40,30);
		b1.setLabel("1");
		add(b1);
		b1.addActionListener(this);
	    
		b2 = new Button();
		b2.setBackground(Color.white);
		b2.setBounds(60,80,40,30);
		b2.setLabel("2");
		add(b2);
		b2.addActionListener(this);
		
		b3 = new Button();
		b3.setBackground(Color.white);
		b3.setBounds(110,80,40,30);
		b3.setLabel("3");
		add(b3);
		b3.addActionListener(this);
	    
		b4 = new Button();
		b4.setBackground(Color.white);
		b4.setBounds(10,120,40,30);
		b4.setLabel("4");
		add(b4);
		b4.addActionListener(this);
	    
		b5 = new Button();
		b5.setBackground(Color.white);
		b5.setBounds(60,120,40,30);
		b5.setLabel("5");
		add(b5);
		b5.addActionListener(this);
		
		b6 = new Button();
		b6.setBackground(Color.white);
		b6.setBounds(110,120,40,30);
		b6.setLabel("6");
		add(b6);
		b6.addActionListener(this);
	    
		b7 = new Button();
		b7.setBackground(Color.white);
		b7.setBounds(10,160,40,30);
		b7.setLabel("7");
		add(b7);
		b7.addActionListener(this);
	    
		b8 = new Button();
		b8.setBackground(Color.white);
		b8.setBounds(60,160,40,30);
		b8.setLabel("8");
		add(b8);
		b8.addActionListener(this);
		
		b9 = new Button();
		b9.setBackground(Color.white);
		b9.setBounds(110,160,40,30);
		b9.setLabel("9");
		add(b9);
		b9.addActionListener(this);
	    
		b0 = new Button();
		b0.setBackground(Color.white);
		b0.setBounds(10,200,40,30);
		b0.setLabel("0");
		add(b0);
		b0.addActionListener(this);
	    
		bcall = new Button();
		bcall.setBackground(Color.GREEN);
		bcall.setBounds(60,200,90,30);
		bcall.setLabel("������");
		add(bcall);
		bcall.addActionListener(this);
		addKeyListener(this);
		
		//���������� ��������� ��� ���� (������)
		addWindowListener(new WindowAdapter(){
			//�� �������� ���� (������)
			public void windowClosing(WindowEvent ev) {
				//��� ����� ��������� �� ������� "ev", �������� �������� ������ ��� ���������� ������ � ���
				Frame frame = (Frame)ev.getSource();
				//��������� ����������� ������
				frame.setVisible(false);
				//������������ ������ �� ������
				frame.dispose();
				//���������� ������ ���������
				System.exit(0);
			} //windowClosing
	    } //WindowAdapter
		); //addWindowListener
	} //T9_Mob constructor

	//�����, ������������ ��� ����� �������� ������������
	public void actionPerformed (ActionEvent e) {
		//��� ����� ��������� �� ������� "e", �������� �������� ������� ��� ���������� ������ � ���
		Object source = e.getSource();
		//������ ���������� "����_��_��������" � ����������� �� �������� "������"
		boolean input_is_not_complete = true;
		//���� ������� ����� 11 ��������, �� ������� ������ �����, �.�. ���� ������ ������
		if (is.length()>11) {is="";} else {
			//���� ������ ������ ������, �� ��������� � ����� ����� (������ ��������) �������
			if (source==b1) {is=is+"1";} else {
				//� ��� ����� �� ������ "0" � "9" 
				if (source==b2) {is=is+"2";} else {
					if (source==b3) {is=is+"3";} else { 
						if (source==b4) {is=is+"4";} else {
							if (source==b5) {is=is+"5";} else {
								if (source==b6) {is=is+"6";} else {
									if (source==b7) {is=is+"7";} else {
										if (source==b8) {is=is+"8";} else {
											if (source==b9) {is=is+"9";} else {
												if (source==b0) {is=is+"0";} else {
													//���� ������ ������ "������"... 
													if (source==bcall) {
														//... � ���� ���� ����� ������...
														if (is.equals("")==true) {
															//�� ��������, ��� ���� ������� 
															input_is_not_complete=false;
															//� ������� ������� "������� �����"
															os = "������� �����";
														//� �����, ���� ���� ����� �� ������, ������� ������� "����" ��� ������������� ����������� ������ 
														} else {
															char ch=is.charAt(0);
															if ((is.length() == 7) && (ch == '2')) {
																input_is_not_complete = false;
																os="����";
															} else {
																if ((is.length() == 7) && (ch == '3')) {
																	input_is_not_complete=false;
																	os="����";
																} else {
																	if ((is.length() == 11) && (ch == '8')) {
																		input_is_not_complete=false;
																		os="����";	
																	} else {
																		if (is.equals("911") == true) {
																			input_is_not_complete=false;
																			os="������ ��������";
																		} else {
																			if (is.equals("01") == true) {
																				input_is_not_complete=false;
																				os="�������� ������";
																			} else {
																				if (is.equals("02") == true) {
																					input_is_not_complete=false;
																					os="�������";
																				} else {
																					if (is.equals("03") == true) {
																						input_is_not_complete=false;
																						os="������ ������";
																					}       
																				}
																			}	
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} //if (str.length()>11)
		
		//���� ���� �� ��������, �� ������� �� ����� �������� ��, ��� ��������� � ������ ������, � ����� (���� �� ���������)
		if (input_is_not_complete==true) {label.setText(is);} else {
			//������� �� ����� �������� ��, ��� ��������� � ������ ������, ... 
			label.setText(os);
			//... ��������, ��� ���� �� �������� (�������� � ���������� ��������) ...
			input_is_not_complete=true;
			//... � ������� ������ �����
			is="";} //if
	} //public void actionPerformed
	
	//�����, ������������ ��� ������� �������
	public void keyPressed(KeyEvent ke) {
		//���� ������ �������� ������� "1", �� ��������� � ������ ����� �������
	   	if (ke.getKeyCode()==KeyEvent.VK_1) {is=is+"1";} else {
	   		//� ��� �����, �� "9" � "0"
	   		if (ke.getKeyCode()==KeyEvent.VK_2) {is=is+"2";} else {
	   			if (ke.getKeyCode()==KeyEvent.VK_3) {is=is+"3";} else {
	   				if (ke.getKeyCode()==KeyEvent.VK_4) {is=is+"4";} else {
	   					if (ke.getKeyCode()==KeyEvent.VK_5) {is=is+"5";} else {
	   						if (ke.getKeyCode()==KeyEvent.VK_6) {is=is+"6";} else {
	   							if (ke.getKeyCode()==KeyEvent.VK_7) {is=is+"7";} else {
	   								if (ke.getKeyCode()==KeyEvent.VK_8) {is=is+"8";} else {
	   									if (ke.getKeyCode()==KeyEvent.VK_9) {is=is+"9";} else {
	   										if (ke.getKeyCode()==KeyEvent.VK_0) {is=is+"0";} else {
	   										}
	   									}
	   								}
	   							}
	   						}
	   					}
	   				}
	   			}
	   		}
	   	}
	   	//������� �� ����� �������� ������ �����
	   	label.setText(is);
	   	} //keyPressed 
	
	public void keyTyped(KeyEvent ke) {}
	public void keyReleased(KeyEvent ke) {}

	//������� �����, ������������ ����� ����� ������� ���� ������ �� ���������� (����� ����� � �����) 
	public static void main(String[] args) {
    	Frame f = new T9_Mob("������");
    	if (f.isResizable()) {f.setResizable(false);}
    } //main
	
} //T9_Mob class