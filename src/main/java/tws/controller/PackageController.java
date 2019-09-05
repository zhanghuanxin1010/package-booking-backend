package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Packagess;
import tws.repository.PackageMapper;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/inputPage")
public class PackageController {

    @Autowired
    private PackageMapper packageMapper;
    
    @Autowired
    private Packagess packages;
    
   
    @GetMapping("")
    public ResponseEntity<List<Packagess>> getAll() {
    	
        return ResponseEntity.ok(packageMapper.selectAll());
    }
    
    
    @PostMapping("")
    public ResponseEntity<Packagess> insert(@RequestBody Packagess packages) {
    	packageMapper.insert(packages);
        return ResponseEntity.created(URI.create("/inputPage/" + packages.getId())).body(packages);
    }
}
