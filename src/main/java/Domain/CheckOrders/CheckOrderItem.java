package Domain.CheckOrders;

import java.util.UUID;

public class CheckOrderItem {
    private UUID id;
    UUID checkItemId;
    String remark;

    public CheckOrderItem(UUID checkItemId,String remark){
        this.checkItemId=checkItemId;
        this.remark=remark;
    }

    public UUID getId() {
        return id;
    }
}
