package Domain.CheckOrders;

import Domain.SeedWork.EntityBase;
import Domain.SeedWork.IDomainEvent;

import java.util.List;
import java.util.UUID;

public class CheckOrder extends EntityBase {
    UUID id;
    UUID doctorId;
    UUID patientId;
    UUID checkCategoryId;
    List<CheckOrderItem> checkOrderItems;
    String remark;

    public UUID GetId()
    {
        return this.id;
    }

    public CheckOrder(UUID doctorId,UUID patientId,UUID checkCategoryId, List<CheckOrderItem> checkOrderItems,String remark)
    {
        this.id=UUID.randomUUID();
        this.doctorId=doctorId;
        this.patientId=patientId;
        this.checkCategoryId=checkCategoryId;
        this.checkOrderItems=checkOrderItems;
        this.remark=remark;

        this.AddDomainEvent(new CheckOrderCreatedEvent());
    }
}
