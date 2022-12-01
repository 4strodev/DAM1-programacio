// Author Juan Alejandro Marin Ruiz AKA 4strodev
import table.ContentRow;
import table.SeparatorRow;
import table.Table;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] roomsCollection = {
                // Sala 1
                {250, 120, 340, 220, 560, 450, 340},
                // Sala 2
                {190, 160, 290, 250, 480, 420, 320},
                // Sala 3
                {210, 180, 210, 270, 350, 325, 260}
        };

        Table table = new Table();

        table.addSeparator(new SeparatorRow("-"));
        for (int i = 0; i < roomsCollection.length; i++) {
            final double[] room = roomsCollection[i];
            final double[] weekCollection = Arrays.stream(room).reduce(Double::sum).stream().toArray();

            final ArrayList<String> rowItems = convertToArrayString(room);
            ContentRow row = new ContentRow(rowItems);
            row.content.add(0, String.format("Sala %d", i + 1));
            row.content.add(weekCollection[0] + "");
            table.addContent(row);
        }

        double[] sumCols = getSumCols(roomsCollection);
        final ArrayList<String> rowItems = convertToArrayString(sumCols);
        final ContentRow colSumRow = new ContentRow(rowItems);
        colSumRow.content.add(" ");
        colSumRow.content.add(0, "Total per dia");
        table.addContent(colSumRow);
        table.addSeparator(new SeparatorRow("-"));

        table.renderTable();
    }

    static ArrayList<String> convertToArrayString(double[] list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (var item : list) {
            arrayList.add(item + "");
        }

        return arrayList;
    }

    static double sumCol(int nCol, double[][] array) {
        double total = 0;

        for (double[] row : array) {
            total += row[nCol];
        }

        return total;
    }

    static double[] getSumCols(double[][] array) {
        double[] sumCols;

        // If the array is empty end function
        if (array.length == 0) {
            return new double[]{};
        }

        double maxCol = array[0].length;
        sumCols = new double[(int) Math.round(maxCol)];

        // Iterate over array and get the sumCol result
        for (int i = 0; i < maxCol; i++) {
            sumCols[i] = sumCol(i, array);
        }

        return sumCols;
    }
}
