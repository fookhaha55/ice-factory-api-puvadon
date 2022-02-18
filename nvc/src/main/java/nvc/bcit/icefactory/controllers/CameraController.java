package nvc.bcit.icefactory.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nvc.bcit.icefactory.model.Camera;
import nvc.bcit.icefactory.service.CameraService;

@RestController
@RequestMapping("/camera")
public class CameraController {
    
    @Autowired
    public CameraService cameraService;

    @GetMapping("")
    public ResponseEntity<Object> getAllCamera(){
        List<Camera> cameras = cameraService.getAllCamera();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Success!");
        map.put("data", cameras);
        return new ResponseEntity<Object>(map,HttpStatus.OK);
        }
    
}
