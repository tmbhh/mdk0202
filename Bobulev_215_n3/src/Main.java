import javax.print.DocFlavor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pixelKcalDay = "43"; // столько калорий съел Пиксель до похода к бабушке
        String beefKcal = "30.2"; // калорийность говядины
        String chickenKcal = "23.8"; // калорийность курицы
        String creamKcal = "32.1"; // калорийность сливок
        String milkKcal = "13.5"; // калорийность молока

        int pKD  = Integer.parseInt(pixelKcalDay);
        float bKc = Float.parseFloat(beefKcal);
        float cKc = Float.parseFloat(chickenKcal);
        float crKc = Float.parseFloat(creamKcal);
        float mKc = Float.parseFloat(milkKcal);
        float pixelChoice = getMinKcalsSum(bKc, cKc, crKc, mKc);
        float totalKcal = Integer.parseInt(pixelKcalDay) + pixelChoice;
        checkKcal(totalKcal);
    }

    private static Float getMinKcalsSum(float firstDishKcal, float secondDishKcal, float firstDesert, float secondDesert) {

        float minDishKcal = Float.min(firstDishKcal,secondDishKcal); // вычислите минимальную калорийность основного блюда
        float minDesertKcal = Float.min(firstDesert,secondDesert); // вычислите минимальную калорийность десерта
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(Float catKcal) {
        if (catKcal == null) {
            System.out.println("Что-то пошло не так");
        } else {
            System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
            if (catKcal > 100) {
                System.out.println("Пиксель сегодня не уложился в норму.");
            } else {
                System.out.println("Лимит не превышен!");
            }
        }
    }
}