package Command;

public class AirConditionerCommand implements Command {
    AirConditioner airConditioner;
    public AirConditionerCommand(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.IncreaseTemparature();
    }

    @Override
    public void undo() {
        airConditioner.DecreaseTemprature();
    }
    
}
