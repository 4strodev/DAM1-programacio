// Author Juan Alejandro Marin Ruiz AKA 4strodev
package table;

public class SeparatorRow extends Row {
    String startCharacter;
    String separatorCharacter;
    String finalCharacter;

    public SeparatorRow(String separatorCharacter) {
        this.startCharacter = separatorCharacter;
        this.separatorCharacter = separatorCharacter;
        this.finalCharacter = separatorCharacter;
    }

    public SeparatorRow(String separatorCharacter, String startCharacter, String finalCharacter) {
        this.startCharacter = startCharacter;
        this.separatorCharacter = separatorCharacter;
        this.finalCharacter = finalCharacter;
    }

    @Override
    public void render(int colSize, int nElements) {
        int length = (colSize * nElements) + nElements + 1;
        for (int i = 0; i < length; i++) {
            System.out.printf(i == 0 || i == length - 1 ? "+" : "-");
        }
        System.out.println();
    }
}
