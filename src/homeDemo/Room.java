package homeDemo;

import java.util.List;

public class Room {
   public List<Light> lights;
   public List<Fan> fans;

   @Override
   public String toString() {
      return "Room{" +
              "lights=" + lights +
              ", fans=" + fans +
              '}';
   }
}
