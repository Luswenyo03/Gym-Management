import java.awt.*;
import javax.swing.*;

public class Main_Frame extends My_Frame {

  public Main_Frame(
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

    JPanel cardPanel = new JPanel(new CardLayout());

    JPanel dashboard = new JPanel(new GridBagLayout());
    dashboard.setBackground(Color.YELLOW);

    cardPanel.add(dashboard, "dashboard");

    mainFrame.add(cardPanel, gbc);
  }
}
