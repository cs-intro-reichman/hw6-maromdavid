import java.awt.Color;
public class Editor4 {
    public static void main (String[] args) {
        String fileName = args[0];
        int steps = Integer.parseInt(args[1]);
        Color[][] source = Runigram.read(fileName);
        Color[][] target = Runigram.grayScaled(source);
        Runigram.setCanvas(source);
        Runigram.morph(source, target, steps);
    }

}
