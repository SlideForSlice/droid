public class ConditionerAdvanced {

    private String name;
    private int maxTemp;
    private int minTemp;
    private int currentTemp;
    private boolean on;

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxTemp (int temp) {
        this.maxTemp = temp;
    }

    public void setMinTemp (int temp) {
        this.minTemp = temp;
    }

    public void setCurrentTemp (int temp) {
        if (temp > maxTemp) {
            // Early Exit
            return;
        }
        if (temp < minTemp) {
            // Early Exit
            return;
        }
        this.currentTemp = temp;
    }

    // Getters

    public String getName () {
        return name;
    }

    public int getMaxTemp () {
        return maxTemp;
    }

    public int getMinTemp ()  {
        return minTemp;
    }

    public int getCurrentTemp () {
        return currentTemp;
    }
}
