package org.acme;


public class LabSeqResponse {
    private int n;
    private int result;
    private long executionTime;

    public LabSeqResponse() {}

    public LabSeqResponse(int n, int result, long executionTime) {
        this.n = n;
        this.result = result;
        this.executionTime = executionTime;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public long getExecutionTime() {
        return this.executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }
}
