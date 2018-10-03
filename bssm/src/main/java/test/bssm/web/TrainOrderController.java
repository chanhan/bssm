package test.bssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.bssm.domain.TrainOrder;
import test.bssm.service.ITrainOrderService;

@RestController
@RequestMapping("/trainOrder")
public class TrainOrderController {
    @Autowired
    private ITrainOrderService service;

    @RequestMapping("/details/{serialId}")
    public TrainOrder OrderDetails(@PathVariable String serialId) {
        TrainOrder order = service.QueryOrder(serialId);
        return order;
    }
}
