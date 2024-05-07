public abstract class Transport implements Repair {
    private String modelName;
    private int wheelsCount;

    public  Transport(String modelName,int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}