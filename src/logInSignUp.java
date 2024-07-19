import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class logInSignUp extends My_Frame {

  public logInSignUp(
    String title,
    int width,
    int height,
    int defaultCloseOperation,
    boolean resizable,
    boolean visible
  ) {
    super(title, width, height, defaultCloseOperation, resizable, visible);
    JFrame mainFrame = new JFrame();
    mainFrame.setTitle(getTitle());
    mainFrame.setSize(getWidth(), getHeight());
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setResizable(isResizable());
    mainFrame.setLayout(new GridBagLayout());
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setVisible(isVisible());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1.0;
    gbc.weighty = 1.0;

    GridBagConstraints smallGbc = new GridBagConstraints();
    smallGbc.gridx = 1;
    smallGbc.gridy = 0;
    smallGbc.anchor = GridBagConstraints.CENTER;
    smallGbc.insets = new Insets(10, 10, 10, 10);

    //CREATING A PANEL THAT HOLDS MANY PANELS
    JPanel cardPanel = new JPanel(new CardLayout());

    //ADDING THE MAIN PANEL TO THE FRAME
    mainFrame.add(cardPanel, gbc);

    //CREATING THE LOGIN PANEL TO HOLD THE LOGIN FORM AND ITS PROPERTIES
    JPanel login = new JPanel(new GridBagLayout());
    //login.setBackground(Color.YELLOW);

    //CREATING THE LOGIN FORM AND ITS PROPERTIES
    JPanel loginPanel = new JPanel();
    loginPanel.setBackground(new Color(0, 0, 0, 60));
    loginPanel.setLayout(new GridBagLayout());
    loginPanel.setPreferredSize(new Dimension(350, 500));
    loginPanel.putClientProperty(FlatClientProperties.STYLE, " " + "arc : 20");

    //ADDING COMPONENTS TO THE LOGIN PANEL FOR USER LOGIN

    JLabel welcome = new JLabel("Welcome back!");
    welcome.putClientProperty(
      FlatClientProperties.STYLE,
      " " + "font : bold 1+0"
    );
    loginPanel.add(welcome);

    //ADDING THE LOGIN FORM TO THE LOGIN PAGE
    login.add(loginPanel, smallGbc);

    //CREATING THE SIGNUP PANEL TO HOLD THE LOGIN FORM AND ITS PROPERTIES
    JPanel signUp = new JPanel(new GridBagLayout());
    //signUp.setBackground(Color.BLUE);

    //CREATING THE LOGIN FORM AND ITS PROPERTIES
    JPanel signUpPanel = new JPanel();
    signUpPanel.setBackground(new Color(1, 0, 0, 60));
    signUpPanel.setPreferredSize(new Dimension(350, 500));
    signUpPanel.putClientProperty(FlatClientProperties.STYLE, " " + "arc : 20");

    //ADDING THE SIGNUP FORM TO THE SIGNUP PAGE
    signUp.add(signUpPanel, smallGbc);

    //ADDING OBJECTS TO THE MAIN PANEL
    cardPanel.add(login, "login");
    cardPanel.add(signUp, "signUp");
  }

  public static void main(String[] args) {
    FlatRobotoFont.install();
    FlatMaterialDeepOceanIJTheme.setup();

    new logInSignUp("Gym Track", 900, 600, JFrame.EXIT_ON_CLOSE, false, true);
  }
}
