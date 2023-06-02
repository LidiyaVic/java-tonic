package src.main.Java.HomeTask9.Color;

/**
 * Enum: Створити Enum Color, який буде зберегіати в собі перечислення кольорів.
 * перевизначити для констант toString()
 * та додати метод який повертає код кольору в форматі HEX(RGB)
 * Переробити клас Shape з дз 7, щоб він містив колір в форматы нашого нового Enum Color
 */

 public enum Color {
        LAVENDER("#B57EDC") {
            public String toString() {
                return "Lavender color " + getHexCode();
            }
        },
        LEMON("#FDE910") {
            public String toString() {
                return "Lemon color " + getHexCode();
            }
        },
        IVORY("#FFFFF0") {
            public String toString() {
                return "Ivory color " + getHexCode();
            }
        };

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
