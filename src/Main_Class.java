import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import javax.swing.JFrame;

public class Main_Class {

  public static void main(String[] args) {
    FlatMaterialDeepOceanIJTheme.setup();
    new Main_Frame("Gym Track", 900, 600, JFrame.EXIT_ON_CLOSE, true, true);
  }
}
