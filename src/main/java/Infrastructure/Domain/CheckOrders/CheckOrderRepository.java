package Infrastructure.Domain.CheckOrders;

import Domain.CheckOrders.CheckOrder;
import Domain.CheckOrders.ICheckOrderRepository;

import java.util.UUID;

public class CheckOrderRepository implements ICheckOrderRepository {
    @Override
    public CheckOrder GetById(UUID checkOrderId) {
        return null;
    }

    @Override
    public void Add(CheckOrder checkOrder) {

    }
}
