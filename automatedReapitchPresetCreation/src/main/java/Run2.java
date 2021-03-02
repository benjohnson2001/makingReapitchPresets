public class Run2 {

   public static double centDiff(double a, double b) {
      double K = 1200 / Math.log10(2);
      return K*(Math.log10(a)-Math.log10(b));
   }

   private static Integer noteNumber(String noteName) {

      switch (noteName) {
         default: return null;

         case "C1": return 4;
         case "C#1": return 5;
         case "D1": return 6;
         case "D#1": return 7;
         case "E1": return 8;
         case "F1": return 9;
         case "F#1": return 10;
         case "G1": return 11;
         case "G#1": return 12;
         case "A1": return 13;
         case "A#1": return 14;
         case "B1": return 15;
         case "C2": return 16;
         case "C#2": return 17;
         case "D2": return 18;
         case "D#2": return 19;
         case "E2": return 20;
         case "F2": return 21;
         case "F#2": return 22;
         case "G2": return 23;
         case "G#2": return 24;
         case "A2": return 25;
         case "A#2": return 26;
         case "B2": return 27;
         case "C3": return 28;
         case "C#3": return 29;
         case "D3": return 30;
         case "D#3": return 31;
         case "E3": return 32;
         case "F3": return 33;
         case "F#3": return 34;
         case "G3": return 35;
         case "G#3": return 36;
         case "A3": return 37;
         case "A#3": return 38;
         case "B3": return 39;
         case "C4": return 40;
         case "C#4": return 41;
         case "D4": return 42;
         case "D#4": return 43;
         case "E4": return 44;
         case "F4": return 45;
         case "F#4": return 46;
         case "G4": return 47;
         case "G#4": return 48;
         case "A4": return 49;
         case "A#4": return 50;
         case "B4": return 51;
         case "C5": return 52;
         case "C#5": return 53;
         case "D5": return 54;
         case "D#5": return 55;
         case "E5": return 56;
         case "F5": return 57;
         case "F#5": return 58;
         case "G5": return 59;
         case "G#5": return 60;
         case "A5": return 61;
         case "A#5": return 62;
         case "B5": return 63;
         case "C6": return 64;
         case "C#6": return 65;
         case "D6": return 66;
         case "D#6": return 67;
         case "E6": return 68;
         case "F6": return 69;
         case "F#6": return 70;
         case "G6": return 71;
         case "G#6": return 72;
         case "A6": return 73;
         case "A#6": return 74;
         case "B6": return 75;
      }
   }

   private static double equalTemperamentFrequency(String noteName) {
      return Math.pow(2, (noteNumber(noteName)-49)/12.0) * 440.0;
   }

   private static void printJustIntervalCentDifference(double offset, String name) {

      System.out.println("\n");

//      System.out.println("B4_ET: " + equalTemperamentFrequency("B4"));


      // Five Limit

//      double justMinorSecond = equalTemperamentFrequency("B4")*16/15;
//      double justMajorSecond = equalTemperamentFrequency("B4")*9/8;
//      double justMinorThird = equalTemperamentFrequency("B4")*6/5;
//      double justMajorThird = equalTemperamentFrequency("B4")*5/4;
//      double justPerfectFourth = equalTemperamentFrequency("B4")*4/3;
//      double justTritone = equalTemperamentFrequency("B4")*45/32;
//      double justPerfectFifth = equalTemperamentFrequency("B4")*3/2;
//      double justMinorSixth = equalTemperamentFrequency("B4")*8/5;
//      double justMajorSixth = equalTemperamentFrequency("B4")*5/3;
//      double justMinorSeventh = equalTemperamentFrequency("B4")*16/9;
////      double justMinorSeventh = equalTemperamentFrequency("B4")*9/5;
//      double justMajorSeventh = equalTemperamentFrequency("B4")*15/8;


      // Seven Limit

      double justMinorSecond = equalTemperamentFrequency("B4")*15/14;
      double justMajorSecond = equalTemperamentFrequency("B4")*8/7;
      double justMinorThird = equalTemperamentFrequency("B4")*6/5;
      double justMajorThird = equalTemperamentFrequency("B4")*5/4;
      double justPerfectFourth = equalTemperamentFrequency("B4")*4/3;
      double augmentedFourth = equalTemperamentFrequency("B4")*7/5;
//      double diminishedFifth = equalTemperamentFrequency("B4")*10/7;
      double justPerfectFifth = equalTemperamentFrequency("B4")*3/2;
      double justMinorSixth = equalTemperamentFrequency("B4")*8/5;
      double justMajorSixth = equalTemperamentFrequency("B4")*5/3;
      double justMinorSeventh = equalTemperamentFrequency("B4")*7/4;
      double justMajorSeventh = equalTemperamentFrequency("B4")*15/8;


//      System.out.println("C5_JI: " + justMinorSecond + "  \t(" + centDiff(justMinorSecond, equalTemperamentFrequency("C5")) + " cents from ET)");
//      System.out.println("C#5_JI: " + justMajorSecond + "  \t(" + centDiff(justMajorSecond, equalTemperamentFrequency("C#5")) + " cents from ET)");
//      System.out.println("D5_JI: " + justMinorThird + "  \t(" + centDiff(justMinorThird, equalTemperamentFrequency("D5")) + " cents from ET)");
//      System.out.println("D#5_JI: " + justMajorThird + "  \t(" + centDiff(justMajorThird, equalTemperamentFrequency("D#5")) + " cents from ET)");
//      System.out.println("E5_JI: " + justPerfectFourth + "  \t(" + centDiff(justPerfectFourth, equalTemperamentFrequency("E5")) + " cents from ET)");
//      System.out.println("F5_JI: " + justTritone + "  \t(" + centDiff(justTritone, equalTemperamentFrequency("F5")) + " cents from ET)");
//      System.out.println("F#5_JI: " + justPerfectFifth + "  \t(" + centDiff(justPerfectFifth, equalTemperamentFrequency("F#5")) + " cents from ET)");
//      System.out.println("G5_JI: " + justMinorSixth + "  \t(" + centDiff(justMinorSixth, equalTemperamentFrequency("G5")) + " cents from ET)");
//      System.out.println("G#5_JI: " + justMajorSixth + "  \t(" + centDiff(justMajorSixth, equalTemperamentFrequency("G#5")) + " cents from ET)");
//      System.out.println("A5_JI: " + justMinorSeventh + "  \t(" + centDiff(justMinorSeventh, equalTemperamentFrequency("A5")) + " cents from ET)");
//      System.out.println("A#5_JI: " + justMajorSeventh + "  \t(" + centDiff(justMajorSeventh, equalTemperamentFrequency("A#5")) + " cents from ET)");


      System.out.println("\n\njust intervals" + name + "\n-------------------------------\n");
      System.out.println("minor second: \t\t" + (centDiff(justMinorSecond, equalTemperamentFrequency("C5")) + offset));
      System.out.println("major second: \t\t" + (centDiff(justMajorSecond, equalTemperamentFrequency("C#5")) + offset));
      System.out.println("minor third: \t\t" + (centDiff(justMinorThird, equalTemperamentFrequency("D5")) + offset));
      System.out.println("major third: \t\t" + (centDiff(justMajorThird, equalTemperamentFrequency("D#5")) + offset));
      System.out.println("perfect fourth: \t" + (centDiff(justPerfectFourth, equalTemperamentFrequency("E5")) + offset));
      System.out.println("flat fifth: \t\t" + (centDiff(augmentedFourth, equalTemperamentFrequency("F5")) + offset));
      System.out.println("perfect fifth: \t\t" + (centDiff(justPerfectFifth, equalTemperamentFrequency("F#5")) + offset));
      System.out.println("minor sixth: \t\t" + (centDiff(justMinorSixth, equalTemperamentFrequency("G5")) + offset));
      System.out.println("major sixth: \t\t" + (centDiff(justMajorSixth, equalTemperamentFrequency("G#5")) + offset));
      System.out.println("minor seventh: \t\t" + (centDiff(justMinorSeventh, equalTemperamentFrequency("A5")) + offset));
      System.out.println("major seventh: \t\t" + (centDiff(justMajorSeventh, equalTemperamentFrequency("A#5")) + offset));

   }

   public static void main(String[] args) {


      printJustIntervalCentDifference(0.0, "");
      printJustIntervalCentDifference(centDiff(110,109.6), " for rhythmA");
      printJustIntervalCentDifference(centDiff(138.6,138.8), " for bass");
      printJustIntervalCentDifference(centDiff(523.2,525.7), " for organ");



   }
}
