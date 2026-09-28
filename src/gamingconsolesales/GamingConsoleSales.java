package gamingconsolesales;

public class GamingConsoleSales {

    public static void main(String[] args) {

        // 1D array containing the city names
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // 1D array containing the console names
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // 2D array containing the sales
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Report heading
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");

        // Display console headings
        System.out.printf("%-20s", "");

        for (int i = 0; i < consoles.length; i++) {
            System.out.printf("%-12s", consoles[i]);
        }

        System.out.println();

        // Display sales information
        for (int row = 0; row < cities.length; row++) {

            System.out.printf("%-20s", cities[row]);

            for (int column = 0; column < sales[row].length; column++) {
                System.out.printf("%-12d", sales[row][column]);
            }

            System.out.println();
        }

        // Display totals
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        int highestSales = 0;
        String cityWithMostSales = "";

        // Calculate total sales for each city
        for (int row = 0; row < cities.length; row++) {

            int total = 0;

            for (int column = 0; column < sales[row].length; column++) {
                total += sales[row][column];
            }

            System.out.printf("%-20s%d%n", cities[row], total);

            // Find city with highest sales
            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[row];
            }
        }

        // Display city with the most sales
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);

        System.out.println("------------------------------------------------------------");
    }
}