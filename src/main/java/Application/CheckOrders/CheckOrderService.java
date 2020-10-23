package Application.CheckOrders;

import Application.CheckOrders.CreateCheckOrder.CheckOrderItemData;
import Application.CheckOrders.CreateCheckOrder.CreateCheckOrderCommand;
import Domain.CheckItems.ICheckItemRepository;
import Domain.CheckOrders.CheckOrder;
import Domain.CheckOrders.CheckOrderItem;
import Domain.CheckOrders.ICheckOrderRepository;
import Domain.Doctors.IDoctorRepository;
import Domain.Patients.IPatientRepository;

import java.util.ArrayList;
import java.util.List;

public class CheckOrderService {

    private ICheckOrderRepository checkOrderRepository;


    public CheckOrderService(){

    }

    public void Handle(CreateCheckOrderCommand createCheckOrderCommand){

        List<CheckOrderItem> checkOrderItemList=new ArrayList<CheckOrderItem>();
        for(CheckOrderItemData data:createCheckOrderCommand.getCheckOrderItemDataList()){
            checkOrderItemList.add(new CheckOrderItem(data.getCheckItemId(),data.getRemark()));
        }

        CheckOrder checkOrder=new CheckOrder(createCheckOrderCommand.getDoctorId(),
                createCheckOrderCommand.getPatientId(),
                createCheckOrderCommand.getCheckCategoryId(),
                checkOrderItemList,
                createCheckOrderCommand.getRemark());
       this.checkOrderRepository.Add(checkOrder);
    }
}
