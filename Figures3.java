public class Figures3 {
    public static void main(String[] args) {
        drawEgg();
        drawTeaCup();
        drawStopSign();
        drawHat();
    }
    
    // draws redundant part that looks like the top of an egg
    public static void drawEggTop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    
    // draws redundant part that looks like the bottom of an egg
    public static void drawEggBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    
    // Draws a figure that vaguely resembles an egg.
    public static void drawEgg() {
        drawEggTop();
        drawEggBottom();
        System.out.println();
    }
    
    // Draws a figure that vaguely resembles a teacup.
    public static void drawTeaCup() {
        drawEggBottom();
        System.out.println("+--------+");
        System.out.println();
    }
    
    // Draws a figure that vaguely resembles a stop sign.
    public static void drawStopSign() {
        drawEggTop();
        System.out.println("|  STOP  |");
        drawEggBottom();
        System.out.println();
    }
    
    // Draws a figure that vaguely resembles a hat.
    public static void drawHat() {
        drawEggTop();
        System.out.println("+--------+");
    }
}