package Domain.Doctors;

import java.util.UUID;

public interface IDoctorRepository {
    Doctor GetById(UUID doctorId);
}
