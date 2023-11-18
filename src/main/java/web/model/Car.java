package web.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Car {
    private final String  series;
    private final String  model;
    private final int wheel;


    public String getSeries() {
        return series;
    }


    public String getModel() {
        return model;
    }


    public int getWheel() {
        return wheel;
    }

}
