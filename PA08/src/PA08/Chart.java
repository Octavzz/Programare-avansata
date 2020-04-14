package PA08;

import PA08.DAO.AlbumController;
import PA08.DAO.ChartsController;

import java.util.ArrayList;
import java.util.List;

public class Chart {
    private String title;
    private ChartsController controller = new ChartsController();

    public Chart(String title) {
        this.title = title;
    }

    public void printChart() {
        controller.printChart(title);
    }
}
