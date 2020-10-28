package ro.uvt;

public class ImageProxy implements Element {
    String imageName;
    Imagine realImage;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
        this.realImage = null;
    }

    @Override
    public void render(){
        if (this.realImage == null) {
            this.realImage = new Imagine(imageName);
        }
        this.realImage.render();
    }
}
