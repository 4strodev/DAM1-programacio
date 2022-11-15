// Author Juan Alejandro Marin Ruiz AKA 4strodev
package table;

import java.util.ArrayList;

public class Table {
    ArrayList<Row> tableContent;
    int colSize;
    int nElements;

    public Table() {
        this.colSize = 0;
        this.nElements = 0;
        this.tableContent = new ArrayList<Row>();
    }

    public void addContent(ContentRow row) {
        this.colSize = Math.max(row.getMaxCol(), this.colSize);
        this.nElements = Math.max(row.content.size(), this.nElements);
        this.tableContent.add(row);
    }

    public void renderTable() {
        for (Row row : this.tableContent) {
            row.render(this.colSize, this.nElements);
        }
    }

    public void addSeparator(SeparatorRow separator) {
        this.tableContent.add(separator);
    }
}
