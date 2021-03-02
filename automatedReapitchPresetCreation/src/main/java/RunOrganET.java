import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class RunOrganET {


   // make sure to shrink images by 50% so it will work with mac retina

   public static double centDiff(double a, double b) {
      double K = 1200 / Math.log10(2);
      return K*(Math.log10(a)-Math.log10(b));
   }

   private static Location getLocation(Screen screen, Pattern arg) throws Exception {
      return screen.wait(arg.similar((float) 0.80), 5).getTarget();
   }

   private static void backspaceThirtyTimes(Screen screen) {
      for (int k = 0; k < 30; k++) {
         screen.type(Key.BACKSPACE);
      }
   }

   private static String getNoteNameForZeroOctaveShift(int i) {

      switch (i) {
         default: return null;
         case -18: return "F#3";
         case -17: return "G3";
         case -16: return "G#3";
         case -15: return "A3";
         case -14: return "A#3";
         case -13: return "B3";
         case -12: return "C4";
         case -11: return "C#4";
         case -10: return "D4";
         case -9: return "D#4";
         case -8: return "E4";
         case -7: return "F4";
         case -6: return "F#4";
         case -5: return "G4";
         case -4: return "G#4";
         case -3: return "A4";
         case -2: return "A#4";
         case -1: return "B4";
         case 0: return "C5";
         case 1: return "C#5";
         case 2: return "D5";
         case 3: return "D#5";
         case 4: return "E5";
         case 5: return "F5";
         case 6: return "F#5";
         case 7: return "G5";
         case 8: return "G#5";
         case 9: return "A5";
         case 10: return "A#5";
         case 11: return "B5";
         case 12: return "C6";
         case 13: return "C#6";
         case 14: return "D6";
         case 15: return "D#6";
         case 16: return "E6";
         case 17: return "F6";
         case 18: return "F#6";
      }
   }


   public static void main(String[] args) throws Exception {

      Pattern currentTrackPattern = new Pattern(RunRhythmAET.class.getResource("currentTrack.png"));
      Pattern closeButtonPattern = new Pattern(RunRhythmAET.class.getResource("closeButton.png"));
      Pattern base1Pattern = new Pattern(RunRhythmAET.class.getResource("base1.png"));
      Pattern shiftCentsPattern = new Pattern(RunRhythmAET.class.getResource("shiftCents.png"));
      Pattern shiftSemitonesPattern = new Pattern(RunRhythmAET.class.getResource("shiftSemitones.png"));
      Pattern shiftOctavesPattern = new Pattern(RunRhythmAET.class.getResource("shiftOctaves.png"));
      Pattern plusButtonPattern = new Pattern(RunRhythmAET.class.getResource("plusButton.png"));

      Pattern okButtonPattern = new Pattern(RunRhythmAET.class.getResource("okButton.png"));
      Pattern exportPatchPattern = new Pattern(RunRhythmAET.class.getResource("exportPatch.png"));
      Pattern savePresetPattern = new Pattern(RunRhythmAET.class.getResource("savePreset.png"));
      Pattern presetNamePattern = new Pattern(RunRhythmAET.class.getResource("presetName.png"));
      Pattern saveAsPattern = new Pattern(RunRhythmAET.class.getResource("saveAs.png"));
      Pattern savePatchButtonPattern = new Pattern(RunRhythmAET.class.getResource("savePatchButton.png"));
      Pattern removeFxPattern = new Pattern(RunRhythmAET.class.getResource("removeFx.png"));

      Screen screen = new Screen(0);

      Location reaperIconLocation = new Location(0, 330);

      screen.mouseMove(reaperIconLocation);
      screen.click(reaperIconLocation);


      for (int i = -18; i <= 18; i++) {

         Location base1FxButton = getLocation(screen, base1Pattern).offset(140, 0);
         Location currentTrackFxButton = getLocation(screen, currentTrackPattern).offset(140, 0);

         screen.dragDrop(base1FxButton, currentTrackFxButton);


         Location centsInputBox = getLocation(screen, shiftCentsPattern).offset(110, 0);
         screen.click(centsInputBox);
         backspaceThirtyTimes(screen);

         screen.type(String.valueOf(centDiff(523.2,525.7)));

         Location semitonesInputBox = getLocation(screen, shiftSemitonesPattern).offset(110, 0);
         screen.click(semitonesInputBox);
         backspaceThirtyTimes(screen);

         screen.type(String.valueOf(i));

         Location plusButton = getLocation(screen, plusButtonPattern);
         screen.click(plusButton);

         Location exportPatch = getLocation(screen, exportPatchPattern);
         screen.click(exportPatch);

         Location saveAsField = getLocation(screen, saveAsPattern).offset(70, 0);
         screen.mouseMove(saveAsField);
         screen.type(Key.BACKSPACE);

         screen.doubleClick(saveAsField);

         backspaceThirtyTimes(screen);

         String presetName = "organ_ET_" + getNoteNameForZeroOctaveShift(i);

         screen.type(presetName);

         Location savePatchButton = getLocation(screen, savePatchButtonPattern);
         screen.click(savePatchButton);

         screen.click(plusButton);

         Location savePreset = getLocation(screen, savePresetPattern);
         screen.click(savePreset);

         Location presetNameField = getLocation(screen, presetNamePattern).offset(100, 0);
         screen.mouseMove(presetNameField);
         screen.type(Key.BACKSPACE);

         screen.doubleClick(presetNameField);

         backspaceThirtyTimes(screen);
         screen.type(presetName);

         Location okButton = getLocation(screen, okButtonPattern);
         screen.click(okButton);

         Location removeFx = getLocation(screen, removeFxPattern);
         screen.click(removeFx);
         Thread.sleep(1000);

         Location closeButton = getLocation(screen, closeButtonPattern);
         screen.click(closeButton);
      }
   }
}
