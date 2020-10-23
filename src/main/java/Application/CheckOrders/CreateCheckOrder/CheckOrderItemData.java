package Application.CheckOrders.CreateCheckOrder;

import java.util.UUID;

public class CheckOrderItemData {
    private UUID checkItemId;
    private String remark;

    public  CheckOrderItemData(UUID checkItemId,String remark){
        this.checkItemId=checkItemId;
        this.remark=remark;
    }

    public UUID getCheckItemId() {
        return checkItemId;
    }

    public String getRemark() {
        return remark;
    }
}
