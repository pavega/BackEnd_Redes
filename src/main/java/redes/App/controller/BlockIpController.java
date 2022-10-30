package redes.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import redes.App.domain.Blockip;
import redes.App.service.BlockIpService;

import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/blocklist")
public class BlockIpController {
    @Autowired
    private BlockIpService blockIpService;

    @GetMapping("/{ipAddress}")
    public ResponseEntity<Blockip> get(@PathVariable String ipAddress) {
        try {
            Blockip Blockip = blockIpService.getByIpAddress(ipAddress);
            return new ResponseEntity<Blockip>(Blockip, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Blockip>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public void add(@RequestBody Blockip Blockip){
        blockIpService.add(Blockip);
    }
}
