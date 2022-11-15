// Author Juan Alejandro Marin Ruiz AKA 4strodev
package table;

import java.util.ArrayList;

public class ContentRow extends Row {
    public ArrayList<String> content;

    public static <T> Row createRow(T[] list) {
        ArrayList<String> contentRow = new ArrayList<>();

        for (var element : list) {
            contentRow.add(element.toString());
        }

        return new ContentRow(contentRow);
    }

    public ContentRow(ArrayList<String> content) {
        this.content = content;
    }

    int getMaxCol() {
        int maxCol = 0;
        for (var item : this.content) {
            maxCol = Math.max(maxCol, item.length());
        }

        return maxCol;
    }

    public void render(int colSize) {
        for (int i = 0; i < this.content.size(); i++) {
            System.out.printf("|%" + colSize + "s", this.content.get(0));
            if (i == this.content.size() - 1) {
                System.out.println("|");
            }
        }
    }

    @Override
    public void render(int colSize, int nElements) {
        for (int i = 0; i < nElements; i++) {
            System.out.printf("|%" + colSize + "s", this.content.get(i));
            if (i == nElements - 1) {
                System.out.println("|");
            }
        }
    }
}
