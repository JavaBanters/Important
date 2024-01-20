class IfElseExample {

    public int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void findStateOfWater() {
        if (this.temperature <= 0) {
            System.out.println("Water in solid state");
        } else if (this.temperature >= 100) {
            System.out.println("Water in gas state");
        } else {
            System.out.println("Water in liquid state");
        }
    }


    public static void main(String[] args) {
        IfElseExample example = new IfElseExample();
        example.setTemperature(-10);
        example.findStateOfWater();
    }

}