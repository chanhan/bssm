package test.bssm.service;

import test.bssm.domain.TrainOrder;

public interface ITrainOrderService {
    TrainOrder QueryOrder(String serialId);
}
