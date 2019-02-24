package StructuralPattern.BridgePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
