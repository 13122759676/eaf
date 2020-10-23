package Domain.UnitTests.CheckOrders;

import Domain.CheckOrders.CheckOrder;
import Domain.CheckOrders.CheckOrderCreatedEvent;
import Domain.CheckOrders.CheckOrderItem;
import Domain.UnitTests.SeedWork.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;


public class CheckOrderTests extends TestBase {

    @Test
    public void NewCheckOrder_NormalCondition_IsSuccessfully()
    {
        UUID doctorId=UUID.randomUUID();
        UUID patientId=UUID.randomUUID();

        UUID checkCategoryId= UUID.randomUUID();
        List<CheckOrderItem> checkOrderItemList=new ArrayList<CheckOrderItem>();
        checkOrderItemList.add(new CheckOrderItem(UUID.randomUUID(),"fakeRemark1"));
        checkOrderItemList.add(new CheckOrderItem(UUID.randomUUID(),"fakeRemark2"));
        String remark="FakeRemark";

        CheckOrder checkOrder=new CheckOrder(doctorId,patientId,checkCategoryId,checkOrderItemList,remark);

        AssertPublishedDomainEvent(checkOrder,CheckOrderCreatedEvent.class.getName());
    }

}
