package keigo.clothesApp.service;

import java.util.List;
import keigo.clothesApp.domain.Size;
import keigo.clothesApp.repository.SizeRepository;
import org.springframework.stereotype.Service;

@Service
public class SizeService {
    private final SizeRepository sizeRepository;

    public SizeService(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;
    }

    public List<Size> getAllSize() {
        List<Size> sizeList = sizeRepository.findAll();
        for (Size size : sizeList) {
            System.out.println(size.getSizeId() + size.getSizeName());
        }
        return sizeList;
    }
}
