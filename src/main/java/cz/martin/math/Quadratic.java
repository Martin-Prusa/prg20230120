package cz.martin.math;

import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.LinePlot;
import tech.tablesaw.plotly.components.Figure;

import java.util.ArrayList;
import java.util.List;

public class Quadratic {
    public static void main(String[] args) {
        double[] xValues = new double[1001];
        double[] yValues = new double[1001];

        for (int i = -500; i <= 500; i++) {
            xValues[i + 500] = i;
            yValues[i + 500] = i*i;
        }

        Figure fig = LinePlot.create("Kvadratická funkce", "X", xValues, "Y", yValues);
        Plot.show(fig);
    }
}
