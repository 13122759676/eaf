package Domain.CheckOrders;

import java.util.UUID;

public interface ICheckOrderRepository {
    CheckOrder GetById(UUID checkOrderId);
    void Add(CheckOrder checkOrder);
}
