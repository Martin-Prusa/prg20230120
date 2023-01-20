package cz.martin.math;

import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.LinePlot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Line;

public class Linear {
    public static void main(String[] args) {
        Figure fig = LinePlot.create("Lineární funkce", "X", new double[]{-500.0, 500.0}, "Y", new double[]{-500, 500});
        Plot.show(fig);
    }
}
