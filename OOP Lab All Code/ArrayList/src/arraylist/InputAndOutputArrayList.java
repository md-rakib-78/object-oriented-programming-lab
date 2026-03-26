
package arraylist;
import java.util.Scanner;


 interface IsEmergency {
  void soundSiren();
}

 class FireEmergency implements IsEmergency {

  @Override
  public void soundSiren() {
    System.out.println("Siren Sounded");
  }
}
 class SmokeAlarm {
  // Empty body, no functionality needed for this class.
}

public class InputAndOutputArrayList {
  public static void main(String[] args) {
    Object[] myArray = new Object[2];

    myArray[0] = new FireEmergency();
    myArray[1] = new FireEmergency();

    for (Object element : myArray) {
      if (element instanceof IsEmergency)
      {
        System.out.println(element.getClass() + " can sound the siren!");
        ((IsEmergency) element).soundSiren();
      }
    }
  }
}
