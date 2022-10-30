package redes.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redes.App.domain.Blockip;
import redes.App.repository.BlockIpRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class BlockIpService {
    @Autowired
    private BlockIpRepository BlockIpRepository;

    public Blockip getByIpAddress(String ipAddress) {
        return BlockIpRepository.findByIpAddress(ipAddress);
    }

    public Blockip add(Blockip Blockip){
        return BlockIpRepository.save(Blockip);
    }
}
