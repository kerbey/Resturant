import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GUIClass extends JPanel implements ActionListener
{
	static String forGDrawing, food, order;
	Graphics g;
	Scanner input= new Scanner(System.in);
	String userPassword, Input="";
	public JPanel buttonPanel, textPanel;
	JButton JButtonNumber, save, delete;
	public JFrame frame, updateframe;
	JTextField textbox;
	int chances=1, button=0;
	JPasswordField MainPassword= new JPasswordField();
	StringBuilder enterPassword= new StringBuilder("");
	int counterWaffles=0, CounterEggs=0, CounterPanckes=0, counterBacon=0,
	counterOrangeJuice=0, counterVanillaIceCream=0, counterChocolateIceCream=0, counterStrawberryIceCream=0
	,counterSteamedChicken=0, counterSlicedPork=0, counterRicePork=0, counterGrilledChicken=0, counterCrispyChickenSandwich=0
	,counterFishSandwich=0, counterSteakRice=0, counterMashed=0, counterSpaghetti=0, counterLobster=0;
	static CategoryList Clist = new CategoryList("meals");
	FoodItemClass item= new FoodItemClass();
	static LinkedList Llist = new LinkedList();
	public void paint(Graphics g)
	{	
		int fontSize = 20;
		g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
		g.setColor(Color.BLACK);
		g.drawString(getForGDrawing(), 50, 20);//first number moves string right second moves it up
		g.drawString(getFood(), 50, 400);//first number moves string right second moves it up
	}
	public String getFood()
	{
		return food;
	}
	public void setFood(String food)
	{
		this.food = food;
	}
	public String getForGDrawing()
	{
		return forGDrawing;
	}
	public void setForGDrawing(String forGDrawing)
	{
		this.forGDrawing = forGDrawing;
	}
	public void Search()
	{
		System.out.println("search method");
		setForGDrawing("select your prefered food category");
		setFood(" ");
		frame = new JFrame(" Food entry");
		frame.getContentPane().add(new GUIClass());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();

		buttonPanel.setLayout(new GridLayout(2,1));	
		//textbox= new JTextField(50);
		//textbox.setPreferredSize(new Dimension(300,100));
		//textPanel.add(textbox);
		JButton breakfast = new JButton("breakfast");
		breakfast.addActionListener(this);
		breakfast.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				Input="breakfast";
				Clist.Add(Input);//unblock if test doesnt work
				//System.out.println("arraylist ="+list.toString());
				Clist.Search(Input);
				breakfast();
			}
		});
		buttonPanel.add(breakfast);
		JButton lunch = new JButton("lunch");
		lunch.addActionListener(this);
		lunch.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				Input="lunch";
				Clist.Search(Input);
				Clist.Add(Input);
				lunch();
			}
		});
		buttonPanel.add(lunch);
		JButton dinner = new JButton("dinner");
		dinner.addActionListener(this);
		dinner.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				//list = new CategoryList("dinner");
				Input="dinner";
				Clist.Search(Input);
				Clist.Add(Input);
				dinner();
			}
		});
		buttonPanel.add(dinner);
		JButton dessert = new JButton("dessert");
		dessert.addActionListener(this);
		dessert.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				//list = new CategoryList("");
				Input="dessert";
				Clist.Search(Input);
				Clist.Add(Input);
				dessert();
			}
		});
		buttonPanel.add(dessert);
		JButton Add=new JButton("Add");
		Add.addActionListener(this);
		Add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		buttonPanel.add(Add);
		JButton specialOrder=new JButton("specialOrder");
		specialOrder.addActionListener(this);
		specialOrder.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Clist.Add("special order");
				specialOrder();
			}
		});
		buttonPanel.add(specialOrder);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		saveAction action = new saveAction();
		new deleteAction();
		//buttonPanel.add(new enterAction());
		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}	
	public void Add()
	{
		System.out.println("Add method");
		setForGDrawing("enter in additional food choices");
		frame = new JFrame(" Food entry");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		//textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		//textbox= new JTextField(50);
		//textbox.setPreferredSize(new Dimension(300,100));
		//textPanel.add(textbox);
		JButton breakfast = new JButton("breakfast");
		breakfast.addActionListener(this);
		breakfast.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				//list = new CategoryList("breakfast");
				Input="breakfast";
				Clist.Add(Input);
				//	System.out.println("arraylist ="+list.toString());
				//Clist.Search(Input);
				breakfast();
			}
		});
		buttonPanel.add(breakfast);
		JButton lunch = new JButton("lunch");
		lunch.addActionListener(this);
		lunch.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				// list = new CategoryList("lunch");
				Input="lunch";
				//Clist.Search(Input);
				//System.out.println("arraylist ="+list.toString());
				Clist.Add(Input);// unblock if test wont work
				lunch();
			}
		});
		buttonPanel.add(lunch);
		JButton dinner = new JButton("dinner");
		dinner.addActionListener(this);
		dinner.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				// list = new CategoryList("dinner");
				Input="dinner";
				//Clist.Search(Input);
				//System.out.println("arraylist ="+list.toString());
				Clist.Add(Input);
				dinner();
			}
		});
		buttonPanel.add(dinner);
		JButton dessert = new JButton("dessert");
		dessert.addActionListener(this);
		dessert.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				// list = new CategoryList("");
				Input="dessert";
				//Clist.Search(Input);
				//System.out.println("arraylist ="+list.toString());
				Clist.Add(Input);
				dessert();
			}
		});
		buttonPanel.add(dessert);
		JButton Add=new JButton("Add");
		Add.addActionListener(this);
		Add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
			}
		});
		buttonPanel.add(Add);
		JButton specialOrder=new JButton("specialOrder");
		specialOrder.addActionListener(this);
		specialOrder.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				Clist.Add("special order");
				specialOrder();
			}
		});
		buttonPanel.add(specialOrder);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		saveAction action = new saveAction();
		new deleteAction();
		//buttonPanel.add(new enterAction());
		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);			
	}
	public void orderSpecialOrder()
	{
		order=textbox.getText().toLowerCase();
		if(order.contains("steamed chicken"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(4.44);
			counterSteamedChicken++;
			item.Quantity(counterSteamedChicken, order);
		}
		else if(order.contains("sliced pork with mixed mushrooms"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(9.99);
			counterSlicedPork++;
			item.Quantity(counterSlicedPork, order);
		}
		else if(order.contains("rice with grilled pork"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(5.55);
			counterRicePork++;
			item.Quantity(counterRicePork, order);
		}
	}
	public void specialOrder()
	{
		System.out.println("special order");
		setForGDrawing("select your favorite food");
		setFood("steamed chicken(4.44), sliced pork with mixed mushrooms(9.99), rice with grilled pork(5.55)");
		frame = new JFrame(" special order ");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		textbox= new JTextField(50);
		textbox.setPreferredSize(new Dimension(300,100));
		textPanel.add(textbox);
		JButton Add=new JButton("Add");
		Add.addActionListener(this);
		Add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{					
				orderSpecialOrder();
				item.SpecialOrder(textbox.getText());	
				setFood("");
				Llist.Add(textbox.getText());
				System.out.println("textboxgettext= "+textbox.getText());
				Add();
			}
		});
		buttonPanel.add(Add);
		JButton Save=new JButton("Save");
		Save.addActionListener(this);
		Save.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				orderSpecialOrder();
				item.SpecialOrder(textbox.getText());
				Llist.Add(textbox.getText());//add to category arraylist 
				System.out.println("textboxgettext= "+textbox.getText());
				update();
			}
		});
		buttonPanel.add(Save);
		new deleteAction();
		//buttonPanel.add(new enterAction());
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}
	public void breakfast()
	{
		System.out.println("breakfast method");
		setForGDrawing("select your favorite food");
		setFood("waffles (2.21), eggs (4.01), pancakes(5.23), bacon(2.22), orangejuice(5.51)");
		frame = new JFrame(" breakfast ");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		textbox= new JTextField(50);
		textbox.setPreferredSize(new Dimension(300,100));
		textPanel.add(textbox);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		//saveAction action = new saveAction();
		JButton Add=new JButton("Add");
		Add.addActionListener(this);
		Add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				setFood("");
				Llist.Add(textbox.getText());
				System.out.println("textboxgettext= "+textbox.getText());
				// try doing add category after adding to the food list
				Add();
			}
		});
		buttonPanel.add(Add);
		JButton small=new JButton("small");
		small.addActionListener(this);
		small.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				orderBreakfast();
				item.Size(0);
			}
		});
		buttonPanel.add(small);
		JButton medium=new JButton("medium");
		medium.addActionListener(this);
		medium.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderBreakfast();
				item.Size(1);
			}
		});
		buttonPanel.add(medium);
		JButton large=new JButton("large");
		large.addActionListener(this);
		large.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				orderBreakfast();
				item.Size(2);
			}
		});
		buttonPanel.add(large);//*/

		JButton Save=new JButton("Save");
		Save.addActionListener(this);
		Save.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				Llist.Add(textbox.getText());
				System.out.println("textboxgettext= "+textbox.getText());
				update();
			}
		});
		buttonPanel.add(Save);
		new deleteAction();
		//buttonPanel.add(new enterAction());

		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}	
	public void orderBreakfast()
	{//	setFood("waffles (2.21), eggs (4.01), pancakes(5.23), bacon(2.22), orangejuice(5.51)");

		order=textbox.getText().toLowerCase();
		if(order.contains("waffles"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(2.21);
			counterWaffles++;
			item.Quantity(counterWaffles, order);
		}
		else if(order.contains("eggs"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(4.01);
			CounterEggs++;
			item.Quantity(CounterEggs, order);
		}
		else if(order.contains("pancakes"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(5.23);
			CounterPanckes++;
			item.Quantity(CounterPanckes, order);
		}
		else if(order.contains("bacon"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(2.22);
			counterBacon++;
			item.Quantity(counterBacon, order);
		}
		else if(order.contains("orange juice"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(5.51);
			counterOrangeJuice++;
			item.Quantity(counterOrangeJuice, order);
		}
	}
	public void lunch()
	{
		System.out.println("lunch method");
		setForGDrawing("select your favorite food");
		setFood("grilled chicken sandwich(4.41), crispyChickenSandwich(2.23), fishSandwich(1.12)");
		frame = new JFrame(" lunch ");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		//textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		textbox= new JTextField(50);
		textbox.setPreferredSize(new Dimension(300,100));
		textPanel.add(textbox);
		Llist.Add(textbox.getText());
		
		JButton small=new JButton("small");
		small.addActionListener(this);
		small.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderLunch();
				item.Size(0);
			}
		});
		buttonPanel.add(small);
		JButton medium=new JButton("medium");
		medium.addActionListener(this);
		medium.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderLunch();
				item.Size(1);
			}
		});
		buttonPanel.add(medium);
		JButton large=new JButton("large");
		large.addActionListener(this);
		large.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderLunch();
				item.Size(2);
			}
		});
		buttonPanel.add(large);
		JButton Add=new JButton("Add");
		Add.addActionListener(this);
		Add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				setFood("");
				Llist.Add(textbox.getText());
				System.out.println("textboxgettext= "+textbox.getText());
				Add();
			}
		});
		buttonPanel.add(Add);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		saveAction action = new saveAction();
		new deleteAction();
		//buttonPanel.add(new enterAction());

		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}
	public void orderLunch()
	{
		 order=textbox.getText().toLowerCase();
		if(order.contains("grilled chicken sandwich"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(4.41);
			counterGrilledChicken++;
			item.Quantity(counterGrilledChicken, order);
		}
		else if(order.contains("crispy chicken sandwich"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(2.23);
			counterCrispyChickenSandwich++;
			item.Quantity(counterCrispyChickenSandwich, order);
		}
		else if(order.contains("fish sandwich"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(1.12);
			counterFishSandwich++;
			item.Quantity(counterFishSandwich, order);
		}
	}
	public void dinner()
	{
		System.out.println("dinner method");
		setForGDrawing("select your favorite food");
		setFood("Steak and rice(4.44), mashedPotatoesWithGravy(3.01), spaghettiWithMeatBalls(8.99), LobsterWithSamon(6.55)");
		frame = new JFrame(" dinner ");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		//textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		textbox= new JTextField(50);
		textbox.setPreferredSize(new Dimension(300,100));
		textPanel.add(textbox);
		Llist.Add(textbox.getText());
		JButton small=new JButton("small");
		small.addActionListener(this);
		small.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderDinner();
				item.Size(0);
			}
		});
		buttonPanel.add(small);
		JButton medium=new JButton("medium");
		medium.addActionListener(this);
		medium.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderDinner();
				item.Size(1);
			}
		});
		buttonPanel.add(medium);
		JButton large=new JButton("large");
		large.addActionListener(this);
		large.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderDinner();
				item.Size(2);
			}
		});
		buttonPanel.add(large);
		JButton Add=new JButton("Add");
		Add.addActionListener(this);
		Add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				setFood("");
				Llist.Add(textbox.getText());
				System.out.println("textboxgettext= "+textbox.getText());
				Add();
			}
		});
		buttonPanel.add(Add);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		saveAction action = new saveAction();
		new deleteAction();
		//buttonPanel.add(new enterAction());

		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}	
	public void orderDinner()
	{//("Steak and rice(4.44), mashedPotatoesWithGravy(3.00), spaghettiWithMeatBalls(8.99), LobsterWithSamon(6.55)");
		 order=textbox.getText().toLowerCase();
		if(order.contains("steak and rice"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(4.44);
			counterSteakRice++;
			item.Quantity(counterSteakRice, order);
		}
		else if(order.contains("mashed potatoes with gravy"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(3.01);
			counterMashed++;
			item.Quantity(counterMashed, order);
		}
		else if(order.contains("spaghetti with meat balls"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(8.99);
			counterSpaghetti++;
			item.Quantity(counterSpaghetti, order);
		}
		else if(order.contains("lobster with samon"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(6.55);
			counterLobster++;
			item.Quantity(counterLobster, order);
		}
	}
	public void dessert()
	{
		System.out.println("dessert");
		setForGDrawing("select your favorite food");
		setFood("VanillaIceCream(4.01), chocolateIceCream(4.01), strawberryIceCream(4.01)");
		frame = new JFrame(" desserts ");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		//textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		textbox= new JTextField(50);
		textbox.setPreferredSize(new Dimension(300,100));
		textPanel.add(textbox);
		Llist.Add(textbox.getText());

		/*JButton vanillaIceCream= new JButton("vanilla IceCream");
		vanillaIceCream.addActionListener(this);
		vanillaIceCream.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				counterVanillaIceCream++;
				Input="vanilla icecream";
				//LinkedList list = new LinkedList();
				list.Add(Input);
				FoodItemClass food= new FoodItemClass();
				food.Quantity(counterVanillaIceCream);
				//lunch();
			}
		});	
		buttonPanel.add(vanillaIceCream);

		JButton chocolateIceCream= new JButton("chocolate IceCream");
		chocolateIceCream.addActionListener(this);
		chocolateIceCream.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				counterChocolateIceCream++;
				Input="chocolate IceCream";
				//LinkedList list = new LinkedList();
				list.Add(Input);
				FoodItemClass food= new FoodItemClass();
				food.Quantity(counterChocolateIceCream);
				//lunch();
			}
		});	
		buttonPanel.add( chocolateIceCream);

		JButton StrawberryIceCream= new JButton("Strawberry IceCream");
		StrawberryIceCream.addActionListener(this);
		StrawberryIceCream.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				counterStrawberryIceCream++;
				Input="Strawberry IceCream";
				//LinkedList list = new LinkedList();
				list.Add(Input);
				FoodItemClass food= new FoodItemClass();
				food.Quantity(counterStrawberryIceCream);
				//lunch();
			}
		});	
		buttonPanel.add( StrawberryIceCream);//*/
		JButton small=new JButton("small");
		small.addActionListener(this);
		small.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderDessert();
				item.Size(0);
			}
		});
		buttonPanel.add(small);
		JButton medium=new JButton("medium");
		medium.addActionListener(this);
		medium.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderDessert();
				item.Size(1);
			}
		});
		buttonPanel.add(medium);
		JButton large=new JButton("large");
		large.addActionListener(this);
		large.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				orderDessert();
				item.Size(2);
			}
		});
		buttonPanel.add(large);
		JButton Add=new JButton("Add");
		Add.addActionListener(this);
		Add.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				setFood("");
				Llist.Add(textbox.getText());
				System.out.println("textboxgettext= "+textbox.getText());
				Add();
			}
		});
		buttonPanel.add(Add);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		saveAction action = new saveAction();
		new deleteAction();
		//buttonPanel.add(new enterAction());

		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}	
	public void orderDessert()
	{//("VanillaIceCream(4.00), chocolateIceCream(4.00), strawberryIceCream(4.00)");
		order=textbox.getText().toLowerCase();
		if(order.contains("vanilla ice cream"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(4.01);
			counterVanillaIceCream++;
			item.Quantity(counterVanillaIceCream, order);
		}
		else if(order.contains("chocolate ice cream"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(4.01);
			counterChocolateIceCream++;
			item.Quantity(counterChocolateIceCream, order);
		}
		else if(order.contains("strawberry ice cream"))
		{
			System.out.println("textboxgettextt="+textbox.getText());
			item.Price(4.01);
			counterStrawberryIceCream++;
			item.Quantity(counterStrawberryIceCream, order);
		}
	}
	public void update()
	{
		System.out.println("update method");
		frame = new JFrame(" Food update");
		setForGDrawing("are you sure?");
		setFood("");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//textPanel= new JPanel();
		buttonPanel= new JPanel();
		//textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		//textbox= new JTextField(50);
		//textbox.setPreferredSize(new Dimension(300,100));
		//textPanel.add(textbox);
		JButton yes = new JButton("yes");
		JButton no = new JButton("no");

		yes.addActionListener(this);
		yes.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("1 final category list to string ="+Clist.toString());
				System.out.println("2 final food list to string ="+Llist.toString());
				//item.Description(Llist.toString());
				//System.exit(0);
				//DriverClass drive= new DriverClass();
				//DriverClass.textfile button = drive.new textfile();
				//DriverClass.textfile.textfile();
				DriverClass.textStream.close();
				DriverClass.textfile nestedObject =new DriverClass.textfile();
			}
		});
		no.addActionListener(this);
		no.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("1 final category list to string ="+Clist.toString());
				System.out.println("2 final food list to string ="+Llist.toString());
				//item.Description(Llist.toString());
				Add();
			}
		});
		buttonPanel.add(yes);
		buttonPanel.add(no);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);

		//frame.add(textPanel, BorderLayout.NORTH);
		//enterAction action = new enterAction();
		//new clearAction();
		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}
	public void confirmDelete()
	{
		System.out.println("confirm delete method");
		setForGDrawing("select the food you want to delete");
		//setFood("");
		frame = new JFrame(" confirm delete ");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		textbox= new JTextField(50);
		textbox.setPreferredSize(new Dimension(300,100));
		textPanel.add(textbox);
		//System.out.println("listst= "+Llist.toString());
		//System.out.println("listst= "+Clist.toString());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.add(textPanel, BorderLayout.NORTH);
		//saveAction action = new saveAction();
		JButton Save=new JButton("Save");
		Save.addActionListener(this);
		Save.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				System.out.println("textbox.gettext()= "+textbox.getText());
				Llist.delete(textbox.getText());
				System.out.println(Llist.toString());
				update();
			}
		});
		buttonPanel.add(Save);
		//new deleteAction();
		//buttonPanel.add(new enterAction());
		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}
	public void Delete()
	{
		System.out.println("Delete method");
		setForGDrawing("remove the food of your choice");
		frame = new JFrame("remove Food");
		frame.getContentPane().add( new GUIClass());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel= new JPanel();
		buttonPanel= new JPanel();
		textPanel.setLayout(new GridLayout(1,3));//the first number controls height other number controls width
		buttonPanel.setLayout(new GridLayout(2,1));

		//textbox= new JTextField(50);
		//textbox.setPreferredSize(new Dimension(300,100));
		//textPanel.add(textbox);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		//frame.add(textPanel, BorderLayout.NORTH);
		JButton breakfast = new JButton("breakfast");
		breakfast.addActionListener(this);
		breakfast.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				Input="breakfast";
				//System.out.println("arraylist ="+list.toString());
				setFood("waffles (2.20), eggs (4.00), pancakes(5.23), bacon(2.20), orangejuice(5.50)");
				//System.out.println("inputbreakfast= "+Input);
				Clist.delete(Input);
				confirmDelete();
			}
		});
		buttonPanel.add(breakfast);
		JButton lunch = new JButton("lunch");
		lunch.addActionListener(this);
		lunch.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				Input="lunch";
				setFood("grilled chicken sandwich(4.40), crispyChickenSandwich(2.23), crispyChickenSandwich(4.44), fishSandwich(1.12)");
				Clist.delete(Input);
				confirmDelete();
			}
		});
		buttonPanel.add(lunch);
		JButton dinner = new JButton("dinner");
		dinner.addActionListener(this);
		dinner.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				//list = new CategoryList("dinner");
				Input="dinner";
				setFood("Steak and rice(4.44), mashedPotatoesWithGravy(3.00), spaghettiWithMeatBalls(8.99), LobsterWithSamon(6.55)");
				Clist.delete(Input);
				confirmDelete();
			}
		});
		buttonPanel.add(dinner);
		JButton dessert = new JButton("dessert");
		dessert.addActionListener(this);
		dessert.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				//list = new CategoryList("");
				Input="dessert";
				setFood("VanillaIceCream(4.00), chocolateIceCream(4.00), strawberryIceCream(4.00)");
				Clist.delete(Input);
				confirmDelete();
			}
		});
		buttonPanel.add(dessert);
		JButton specialOrder=new JButton("specialOrder");
		specialOrder.addActionListener(this);
		specialOrder.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{	
				Input="special order";
				setFood("steamed chicken(4.44), sliced pork with mized mushrooms(9.99), rice served with grilled pork(5.55)");
				Clist.delete(Input);
				confirmDelete();
			}
		});
		buttonPanel.add(specialOrder);

		/*JButton delete= new JButton("delete");
		delete.addActionListener(new ActionListener()
		{@Override
			public void actionPerformed(ActionEvent e)
		{
			Input+=((JButton)e.getSource()).getText();
			//MainPassword.setText(Input);
			//textbox.setText(Input);
			//connect to other class to get rid of 
			//food that's typed in
			textbox.setText(Input);
			Llist.delete(textbox.getText());
			//Llist.delete(Input);
			System.out.println("the list From THe main Class is = "+	 Llist.getString());
			FoodItemClass item= new FoodItemClass();
			item.Description(Llist.getString());
		}
		});*/
		saveAction action = new saveAction();
		//new deleteAction();
		Random number= new Random();
		frame.setBackground(new Color(number.nextInt()));
		frame.setSize(new Dimension(800,600));
		frame.setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
	}
	public class saveAction implements ActionListener  
	{
		public saveAction()
		{
			save= new JButton("save");
			buttonPanel.add(save);
			save.addActionListener(this);
			save.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					//System.out.println("textbox= "+textbox.getText());
					//	k
					/*Input+=textbox.getText(); go to add method for linked list
					textbox.setText(Input);				
					textbox.getText();//goto category list class and throw in what the user entered
					CategoryList list = new CategoryList();
					Node pointer = null;*/

					/*Input="breakfast";
					list.Add(Input);
					//System.out.println("arraylist ="+list.toString());
					list.Search(Input);*/


					//Llist.Add(textbox.getText());
					//Llist.Search(textbox.getText());
					update();
				}
			});
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==save)
			{
				{
				}
			}
		}
	}
	public class deleteAction implements ActionListener
	{
		public deleteAction()
		{
			delete= new JButton("delete");		
			buttonPanel.add(delete);
			delete.addActionListener(this);
			delete.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
				}
			});
		}		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==delete)
			{
				//Input = "";
				//textbox.setText("");//clears text box
				Delete();
			}
		}
	}	
}
