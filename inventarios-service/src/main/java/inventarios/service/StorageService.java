package inventarios.service;

import inventarios.repository.StorageRepository;
import inventarios.to.StorageLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    public List<StorageLocation> findAll() {
        return storageRepository.findAll();
    }

    public <S extends StorageLocation> S save(S entity) {
        return storageRepository.save(entity);
    }
}
