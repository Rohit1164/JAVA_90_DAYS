import java.util.Scanner;

// “Smart Home System”

// Interface SwitchBoard
interface SwitchBoard {
  void switchOn();

  void switchOff();
}

// Interface EnergyUsage
interface EnergyUsage {
  void unitsConsumed();
}

// Class Fan implements both
class Fan implements SwitchBoard, EnergyUsage {

  public void switchOn() {
    System.out.println("✅ Fan is turned ON 🌀");
  }

  public void switchOff() {
    System.out.println("❌ Fan is turned OFF");
  }

  public void unitsConsumed() {
    System.out.println("⚡ Fan consumed: 1.2 units/hour");
  }
}

// Class Light implements both
class Light implements SwitchBoard, EnergyUsage {

  public void switchOn() {
    System.out.println("✅ Light is turned ON 💡");
  }

  public void switchOff() {
    System.out.println("❌ Light is turned OFF");
  }

  public void unitsConsumed() {
    System.out.println("⚡ Light consumed: 0.5 units/hour");
  }
}

// Main me user choice se ON/OFF + usage print karo
// Main class
public class Project {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("🏠 SMART HOME CONTROL PANEL");
    System.out.println("1. Fan");
    System.out.println("2. Light");
    System.out.print("Choose device: ");
    int device = sc.nextInt();

    System.out.println("\n1. Switch ON");
    System.out.println("2. Switch OFF");
    System.out.println("3. Show Energy Usage");
    System.out.print("Choose action: ");
    int action = sc.nextInt();

    // Objects
    Fan fan = new Fan();
    Light light = new Light();

    // Logic based on user choice
    if (device == 1) {
      if (action == 1) {
        fan.switchOn();
      } else if (action == 2) {
        fan.switchOff();
      } else if (action == 3) {
        fan.unitsConsumed();
      } else {
        System.out.println("⚠ Invalid action!");
      }
    } else if (device == 2) {
      if (action == 1) {
        light.switchOn();
      } else if (action == 2) {
        light.switchOff();
      } else if (action == 3) {
        light.unitsConsumed();
      } else {
        System.out.println("⚠ Invalid action!");
      }
    } else {
      System.out.println("⚠ Invalid device!");
    }

    sc.close();
  }
}
