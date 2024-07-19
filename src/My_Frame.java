public class My_Frame {

    private String title;
    private int Width;
    private int height;
    private int defaultCloseOperation;
    private boolean resizable;
    private boolean visible;

    
    public My_Frame(String title, 
                    int width, 
                    int height, 
                    int defaultCloseOperation, 
                    boolean resizable,
                    boolean visible) {

        this.title = title;
        this.Width = width;
        this.height = height;
        this.defaultCloseOperation = defaultCloseOperation;
        this.resizable = resizable;
        this.visible = visible;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public int getWidth() {
        return Width;
    }


    public void setWidth(int width) {
        Width = width;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public int getDefaultCloseOperation() {
        return defaultCloseOperation;
    }


    public void setDefaultCloseOperation(int defaultCloseOperation) {
        this.defaultCloseOperation = defaultCloseOperation;
    }


    public boolean isResizable() {
        return resizable;
    }


    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }


    public boolean isVisible() {
        return visible;
    }


    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    

    

    
}