// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalTime;

class Reminder {
   Reminder() {
   }

   public void setReminder(LocalDate var1, LocalTime var2) {
      PrintStream var10000 = System.out;
      String var10001 = String.valueOf(var1);
      var10000.println("Reminder set for: " + var10001 + " at " + String.valueOf(var2));
   }
}
