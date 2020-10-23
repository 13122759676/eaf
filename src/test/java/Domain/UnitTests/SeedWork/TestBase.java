package Domain.UnitTests.SeedWork;

import Domain.SeedWork.EntityBase;
import Domain.SeedWork.IDomainEvent;
import org.junit.Assert;

public class TestBase {


    public void AssertPublishedDomainEvent(EntityBase entityBase,String className)
    {
        boolean exist=false;
        for (IDomainEvent domainEvent:entityBase.GetDomainEvents()){
            if(domainEvent.getClass().getName().equals(className))
            {
                exist=true;
                break;
            }
        }
        Assert.assertTrue(exist);
    }

}
