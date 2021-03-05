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

   private static void printFiveLimitJustIntervalCentDifference(double offset, String name) {

      System.out.println("\n");

//      System.out.println("B4_ET: " + equalTemperamentFrequency("B4"));


      // Five Limit

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
//      double justMinorSeventh = equalTemperamentFrequency("B4")*9/5;
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


      System.out.println("\n\n5-limit just intervals" + name + "\n-----------------------------------------\n");
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

   private static void printSevenLimitJustIntervalCentDifference(double offset, String name) {

      System.out.println("\n");

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

      System.out.println("\n\n7-limit just intervals" + name + "\n-----------------------------------------\n");

      System.out.println("original offset: " + offset + " (offset from source sample combined with A detuning, before the just intonation correction)\n");

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


//      printFiveLimitJustIntervalCentDifference(0.0, " (A440)");
//      printFiveLimitJustIntervalCentDifference(centDiff(110, 109.6), " for rhythmA (A440)");
//      printFiveLimitJustIntervalCentDifference(centDiff(138.6, 138.8), " for bass (A440)");
//      printFiveLimitJustIntervalCentDifference(centDiff(523.2, 525.7), " for organ (A440)");

      printSevenLimitJustIntervalCentDifference(0.0, " (A440)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6), " for rhythmA (A440)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8), " for bass (A440)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7), " for organ (A440)");

//      printSevenLimitJustIntervalCentDifference(centDiff(439,440), " (A439)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(439,440), " for rhythmA (A439)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(439,440), " for bass (A439)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(439,440), " for organ (A439)");

//      printSevenLimitJustIntervalCentDifference(centDiff(438,440), " (A438)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(438,440), " for rhythmA (A438)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(438,440), " for bass (A438)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(438,440), " for organ (A438)");

//      printSevenLimitJustIntervalCentDifference(centDiff(437,440), " (A437)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(437,440), " for rhythmA (A437)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(437,440), " for bass (A437)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(437,440), " for organ (A437)");

//      printSevenLimitJustIntervalCentDifference(centDiff(436,440), " (A436)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(436,440), " for rhythmA (A436)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(436,440), " for bass (A436)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(436,440), " for organ (A436)");

//      printSevenLimitJustIntervalCentDifference(centDiff(435,440), " (A435)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(435,440), " for rhythmA (A435)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(435,440), " for bass (A435)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(435,440), " for organ (A435)");

//      printSevenLimitJustIntervalCentDifference(centDiff(434,440), " (A434)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(434,440), " for rhythmA (A434)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(434,440), " for bass (A434)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(434,440), " for organ (A434)");

//      printSevenLimitJustIntervalCentDifference(centDiff(433,440), " (A433)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(433,440), " for rhythmA (A433)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(433,440), " for bass (A433)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(433,440), " for organ (A433)");

//      printSevenLimitJustIntervalCentDifference(centDiff(432,440), " (A432)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(432,440), " for rhythmA (A432)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(432,440), " for bass (A432)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(432,440), " for organ (A432)");

//      printSevenLimitJustIntervalCentDifference(centDiff(431,440), " (A431)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(431,440), " for rhythmA (A431)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(431,440), " for bass (A431)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(431,440), " for organ (A431)");

//      printSevenLimitJustIntervalCentDifference(centDiff(430,440), " (A430)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(430,440), " for rhythmA (A430)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(430,440), " for bass (A430)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(430,440), " for organ (A430)");

//      printSevenLimitJustIntervalCentDifference(centDiff(429,440), " (A429)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(429,440), " for rhythmA (A429)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(429,440), " for bass (A429)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(429,440), " for organ (A429)");

//      printSevenLimitJustIntervalCentDifference(centDiff(428,440), " (A428)");
      printSevenLimitJustIntervalCentDifference(centDiff(110, 109.6) + centDiff(428,440), " for rhythmA (A428)");
      printSevenLimitJustIntervalCentDifference(centDiff(138.6, 138.8) + centDiff(428,440), " for bass (A428)");
      printSevenLimitJustIntervalCentDifference(centDiff(523.2, 525.7) + centDiff(428,440), " for organ (A428)");
   }


}


   /*




7-limit just intervals (A440)
-----------------------------------------

original offset: 0.0 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		19.4428082610977
major second: 		31.17409353087477
minor third: 		15.641287000551893
major third: 		-13.686286135165368
perfect fourth: 	-1.9550008653865258
flat fifth: 		-17.487807395711172
perfect fifth: 		1.955000865388296
minor sixth: 		13.686286135165368
major sixth: 		-15.641287000553664
minor seventh: 		-31.17409353087477
major seventh: 		-11.731285269777072




7-limit just intervals for rhythmA (A440)
-----------------------------------------

original offset: 6.306870541793447 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		25.749678802891147
major second: 		37.480964072668215
minor third: 		21.948157542345342
major third: 		-7.37941559337192
perfect fourth: 	4.351869676406921
flat fifth: 		-11.180936853917725
perfect fifth: 		8.261871407181744
minor sixth: 		19.993156676958815
major sixth: 		-9.334416458760217
minor seventh: 		-24.867222989081323
major seventh: 		-5.424414727983624




7-limit just intervals for bass (A440)
-----------------------------------------

original offset: -2.4963725292568153 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		16.946435731840886
major second: 		28.677721001617954
minor third: 		13.144914471295078
major third: 		-16.182658664422185
perfect fourth: 	-4.451373394643341
flat fifth: 		-19.98417992496799
perfect fifth: 		-0.5413716638685193
minor sixth: 		11.189913605908552
major sixth: 		-18.137659529810477
minor seventh: 		-33.67046606013159
major seventh: 		-14.227657799033887




7-limit just intervals for organ (A440)
-----------------------------------------

original offset: -8.252632888552467 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		11.190175372545232
major second: 		22.9214606423223
minor third: 		7.388654111999426
major third: 		-21.938919023717837
perfect fourth: 	-10.207633753938993
flat fifth: 		-25.74044028426364
perfect fifth: 		-6.297632023164171
minor sixth: 		5.4336532466129
major sixth: 		-23.89391988910613
minor seventh: 		-39.42672641942724
major seventh: 		-19.983918158329537




7-limit just intervals for rhythmA (A439)
-----------------------------------------

original offset: 2.3677697546315124 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		21.810578015729213
major second: 		33.54186328550628
minor third: 		18.009056755183405
major third: 		-11.318516380533856
perfect fourth: 	0.41276888924498656
flat fifth: 		-15.12003764107966
perfect fifth: 		4.322770620019808
minor sixth: 		16.05405588979688
major sixth: 		-13.273517245922152
minor seventh: 		-28.806323776243257
major seventh: 		-9.36351551514556




7-limit just intervals for bass (A439)
-----------------------------------------

original offset: -6.435473316418751 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		13.007334944678949
major second: 		24.73862021445602
minor third: 		9.205813684133142
major third: 		-20.12175945158412
perfect fourth: 	-8.390474181805276
flat fifth: 		-23.923280712129923
perfect fifth: 		-4.4804724510304546
minor sixth: 		7.250812818746617
major sixth: 		-22.076760316972415
minor seventh: 		-37.60956684729352
major seventh: 		-18.166758586195822




7-limit just intervals for organ (A439)
-----------------------------------------

original offset: -12.191733675714403 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		7.2510745853832965
major second: 		18.982359855160368
minor third: 		3.44955332483749
major third: 		-25.87801981087977
perfect fourth: 	-14.146734541100928
flat fifth: 		-29.679541071425575
perfect fifth: 		-10.236732810326107
minor sixth: 		1.494552459450965
major sixth: 		-27.833020676268067
minor seventh: 		-43.365827206589174
major seventh: 		-23.923018945491474




7-limit just intervals for rhythmA (A438)
-----------------------------------------

original offset: -1.580314166389103 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		17.862494094708595
major second: 		29.59377936448567
minor third: 		14.06097283416279
major third: 		-15.26660030155447
perfect fourth: 	-3.535315031775629
flat fifth: 		-19.068121562100274
perfect fifth: 		0.37468669899919305
minor sixth: 		12.105971968776265
major sixth: 		-17.22160116694277
minor seventh: 		-32.75440769726387
major seventh: 		-13.311599436166174




7-limit just intervals for bass (A438)
-----------------------------------------

original offset: -10.383557237439366 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		9.059251023658334
major second: 		20.790536293435405
minor third: 		5.257729763112527
major third: 		-24.069843372604733
perfect fourth: 	-12.33855810282589
flat fifth: 		-27.871364633150538
perfect fifth: 		-8.42855637205107
minor sixth: 		3.302728897726002
major sixth: 		-26.02484423799303
minor seventh: 		-41.55765076831413
major seventh: 		-22.114842507216437




7-limit just intervals for organ (A438)
-----------------------------------------

original offset: -16.139817596735018 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		3.3029906643626816
major second: 		15.034275934139753
minor third: 		-0.4985305961831248
major third: 		-29.826103731900385
perfect fourth: 	-18.094818462121545
flat fifth: 		-33.62762499244619
perfect fifth: 		-14.184816731346721
minor sixth: 		-2.45353146156965
major sixth: 		-31.78110459728868
minor seventh: 		-47.313911127609785
major seventh: 		-27.87110286651209




7-limit just intervals for rhythmA (A437)
-----------------------------------------

original offset: -5.537422287079677 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		13.905385974018023
major second: 		25.636671243795092
minor third: 		10.103864713472216
major third: 		-19.223708422245046
perfect fourth: 	-7.492423152466203
flat fifth: 		-23.02522968279085
perfect fifth: 		-3.5824214216913806
minor sixth: 		8.148863848085691
major sixth: 		-21.17870928763334
minor seventh: 		-36.71151581795445
major seventh: 		-17.268707556856747




7-limit just intervals for bass (A437)
-----------------------------------------

original offset: -14.34066535812994 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		5.10214290296776
major second: 		16.83342817274483
minor third: 		1.3006216424219534
major third: 		-28.026951493295307
perfect fourth: 	-16.295666223516466
flat fifth: 		-31.828472753841112
perfect fifth: 		-12.385664492741643
minor sixth: 		-0.6543792229645717
major sixth: 		-29.981952358683603
minor seventh: 		-45.51475888900471
major seventh: 		-26.07195062790701




7-limit just intervals for organ (A437)
-----------------------------------------

original offset: -20.09692571742559 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-0.6541174563278922
major second: 		11.07716781344918
minor third: 		-4.455638716873699
major third: 		-33.78321185259096
perfect fourth: 	-22.05192658281212
flat fifth: 		-37.584733113136764
perfect fifth: 		-18.141924852037295
minor sixth: 		-6.410639582260224
major sixth: 		-35.73821271797925
minor seventh: 		-51.27101924830036
major seventh: 		-31.828210987202663




7-limit just intervals for rhythmA (A436)
-----------------------------------------

original offset: -9.503595955487054 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		9.939212305610646
major second: 		21.670497575387717
minor third: 		6.137691045064839
major third: 		-23.18988209065242
perfect fourth: 	-11.458596820873579
flat fifth: 		-26.991403351198226
perfect fifth: 		-7.5485950900987575
minor sixth: 		4.182690179678314
major sixth: 		-25.144882956040718
minor seventh: 		-40.67768948636183
major seventh: 		-21.234881225264125




7-limit just intervals for bass (A436)
-----------------------------------------

original offset: -18.306839026537318 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		1.1359692345603811
major second: 		12.867254504337453
minor third: 		-2.6655520259854253
major third: 		-31.993125161702686
perfect fourth: 	-20.261839891923845
flat fifth: 		-35.79464642224849
perfect fifth: 		-16.351838161149022
minor sixth: 		-4.6205528913719505
major sixth: 		-33.94812602709098
minor seventh: 		-49.48093255741209
major seventh: 		-30.03812429631439




7-limit just intervals for organ (A436)
-----------------------------------------

original offset: -24.06309938583297 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-4.620291124735271
major second: 		7.110994145041801
minor third: 		-8.421812385281077
major third: 		-37.74938552099834
perfect fourth: 	-26.018100251219497
flat fifth: 		-41.55090678154414
perfect fifth: 		-22.108098520444674
minor sixth: 		-10.376813250667603
major sixth: 		-39.70438638638663
minor seventh: 		-55.23719291670774
major seventh: 		-35.794384655610045




7-limit just intervals for rhythmA (A435)
-----------------------------------------

original offset: -13.478876804488873 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		5.963931456608826
major second: 		17.695216726385897
minor third: 		2.1624101960630195
major third: 		-27.16516293965424
perfect fourth: 	-15.433877669875399
flat fifth: 		-30.966684200200046
perfect fifth: 		-11.523875939100577
minor sixth: 		0.20740933067649436
major sixth: 		-29.120163805042537
minor seventh: 		-44.65297033536365
major seventh: 		-25.210162074265945




7-limit just intervals for bass (A435)
-----------------------------------------

original offset: -22.282119875539138 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-2.8393116144414385
major second: 		8.891973655335633
minor third: 		-6.640832874987245
major third: 		-35.968406010704506
perfect fourth: 	-24.237120740925665
flat fifth: 		-39.76992727125031
perfect fifth: 		-20.32711901015084
minor sixth: 		-8.59583374037377
major sixth: 		-37.9234068760928
minor seventh: 		-53.45621340641391
major seventh: 		-34.01340514531621




7-limit just intervals for organ (A435)
-----------------------------------------

original offset: -28.03838023483479 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-8.59557197373709
major second: 		3.135713296039981
minor third: 		-12.397093234282897
major third: 		-41.72466637000016
perfect fourth: 	-29.993381100221317
flat fifth: 		-45.52618763054596
perfect fifth: 		-26.083379369446494
minor sixth: 		-14.352094099669422
major sixth: 		-43.67966723538845
minor seventh: 		-59.21247376570956
major seventh: 		-39.769665504611865




7-limit just intervals for rhythmA (A434)
-----------------------------------------

original offset: -17.46330675442243 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		1.9795015066752697
major second: 		13.710786776452341
minor third: 		-1.8220197538705367
major third: 		-31.149592889587797
perfect fourth: 	-19.418307619808957
flat fifth: 		-34.951114150133606
perfect fifth: 		-15.508305889034133
minor sixth: 		-3.777020619257062
major sixth: 		-33.104593754976094
minor seventh: 		-48.637400285297204
major seventh: 		-29.1945920241995




7-limit just intervals for bass (A434)
-----------------------------------------

original offset: -26.266549825472694 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-6.823741564374995
major second: 		4.907543705402077
minor third: 		-10.625262824920801
major third: 		-39.95283596063806
perfect fourth: 	-28.22155069085922
flat fifth: 		-43.75435722118387
perfect fifth: 		-24.311548960084398
minor sixth: 		-12.580263690307326
major sixth: 		-41.907836826026355
minor seventh: 		-57.440643356347465
major seventh: 		-37.99783509524977




7-limit just intervals for organ (A434)
-----------------------------------------

original offset: -32.022810184768346 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-12.580001923670647
major second: 		-0.8487166538935753
minor third: 		-16.381523184216455
major third: 		-45.709096319933714
perfect fourth: 	-33.97781105015487
flat fifth: 		-49.51061758047952
perfect fifth: 		-30.06780931938005
minor sixth: 		-18.33652404960298
major sixth: 		-47.66409718532201
minor seventh: 		-63.19690371564312
major seventh: 		-43.75409545454542




7-limit just intervals for rhythmA (A433)
-----------------------------------------

original offset: -21.456928015727712 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-2.0141197546300127
major second: 		9.717165515147059
minor third: 		-5.815641015175819
major third: 		-35.14321415089308
perfect fourth: 	-23.41192888111424
flat fifth: 		-38.944735411438884
perfect fifth: 		-19.501927150339416
minor sixth: 		-7.770641880562344
major sixth: 		-37.09821501628137
minor seventh: 		-52.63102154660248
major seventh: 		-33.18821328550479




7-limit just intervals for bass (A433)
-----------------------------------------

original offset: -30.260171086777973 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-10.817362825680274
major second: 		0.9139224440967979
minor third: 		-14.61888408622608
major third: 		-43.94645722194334
perfect fourth: 	-32.215171952164496
flat fifth: 		-47.747978482489145
perfect fifth: 		-28.305170221389677
minor sixth: 		-16.573884951612605
major sixth: 		-45.90145808733163
minor seventh: 		-61.434264617652744
major seventh: 		-41.99145635655505




7-limit just intervals for organ (A433)
-----------------------------------------

original offset: -36.016431446073625 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-16.573623184975926
major second: 		-4.842337915198854
minor third: 		-20.375144445521734
major third: 		-49.70271758123899
perfect fourth: 	-37.97143231146015
flat fifth: 		-53.5042388417848
perfect fifth: 		-34.06143058068533
minor sixth: 		-22.330145310908257
major sixth: 		-51.657718446627285
minor seventh: 		-67.1905249769484
major seventh: 		-47.7477167158507




7-limit just intervals for rhythmA (A432)
-----------------------------------------

original offset: -25.459783091636442 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-6.016974830538743
major second: 		5.714310439238329
minor third: 		-9.81849609108455
major third: 		-39.146069226801814
perfect fourth: 	-27.41478395702297
flat fifth: 		-42.94759048734761
perfect fifth: 		-23.504782226248146
minor sixth: 		-11.773496956471075
major sixth: 		-41.101070092190106
minor seventh: 		-56.63387662251121
major seventh: 		-37.191068361413514




7-limit just intervals for bass (A432)
-----------------------------------------

original offset: -34.26302616268671 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-14.820217901589007
major second: 		-3.088932631811936
minor third: 		-18.621739162134816
major third: 		-47.949312297852074
perfect fourth: 	-36.21802702807323
flat fifth: 		-51.75083355839788
perfect fifth: 		-32.308025297298414
minor sixth: 		-20.57674002752134
major sixth: 		-49.904313163240374
minor seventh: 		-65.43711969356147
major seventh: 		-45.994311432463775




7-limit just intervals for organ (A432)
-----------------------------------------

original offset: -40.01928652198236 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-20.57647826088466
major second: 		-8.845192991107588
minor third: 		-24.377999521430468
major third: 		-53.70557265714773
perfect fourth: 	-41.97428738736888
flat fifth: 		-57.50709391769353
perfect fifth: 		-38.064285656594066
minor sixth: 		-26.33300038681699
major sixth: 		-55.660573522536026
minor seventh: 		-71.19338005285712
major seventh: 		-51.75057179175943




7-limit just intervals for rhythmA (A431)
-----------------------------------------

original offset: -29.471914780880606 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-10.029106519782907
major second: 		1.7021787499941645
minor third: 		-13.830627780328713
major third: 		-43.15820091604597
perfect fourth: 	-31.426915646267133
flat fifth: 		-46.95972217659178
perfect fifth: 		-27.51691391549231
minor sixth: 		-15.785628645715239
major sixth: 		-45.11320178143427
minor seventh: 		-60.64600831175538
major seventh: 		-41.20320005065768




7-limit just intervals for bass (A431)
-----------------------------------------

original offset: -38.27515785193087 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-18.83234959083317
major second: 		-7.1010643210561
minor third: 		-22.63387085137898
major third: 		-51.96144398709624
perfect fourth: 	-40.230158717317394
flat fifth: 		-55.76296524764204
perfect fifth: 		-36.32015698654258
minor sixth: 		-24.588871716765503
major sixth: 		-53.91644485248453
minor seventh: 		-69.44925138280564
major seventh: 		-50.006443121707946




7-limit just intervals for organ (A431)
-----------------------------------------

original offset: -44.03141821122652 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-24.588609950128824
major second: 		-12.857324680351752
minor third: 		-28.39013121067463
major third: 		-57.71770434639189
perfect fourth: 	-45.986419076613046
flat fifth: 		-61.519225606937695
perfect fifth: 		-42.07641734583823
minor sixth: 		-30.345132076061155
major sixth: 		-59.67270521178018
minor seventh: 		-75.2055117421013
major seventh: 		-55.7627034810036




7-limit just intervals for rhythmA (A430)
-----------------------------------------

original offset: -33.49336618044525 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-14.05055791934755
major second: 		-2.319272649570479
minor third: 		-17.85207917989336
major third: 		-47.17965231561062
perfect fourth: 	-35.44836704583177
flat fifth: 		-50.98117357615642
perfect fifth: 		-31.538365315056954
minor sixth: 		-19.807080045279882
major sixth: 		-49.13465318099891
minor seventh: 		-64.66745971132002
major seventh: 		-45.224651450222325




7-limit just intervals for bass (A430)
-----------------------------------------

original offset: -42.29660925149551 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-22.85380099039781
major second: 		-11.12251572062074
minor third: 		-26.65532225094362
major third: 		-55.98289538666088
perfect fourth: 	-44.251610116882034
flat fifth: 		-59.78441664720668
perfect fifth: 		-40.34160838610722
minor sixth: 		-28.610323116330143
major sixth: 		-57.93789625204917
minor seventh: 		-73.47070278237028
major seventh: 		-54.027894521272586




7-limit just intervals for organ (A430)
-----------------------------------------

original offset: -48.05286961079116 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-28.610061349693463
major second: 		-16.878776079916392
minor third: 		-32.41158261023927
major third: 		-61.73915574595653
perfect fourth: 	-50.007870476177686
flat fifth: 		-65.54067700650234
perfect fifth: 		-46.09786874540287
minor sixth: 		-34.366583475625795
major sixth: 		-63.69415661134482
minor seventh: 		-79.22696314166593
major seventh: 		-59.78415488056824




7-limit just intervals for rhythmA (A429)
-----------------------------------------

original offset: -37.52418068834248 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-18.081372427244784
major second: 		-6.350087157467712
minor third: 		-21.88289368779059
major third: 		-51.21046682350785
perfect fourth: 	-39.479181553729006
flat fifth: 		-55.011988084053655
perfect fifth: 		-35.56917982295419
minor sixth: 		-23.837894553177115
major sixth: 		-53.16546768889614
minor seventh: 		-68.69827421921725
major seventh: 		-49.25546595811956




7-limit just intervals for bass (A429)
-----------------------------------------

original offset: -46.327423759392744 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-26.884615498295044
major second: 		-15.153330228517973
minor third: 		-30.686136758840853
major third: 		-60.01370989455811
perfect fourth: 	-48.28242462477927
flat fifth: 		-63.815231155103916
perfect fifth: 		-44.37242289400445
minor sixth: 		-32.641137624227376
major sixth: 		-61.968710759946404
minor seventh: 		-77.50151729026751
major seventh: 		-58.05870902916982




7-limit just intervals for organ (A429)
-----------------------------------------

original offset: -52.083684118688396 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-32.6408758575907
major second: 		-20.909590587813625
minor third: 		-36.442397118136505
major third: 		-65.76997025385376
perfect fourth: 	-54.03868498407492
flat fifth: 		-69.57149151439957
perfect fifth: 		-50.1286832533001
minor sixth: 		-38.39739798352303
major sixth: 		-67.72497111924206
minor seventh: 		-83.25777764956317
major seventh: 		-63.81496938846547




7-limit just intervals for rhythmA (A428)
-----------------------------------------

original offset: -41.56440200642092 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-22.12159374532322
major second: 		-10.39030847554615
minor third: 		-25.92311500586903
major third: 		-55.25068814158629
perfect fourth: 	-43.51940287180744
flat fifth: 		-59.05220940213209
perfect fifth: 		-39.60940114103263
minor sixth: 		-27.878115871255552
major sixth: 		-57.20568900697458
minor seventh: 		-72.73849553729569
major seventh: 		-53.295687276197995




7-limit just intervals for bass (A428)
-----------------------------------------

original offset: -50.36764507747119 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-30.92483681637349
major second: 		-19.193551546596417
minor third: 		-34.7263580769193
major third: 		-64.05393121263656
perfect fourth: 	-52.32264594285771
flat fifth: 		-67.85545247318237
perfect fifth: 		-48.412644212082895
minor sixth: 		-36.68135894230582
major sixth: 		-66.00893207802486
minor seventh: 		-81.54173860834595
major seventh: 		-62.098930347248256




7-limit just intervals for organ (A428)
-----------------------------------------

original offset: -56.12390543676684 (offset from source sample combined with A detuning, before the just intonation correction)

minor second: 		-36.68109717566914
major second: 		-24.94981190589207
minor third: 		-40.48261843621495
major third: 		-69.81019157193221
perfect fourth: 	-58.078906302153364
flat fifth: 		-73.61171283247802
perfect fifth: 		-54.16890457137855
minor sixth: 		-42.43761930160147
major sixth: 		-71.76519243732051
minor seventh: 		-87.2979989676416
major seventh: 		-67.85519070654391

Process finished with exit code 0

    */

