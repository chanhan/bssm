package test.bssm.dao;

import test.bssm.domain.TrainOrder;

public interface ITrainOrderDao {
    TrainOrder queryTrainOrder(String serialId);
}
