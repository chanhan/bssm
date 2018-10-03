package test.bssm.domain;

public class TrainOrder {
    private long id;
    private String serialId;
    private String trainNo;
    private String startStationName;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TrainOrder{" +
                "id=" + id +
                ", serialId='" + serialId + '\'' +
                ", trainNo='" + trainNo + '\'' +
                ", startStationName='" + startStationName + '\'' +
                ", endStationName='" + endStationName + '\'' +
                '}';
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public long getId() {
        return id;
    }

    public String getSerialId() {
        return serialId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public String getStartStationName() {
        return startStationName;
    }

    public String getEndStationName() {
        return endStationName;
    }

    public void setStartStationName(String startStationName) {
        this.startStationName = startStationName;
    }

    public void setEndStationName(String endStationName) {
        this.endStationName = endStationName;
    }

    private String endStationName;
}