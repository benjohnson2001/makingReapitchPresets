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

      double justMinorSecond = equalTemperamentFrequency("B4")*16/15;
      double justMajorSecond = equalTemperamentFrequency("B4")*9/8;
      double justMinorThird = equalTemperamentFrequency("B4")*6/5;
      double justMajorThird = equalTemperamentFrequency("B4")*5/4;
      double justPerfectFourth = equalTemperamentFrequency("B4")*4/3;
      double justTritone = equalTemperamentFrequency("B4")*45/32;
      double justPerfectFifth = equalTemperamentFrequency("B4")*3/2;
      double justMinorSixth = equalTemperamentFrequency("B4")*8/5;
      double justMajorSixth = equalTemperamentFrequency("B4")*5/3;
      double justMinorSeventh = equalTemperamentFrequency("B4")*16/9;
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
      System.out.println("flat fifth: \t\t" + (centDiff(justTritone, equalTemperamentFrequency("F5")) + offset));
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
   
   
   
   /*
    * 
    * 
    * output:
    * 


just intervals
-------------------------------

minor second: 		11.731285269777072
major second: 		3.910001730774822
minor third: 		15.641287000551893
major third: 		-13.686286135165368
perfect fourth: 	-1.9550008653865258
flat fifth: 		-9.776284404390546
perfect fifth: 		1.955000865388296
minor sixth: 		13.686286135165368
major sixth: 		-15.641287000553664
minor seventh: 		-3.910001730774822
major seventh: 		-11.731285269777072




just intervals for rhythmA
-------------------------------

minor second: 		18.03815581157052
major second: 		10.216872272568269
minor third: 		21.948157542345342
major third: 		-7.37941559337192
perfect fourth: 	4.351869676406921
flat fifth: 		-3.469413862597099
perfect fifth: 		8.261871407181744
minor sixth: 		19.993156676958815
major sixth: 		-9.334416458760217
minor seventh: 		2.3968688110186256
major seventh: 		-5.424414727983624




just intervals for bass
-------------------------------

minor second: 		9.234912740520256
major second: 		1.4136292015180065
minor third: 		13.144914471295078
major third: 		-16.182658664422185
perfect fourth: 	-4.451373394643341
flat fifth: 		-12.272656933647362
perfect fifth: 		-0.5413716638685193
minor sixth: 		11.189913605908552
major sixth: 		-18.137659529810477
minor seventh: 		-6.406374260031637
major seventh: 		-14.227657799033887




just intervals for organ
-------------------------------

minor second: 		3.478652381224604
major second: 		-4.342631157777646
minor third: 		7.388654111999426
major third: 		-21.938919023717837
perfect fourth: 	-10.207633753938993
flat fifth: 		-18.028917292943014
perfect fifth: 		-6.297632023164171
minor sixth: 		5.4336532466129
major sixth: 		-23.89391988910613
minor seventh: 		-12.162634619327289
major seventh: 		-19.983918158329537
 
 
    * 
    * */
}
