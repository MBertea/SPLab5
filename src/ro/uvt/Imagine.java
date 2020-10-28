package ro.uvt;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element{
    String name;

    public Imagine(String name) {
        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Imagine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void render(){
        System.out.println(this);
    }
}
