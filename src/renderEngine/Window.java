package renderEngine;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class Window {

    private final int WIDTH = 1024;
    private final int HEIGHT = WIDTH / 12 * 9;

    private long window;
    private String title;

    public Window(String title) {
        this.title = title;
    }


    public void create() {
        if (!GLFW.glfwInit()) {
            System.err.println("Error creating window");
            System.exit(-1);
        }

        this.window = GLFW.glfwCreateWindow(WIDTH,HEIGHT,title, 0,0);

        if (window == 0) {
            System.err.println("Error, window coulnt be created");
            System.exit(-1);
        }

        GLFWVidMode videoMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
        GLFW.glfwSetWindowPos(window, (videoMode.width() - WIDTH) / 2, (videoMode.height() - HEIGHT) /2 );
        GLFW.glfwShowWindow(window);
    }


    public boolean closed() {
        return GLFW.glfwWindowShouldClose(window);
    }


    public void update() {
        GLFW.glfwPollEvents();
    }

    public void swapBuffers() {
        GLFW.glfwSwapBuffers(window);
    }


    public void close() {

    }
}
