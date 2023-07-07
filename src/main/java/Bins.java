
public class Bins {
    // maybe can do this with map (in the future)
    private int[] binLabels;
    private int[] binValue;

    // Constructor
    public Bins(int minVal, int maxVal){
        this.binLabels = new int[maxVal - minVal + 1];
        this.binValue = new int[maxVal - minVal + 1];

        setUpBins(minVal);
    }

    private void setUpBins(int min){
                for(int i = 0; i < binLabels.length; i++){
                    binLabels[i] = i + min;
                    binValue[i] = 0;
        }
    }

    public void setBin(Integer binNumber, int value){
        this.binValue[getIndex(binNumber)] = value;
    }

    public Integer getBin(Integer binNumber){
        return this.binValue[getIndex(binNumber)];
    }

    // Increments bin # 10
    public void incrementBin(Integer binNumber){
        binValue[getIndex(binNumber)] = binValue[getIndex(binNumber)] + 1;
    }

    private int getIndex(int num){
        return num - binLabels[0];
    }
}
