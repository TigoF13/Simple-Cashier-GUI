package cashier;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class GUI{
	// constants
	int SCREEN_WIDTH = 1000;
	int SCREEN_HEIGHT = 600;
	int FONT_HEADER1_SIZE = 30;
	int FONT_HEADER2_SIZE = 20;
	int FONT_DEFAULT_SIZE = 15;
	int POSITION_X_LOGIN = (SCREEN_WIDTH/2)-185;
	int POSITION_Y_LOGIN = (SCREEN_HEIGHT/2)-150;
	int POSITION_X_USER = 200;
	int POSITION_Y_USER = 100;
	int POSITION_X_CONTENT = 200;
	int POSITION_Y_CONTENT = 200;
	int arraySize = 100;
	int length;
        Color pastel = new Color(152,168,248) ;
        Color pastel1 = new Color(255, 159, 159) ;
	
	String FRAME_TITLE = "Cashier";
	String ROOT_PASSWORD = "1234567";
	String FONT_DEFAULT = "times-new-roman";

	// objects
	Users users;
	Items items;
	Sales sales;

	// other objects
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss");

	// frame
	JFrame frame;

        //ScrollPane
        JScrollPane MarketScrollPane;        
        
	// panel
	JPanel userLoginPanel;
	JPanel userSignupPanel;
	JPanel userPanel;
	JPanel userProfilePanel;
	JPanel userItemPanel;
	JPanel usersalesPanel;
        JPanel userSalesItemPanel;
        JPanel uservSalesItemPanel;

	JPanel adminLoginPanel;
	JPanel adminPanel;
        JPanel adminItemPanel;
        JPanel adminSalesItemPanel;
        JPanel adminvSalesItemPanel;
	JPanel adminControlPanel;
	JPanel adminviewsalessPanel;	

	// labels
	JLabel labelLogin;
	JLabel labelUsername;
	JLabel labelPassword;
	JLabel labelProfileHeader;
	JLabel labelUserMarketHeader;
	JLabel labelUsersalesHeader;
	JLabel labelProfileUsername;
	JLabel labelProfileMobileNo;
	JLabel labelProfilePassword;
	JLabel labelUserSignup;
	JLabel labelSignupUsername;
	JLabel labelSignupMobileNumber;
	JLabel labelSignupPassword;
	JLabel labelUserMarketItemIDHeader;
	JLabel labelUserMarketItemNameHeader;
	JLabel labelUserMarketPricePerQuantityHeader;
	JLabel[] labelUserMarketItemID;
	JLabel[] labelUserMarketItemName;
	JLabel[] labelUserMarketPricePerQuantity;
	JLabel[] labelUserMarketPrice;
	JLabel labelUserMarketQuantityHeader;
	JLabel labelUserMarketPriceHeader;  
	JLabel labelUserMarketTotalPriceHeader;
	JLabel labelUserMarketTotalPrice;
        JLabel labelUserMarketMoney;
        JLabel labelUserMarketChangeHeader;
        JLabel labelUserMarketChange;
	JLabel labelUserSalesIDHeader;
	JLabel labelUserSalesDateHeader;
	JLabel labelUserSalesTotalPriceHeader;
	JLabel[] labelUserSalesID;
	JLabel[] labelUserSalesDate;
	JLabel[] labelUserSalesTotalPrice;

	JLabel labelAdminLogin;
	JLabel labelAdminPassword;
	JLabel labelAdminMarketHeader;
	JLabel labelAdminControlHeader;
	JLabel labelAdminviewsalessHeader;
	JLabel labelAdminAddItemsHeader;
	JLabel labelAdminControlUserIDHeader;
	JLabel labelAdminControlUsernameHeader;
	JLabel labelAdminControlMobileNoHeader;
	JLabel[] labelAdminControlUserID;
	JLabel[] labelAdminControlUsername;
	JLabel[] labelAdminControlMobileNo;
	JLabel labelAdminMarketItemIDHeader;
	JLabel labelAdminMarketItemNameHeader;
	JLabel labelAdminMarketPriceHeader;
	JLabel[] labelAdminMarketItemID;
	JLabel[] labelAdminMarketItemName;
	JLabel[] labelAdminMarketPrice;
	JLabel labelAdminMarketAddItemName;
	JLabel labelAdminMarketAddPrice;
	JLabel labelAdminSalesIDHeader;
	JLabel labelAdminOrderDateHeader;
	JLabel labelAdminOrderUsernameHeader;
	JLabel labelAdminOrderTotalPriceHeader;
	JLabel[] labelAdminSalesID;
	JLabel[] labelAdminOrderDate;
	JLabel[] labelAdminOrderUsername;
	JLabel[] labelAdminOrderTotalPrice;


	// checkbox
	JCheckBox[] checkboxUsersales;

	JCheckBox[] checkboxAdminControl;
	JCheckBox[] checkboxAdminMarket;
	JCheckBox[] checkboxAdminsales;
	
	// textfields
	JTextField textfieldUsername;
	JTextField textfieldEditUsername;
	JTextField textfieldEditMobileNo;
	JTextField textfieldSignupUsername;
	JTextField textfieldSignupMobileNumber;
        JTextField textfieldUserMarketChange;
	JTextField[] textfieldUserMarketItemQuantity;

	JTextField textfieldAdminMarketAddItemName;
	JTextField textfieldAdminMarketAddPrice;

	// passwordfileds
	JPasswordField passwordFieldUser;
	JPasswordField passfieldEditPassword;
	JPasswordField passwordFieldSignupUser;
	JPasswordField passwordFieldAdmin;
	
	// buttons
	JButton btnUserProfile;
	JButton btnUserLoginAttempt;
	JButton btnUserSignupPanel;
	JButton btnUserMarket;
	JButton btnUsersales;
	JButton btnUserLogout;
	JButton btnUserDeleteAccount;
	JButton btnUserSaveChanges;
	JButton btnUserLoginPanel;
	JButton btnUserSignupAttempt;
	JButton btnUserMarketPurchase;
	JButton btnUserMarketCalculate;
	JButton btnUserOrderView;
	
	JButton btnAdmin;
	JButton btnAdminLoginAtttempt;
	JButton btnAdminUser;
	JButton btnAdminLogout;
	JButton btnAdminControl;
	JButton btnAdminControlDelete;
	JButton btnAdminMarket;
	JButton btnAdminviewsaless;
	JButton btnAdminMarketAdditem;
	JButton btnAdminMarketDelete;
	JButton btnAdminOrderView;

	GUI() throws Exception{
		// objects
		users = new Users();
		items = new Items();
		sales = new Sales();

		// frame
		frame = new JFrame();

                // scrollpane
                
                
                
		// login label
		labelLogin = new JLabel("LOGIN");
		labelLogin.setBounds(POSITION_X_LOGIN+125, POSITION_Y_LOGIN, 120, 60);
		labelLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));
		
		labelUsername = new JLabel("Username ");
		labelUsername.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
		labelUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

		labelPassword = new JLabel("Password ");
		labelPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		labelPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+140, 120, 30);

		// login textfields
		textfieldUsername = new JTextField();
		textfieldUsername.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
		textfieldUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

		passwordFieldUser = new JPasswordField();
		passwordFieldUser.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+140, 250, 30);
		passwordFieldUser.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

		// Buttons
		btnUserLoginAttempt = new JButton("Login");
		btnUserLoginAttempt.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+200, 100, 30);
		btnUserLoginAttempt.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnUserLoginAttempt.setForeground(Color.WHITE);
		btnUserLoginAttempt.setBackground(Color.BLACK);
		btnUserLoginAttempt.setOpaque(true);
		btnUserLoginAttempt.setFocusable(false);
		btnUserLoginAttempt.setBorderPainted(false);
		btnUserLoginAttempt.setFocusPainted(false);

		btnUserSignupPanel = new JButton("Signup");
		btnUserSignupPanel.setBounds(POSITION_X_LOGIN+270, POSITION_Y_LOGIN+200, 100, 30);
		btnUserSignupPanel.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnUserSignupPanel.setForeground(Color.WHITE);
		btnUserSignupPanel.setBackground(Color.BLACK);
		btnUserSignupPanel.setOpaque(true);
		btnUserSignupPanel.setFocusable(false);
		btnUserSignupPanel.setBorderPainted(false);
		btnUserSignupPanel.setFocusPainted(false);

		btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(25, 25, 100, 30);
		btnAdmin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setBackground(pastel);
		btnAdmin.setOpaque(true);
		btnAdmin.setFocusable(false);
		btnAdmin.setBorderPainted(false);
		btnAdmin.setFocusPainted(false);

		// panel
		userLoginPanel = new JPanel();
		userLoginPanel.setLayout(null);
		userLoginPanel.add(labelLogin);
		userLoginPanel.add(labelUsername);
		userLoginPanel.add(textfieldUsername);
		userLoginPanel.add(labelPassword);
		userLoginPanel.add(passwordFieldUser);
		userLoginPanel.add(btnUserLoginAttempt);
		userLoginPanel.add(btnAdmin);
		userLoginPanel.add(btnUserSignupPanel);

		// set content
		frame.setContentPane(userLoginPanel);

		// actions
		btnUserLoginAttempt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("User Login attempt: " + textfieldUsername.getText()+ " " + String.valueOf(passwordFieldUser.getPassword()) + " ");

				String[] userinfo = users.getUserinfo(textfieldUsername.getText());

				if(users.illegalUserTextInput(textfieldUsername.getText()) || users.illegalUserTextInput(String.valueOf(passwordFieldUser.getPassword()))){
					JOptionPane.showMessageDialog(null, "Please provide all the information", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textfieldUsername.getText().equals(userinfo[1]) && String.valueOf(passwordFieldUser.getPassword()).equals(userinfo[3])){				
					int userID = Integer.valueOf(userinfo[0]);
					String username = userinfo[1];
					String mobileNo = userinfo[2];
					String password = userinfo[3];

					System.out.println(username + " user panel");

					// user market elements
					labelUserMarketHeader = new JLabel("MARKET");
					labelUserMarketHeader.setBounds(POSITION_X_USER, POSITION_Y_USER, 400, 30);
					labelUserMarketHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));

					labelUserMarketItemIDHeader = new JLabel("Item ID");
					labelUserMarketItemIDHeader.setBounds(200, 150, 100, 30);
					labelUserMarketItemIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserMarketItemNameHeader = new JLabel("Item Name");
					labelUserMarketItemNameHeader.setBounds(300, 150, 300, 30);
					labelUserMarketItemNameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserMarketPricePerQuantityHeader = new JLabel("Price/Quantity");
					labelUserMarketPricePerQuantityHeader.setBounds(515, 150, 100, 30);
					labelUserMarketPricePerQuantityHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserMarketQuantityHeader = new JLabel("Quantity");
					labelUserMarketQuantityHeader.setBounds(650, 150, 100, 30);
					labelUserMarketQuantityHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserMarketPriceHeader = new JLabel("Price");
					labelUserMarketPriceHeader.setBounds(750, 150, 100, 30);
					labelUserMarketPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
                                        
                                        labelUserMarketMoney = new JLabel("Uang Bayar ");
					labelUserMarketMoney.setBounds(SCREEN_WIDTH-140, 435, 100, 30);
					labelUserMarketMoney.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserMarketTotalPriceHeader = new JLabel("Total Price");
					labelUserMarketTotalPriceHeader.setBounds(630, SCREEN_HEIGHT-110, 100, 30);
					labelUserMarketTotalPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserMarketTotalPrice = new JLabel("0.0");
					labelUserMarketTotalPrice.setBounds(725, SCREEN_HEIGHT-110, 100, 30);
					labelUserMarketTotalPrice.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER2_SIZE));
                                        
					labelUserMarketChangeHeader = new JLabel("Change");
					labelUserMarketChangeHeader.setBounds(630, SCREEN_HEIGHT-75, 100, 30);
					labelUserMarketChangeHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserMarketChange = new JLabel("0.0");
					labelUserMarketChange.setBounds(725, SCREEN_HEIGHT-75, 100, 30);
					labelUserMarketChange.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER2_SIZE));

					textfieldUserMarketItemQuantity = new JTextField[arraySize];

					labelUserMarketItemID = new JLabel[arraySize];
					labelUserMarketItemName = new JLabel[arraySize];
					labelUserMarketPricePerQuantity = new JLabel[arraySize];
					labelUserMarketPrice = new JLabel[arraySize];

					// user profile elements
					labelProfileHeader = new JLabel("PROFILE");
					labelProfileHeader.setBounds(POSITION_X_USER, POSITION_Y_USER, 400, 30);
					labelProfileHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));

					labelProfileUsername = new JLabel("Username");
					labelProfileUsername.setBounds(POSITION_X_USER, POSITION_Y_USER+100, 200, 30);
					labelProfileUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelProfileMobileNo = new JLabel("No Telepon");
					labelProfileMobileNo.setBounds(POSITION_X_USER, POSITION_Y_USER+150, 200, 30);
					labelProfileMobileNo.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelProfilePassword = new JLabel("Password");
					labelProfilePassword.setBounds(POSITION_X_USER, POSITION_Y_USER+200, 200, 30);
					labelProfilePassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					textfieldEditUsername = new JTextField();
					textfieldEditUsername.setText(username);
					textfieldEditUsername.setBounds(POSITION_X_USER+100, POSITION_Y_USER+100, 250, 30);
					textfieldEditUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
					
					textfieldEditMobileNo = new JTextField();
					textfieldEditMobileNo.setText(mobileNo);
					textfieldEditMobileNo.setBounds(POSITION_X_USER+100, POSITION_Y_USER+150, 250, 30);
					textfieldEditMobileNo.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
					
					passfieldEditPassword = new JPasswordField();
					passfieldEditPassword.setText(password);
					passfieldEditPassword.setBounds(POSITION_X_USER+100, POSITION_Y_USER+200, 250, 30);
					passfieldEditPassword.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

					// user sales elements
					labelUsersalesHeader = new JLabel("Sales");
					labelUsersalesHeader.setBounds(POSITION_X_USER, POSITION_Y_USER, 400, 30);
					labelUsersalesHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));

					labelUserSalesIDHeader = new JLabel("Sales ID");
					labelUserSalesIDHeader.setBounds(200, 150, 100, 30);
					labelUserSalesIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserSalesDateHeader = new JLabel("Sales Date");
					labelUserSalesDateHeader.setBounds(300, 150, 300, 30);
					labelUserSalesDateHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelUserSalesTotalPriceHeader = new JLabel("Total Price");
					labelUserSalesTotalPriceHeader.setBounds(600, 150, 100, 30);
					labelUserSalesTotalPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					checkboxUsersales = new JCheckBox[arraySize];
					labelUserSalesID = new JLabel[arraySize];
					labelUserSalesDate = new JLabel[arraySize];
					labelUserSalesTotalPrice = new JLabel[arraySize];

					// user profile buttons
					btnUserProfile = new JButton("Profile");
					btnUserProfile.setBounds(0, 100, 150, 50);
					btnUserProfile.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserProfile.setForeground(Color.WHITE);
					btnUserProfile.setBackground(pastel);
					btnUserProfile.setOpaque(true);
					btnUserProfile.setFocusable(false);
					btnUserProfile.setBorderPainted(false);
					btnUserProfile.setFocusPainted(false);
					btnUserProfile.setEnabled(true);
					
					btnUserDeleteAccount = new JButton("Delete Account");
					btnUserDeleteAccount.setBounds(SCREEN_WIDTH-340, SCREEN_HEIGHT-100, 150, 50);
					btnUserDeleteAccount.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserDeleteAccount.setForeground(Color.WHITE);
					btnUserDeleteAccount.setBackground(Color.RED);
					btnUserDeleteAccount.setOpaque(true);
					btnUserDeleteAccount.setFocusable(false);
					btnUserDeleteAccount.setBorderPainted(false);
					btnUserDeleteAccount.setFocusPainted(false);

					btnUserSaveChanges = new JButton("Save Changes");
					btnUserSaveChanges.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
					btnUserSaveChanges.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserSaveChanges.setForeground(Color.WHITE);
					btnUserSaveChanges.setBackground(pastel);
					btnUserSaveChanges.setOpaque(true);
					btnUserSaveChanges.setFocusable(false);
					btnUserSaveChanges.setBorderPainted(false);
					btnUserSaveChanges.setFocusPainted(false);

					// user market buttons
					btnUserMarket = new JButton("Market");
					btnUserMarket.setBounds(0, 150, 150, 50);
					btnUserMarket.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserMarket.setForeground(Color.WHITE);
					btnUserMarket.setBackground(pastel);
					btnUserMarket.setOpaque(true);
					btnUserMarket.setFocusable(false);
					btnUserMarket.setBorderPainted(false);
					btnUserMarket.setFocusPainted(false);
					btnUserMarket.setEnabled(false);

					btnUserMarketPurchase = new JButton("Bayar");
					btnUserMarketPurchase.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
					btnUserMarketPurchase.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserMarketPurchase.setForeground(Color.WHITE);
					btnUserMarketPurchase.setBackground(pastel1);
					btnUserMarketPurchase.setOpaque(true);
					btnUserMarketPurchase.setFocusable(false);
					btnUserMarketPurchase.setBorderPainted(false);
					btnUserMarketPurchase.setFocusPainted(false);
					btnUserMarketPurchase.setEnabled(false);

					btnUserMarketCalculate = new JButton("Calculate");
					btnUserMarketCalculate.setBounds(170, SCREEN_HEIGHT-100, 150, 50);
					btnUserMarketCalculate.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserMarketCalculate.setForeground(Color.WHITE);
					btnUserMarketCalculate.setBackground(Color.BLACK);
					btnUserMarketCalculate.setOpaque(true);
					btnUserMarketCalculate.setFocusable(false);
					btnUserMarketCalculate.setBorderPainted(false);
					btnUserMarketCalculate.setFocusPainted(false);
                                        
                                        

					// user sales buttons
					btnUsersales = new JButton("Sales");
					btnUsersales.setBounds(0, 200, 150, 50);
					btnUsersales.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUsersales.setForeground(Color.WHITE);
					btnUsersales.setBackground(pastel);
					btnUsersales.setOpaque(true);
					btnUsersales.setFocusable(false);
					btnUsersales.setBorderPainted(false);
					btnUsersales.setFocusPainted(false);
					btnUsersales.setEnabled(true);

					btnUserOrderView = new JButton("View");
					btnUserOrderView.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
					btnUserOrderView.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserOrderView.setForeground(Color.WHITE);
					btnUserOrderView.setBackground(Color.BLACK);
					btnUserOrderView.setOpaque(true);
					btnUserOrderView.setFocusable(false);
					btnUserOrderView.setBorderPainted(false);
					btnUserOrderView.setFocusPainted(false);

					// user logout button
					btnUserLogout = new JButton("Logout");
					btnUserLogout.setBounds(0, SCREEN_HEIGHT-100, 150, 50);
					btnUserLogout.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnUserLogout.setForeground(Color.WHITE);
					btnUserLogout.setBackground(Color.RED);
					btnUserLogout.setOpaque(true);
					btnUserLogout.setFocusable(false);
					btnUserLogout.setBorderPainted(false);
					btnUserLogout.setFocusPainted(false);

                                        
                                        
                                        // user item panel
                                        userItemPanel = new JPanel();
                                        userItemPanel.setBackground(Color.WHITE);
                                        GridBagLayout grid1 = new GridBagLayout();
                                        GridBagConstraints gbc = new GridBagConstraints();
                                        userItemPanel.setLayout(grid1);
                                        userItemPanel.setBounds(200,180,680,5000);
                                        
                                        
					// user market panel
					userPanel = new JPanel();
					userPanel.setBackground(Color.WHITE);
					userPanel.setLayout(null);
					userPanel.add(btnUserProfile);
					userPanel.add(btnUserMarket);
					userPanel.add(btnUsersales);
					userPanel.add(btnUserLogout);
					userPanel.add(labelUserMarketHeader);
					userPanel.add(labelUserMarketItemIDHeader);
					userPanel.add(labelUserMarketItemNameHeader);
					userPanel.add(labelUserMarketPricePerQuantityHeader);
					userPanel.add(btnUserMarketPurchase);
					userPanel.add(labelUserMarketQuantityHeader);
					userPanel.add(labelUserMarketPriceHeader);
					userPanel.add(btnUserMarketCalculate);
					userPanel.add(labelUserMarketTotalPriceHeader);
					userPanel.add(labelUserMarketTotalPrice);
					userPanel.add(labelUserMarketChangeHeader);
					userPanel.add(labelUserMarketChange);
					userPanel.add(labelUserMarketMoney);
					
                                        
                                        
                                        
                                        textfieldUserMarketChange = new JTextField();
					textfieldUserMarketChange.setBounds(SCREEN_WIDTH-170, 465, 150, 30);
					textfieldUserMarketChange.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                        
                                        JScrollPane UserItemScroll = new JScrollPane(userItemPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                                        
                                        // user market scrollpane
                                        UserItemScroll.setBackground(Color.WHITE);
                                        UserItemScroll.setBounds(200,180,650,250);
                                        UserItemScroll.setViewportBorder(null);
                                        UserItemScroll.setViewportView(userItemPanel);
                                        
					for(int i=0; i<=items.newItemID; i++){
						labelUserMarketItemID[i] = new JLabel(String.valueOf(i));
						labelUserMarketItemID[i].setBounds(10, (10+30*(i)), 100, 30);
						labelUserMarketItemID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                gbc.fill = GridBagConstraints.HORIZONTAL;
                                                gbc.gridx = 0;
                                                gbc.gridy = i;
                                                gbc.weightx = 1.25;
                                                userItemPanel.add(labelUserMarketItemID[i],gbc);

						labelUserMarketItemName[i] = new JLabel(items.itemName[i]);
						labelUserMarketItemName[i].setBounds(120, (10+30*(i)), 300, 30);
						labelUserMarketItemName[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                gbc.fill = GridBagConstraints.HORIZONTAL;
                                                gbc.gridx = 1;
                                                gbc.gridy = i;
                                                gbc.weightx = 0.9;
                                                userItemPanel.add(labelUserMarketItemName[i],gbc);

						labelUserMarketPricePerQuantity[i] = new JLabel(String.valueOf(items.price[i]));
						labelUserMarketPricePerQuantity[i].setBounds(350, (10+30*(i)), 100, 30);
						labelUserMarketPricePerQuantity[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                gbc.fill = GridBagConstraints.HORIZONTAL;
                                                gbc.gridx = 2;
                                                gbc.gridy = i;
                                                gbc.weightx = 0.70;
                                                userItemPanel.add(labelUserMarketPricePerQuantity[i],gbc);

						textfieldUserMarketItemQuantity[i] = new JTextField();
						textfieldUserMarketItemQuantity[i].setText("0");
						textfieldUserMarketItemQuantity[i].setBounds(450, (10+30*(i)), 100, 30);
						textfieldUserMarketItemQuantity[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                gbc.fill = GridBagConstraints.HORIZONTAL;
                                                gbc.gridx = 3;
                                                gbc.gridy = i;
                                                gbc.weightx = 0.85;
                                                userItemPanel.add(textfieldUserMarketItemQuantity[i],gbc);

						labelUserMarketPrice[i] = new JLabel();
						labelUserMarketPrice[i].setText("0.0");
						labelUserMarketPrice[i].setBounds(550, (10+30*(i)), 100, 30);
						labelUserMarketPrice[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));	
                                                gbc.fill = GridBagConstraints.HORIZONTAL;
                                                gbc.gridx = 4;
                                                gbc.gridy = i;
                                                gbc.weightx = 1;
						userItemPanel.add(labelUserMarketPrice[i],gbc);
                                                
						
						
						
						
						
						
                                                
                                         
					}
                                        userPanel.add(textfieldUserMarketChange);
                                        userPanel.add(UserItemScroll);
                                        
					// user profile panel
					userProfilePanel = new JPanel();
					userProfilePanel.setBackground(Color.WHITE);
					userProfilePanel.setLayout(null);

					// user order panel
					usersalesPanel = new JPanel();
					usersalesPanel.setBackground(Color.WHITE);
					usersalesPanel.setLayout(null);
					usersalesPanel.add(labelUserSalesIDHeader);
					usersalesPanel.add(labelUserSalesDateHeader);
					usersalesPanel.add(labelUserSalesTotalPriceHeader);
					usersalesPanel.add(btnUserOrderView);
                                        
                                        uservSalesItemPanel = new JPanel();
                                        uservSalesItemPanel.setBackground(Color.WHITE);
                                        GridBagLayout grid2 = new GridBagLayout();
                                        GridBagConstraints gvc = new GridBagConstraints();
                                        uservSalesItemPanel.setLayout(grid2);
                                        uservSalesItemPanel.setBounds(155,180,800,5000);
                                        
                                        JScrollPane UservSalesItemScroll = new JScrollPane(uservSalesItemPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                                        // user view scrollpane
                                        UservSalesItemScroll.setBackground(Color.WHITE);
                                        UservSalesItemScroll.setBounds(155,180,625,250);
                                        UservSalesItemScroll.setViewportBorder(null);
                                        UservSalesItemScroll.setViewportView(uservSalesItemPanel);

					for(int i=sales.newSalesID, j=0; i>=0; i--){
						if(sales.username[i].equals(username)){
							checkboxUsersales[j] = new JCheckBox();
							checkboxUsersales[j].setBounds(160, (150+30*(j+1)), 30, 30);
							checkboxUsersales[j].setBackground(Color.WHITE);
							checkboxUsersales[j].setFocusable(false);
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 0;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 1.25;
                                                        uservSalesItemPanel.add(checkboxUsersales[j],gvc);
                                                        

							labelUserSalesID[j] = new JLabel(String.valueOf(i));
							labelUserSalesID[j].setBounds(200, (150+30*(j+1)), 100, 30);
							labelUserSalesID[j].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 1;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 4;
                                                        uservSalesItemPanel.add(labelUserSalesID[j],gvc);

							labelUserSalesDate[j] = new JLabel(sales.date[i]);
							labelUserSalesDate[j].setBounds(300, (150+30*(j+1)), 300, 30);
							labelUserSalesDate[j].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 2;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 9;
                                                        uservSalesItemPanel.add(labelUserSalesDate[j],gvc);

							labelUserSalesTotalPrice[j] = new JLabel(String.valueOf(sales.totalPrice[i]));
							labelUserSalesTotalPrice[j].setBounds(600, (150+30*(j+1)), 100, 30);
							labelUserSalesTotalPrice[j].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 3;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 5;
                                                        uservSalesItemPanel.add(labelUserSalesTotalPrice[j],gvc);

							
							
							
							
							j++;
						}
					}
                                        usersalesPanel.add(UservSalesItemScroll);

					// user temp panel
					JPanel tempPanel = new JPanel();
					tempPanel.setLayout(null);

					// action user profile
					btnUserProfile.addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println(username + "User Profile panel");
							btnUserMarket.setEnabled(true);
							btnUserProfile.setEnabled(false);
							btnUsersales.setEnabled(true);

							userProfilePanel.add(labelProfileHeader);
							userProfilePanel.add(labelProfileUsername);
							userProfilePanel.add(textfieldEditUsername);
							userProfilePanel.add(labelProfileMobileNo);
							userProfilePanel.add(textfieldEditMobileNo);
							userProfilePanel.add(labelProfilePassword);
							userProfilePanel.add(passfieldEditPassword);
							userProfilePanel.add(btnUserProfile);
							userProfilePanel.add(btnUserMarket);
							userProfilePanel.add(btnUsersales);
							userProfilePanel.add(btnUserLogout);
							userProfilePanel.add(btnUserSaveChanges);
							userProfilePanel.add(btnUserDeleteAccount);

							frame.setContentPane(userProfilePanel);
							frame.validate();
						}
					});

					btnUserDeleteAccount.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int answer = JOptionPane.showConfirmDialog(null, "Do you really want to delete your account?", "Confirm", JOptionPane.YES_NO_OPTION);
							if(answer == 0){
								System.out.println("User account deleted: " + username);
								users.removeUser(userID);
								System.out.println(users);

								try {
									System.out.println("Svaing userinfo....");
									users.saveUserinfo();
									users = new Users();
								} catch (Exception e) {
									e.printStackTrace();
								}

								frame.setContentPane(userLoginPanel);
								frame.validate();
							}
						}
						
					});

					btnUserSaveChanges.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							String username = textfieldEditUsername.getText();
							String mobileNo = textfieldEditMobileNo.getText();
							String password = String.valueOf(passfieldEditPassword.getPassword());

							System.out.println("Edit userinfo: " + username + " " + mobileNo + " " + password);

							users.editUserinfo(userID, username, mobileNo, password);
							JOptionPane.showMessageDialog(null, "Successfully applied changes!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
						}
						
					});

					// action user market
					btnUserMarket.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println(username + " User Market panel");

							btnUserMarket.setEnabled(false);
							btnUserProfile.setEnabled(true);
							btnUsersales.setEnabled(true);
							
							userPanel.add(btnUserProfile);
							userPanel.add(btnUserMarket);
							userPanel.add(btnUsersales);
							userPanel.add(btnUserLogout);
							userPanel.add(labelUserMarketHeader);

							frame.setContentPane(userPanel);
							frame.validate();
						}
						
					});

					btnUserMarketCalculate.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							try{
								System.out.println(username + " calculate price");
								Double totalPrice = 0.0;

								for(int i=0; i<=items.newItemID; i++){
									Double price = Double.valueOf(labelUserMarketPricePerQuantity[i].getText()) * Double.valueOf(textfieldUserMarketItemQuantity[i].getText());
									labelUserMarketPrice[i].setText(String.valueOf(price));
									totalPrice += price;
								}

								System.out.println(username + " Total price: " + totalPrice);
								labelUserMarketTotalPrice.setText(String.valueOf(totalPrice));

								if(totalPrice == 0.0){
									btnUserMarketPurchase.setEnabled(false);
								}else{
									btnUserMarketPurchase.setEnabled(true);
								}
							}catch(Exception e){
								System.out.println(e);
							}
						}

					});
					
					btnUserMarketPurchase.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							try{
                                                            
                                                                System.out.println(username + " calculate change");
								Double change = 0.0;
                                                                double total = Double.parseDouble(labelUserMarketTotalPrice.getText());
                                                                double money = Double.parseDouble(textfieldUserMarketChange.getText());
                                                                change = money - total;
								System.out.println(username + " Change: " + change);
                                                                labelUserMarketChange.setText(String.valueOf(change));
                                                            
								for(int i=0, j=0; i<=sales.newSalesID; i++){
									if(sales.username[i].equals(username)){
										tempPanel.add(checkboxUsersales[j]);
										tempPanel.add(labelUserSalesID[j]);
										tempPanel.add(labelUserSalesDate[j]);
										tempPanel.add(labelUserSalesTotalPrice[j]);
										j++;
									}
								}

								LocalDateTime now = LocalDateTime.now();
								String date = String.valueOf(dtf.format(now));
								String itemsName = "";
								String itemsPricePerQuantity = "";
								String itemsQuantity = "";
								double totalPrice = Double.valueOf(labelUserMarketTotalPrice.getText());
								
								System.out.println(username + " Purchased  : " + dtf.format(now) + " " + username + " " + totalPrice);
                                                                
                                                                

								for(int i=0; i<=items.newItemID; i++){
									itemsName += items.itemName[i];
									itemsPricePerQuantity += items.price[i];
									itemsQuantity += String.valueOf(Integer.valueOf(textfieldUserMarketItemQuantity[i].getText()));

									if(i != items.newItemID){
										itemsName += "-";
										itemsPricePerQuantity += "-";
										itemsQuantity += "-";
									}
								}

								sales.createSales(date, username, itemsName, itemsPricePerQuantity, itemsQuantity, totalPrice);
								try {
									System.out.println("Saving SalesInfo....");
									sales.saveSalesInfo();
									sales = new Sales();
								} catch (Exception e) {
									e.printStackTrace();
								}

								JOptionPane.showMessageDialog(null, "Successfully purchased!", "Confirm", JOptionPane.INFORMATION_MESSAGE);
								btnUserMarketPurchase.setEnabled(false);

                                                                uservSalesItemPanel = new JPanel();
                                                                uservSalesItemPanel.setBackground(Color.WHITE);
                                                                GridBagLayout grid2 = new GridBagLayout();
                                                                GridBagConstraints gvc = new GridBagConstraints();
                                                                uservSalesItemPanel.setLayout(grid2);
                                                                uservSalesItemPanel.setBounds(155,180,800,5000);
                                        
                                                                JScrollPane UservSalesItemScroll = new JScrollPane(uservSalesItemPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                                                                // user view scrollpane
                                                                UservSalesItemScroll.setBackground(Color.WHITE);
                                                                UservSalesItemScroll.setBounds(155,180,625,250);
                                                                UservSalesItemScroll.setViewportBorder(null);
                                                                UservSalesItemScroll.setViewportView(uservSalesItemPanel);
                                                                
								for(int i=sales.newSalesID, j=0; i>=0; i--){
									if(sales.username[i].equals(username)){
										checkboxUsersales[j] = new JCheckBox();
							checkboxUsersales[j].setBounds(160, (150+30*(j+1)), 30, 30);
							checkboxUsersales[j].setBackground(Color.WHITE);
							checkboxUsersales[j].setFocusable(false);
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 0;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 1.25;
                                                        uservSalesItemPanel.add(checkboxUsersales[j],gvc);
                                                        

							labelUserSalesID[j] = new JLabel(String.valueOf(i));
							labelUserSalesID[j].setBounds(200, (150+30*(j+1)), 100, 30);
							labelUserSalesID[j].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 1;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 4;
                                                        uservSalesItemPanel.add(labelUserSalesID[j],gvc);

							labelUserSalesDate[j] = new JLabel(sales.date[i]);
							labelUserSalesDate[j].setBounds(300, (150+30*(j+1)), 300, 30);
							labelUserSalesDate[j].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 2;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 9;
                                                        uservSalesItemPanel.add(labelUserSalesDate[j],gvc);

							labelUserSalesTotalPrice[j] = new JLabel(String.valueOf(sales.totalPrice[i]));
							labelUserSalesTotalPrice[j].setBounds(600, (150+30*(j+1)), 100, 30);
							labelUserSalesTotalPrice[j].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                        gvc.fill = GridBagConstraints.HORIZONTAL;
                                                        gvc.gridx = 3;
                                                        gvc.gridy = j;
                                                        gvc.weightx = 5;
                                                        uservSalesItemPanel.add(labelUserSalesTotalPrice[j],gvc);
										j++;
									}


								}
							}catch(Exception e){
								System.out.println(e);
							}

						}
						
					});

					// action user sales
					btnUsersales.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println(username + " order panel");

							btnUserMarket.setEnabled(true);
							btnUserProfile.setEnabled(true);
							btnUsersales.setEnabled(false);

							usersalesPanel.add(btnUserProfile);
							usersalesPanel.add(btnUserMarket);
							usersalesPanel.add(btnUsersales);
							usersalesPanel.add(btnUserLogout);
							usersalesPanel.add(labelUsersalesHeader);
                                                        UservSalesItemScroll.setViewportView(uservSalesItemPanel);
                                                        usersalesPanel.add(UservSalesItemScroll);
							frame.setContentPane(usersalesPanel);
							frame.validate();
						}
						
					});
					
					btnUserOrderView.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							for(int i=0; i<=sales.newSalesID; i++){
								if(checkboxUsersales[i].isSelected()){
									System.out.println(i);

									int checkedSalesID = Integer.valueOf(labelUserSalesID[i].getText());
									System.out.println(checkedSalesID);

									JFrame frameviewsales = new JFrame();
                                        
									JLabel labelDate = new JLabel("Date: " + sales.date[checkedSalesID]);
									labelDate.setBounds(100, 50, 400, 50);
									labelDate.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER2_SIZE));
									
									JLabel labelUsername = new JLabel("Username: " + sales.username[checkedSalesID]);
									labelUsername.setBounds(100, 100, 400, 50);
									labelUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER2_SIZE));

									JLabel labelItemIDHeader = new JLabel("Item ID");
									labelItemIDHeader.setBounds(100, 150, 100, 30);
									labelItemIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

									JLabel labelItemNameHeader = new JLabel("Item Name");
									labelItemNameHeader.setBounds(200, 150, 300, 30);
									labelItemNameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

									JLabel labelPricePerQuantityHeader = new JLabel("Price/Quantity");
									labelPricePerQuantityHeader.setBounds(495, 150, 100, 30);
									labelPricePerQuantityHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

									JLabel labelQuantityHeader = new JLabel("Quantity");
									labelQuantityHeader.setBounds(685, 150, 100, 30);
									labelQuantityHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

									JLabel labelPriceHeader = new JLabel("Price");
									labelPriceHeader.setBounds(800, 150, 100, 30);
									labelPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

									JLabel[] labelItemID = new JLabel[arraySize];
									JLabel[] labelItemName = new JLabel[arraySize];
									JLabel[] labelItemPricePerQuantity = new JLabel[arraySize];
									JLabel[] labelItemQuantity = new JLabel[arraySize];
									JLabel[] labelItemPrice = new JLabel[arraySize];

									JLabel labelTotalPrice = new JLabel("Total Price: " + sales.totalPrice[checkedSalesID]);
									labelTotalPrice.setBounds(700, SCREEN_HEIGHT-100, 300, 30);
									labelTotalPrice.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

									String[] arrayItemsName = sales.itemsName[checkedSalesID].split("-");
									String[] arrayItemsPricePerQuantity = sales.itemsPricePerQuantity[checkedSalesID].split("-");
									String[] arrayItemsQuantity = sales.itemsQuantity[checkedSalesID].split("-");
                                                                        
                                                                        userSalesItemPanel = new JPanel();
                                                                        userSalesItemPanel.setBackground(Color.WHITE);
                                                                        GridBagLayout grid1 = new GridBagLayout();
                                                                        GridBagConstraints gcc = new GridBagConstraints();
                                                                        userSalesItemPanel.setLayout(grid1);
                                                                        userSalesItemPanel.setBounds(100,180,800,5000);
                                                                        
                                                                        JScrollPane UserSalesItemScroll = new JScrollPane(userSalesItemPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                                        
                                                                        // user view scrollpane
                                                                        UserSalesItemScroll.setBackground(Color.WHITE);
                                                                        UserSalesItemScroll.setBounds(100,180,850,250);
                                                                        UserSalesItemScroll.setViewportBorder(null);
                                                                        UserSalesItemScroll.setViewportView(userSalesItemPanel);
                                                                        
									// panel
									JPanel viewsalesPanel = new JPanel();
									viewsalesPanel.setBackground(Color.WHITE);
									viewsalesPanel.setLayout(null);	
									viewsalesPanel.add(labelDate);
									viewsalesPanel.add(labelUsername);
									viewsalesPanel.add(labelTotalPrice);
									viewsalesPanel.add(labelPriceHeader);
									viewsalesPanel.add(labelQuantityHeader);
									viewsalesPanel.add(labelPricePerQuantityHeader);
									viewsalesPanel.add(labelItemNameHeader);
									viewsalesPanel.add(labelItemIDHeader);

									try{
										for(int k=0; k<arrayItemsName.length; k++){
											labelItemID[k] = new JLabel(String.valueOf(k));
											labelItemID[k].setBounds(100, 150+30*(k+1), 100, 30);
											labelItemID[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gcc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gcc.gridx = 0;
                                                                                        gcc.gridy = k;
                                                                                        gcc.weightx = 1.25;
                                                                                        userSalesItemPanel.add(labelItemID[k],gcc);

											System.out.println(arrayItemsName[k] + " " + arrayItemsPricePerQuantity[k] + "-" + arrayItemsQuantity[k]);

											labelItemName[k] = new JLabel(arrayItemsName[k]);
											labelItemName[k].setBounds(200, 150+30*(k+1), 300, 30);
											labelItemName[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gcc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gcc.gridx = 1;
                                                                                        gcc.gridy = k;
                                                                                        gcc.weightx = 2;
                                                                                        userSalesItemPanel.add(labelItemName[k],gcc);

											labelItemPricePerQuantity[k] = new JLabel(arrayItemsPricePerQuantity[k]);
											labelItemPricePerQuantity[k].setBounds(500, 150+30*(k+1), 100, 30);
											labelItemPricePerQuantity[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gcc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gcc.gridx = 2;
                                                                                        gcc.gridy = k;
                                                                                        gcc.weightx = 1.85;
                                                                                        userSalesItemPanel.add(labelItemPricePerQuantity[k],gcc);
                                                                                        
											labelItemQuantity[k] = new JLabel(arrayItemsQuantity[k]);
											labelItemQuantity[k].setBounds(700, 150+30*(k+1), 100, 30);
											labelItemQuantity[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gcc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gcc.gridx = 3;
                                                                                        gcc.gridy = k;
                                                                                        gcc.weightx = 1.25;
                                                                                        userSalesItemPanel.add(labelItemQuantity[k],gcc);

                                                                                        
											labelItemPrice[k] = new JLabel(String.valueOf(Double.valueOf(arrayItemsPricePerQuantity[k]) * Double.valueOf(arrayItemsQuantity[k])));
											labelItemPrice[k].setBounds(800, 150+30*(k+1), 100, 30);
											labelItemPrice[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gcc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gcc.gridx = 4;
                                                                                        gcc.gridy = k;
                                                                                        gcc.weightx = 1.1;
                                                                                        userSalesItemPanel.add(labelItemPrice[k],gcc);
		
											
											
											
											
											
										}
                                                                                viewsalesPanel.add(UserSalesItemScroll);
									}catch(Exception e){
										System.out.println(e);
									}

									// frame
									frameviewsales.setContentPane(viewsalesPanel);
									frameviewsales.setTitle(sales.date[i] + " " + sales.username[i]);
									frameviewsales.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
									frameviewsales.setResizable(false);
									frameviewsales.setLocationRelativeTo(null);
									frameviewsales.setVisible(true);
									frameviewsales.setLayout(null);
									break;
								}
							}
						}
						
					});
					
					
					btnUserLogout.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							// set content
							int answer = JOptionPane.showConfirmDialog(null, "Do you really want to signout?", "Confirm", JOptionPane.YES_NO_OPTION);
							if(answer == 0){
								System.out.println("logging out: " + username);
								frame.setContentPane(userLoginPanel);
								frame.validate();
							}
						}
						
					});

					// set content
					frame.setContentPane(userPanel);
					frame.validate();				
				}else{
					JOptionPane.showMessageDialog(null, "Username or Password doesn't match!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});

		btnUserSignupPanel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("User signup panel");
				// elements
				btnUserLoginPanel = new JButton("Login");
				btnUserLoginPanel.setBounds(25, 25, 100, 30);
				btnUserLoginPanel.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnUserLoginPanel.setForeground(Color.WHITE);
				btnUserLoginPanel.setBackground(Color.BLACK);
				btnUserLoginPanel.setOpaque(true);
				btnUserLoginPanel.setFocusable(false);
				btnUserLoginPanel.setBorderPainted(false);
				btnUserLoginPanel.setFocusPainted(false);

				labelUserSignup = new JLabel("Signup");
				labelUserSignup.setBounds(POSITION_X_LOGIN+125, POSITION_Y_LOGIN, 120, 60);
				labelUserSignup.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));
				
				labelSignupUsername = new JLabel("Username ");
				labelSignupUsername.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
				labelSignupUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

				labelSignupMobileNumber = new JLabel("No Telepon ");
				labelSignupMobileNumber.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				labelSignupMobileNumber.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+140, 120, 30);

				labelSignupPassword = new JLabel("Password ");
				labelSignupPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				labelSignupPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+180, 120, 30);

				// login textfields
				textfieldSignupUsername = new JTextField();
				textfieldSignupUsername.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
				textfieldSignupUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				textfieldSignupMobileNumber = new JTextField();
				textfieldSignupMobileNumber.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+140, 250, 30);
				textfieldSignupMobileNumber.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				passwordFieldSignupUser = new JPasswordField();
				passwordFieldSignupUser.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+180, 250, 30);
				passwordFieldSignupUser.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				btnUserSignupAttempt = new JButton("Signup");
				btnUserSignupAttempt.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+260, 100, 30);
				btnUserSignupAttempt.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnUserSignupAttempt.setForeground(Color.WHITE);
				btnUserSignupAttempt.setBackground(Color.BLACK);
				btnUserSignupAttempt.setOpaque(true);
				btnUserSignupAttempt.setFocusable(false);
				btnUserSignupAttempt.setBorderPainted(false);
				btnUserSignupAttempt.setFocusPainted(false);

				// panel
				userSignupPanel = new JPanel();
				userSignupPanel.setBackground(Color.WHITE);
				userSignupPanel.setLayout(null);
				userSignupPanel.add(btnUserLoginPanel);
				userSignupPanel.add(labelUserSignup);
				userSignupPanel.add(labelSignupUsername);
				userSignupPanel.add(labelSignupPassword);
				userSignupPanel.add(labelSignupMobileNumber);
				userSignupPanel.add(textfieldSignupUsername);
				userSignupPanel.add(textfieldSignupMobileNumber);
				userSignupPanel.add(passwordFieldSignupUser);
				userSignupPanel.add(btnUserSignupAttempt);

				// actions
				btnUserLoginPanel.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// set content
						System.out.println("user login panel");
						frame.setContentPane(userLoginPanel);
						frame.validate();
					}
					
				});

				btnUserSignupAttempt.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String signupUsername = textfieldSignupUsername.getText();
						String signupMobileNo = textfieldSignupMobileNumber.getText();
						String signupPassword = String.valueOf(passwordFieldSignupUser.getPassword());

						System.out.println("Signup attempt: "+signupUsername+" " +signupMobileNo+" "+signupPassword);

						// System.out.println(username + " " + mobileNo + " " + password);
						if(signupUsername.equals("") || signupMobileNo.equals("") || signupPassword.equals("")){
							// System.out.println("Please provide all information");
							JOptionPane.showMessageDialog(null, "Please provide all the information", "Error", JOptionPane.ERROR_MESSAGE);
						}else if(signupUsername.equals(users.getUserinfo(signupUsername)[1])){
							// System.out.println("User Already Exists");
							JOptionPane.showMessageDialog(null, "User already Exists", "Error", JOptionPane.ERROR_MESSAGE);
						}else{
							users.createUser(signupUsername, signupMobileNo, signupPassword);
							// System.out.println("New User Created!");
							JOptionPane.showMessageDialog(null, "Successfully Signed Up", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
							frame.setContentPane(userLoginPanel);
						}
					}
					
				});

				// set content
				frame.setContentPane(userSignupPanel);
				frame.validate();
			}
			
		});

		btnAdmin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Admin panel");
				// elements
				labelAdminLogin = new JLabel("Admin Login");
				labelAdminLogin.setBounds(POSITION_X_LOGIN+100, POSITION_Y_LOGIN, 200, 60);
				labelAdminLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));
				labelAdminLogin.setForeground(pastel);

				labelAdminPassword = new JLabel("Root Password");
				labelAdminPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
				labelAdminPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

				passwordFieldAdmin = new JPasswordField();
				passwordFieldAdmin.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
				passwordFieldAdmin.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				btnAdminLoginAtttempt = new JButton("Login");
				btnAdminLoginAtttempt.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+200, 100, 30);
				btnAdminLoginAtttempt.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnAdminLoginAtttempt.setForeground(Color.WHITE);
				btnAdminLoginAtttempt.setBackground(pastel);
				btnAdminLoginAtttempt.setOpaque(true);
				btnAdminLoginAtttempt.setFocusable(false);
				btnAdminLoginAtttempt.setBorderPainted(false);
				btnAdminLoginAtttempt.setFocusPainted(false);

				btnAdminUser = new JButton("User");
				btnAdminUser.setBounds(25, 25, 100, 30);
				btnAdminUser.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnAdminUser.setForeground(Color.WHITE);
				btnAdminUser.setBackground(Color.BLACK);
				btnAdminUser.setOpaque(true);
				btnAdminUser.setFocusable(false);
				btnAdminUser.setBorderPainted(false);
				btnAdminUser.setFocusPainted(false);

				// actions
				btnAdminLoginAtttempt.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {	
						System.out.println("admin login attempt");
						if(!String.valueOf(passwordFieldAdmin.getPassword()).equals(ROOT_PASSWORD)){
							JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Error", JOptionPane.ERROR_MESSAGE);
						}else{
							System.out.println("Admin panel");

							// control labels
							labelAdminControlHeader = new JLabel("CONTROL PANEL");
							labelAdminControlHeader.setBounds(200, 100, 400, 30);
							labelAdminControlHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));

							labelAdminControlUserIDHeader = new JLabel("User ID");
							labelAdminControlUserIDHeader.setBounds(200, 150, 100, 30);
							labelAdminControlUserIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminControlUsernameHeader = new JLabel("Username");
							labelAdminControlUsernameHeader.setBounds(300, 150, 300, 30);
							labelAdminControlUsernameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminControlMobileNoHeader = new JLabel("No Telepon");
							labelAdminControlMobileNoHeader.setBounds(600, 150, 100, 30);
							labelAdminControlMobileNoHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							checkboxAdminControl = new JCheckBox[arraySize];
							labelAdminControlUserID = new JLabel[arraySize];
							labelAdminControlUsername = new JLabel[arraySize];
							labelAdminControlMobileNo = new JLabel[arraySize];

							// market labels
							labelAdminMarketHeader = new JLabel("MARKET");
							labelAdminMarketHeader.setBounds(200, 100, 400, 30);
							labelAdminMarketHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));

							// element add items
							labelAdminMarketAddItemName = new JLabel("Item Name");
							labelAdminMarketAddItemName.setBounds(300, 150, 100, 30);
							labelAdminMarketAddItemName.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							textfieldAdminMarketAddItemName = new JTextField();
							textfieldAdminMarketAddItemName.setBounds(390, 150, 200, 30);
							textfieldAdminMarketAddItemName.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

							labelAdminMarketAddPrice = new JLabel("Price");
							labelAdminMarketAddPrice.setBounds(600, 150, 100, 30);
							labelAdminMarketAddPrice.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							textfieldAdminMarketAddPrice = new JTextField();
							textfieldAdminMarketAddPrice.setBounds(650, 150, 100, 30);
							textfieldAdminMarketAddPrice.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

							// label display items
							labelAdminMarketItemIDHeader = new JLabel("Item ID");
							labelAdminMarketItemIDHeader.setBounds(220, 200, 100, 30);
							labelAdminMarketItemIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminMarketItemNameHeader = new JLabel("Item Name");
							labelAdminMarketItemNameHeader.setBounds(350, 200, 300, 30);
							labelAdminMarketItemNameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminMarketPriceHeader = new JLabel("Price/Quantity");
							labelAdminMarketPriceHeader.setBounds(600, 200, 100, 30);
							labelAdminMarketPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							checkboxAdminMarket = new JCheckBox[arraySize];
							labelAdminMarketItemID = new JLabel[arraySize];
							labelAdminMarketItemName = new JLabel[arraySize];
							labelAdminMarketPrice = new JLabel[arraySize];


							// view sales labels
							labelAdminviewsalessHeader = new JLabel("View Sales");
							labelAdminviewsalessHeader.setBounds(200, 100, 400, 30);
							labelAdminviewsalessHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));

							labelAdminSalesIDHeader = new JLabel("Order ID");
							labelAdminSalesIDHeader.setBounds(200, 150, 100, 30);
							labelAdminSalesIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminOrderDateHeader = new JLabel("Order Date");
							labelAdminOrderDateHeader.setBounds(300, 150, 300, 30);
							labelAdminOrderDateHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminOrderUsernameHeader = new JLabel("Username");
							labelAdminOrderUsernameHeader.setBounds(600, 150, 100, 30);
							labelAdminOrderUsernameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminOrderTotalPriceHeader = new JLabel("Total Price");
							labelAdminOrderTotalPriceHeader.setBounds(800, 150, 100, 30);
							labelAdminOrderTotalPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							checkboxAdminsales = new JCheckBox[arraySize];
							labelAdminSalesID = new JLabel[arraySize];
							labelAdminOrderDate = new JLabel[arraySize];
							labelAdminOrderUsername = new JLabel[arraySize];
							labelAdminOrderTotalPrice = new JLabel[arraySize];

							// add new items labels
							labelAdminAddItemsHeader = new JLabel("ADD NEW ITEMS");
							labelAdminAddItemsHeader.setBounds(200, 100, 400, 30);
							labelAdminAddItemsHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER1_SIZE));

							// admin conrtol buttons
							btnAdminControl = new JButton("Control Panel");
							btnAdminControl.setBounds(0, 100, 150, 50);
							btnAdminControl.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminControl.setForeground(Color.WHITE);
							btnAdminControl.setBackground(pastel);
							btnAdminControl.setOpaque(true);
							btnAdminControl.setFocusable(false);
							btnAdminControl.setBorderPainted(false);
							btnAdminControl.setFocusPainted(false);
							btnAdminControl.setEnabled(true);

							btnAdminControlDelete = new JButton("Delete");
							btnAdminControlDelete.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
							btnAdminControlDelete.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminControlDelete.setForeground(Color.WHITE);
							btnAdminControlDelete.setBackground(Color.RED);
							btnAdminControlDelete.setOpaque(true);
							btnAdminControlDelete.setFocusable(false);
							btnAdminControlDelete.setBorderPainted(false);
							btnAdminControlDelete.setFocusPainted(false);
							
							// admin market buttons
							btnAdminMarket = new JButton("Market");
							btnAdminMarket.setBounds(0, 150, 150, 50);
							btnAdminMarket.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminMarket.setForeground(Color.WHITE);
							btnAdminMarket.setBackground(pastel);
							btnAdminMarket.setOpaque(true);
							btnAdminMarket.setFocusable(false);
							btnAdminMarket.setBorderPainted(false);
							btnAdminMarket.setFocusPainted(false);
							btnAdminMarket.setEnabled(false);

							btnAdminMarketAdditem = new JButton("Add");
							btnAdminMarketAdditem.setBounds(800, 150, 100, 30);
							btnAdminMarketAdditem.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminMarketAdditem.setForeground(Color.WHITE);
							btnAdminMarketAdditem.setBackground(Color.BLACK);
							btnAdminMarketAdditem.setOpaque(true);
							btnAdminMarketAdditem.setFocusable(false);
							btnAdminMarketAdditem.setBorderPainted(false);
							btnAdminMarketAdditem.setFocusPainted(false);

							btnAdminMarketDelete = new JButton("Delete");
							btnAdminMarketDelete.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
							btnAdminMarketDelete.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminMarketDelete.setForeground(Color.WHITE);
							btnAdminMarketDelete.setBackground(Color.RED);
							btnAdminMarketDelete.setOpaque(true);
							btnAdminMarketDelete.setFocusable(false);
							btnAdminMarketDelete.setBorderPainted(false);
							btnAdminMarketDelete.setFocusPainted(false);
							
							// buttons admin view order 
							btnAdminviewsaless = new JButton("View Sales");
							btnAdminviewsaless.setBounds(0, 200, 150, 50);
							btnAdminviewsaless.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminviewsaless.setForeground(Color.WHITE);
							btnAdminviewsaless.setBackground(pastel);
							btnAdminviewsaless.setOpaque(true);
							btnAdminviewsaless.setFocusable(false);
							btnAdminviewsaless.setBorderPainted(false);
							btnAdminviewsaless.setFocusPainted(false);
							btnAdminviewsaless.setEnabled(true);

							btnAdminOrderView = new JButton("View");
							btnAdminOrderView.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
							btnAdminOrderView.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminOrderView.setForeground(Color.WHITE);
							btnAdminOrderView.setBackground(Color.BLACK);
							btnAdminOrderView.setOpaque(true);
							btnAdminOrderView.setFocusable(false);
							btnAdminOrderView.setBorderPainted(false);
							btnAdminOrderView.setFocusPainted(false);

							// admin logout buttons
							btnAdminLogout = new JButton("Logout");
							btnAdminLogout.setBounds(0, SCREEN_HEIGHT-100, 150, 50);
							btnAdminLogout.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminLogout.setForeground(Color.WHITE);
							btnAdminLogout.setBackground(Color.RED);
							btnAdminLogout.setOpaque(true);
							btnAdminLogout.setFocusable(false);
							btnAdminLogout.setBorderPainted(false);
							btnAdminLogout.setFocusPainted(false);
							
                                                        // user item panel
                                                        adminItemPanel = new JPanel();
                                                        adminItemPanel.setBackground(Color.WHITE);
                                                        GridBagLayout grid2 = new GridBagLayout();
                                                        GridBagConstraints gc = new GridBagConstraints();
                                                        adminItemPanel.setLayout(grid2);
                                                        adminItemPanel.setBounds(173,238,550,5000);
                                                        
                                                        // admin market scroll panel
                                                        JScrollPane AdminItemScroll = new JScrollPane(adminItemPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                                                        AdminItemScroll.setBackground(Color.WHITE);
                                                        AdminItemScroll.setBounds(173,238,550,250);
                                                        AdminItemScroll.setViewportBorder(null);
                                                        AdminItemScroll.setViewportView(adminItemPanel);
                                                        
							// admin panel
							adminPanel = new JPanel();
							adminPanel.setBackground(Color.WHITE);
							adminPanel.setLayout(null);
							adminPanel.add(labelAdminMarketHeader);
							adminPanel.add(btnAdminControl);
							adminPanel.add(btnAdminMarket);
							adminPanel.add(btnAdminviewsaless);
							adminPanel.add(btnAdminLogout);
							adminPanel.add(labelAdminMarketItemIDHeader);
							adminPanel.add(labelAdminMarketItemNameHeader);
							adminPanel.add(labelAdminMarketPriceHeader);
							adminPanel.add(labelAdminMarketAddItemName);
							adminPanel.add(labelAdminMarketAddPrice);
							adminPanel.add(textfieldAdminMarketAddItemName);
							adminPanel.add(textfieldAdminMarketAddPrice);
							adminPanel.add(btnAdminMarketAdditem);
							adminPanel.add(btnAdminMarketDelete);
                                                        

							for(int i=0; i<=items.newItemID; i++){
								checkboxAdminMarket[i] = new JCheckBox();
								checkboxAdminMarket[i].setBounds(10, (10+30*(i)), 30, 30);
								checkboxAdminMarket[i].setBackground(Color.WHITE);
								checkboxAdminMarket[i].setFocusable(false);
                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                gc.gridx = 0;
                                                                gc.gridy = i;
                                                                gc.weightx = 1.25;
								adminItemPanel.add(checkboxAdminMarket[i],gc);
                                                                
								labelAdminMarketItemID[i] = new JLabel(String.valueOf(i));
								labelAdminMarketItemID[i].setBounds(50, (10+30*(i)), 100, 30);
								labelAdminMarketItemID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                gc.gridx = 1;
                                                                gc.gridy = i;
                                                                gc.weightx = 3;
                                                                adminItemPanel.add(labelAdminMarketItemID[i],gc);

								labelAdminMarketItemName[i] = new JLabel(items.itemName[i]);
								labelAdminMarketItemName[i].setBounds(140, (10+30*(i)), 300, 30);
								labelAdminMarketItemName[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                gc.gridx = 2;
                                                                gc.gridy = i;
                                                                gc.weightx = 4;
                                                                adminItemPanel.add(labelAdminMarketItemName[i],gc);

								labelAdminMarketPrice[i] = new JLabel(String.valueOf(items.price[i]));
								labelAdminMarketPrice[i].setBounds(450, (10+30*(i)), 100, 30);
								labelAdminMarketPrice[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                gc.gridx = 3;
                                                                gc.gridy = i;
                                                                gc.weightx = 0.8;
								adminItemPanel.add(labelAdminMarketPrice[i],gc);
								
								
								
								
							}
                                                        adminPanel.add(AdminItemScroll);
							
							// admin control panel
							adminControlPanel = new JPanel();
							adminControlPanel.setBackground(Color.WHITE);
							adminControlPanel.setLayout(null);
							adminControlPanel.add(labelAdminControlHeader);
							adminControlPanel.add(labelAdminControlUserIDHeader);
							adminControlPanel.add(labelAdminControlUsernameHeader);
							adminControlPanel.add(labelAdminControlMobileNoHeader);
							adminControlPanel.add(btnAdminControlDelete);

							for(int i=0; i<=users.newUserID; i++){
								checkboxAdminControl[i] = new JCheckBox();
								checkboxAdminControl[i].setBounds(160, (150+30*(i+1)), 30, 30);
								checkboxAdminControl[i].setBackground(Color.WHITE);
								checkboxAdminControl[i].setFocusable(false);

								labelAdminControlUserID[i] = new JLabel(String.valueOf(i));
								labelAdminControlUserID[i].setBounds(200, (150+30*(i+1)), 100, 30);
								labelAdminControlUserID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								labelAdminControlUsername[i] = new JLabel(users.username[i]);
								labelAdminControlUsername[i].setBounds(300, (150+30*(i+1)), 300, 30);
								labelAdminControlUsername[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								labelAdminControlMobileNo[i] = new JLabel(users.mobileNo[i]);
								labelAdminControlMobileNo[i].setBounds(600, (150+30*(i+1)), 300, 30);
								labelAdminControlMobileNo[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								adminControlPanel.add(checkboxAdminControl[i]);
								adminControlPanel.add(labelAdminControlUserID[i]);
								adminControlPanel.add(labelAdminControlUsername[i]);
								adminControlPanel.add(labelAdminControlMobileNo[i]);

							}

							// admin order panel
							adminviewsalessPanel = new JPanel();
							adminviewsalessPanel.setBackground(Color.WHITE);
							adminviewsalessPanel.setLayout(null);
							adminviewsalessPanel.add(labelAdminSalesIDHeader);
							adminviewsalessPanel.add(labelAdminOrderDateHeader);
							adminviewsalessPanel.add(labelAdminOrderUsernameHeader);
							adminviewsalessPanel.add(labelAdminOrderTotalPriceHeader);
							adminviewsalessPanel.add(btnAdminOrderView);
                                                        
                                                        adminvSalesItemPanel = new JPanel();
                                                        adminvSalesItemPanel.setBackground(Color.WHITE);
                                                        GridBagLayout grid3 = new GridBagLayout();
                                                        GridBagConstraints gac = new GridBagConstraints();
                                                        adminvSalesItemPanel.setLayout(grid3);
                                                        adminvSalesItemPanel.setBounds(155,180,800,5000);
                                        
                                                        JScrollPane adminvSalesItemScroll = new JScrollPane(adminvSalesItemPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                                                        // user view scrollpane
                                                        adminvSalesItemScroll.setBackground(Color.WHITE);
                                                        adminvSalesItemScroll.setBounds(155,180,800,250);
                                                        adminvSalesItemScroll.setViewportBorder(null);
                                                        adminvSalesItemScroll.setViewportView(adminvSalesItemPanel);


							for(int i=0, j=sales.newSalesID; j>=0; j--){
								checkboxAdminsales[j] = new JCheckBox();
								checkboxAdminsales[j].setBounds(160, (150+30*(j+1)), 30, 30);
								checkboxAdminsales[j].setBackground(Color.WHITE);
								checkboxAdminsales[j].setFocusable(false);
                                                                gac.fill = GridBagConstraints.HORIZONTAL;
                                                                gac.gridx = 0;
                                                                gac.gridy = i;
                                                                gac.weightx = 0.375;
                                                                adminvSalesItemPanel.add(checkboxAdminsales[j],gac);
	
								labelAdminSalesID[i] = new JLabel(String.valueOf(j));
								labelAdminSalesID[i].setBounds(200, (150+30*(i+1)), 100, 30);
								labelAdminSalesID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                gac.fill = GridBagConstraints.HORIZONTAL;
                                                                gac.gridx = 1;
                                                                gac.gridy = i;
                                                                gac.weightx = 0.55;
                                                                adminvSalesItemPanel.add(labelAdminSalesID[i],gac);
	
								labelAdminOrderDate[i] = new JLabel(sales.date[j]);
								labelAdminOrderDate[i].setBounds(300, (150+30*(i+1)), 300, 30);
								labelAdminOrderDate[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                gac.fill = GridBagConstraints.HORIZONTAL;
                                                                gac.gridx = 2;
                                                                gac.gridy = i;
                                                                gac.weightx = 1.3;
                                                                adminvSalesItemPanel.add(labelAdminOrderDate[i],gac);
	
								labelAdminOrderUsername[i] = new JLabel(sales.username[j]);
								labelAdminOrderUsername[i].setBounds(600, (150+30*(i+1)), 300, 30);
								labelAdminOrderUsername[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                gac.fill = GridBagConstraints.HORIZONTAL;
                                                                gac.gridx = 3;
                                                                gac.gridy = i;
                                                                gac.weightx = 1.15;
                                                                adminvSalesItemPanel.add(labelAdminOrderUsername[i],gac);
	
								labelAdminOrderTotalPrice[i] = new JLabel(String.valueOf(sales.totalPrice[j]));
								labelAdminOrderTotalPrice[i].setBounds(800, (150+30*(i+1)), 100, 30);
								labelAdminOrderTotalPrice[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                gac.fill = GridBagConstraints.HORIZONTAL;
                                                                gac.gridx = 4;
                                                                gac.gridy = i;
                                                                gac.weightx = 0.5;
                                                                adminvSalesItemPanel.add(labelAdminOrderTotalPrice[i],gac);
								i++;
							}
                                                        adminviewsalessPanel.add(adminvSalesItemScroll);

							// refresh panel
							JPanel tempPanel = new JPanel();
							tempPanel.setLayout(null);

							// action admin control
							btnAdminControl.addActionListener(new ActionListener(){
								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin control panel");
									btnAdminControl.setEnabled(false);
									btnAdminMarket.setEnabled(true);
									btnAdminviewsaless.setEnabled(true);

									adminControlPanel.add(btnAdminControl);
									adminControlPanel.add(btnAdminMarket);
									adminControlPanel.add(btnAdminviewsaless);
									adminControlPanel.add(btnAdminLogout);
									
									
									frame.setContentPane(adminControlPanel);
									frame.validate();
								}
							});

							btnAdminControlDelete.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									for(int i=0; i<=users.newUserID; i++){
										if(checkboxAdminControl[i].isSelected()){
											for(int k=0; k<=users.newUserID; k++){
												tempPanel.add(checkboxAdminControl[k]);
												tempPanel.add(labelAdminControlUserID[k]);
												tempPanel.add(labelAdminControlUsername[k]);
												tempPanel.add(labelAdminControlMobileNo[k]);
											}

											System.out.println("deleting item: " + i + " " + users.username[i] + " " + users.mobileNo[i]);
											users.removeUser(i);

											for(int k=0; k<=users.newUserID; k++){
												checkboxAdminControl[k] = new JCheckBox();
												checkboxAdminControl[k].setBounds(160, (150+30*(k+1)), 30, 30);
												checkboxAdminControl[k].setBackground(Color.WHITE);
												checkboxAdminControl[k].setFocusable(false);
		
												labelAdminControlUserID[k] = new JLabel(String.valueOf(k));
												labelAdminControlUserID[k].setBounds(200, (150+30*(k+1)), 100, 30);
												labelAdminControlUserID[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
				
												labelAdminControlUsername[k] = new JLabel(users.username[k]);
												labelAdminControlUsername[k].setBounds(300, (150+30*(k+1)), 300, 30);
												labelAdminControlUsername[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
				
												labelAdminControlMobileNo[k] = new JLabel(String.valueOf(users.mobileNo[k]));
												labelAdminControlMobileNo[k].setBounds(600, (150+30*(k+1)), 300, 30);
												labelAdminControlMobileNo[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
		
												adminControlPanel.add(checkboxAdminControl[k]);
												adminControlPanel.add(labelAdminControlUserID[k]);
												adminControlPanel.add(labelAdminControlUsername[k]);
												adminControlPanel.add(labelAdminControlMobileNo[k]);
											}

											break;
										}
									}
									
									try {
										System.out.println("Saving userinfo....");
										users.saveUserinfo();
										users = new Users();
									} catch (Exception e) {
										e.printStackTrace();
									}
									

									frame.setContentPane(adminControlPanel);
									frame.validate();
								}
								
							});

							// action admin market
							btnAdminMarket.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin market panel");

									btnAdminMarket.setEnabled(false);
									btnAdminControl.setEnabled(true);
									btnAdminviewsaless.setEnabled(true);

									adminPanel.add(btnAdminControl);
									adminPanel.add(btnAdminMarket);
									adminPanel.add(btnAdminviewsaless);
									adminPanel.add(btnAdminLogout);

									frame.setContentPane(adminPanel);
									frame.validate();
								}
								
							});

							btnAdminMarketAdditem.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									try{
										String itemName = textfieldAdminMarketAddItemName.getText();
										double price = Double.valueOf(textfieldAdminMarketAddPrice.getText());

										String arrayItemName[] = itemName.split(" ");
										itemName = String.join("_", arrayItemName);
								
										for(int i=0; i<=items.newItemID; i++){
											tempPanel.add(checkboxAdminMarket[i]);
											tempPanel.add(labelAdminMarketItemID[i]);
											tempPanel.add(labelAdminMarketItemName[i]);
											tempPanel.add(labelAdminMarketPrice[i]);
										}

										items.createItem(itemName, price);
										System.out.println(items);

										for(int i=0; i<=items.newItemID; i++){
											checkboxAdminMarket[i] = new JCheckBox();
											checkboxAdminMarket[i].setBounds(160, (200+30*(i+1)), 30, 30);
											checkboxAdminMarket[i].setBackground(Color.WHITE);
											checkboxAdminMarket[i].setFocusable(false);
                                                                                        gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gc.gridx = 0;
                                                                                        gc.gridy = i;
                                                                                        gc.weightx = 1.25;
                                                                                        adminItemPanel.add(checkboxAdminMarket[i],gc);

											labelAdminMarketItemID[i] = new JLabel(String.valueOf(i));
											labelAdminMarketItemID[i].setBounds(200, (200+30*(i+1)), 100, 30);
											labelAdminMarketItemID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gc.gridx = 1;
                                                                                        gc.gridy = i;
                                                                                        gc.weightx = 3;
                                                                                        adminItemPanel.add(labelAdminMarketItemID[i],gc);
			
											labelAdminMarketItemName[i] = new JLabel(items.itemName[i]);
											labelAdminMarketItemName[i].setBounds(300, (200+30*(i+1)), 300, 30);
											labelAdminMarketItemName[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gc.gridx = 2;
                                                                                        gc.gridy = i;
                                                                                        gc.weightx = 4;
                                                                                        adminItemPanel.add(labelAdminMarketItemName[i],gc);
			
											labelAdminMarketPrice[i] = new JLabel(String.valueOf(items.price[i]));
											labelAdminMarketPrice[i].setBounds(600, (200+30*(i+1)), 100, 30);
											labelAdminMarketPrice[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                        gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                        gc.gridx = 3;
                                                                                        gc.gridy = i;
                                                                                        gc.weightx = 0.8;
                                                                                        adminItemPanel.add(labelAdminMarketPrice[i],gc);

											textfieldAdminMarketAddItemName.setText("");
											textfieldAdminMarketAddPrice.setText("");
										}

										try {
											System.out.println("Saving userinfo....");
											users.saveUserinfo();
											users = new Users();
										} catch (Exception e) {
											e.printStackTrace();
										}

										frame.setContentPane(adminPanel);
										frame.validate();
									}catch(Exception e){
										System.out.println(e);
									}
								}							
							});

							btnAdminMarketDelete.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									for(int i=0; i<=items.newItemID; i++){
										if(checkboxAdminMarket[i].isSelected()){
											for(int k=0; k<=items.newItemID; k++){
												tempPanel.add(checkboxAdminMarket[k]);
												tempPanel.add(labelAdminMarketItemID[k]);
												tempPanel.add(labelAdminMarketItemName[k]);
												tempPanel.add(labelAdminMarketPrice[k]);
											}

											System.out.println("deleting item: " + i + " " + items.itemName[i] + " " + items.price[i]);
											items.removeItem(items.itemName[i]);

											try{
												items.saveIteminfo();
												items = new Items();
											}catch(Exception e){
												System.out.println(e);
											}

											for(int k=0; k<=items.newItemID; k++){
												checkboxAdminMarket[k] = new JCheckBox();
												checkboxAdminMarket[k].setBounds(160, (200+30*(k+1)), 30, 30);
												checkboxAdminMarket[k].setBackground(Color.WHITE);
												checkboxAdminMarket[k].setFocusable(false);
                                                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                gc.gridx = 0;
                                                                                                gc.gridy = k;
                                                                                                gc.weightx = 1.25;
                                                                                                adminItemPanel.add(checkboxAdminMarket[k],gc);
		
												labelAdminMarketItemID[k] = new JLabel(String.valueOf(k));
												labelAdminMarketItemID[k].setBounds(200, (200+30*(k+1)), 100, 30);
												labelAdminMarketItemID[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                gc.gridx = 1;
                                                                                                gc.gridy = k;
                                                                                                gc.weightx = 3;
                                                                                                adminItemPanel.add(labelAdminMarketItemID[k],gc);
				
												labelAdminMarketItemName[k] = new JLabel(items.itemName[k]);
												labelAdminMarketItemName[k].setBounds(300, (200+30*(k+1)), 300, 30);
												labelAdminMarketItemName[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                gc.gridx = 2;
                                                                                                gc.gridy = k;
                                                                                                gc.weightx = 4;
                                                                                                adminItemPanel.add(labelAdminMarketItemName[k],gc);
				
												labelAdminMarketPrice[k] = new JLabel(String.valueOf(items.price[k]));
												labelAdminMarketPrice[k].setBounds(600, (200+30*(k+1)), 100, 30);
												labelAdminMarketPrice[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                gc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                gc.gridx = 3;
                                                                                                gc.gridy = k;
                                                                                                gc.weightx = 0.8;
                                                                                                adminItemPanel.add(labelAdminMarketPrice[k],gc);
		
												textfieldAdminMarketAddItemName.setText("");
												textfieldAdminMarketAddPrice.setText("");
											}

											break;
										}
									}

									try {
										System.out.println("Saving iteminfo....");
										items.saveIteminfo();
										items = new Items();
									} catch (Exception e) {
										e.printStackTrace();
									}
									
									frame.setContentPane(adminPanel);
									frame.validate();
								}
								
							});

							// action admin sales
							btnAdminviewsaless.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin View Sales panel");

									btnAdminMarket.setEnabled(true);
									btnAdminControl.setEnabled(true);
									btnAdminviewsaless.setEnabled(false);

									adminviewsalessPanel.add(labelAdminviewsalessHeader);
									adminviewsalessPanel.add(btnAdminControl);
									adminviewsalessPanel.add(btnAdminMarket);
									adminviewsalessPanel.add(btnAdminviewsaless);
									adminviewsalessPanel.add(btnAdminLogout);

									frame.setContentPane(adminviewsalessPanel);
									frame.validate();
								}
								
							});

							btnAdminOrderView.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									for(int i=0; i<=sales.newSalesID; i++){
										if(checkboxAdminsales[i].isSelected()){
											JFrame frameviewsales = new JFrame();

											JLabel labelDate = new JLabel("Date: " + sales.date[i]);
											labelDate.setBounds(100, 50, 400, 50);
											labelDate.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER2_SIZE));
											
											JLabel labelUsername = new JLabel("Username: " + sales.username[i]);
											labelUsername.setBounds(100, 100, 400, 50);
											labelUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER2_SIZE));

											JLabel labelItemIDHeader = new JLabel("Item ID");
											labelItemIDHeader.setBounds(100, 150, 100, 30);
											labelItemIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

											JLabel labelItemNameHeader = new JLabel("Item Name");
											labelItemNameHeader.setBounds(200, 150, 300, 30);
											labelItemNameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

											JLabel labelPricePerQuantityHeader = new JLabel("Price/Quantity");
											labelPricePerQuantityHeader.setBounds(500, 150, 100, 30);
											labelPricePerQuantityHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

											JLabel labelQuantityHeader = new JLabel("Quantity");
											labelQuantityHeader.setBounds(700, 150, 100, 30);
											labelQuantityHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

											JLabel labelPriceHeader = new JLabel("Price");
											labelPriceHeader.setBounds(800, 150, 100, 30);
											labelPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

											JLabel[] labelItemID = new JLabel[arraySize];
											JLabel[] labelItemName = new JLabel[arraySize];
											JLabel[] labelItemPricePerQuantity = new JLabel[arraySize];
											JLabel[] labelItemQuantity = new JLabel[arraySize];
											JLabel[] labelItemPrice = new JLabel[arraySize];

											JLabel labelTotalPrice = new JLabel("Total Price: " + sales.totalPrice[i]);
											labelTotalPrice.setBounds(700, SCREEN_HEIGHT-100, 300, 30);
											labelTotalPrice.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

											String[] arrayItemsName = sales.itemsName[i].split("-");
											String[] arrayItemsPricePerQuantity = sales.itemsPricePerQuantity[i].split("-");
											String[] arrayItemsQuantity = sales.itemsQuantity[i].split("-");

											// panel
											JPanel viewsalesPanel = new JPanel();
											viewsalesPanel.setBackground(Color.WHITE);
											viewsalesPanel.setLayout(null);	
											viewsalesPanel.add(labelDate);
											viewsalesPanel.add(labelUsername);
											viewsalesPanel.add(labelTotalPrice);
											viewsalesPanel.add(labelPriceHeader);
											viewsalesPanel.add(labelQuantityHeader);
											viewsalesPanel.add(labelPricePerQuantityHeader);
											viewsalesPanel.add(labelItemNameHeader);
											viewsalesPanel.add(labelItemIDHeader);
                                                                                        
                                                                                        adminSalesItemPanel = new JPanel();
                                                                                        adminSalesItemPanel.setBackground(Color.WHITE);
                                                                                        GridBagLayout grid4 = new GridBagLayout();
                                                                                        GridBagConstraints gnc = new GridBagConstraints();
                                                                                        adminSalesItemPanel.setLayout(grid4);
                                                                                        adminSalesItemPanel.setBounds(100,180,800,5000);
                                                                        
                                                                                        JScrollPane adminSalesItemScroll = new JScrollPane(adminSalesItemPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                                        
                                                                                        // user view scrollpane
                                                                                        adminSalesItemScroll.setBackground(Color.WHITE);
                                                                                        adminSalesItemScroll.setBounds(100,180,850,250);
                                                                                        adminSalesItemScroll.setViewportBorder(null);
                                                                                        adminSalesItemScroll.setViewportView(adminSalesItemPanel);

											try{
												for(int k=0; k<arrayItemsName.length; k++){
													labelItemID[k] = new JLabel(String.valueOf(k));
													labelItemID[k].setBounds(100, 150+30*(k+1), 100, 30);
													labelItemID[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                        gnc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                        gnc.gridx = 0;
                                                                                                        gnc.gridy = k;
                                                                                                        gnc.weightx = 1.25;
                                                                                                        adminSalesItemPanel.add(labelItemID[k],gnc);

													System.out.println(arrayItemsName[k] + " " + arrayItemsPricePerQuantity[k] + "-" + arrayItemsQuantity[k]);

													labelItemName[k] = new JLabel(arrayItemsName[k]);
													labelItemName[k].setBounds(200, 150+30*(k+1), 300, 30);
													labelItemName[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                        gnc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                        gnc.gridx = 1;
                                                                                                        gnc.gridy = k;
                                                                                                        gnc.weightx = 2;
                                                                                                        adminSalesItemPanel.add(labelItemName[k],gnc);

													labelItemPricePerQuantity[k] = new JLabel(arrayItemsPricePerQuantity[k]);
													labelItemPricePerQuantity[k].setBounds(500, 150+30*(k+1), 100, 30);
													labelItemPricePerQuantity[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                        gnc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                        gnc.gridx = 2;
                                                                                                        gnc.gridy = k;
                                                                                                        gnc.weightx = 1.85;
                                                                                                        adminSalesItemPanel.add(labelItemPricePerQuantity[k],gnc);

													labelItemQuantity[k] = new JLabel(arrayItemsQuantity[k]);
													labelItemQuantity[k].setBounds(700, 150+30*(k+1), 100, 30);
													labelItemQuantity[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                        gnc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                        gnc.gridx = 3;
                                                                                                        gnc.gridy = k;
                                                                                                        gnc.weightx = 1.15;
                                                                                                        adminSalesItemPanel.add(labelItemQuantity[k],gnc);

													labelItemPrice[k] = new JLabel(String.valueOf(Double.valueOf(arrayItemsPricePerQuantity[k]) * Double.valueOf(arrayItemsQuantity[k])));
													labelItemPrice[k].setBounds(800, 150+30*(k+1), 100, 30);
													labelItemPrice[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
                                                                                                        gnc.fill = GridBagConstraints.HORIZONTAL;
                                                                                                        gnc.gridx = 4;
                                                                                                        gnc.gridy = k;
                                                                                                        gnc.weightx = 1.1;
                                                                                                        adminSalesItemPanel.add(labelItemPrice[k],gnc);
												}
                                                                                                viewsalesPanel.add(adminSalesItemScroll);
											}catch(Exception e){
												System.out.println(e);
											}

											// frame
											frameviewsales.setContentPane(viewsalesPanel);
											frameviewsales.setTitle(sales.date[i] + " " + sales.username[i]);
											frameviewsales.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
											frameviewsales.setResizable(false);
											frameviewsales.setLocationRelativeTo(null);
											frameviewsales.setVisible(true);
											frameviewsales.setLayout(null);
											break;
										}
									}
								}
								
							});

							// action admin logout
							btnAdminLogout.addActionListener(new ActionListener(){
			
								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin Logout attempt");
									int answer = JOptionPane.showConfirmDialog(null, "Do you really want to signout?", "Confirm", JOptionPane.YES_NO_OPTION);
									if(answer == 0){
										System.out.println("Admin logging out...");
										frame.setContentPane(adminLoginPanel);
									}
								}
								
							});							
							
							// set content
							frame.setContentPane(adminPanel);
							frame.validate();	
						}
			
					}
					
				});

				btnAdminUser.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// set content
						frame.setContentPane(userLoginPanel);
						frame.validate();
					}
					
				});

				// panel
				adminLoginPanel = new JPanel();
				adminLoginPanel.setBackground(Color.WHITE);
				adminLoginPanel.setLayout(null);
				adminLoginPanel.add(labelAdminLogin);
				adminLoginPanel.add(labelAdminPassword);
				adminLoginPanel.add(passwordFieldAdmin);
				adminLoginPanel.add(btnAdminLoginAtttempt);
				adminLoginPanel.add(btnAdminUser);

				// set content
				frame.setContentPane(adminLoginPanel);
				frame.validate();
			}
			
		});

		// saves everything to files
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				// System.out.println("Window closing listener");
				try {
					System.out.println("Saving userinfo....");
					users.saveUserinfo();
					System.out.println("Saving iteminfo....");
					items.saveIteminfo();
					System.out.println("Saving salesinfo....");
					sales.saveSalesInfo();;
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		
		// frame
		frame.setTitle(FRAME_TITLE);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
	}
}
