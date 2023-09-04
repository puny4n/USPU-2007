//блок импорта пакетов, где содержатся необходимые для выполнения задания методы
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//мой класс с предком Frame, использующий слушатели KeyListener, ActionListener
public class T9_Mob extends Frame implements KeyListener, ActionListener {

//переменные:
	//статическое финализированное поле моего сериализируемого класса
	private static final long serialVersionUID = 1L;
	//кнопки
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bcall;
	//экран телефона
	private Label label;
	//для ввода и вывода
	private String is="", os=""; //input and output strings

	//конструктор класса
	public T9_Mob (String s) {

		//вызов конструктора Frame класса Frame, являющегося предком моего класса
		//используем менеджер размещения по умолчанию - BorderLayout
		super(s);

		//установка цвета фона фрейма (чёрный)
		setBackground(Color.black);
		//установка размеров фрейма
		setSize(160,250);
		//установка видимости фрейма (истинно)
		setVisible(true);
		//создание метки для работы с экраном телефона
		label = new Label();
		//установка размеров экрана телефона
		label.setBounds(10,40,140,30); //North, South, East, West
		//установка цвета экрана телефона
		label.setBackground(Color.white);
		//размещение на фрейме экрана телефона
		add(label);

		//создание кнопок, установка их цвета, надписей, добавление их на экран, добавление слушателей для них
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
		bcall.setLabel("Дозвон");
		add(bcall);
		bcall.addActionListener(this);
		addKeyListener(this);

		//добавление слушателя для окна (фрейма)
		addWindowListener(new WindowAdapter(){
			//на закрытие окна (фрейма)
			public void windowClosing(WindowEvent ev) {
				//мой фрейм реагирует на событие "ev", получаем источник фрейма для дальнейшей работы с ним
				Frame frame = (Frame)ev.getSource();
				//установка невидимости фрейма
				frame.setVisible(false);
				//освобождение памяти от фрейма
				frame.dispose();
				//завершение работы программы
				System.exit(0);
			} //windowClosing
	    } //WindowAdapter
		); //addWindowListener
	} //T9_Mob constructor

	//метод, вызываемый при любом действии пользователя
	public void actionPerformed (ActionEvent e) {
		//мой метод реагирует на событие "e", получаем источник объекта для дальнейшей работы с ним
		Object source = e.getSource();
		//создаём переменную "ввод_не_закончен" и присваиваем ей значение "истина"
		boolean input_is_not_complete = true;
		//если набрано более 11 символов, то очищаем строку ввода, т.к. есть ошибка набора
		if (is.length()>11) {is="";} else {
			//если нажата первая кнопка, то добавляем к метке ввода (экрану телефона) единицу
			if (source==b1) {is=is+"1";} else {
				//и так далее до кнопок "0" и "9"
				if (source==b2) {is=is+"2";} else {
					if (source==b3) {is=is+"3";} else {
						if (source==b4) {is=is+"4";} else {
							if (source==b5) {is=is+"5";} else {
								if (source==b6) {is=is+"6";} else {
									if (source==b7) {is=is+"7";} else {
										if (source==b8) {is=is+"8";} else {
											if (source==b9) {is=is+"9";} else {
												if (source==b0) {is=is+"0";} else {
													//если нажата кнопка "Дозвон"...
													if (source==bcall) {
														//и если поле ввода пустое...
														if (is.equals("")==true) {
															//то отмечаем, что ввод окончен...
															input_is_not_complete=false;
															//и выводим надпись "Введине номер"
															os = "Введите номер";
														//а иначе, если поле ввода не пустое, выводим надпись "Алло" или идентификатор специальной службы
														} else {
															char ch=is.charAt(0);
															if ((is.length() == 7) && (ch == '2')) {
																input_is_not_complete = false;
																os="Алло";
															} else {
																if ((is.length() == 7) && (ch == '3')) {
																	input_is_not_complete=false;
																	os="Алло";
																} else {
																	if ((is.length() == 11) && (ch == '8')) {
																		input_is_not_complete=false;
																		os="Алло";	
																	} else {
																		if (is.equals("911") == true) {
																			input_is_not_complete=false;
																			os="Служба спасения";
																		} else {
																			if (is.equals("01") == true) {
																				input_is_not_complete=false;
																				os="Пожарная служба";
																			} else {
																				if (is.equals("02") == true) {
																					input_is_not_complete=false;
																					os="Милиция";
																				} else {
																					if (is.equals("03") == true) {
																						input_is_not_complete=false;
																						os="Скорая помощь";
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

		//если ввод не закончен, то выводим на экран телефона то, что находится в строке ввода, а иначе (если всё нормально)...
		if (input_is_not_complete==true) {label.setText(is);} else {
			//выводим на экран телефона то, что находится в строке вывода, ..
			label.setText(os);
			//отмечаем, что ввод не закончен (возврат к начальному значению)...
			input_is_not_complete=true;
			//и очищаем строку ввода
			is="";} //if
	} //public void actionPerformed

	//метод, вызываемый при нажатии клавиши
	public void keyPressed(KeyEvent ke) {
		//если нажата цифровая клавиша "1", то добавляем в строку ввода единицу
	   	if (ke.getKeyCode()==KeyEvent.VK_1) {is=is+"1";} else {
	   		//и так далее, до "9" и "0"
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
	   	//выводим на экран телефона строку ввода
	   	label.setText(is);
	   	} //keyPressed

	public void keyTyped(KeyEvent ke) {}
	public void keyReleased(KeyEvent ke) {}

	//главный метод, вызываемый сразу после запуска кода класса на выполнение (точка входа в класс)
	public static void main(String[] args) {
    	Frame f = new T9_Mob("Мобила");
    	if (f.isResizable()) {f.setResizable(false);}
    } //main

} //T9_Mob class