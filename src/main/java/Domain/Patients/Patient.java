package Domain.Patients;

import Domain.SeedWork.EntityBase;

import java.util.UUID;

public class Patient extends EntityBase {
    private UUID id;
    String code;
    String name;

    public UUID getId() {
        return id;
    }
}
