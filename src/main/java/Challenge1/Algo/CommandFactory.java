package Challenge1.Algo;

public class CommandFactory {

    public ICommand createGCDSubRecCmd() {
        return new GCDSubRecCmd();
    }

    public ICommand createGCDSubItCmd() {
        return new GCDSubItCmd();
    }

    public ICommand createGCDDivRestRecCmd() {
        return new GCDDivRestRecCmd();
    }

    public ICommand createGCDDivRestIteCmd() {
        return new GCDDivRestIteCmd();
    }
}
