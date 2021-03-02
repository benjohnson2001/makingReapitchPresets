public class Run {

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

   public static void main(String[] args) {

      System.out.println("\n");

      System.out.println("C2_ET: " + equalTemperamentFrequency("C2"));
      System.out.println("E2_ET: " + equalTemperamentFrequency("E2"));
      System.out.println("G2_ET: " + equalTemperamentFrequency("G2"));
      System.out.println("\n");

      double justThird = equalTemperamentFrequency("C2")*5/4;
      double justFifth = equalTemperamentFrequency("C2")*3/2;

      System.out.println("E2_JI: " + justThird + "  (" + centDiff(justThird, equalTemperamentFrequency("E2")) + " cents from ET)");
      System.out.println("G2_JI: " + justFifth + "  (" + centDiff(justFifth, equalTemperamentFrequency("G2")) + " cents from ET)");


      //

      System.out.println("\n\n----\n\n");


      System.out.println("G#3_ET: " + equalTemperamentFrequency("G#3"));
      System.out.println("C4_ET: " + equalTemperamentFrequency("C4"));
      System.out.println("D#4_ET: " + equalTemperamentFrequency("D#4"));
      System.out.println("\n");

      double justThird2 = equalTemperamentFrequency("G#3")*5/4;
      double justFifth2 = equalTemperamentFrequency("G#3")*3/2;

      System.out.println("C4_JI: " + justThird + "  (" + centDiff(justThird2, equalTemperamentFrequency("C4")) + " cents from ET)");
      System.out.println("D#4_JI: " + justFifth + "  (" + centDiff(justFifth2, equalTemperamentFrequency("D#4")) + " cents from ET)");

   }
}
