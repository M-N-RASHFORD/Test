import javax.swing.*;
class SwingDemo {
  SwingDemo(){
    JFrame frame = new JFrame("Swing title");
    frame.setSize(100, 250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("This is a swing program");
    frame.add(label);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new SwingDemo();
      }
    });
  }
}
