package Api.CheckOrders;

import java.util.UUID;

public class CheckOrderItemDto {
    private UUID checkItemId;
    private String remark;

    public UUID getCheckItemId() {
        return checkItemId;
    }

    public void setCheckItemId(UUID checkItemId) {
        this.checkItemId = checkItemId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
