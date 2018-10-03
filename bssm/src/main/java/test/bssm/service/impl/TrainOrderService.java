package test.bssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.bssm.dao.ITrainOrderDao;
import test.bssm.domain.TrainOrder;
import test.bssm.service.ITrainOrderService;

@Service
@Transactional
public class TrainOrderService implements ITrainOrderService {

    @Autowired
    private ITrainOrderDao trainOrderDao;

    @Override
    public TrainOrder QueryOrder(String serialId) {
        TrainOrder order = trainOrderDao.queryTrainOrder(serialId);
        return order;
    }
}
