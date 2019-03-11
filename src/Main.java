import renderEngine.Window;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting game!");
        Window window = new Window("My first game");
        window.create();
        //game logic

        while(!window.closed()) {
            window.update();
            System.out.println("Some logic");
            window.swapBuffers();
        }
    }
}




