package cz.martin.math;

import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.LinePlot;
import tech.tablesaw.plotly.components.Axis;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.components.Line;
import tech.tablesaw.plotly.traces.ScatterTrace;
import tech.tablesaw.plotly.traces.Trace;

public class SinCos {
    public static void main(String[] args) {
        double[] xValuesSin = new double[1001];
        double[] yValuesSin = new double[1001];
        double[] xValuesCos = new double[1001];
        double[] yValuesCos = new double[1001];

        for (int i = -500; i <= 500; i++) {
            xValuesSin[i + 500] = i;
            yValuesSin[i + 500] = Math.sin(i / 50f);
            xValuesCos[i + 500] = i;
            yValuesCos[i + 500] = Math.cos(i / 50f);
        }

        Axis xAxis = Axis.builder().title("X").build();
        Axis yAxis = Axis.builder().title("Y").build();

        Layout layout = Layout.builder()
                .title("Mathematical Functions")
                .xAxis(xAxis)
                .yAxis(yAxis)
                .height(650)
                .width(650)
                .build();

        Trace traceCos = ScatterTrace
                .builder(xValuesCos, yValuesCos)
                .line(Line.builder().build())
                .name("cos(x)")
                .build();

        Trace traceSin = ScatterTrace
                .builder(xValuesSin, yValuesSin)
                .line(Line.builder().build())
                .name("sin(x)")
                .build();

        Figure fig = new Figure(layout, traceCos, traceSin);

        Plot.show(fig);
    }
}
