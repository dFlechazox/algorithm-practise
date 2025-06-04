package datas.sort;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.*;

public class LineXYDemo extends ApplicationFrame {
    // 该构造方法中完成了数据集、图表对象和显示图表面板的创建工作
    public LineXYDemo(String title){
        super(title);
        XYDataset dataset = createDataset();             // 创建记录图中坐标点的数据集
        JFreeChart chart = createChart(dataset);         // 使用上一步已经创建好的数据集生成一个图表对象
        ChartPanel chartPanel = new ChartPanel(chart);   // 将上一步已经创建好的图表对象放置到一个可以显示的Panel上
        // 设置GUI面板Panel的显示大小
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);                      // 这是JavaGUI的步骤之一，不用过于关心
    }

    private JFreeChart createChart(XYDataset dataset) {
        // 使用已经创建好的dataset生成图表对象
        // JFreechart提供了多种类型的图表对象，本次实验是需要使用XYLine型的图表对象
        JFreeChart chart = ChartFactory.createXYLineChart(
                "LineXY Chart Demo",      // 图表的标题
                "X",                           // 横轴的标题名
                "Y",                           // 纵轴的标题名
                dataset,                       // 图表对象中使用的数据集对象
                PlotOrientation.VERTICAL,      // 图表显示的方向
                true,                          // 是否显示图例
                false,                         // 是否需要生成tooltips
                false                          // 是否需要生成urls
        );
        // 下面所做的工作都是可选操作，主要是为了调整图表显示的风格
        // 同学们不必在意下面的代码
        // 可以将下面的代码去掉对比一下显示的不同效果
        chart.setBackgroundPaint(Color.WHITE);
        XYPlot plot = (XYPlot)chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 6.0));
        plot.setDomainGridlinePaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.WHITE);
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
        renderer.setDefaultShapesVisible(true);
        renderer.setDefaultShapesFilled(true);
        return chart;
    }

    private XYDataset createDataset() {
        // 本样例中想要显示的是三组数据的变化图
        // X数组是三组数据共同拥有的x坐标值；Y1、Y2和Y3数组分别存储了三组数据对应的y坐标值
        double[] X = {256,512,1024,2048,4096,8192,16384,32768,65536};
        double[] Y1 = {87840.0000, 100020.0000, 130820.0000, 294420.0000, 471000.0000, 312380.0000, 512720.0000, 769680.0000, 1366860.0000};
        for (int i = 0;i<Y1.length;i++){
            Y1[i] = Math.log(Y1[i]);
        }
        double[] Y2 = {851080.0000, 1996140.0000, 4892640.0000, 4460480.0000, 15964360.0000, 69157140.0000, 261843940.0000, 1066067160.0000, 4237884040.0000};
        for (int i = 0;i<Y1.length;i++){
            Y2[i] = Math.log(Y2[i]);
        }
        double[] Y3 = {131720.0000, 180920.0000, 271520.0000, 237420.0000, 561040.0000, 1165480.0000, 1055020.0000, 2198540.0000, 4987640.0000};
        for (int i = 0;i<Y1.length;i++){
            Y3[i] = Math.log(Y3[i]);
        }
        double[] Y4 = {680.0000, 200.0000, 300.0000, 400.0000, 480.0000, 720.0000, 680.0000, 1400.0000, 1380.0000};
        for (int i = 0;i<Y1.length;i++){
            Y4[i] = Math.log(Y4[i]);
        }
        double[] Y5 = {560.0000, 200.0000, 120.0000, 320.0000, 340.0000, 540.0000, 380.0000, 880.0000, 960.0000};
        for (int i = 0;i<Y1.length;i++){
            Y5[i] = Math.log(Y5[i]);
        }
        double[][] Y = {Y1, Y2, Y3,Y4,Y5};
        // jfreechart中使用XYSeries对象存储一组数据的(x,y)的序列，因为有三组数据所以创建三个XYSeries对象
        XYSeries[] series = {new XYSeries("Insertion"), new XYSeries("Selection"), new XYSeries("Shell"), new XYSeries("Quicksort"), new XYSeries("Mergesort")};
        int N = X.length;
        int M = series.length;
        for(int i = 0; i < M; i++)
            for(int j = 0; j < N; j++)
                series[i].add(X[j], Y[i][j]);
        // 因为在该图表中显示的数据序列不止一组，所以在jfreechart中需要将多组数据序列存放到一个XYSeriesCollection对象中
        XYSeriesCollection dataset = new XYSeriesCollection();
        for(int i = 0; i < M; i++)
            dataset.addSeries(series[i]);

        return dataset;
    }

    public static void main(String[] args) {
        LineXYDemo demo = new LineXYDemo("图表数据显示演示程序");
        demo.pack();
        demo.setVisible(true);
    }
}
