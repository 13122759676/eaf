package Domain.Patients;

import java.util.UUID;

public interface IPatientRepository {
    Patient GetById(UUID patientId);
}
