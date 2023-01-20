package cz.martin.height;

import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.*;
import tech.tablesaw.plotly.traces.ScatterTrace;
import tech.tablesaw.plotly.traces.Trace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Height {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("height-weight.csv"));

        double[] maleHeight = lines.stream().filter(i -> i.contains("Male")).map(i -> Double.parseDouble(i.split(",")[1])).mapToDouble(d -> d).toArray();
        double[] maleWeight = lines.stream().filter(i -> i.contains("Male")).map(i -> Double.parseDouble(i.split(",")[2])).mapToDouble(d -> d).toArray();
        double[] femaleHeight = lines.stream().filter(i -> i.contains("Female")).map(i -> Double.parseDouble(i.split(",")[1])).mapToDouble(d -> d).toArray();
        double[] femaleWeight = lines.stream().filter(i -> i.contains("Female")).map(i -> Double.parseDouble(i.split(",")[2])).mapToDouble(d -> d).toArray();

        Axis xAxis = Axis.builder()
                .title("Height")
                .build();

        Axis yAxis = Axis.builder()
                .title("Weight")
                .build();

        Layout layout = Layout.builder()
                .title("Correlation between height and weight")
                .height(650)
                .xAxis(xAxis)
                .yAxis(yAxis)
                .width(850)
                .build();

        Trace trace = ScatterTrace
                .builder(maleHeight, maleWeight)
                .opacity(0.5)
                .mode(ScatterTrace.Mode.MARKERS)
                .marker(Marker.builder().color("blue").build())
                .name("Male")
                .build();

        Trace trace2 = ScatterTrace
                .builder(femaleHeight, femaleWeight)
                .opacity(0.5)
                .mode(ScatterTrace.Mode.MARKERS)
                .marker(Marker.builder().color("red").build())
                .name("female")
                .build();

        Figure fig = new Figure(layout, trace, trace2);

        Plot.show(fig);
    }
}
